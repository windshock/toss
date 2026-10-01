package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.NalUnitUtil$PpsData;
import com.google.android.exoplayer2.util.NalUnitUtil$SpsData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = -9223372036854775807L;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z;
        this.detectAccessUnits = z2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = -9223372036854775807L;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new SampleReader(trackOutputTrack, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i2) {
        if (j != -9223372036854775807L) {
            this.pesTimeUs = j;
        }
        this.randomAccessIndicator |= (i2 & 2) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                nalUnitData(data, position, iLimit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, iFindNalUnit);
            int i2 = iFindNalUnit - position;
            if (i2 > 0) {
                nalUnitData(data, position, iFindNalUnit);
            }
            int i3 = iLimit - iFindNalUnit;
            long j = this.totalBytesWritten - i3;
            endNalUnit(j, i3, i2 < 0 ? -i2 : 0, this.pesTimeUs);
            startNalUnit(j, nalUnitType, this.pesTimeUs);
            position = iFindNalUnit + 3;
        }
    }

    @RequiresNonNull
    private void startNalUnit(long j, int i2, long j2) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i2);
            this.pps.startNalUnit(i2);
        }
        this.sei.startNalUnit(i2);
        this.sampleReader.startNalUnit(j, i2, j2);
    }

    @RequiresNonNull
    private void nalUnitData(byte[] bArr, int i2, int i3) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i2, i3);
            this.pps.appendToNalUnit(bArr, i2, i3);
        }
        this.sei.appendToNalUnit(bArr, i2, i3);
        this.sampleReader.appendToNalUnit(bArr, i2, i3);
    }

    @RequiresNonNull
    private void endNalUnit(long j, int i2, int i3, long j2) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i3);
            this.pps.endNalUnit(i3);
            if (!this.hasOutputFormat) {
                if (this.sps.isCompleted() && this.pps.isCompleted()) {
                    ArrayList arrayList = new ArrayList();
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.pps;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.sps;
                    NalUnitUtil$SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer3.nalData, 3, nalUnitTargetBuffer3.nalLength);
                    NalUnitTargetBuffer nalUnitTargetBuffer4 = this.pps;
                    NalUnitUtil$PpsData ppsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer4.nalData, 3, nalUnitTargetBuffer4.nalLength);
                    this.output.format(new Format.Builder().setId(this.formatId).setSampleMimeType("video/avc").setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc)).setWidth(spsNalUnit.width).setHeight(spsNalUnit.height).setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio).setInitializationData(arrayList).build());
                    this.hasOutputFormat = true;
                    this.sampleReader.putSps(spsNalUnit);
                    this.sampleReader.putPps(ppsNalUnit);
                    this.sps.reset();
                    this.pps.reset();
                }
            } else if (this.sps.isCompleted()) {
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.sps;
                this.sampleReader.putSps(NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer5.nalData, 3, nalUnitTargetBuffer5.nalLength));
                this.sps.reset();
            } else if (this.pps.isCompleted()) {
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.pps;
                this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength));
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i3)) {
            NalUnitTargetBuffer nalUnitTargetBuffer7 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer7.nalData, nalUnitTargetBuffer7.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j2, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j, i2, this.hasOutputFormat, this.randomAccessIndicator)) {
            this.randomAccessIndicator = false;
        }
    }

    @EnsuresNonNull
    private void assertTracksCreated() {
        Assertions.checkStateNotNull(this.output);
        Util.castNonNull(this.sampleReader);
    }

    static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil$SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil$PpsData> pps = new SparseArray<>();

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z;
            this.detectAccessUnits = z2;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[DEFAULT_BUFFER_SIZE];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putSps(NalUnitUtil$SpsData nalUnitUtil$SpsData) {
            this.sps.append(nalUnitUtil$SpsData.seqParameterSetId, nalUnitUtil$SpsData);
        }

        public void putPps(NalUnitUtil$PpsData nalUnitUtil$PpsData) {
            this.pps.append(nalUnitUtil$PpsData.picParameterSetId, nalUnitUtil$PpsData);
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        public void startNalUnit(long j, int i2, long j2) {
            this.nalUnitType = i2;
            this.nalUnitTimeUs = j2;
            this.nalUnitStartPosition = j;
            if (!this.allowNonIdrKeyframes || i2 != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void appendToNalUnit(byte[] bArr, int i2, int i3) {
            boolean bit;
            boolean z;
            boolean z2;
            boolean bit2;
            boolean z3;
            int unsignedExpGolombCodedInt;
            int i4;
            int bits;
            int i5;
            int i6;
            int i7;
            int signedExpGolombCodedInt;
            int signedExpGolombCodedInt2;
            if (this.isFilling) {
                int i8 = i3 - i2;
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i9 = this.bufferLength + i8;
                if (length < i9) {
                    this.buffer = Arrays.copyOf(bArr2, i9 << 1);
                }
                System.arraycopy(bArr, i2, this.buffer, this.bufferLength, i8);
                int i10 = this.bufferLength + i8;
                this.bufferLength = i10;
                this.bitArray.reset(this.buffer, 0, i10);
                if (this.bitArray.canReadBits(8)) {
                    this.bitArray.skipBit();
                    int bits2 = this.bitArray.readBits(2);
                    this.bitArray.skipBits(5);
                    if (this.bitArray.canReadExpGolombCodedNum()) {
                        this.bitArray.readUnsignedExpGolombCodedInt();
                        if (this.bitArray.canReadExpGolombCodedNum()) {
                            int unsignedExpGolombCodedInt2 = this.bitArray.readUnsignedExpGolombCodedInt();
                            if (!this.detectAccessUnits) {
                                this.isFilling = false;
                                this.sliceHeader.setSliceType(unsignedExpGolombCodedInt2);
                                return;
                            }
                            if (this.bitArray.canReadExpGolombCodedNum()) {
                                int unsignedExpGolombCodedInt3 = this.bitArray.readUnsignedExpGolombCodedInt();
                                if (this.pps.indexOfKey(unsignedExpGolombCodedInt3) < 0) {
                                    this.isFilling = false;
                                    return;
                                }
                                NalUnitUtil$PpsData nalUnitUtil$PpsData = this.pps.get(unsignedExpGolombCodedInt3);
                                NalUnitUtil$SpsData nalUnitUtil$SpsData = this.sps.get(nalUnitUtil$PpsData.seqParameterSetId);
                                if (nalUnitUtil$SpsData.separateColorPlaneFlag) {
                                    if (!this.bitArray.canReadBits(2)) {
                                        return;
                                    } else {
                                        this.bitArray.skipBits(2);
                                    }
                                }
                                if (this.bitArray.canReadBits(nalUnitUtil$SpsData.frameNumLength)) {
                                    int bits3 = this.bitArray.readBits(nalUnitUtil$SpsData.frameNumLength);
                                    if (!nalUnitUtil$SpsData.frameMbsOnlyFlag) {
                                        if (this.bitArray.canReadBits(1)) {
                                            bit = this.bitArray.readBit();
                                            if (bit) {
                                                if (!this.bitArray.canReadBits(1)) {
                                                    return;
                                                }
                                                z = bit;
                                                bit2 = this.bitArray.readBit();
                                                z2 = true;
                                            }
                                            z3 = this.nalUnitType != 5;
                                            if (z3) {
                                                unsignedExpGolombCodedInt = 0;
                                            } else if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                return;
                                            } else {
                                                unsignedExpGolombCodedInt = this.bitArray.readUnsignedExpGolombCodedInt();
                                            }
                                            i4 = nalUnitUtil$SpsData.picOrderCountType;
                                            if (i4 != 0) {
                                                if (this.bitArray.canReadBits(nalUnitUtil$SpsData.picOrderCntLsbLength)) {
                                                    bits = this.bitArray.readBits(nalUnitUtil$SpsData.picOrderCntLsbLength);
                                                    if (nalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag && !z) {
                                                        if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                            return;
                                                        } else {
                                                            signedExpGolombCodedInt2 = this.bitArray.readSignedExpGolombCodedInt();
                                                        }
                                                    }
                                                    i7 = signedExpGolombCodedInt2;
                                                    i6 = bits;
                                                    i5 = 0;
                                                    signedExpGolombCodedInt = 0;
                                                    this.sliceHeader.setAll(nalUnitUtil$SpsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit2, z3, unsignedExpGolombCodedInt, i6, i7, i5, signedExpGolombCodedInt);
                                                    this.isFilling = false;
                                                }
                                                return;
                                            }
                                            if (i4 == 1 && !nalUnitUtil$SpsData.deltaPicOrderAlwaysZeroFlag) {
                                                if (this.bitArray.canReadExpGolombCodedNum()) {
                                                    int signedExpGolombCodedInt3 = this.bitArray.readSignedExpGolombCodedInt();
                                                    if (!nalUnitUtil$PpsData.bottomFieldPicOrderInFramePresentFlag || z) {
                                                        i5 = signedExpGolombCodedInt3;
                                                        i6 = 0;
                                                        i7 = 0;
                                                        signedExpGolombCodedInt = 0;
                                                    } else {
                                                        if (!this.bitArray.canReadExpGolombCodedNum()) {
                                                            return;
                                                        }
                                                        signedExpGolombCodedInt = this.bitArray.readSignedExpGolombCodedInt();
                                                        i5 = signedExpGolombCodedInt3;
                                                        i6 = 0;
                                                        i7 = 0;
                                                    }
                                                    this.sliceHeader.setAll(nalUnitUtil$SpsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit2, z3, unsignedExpGolombCodedInt, i6, i7, i5, signedExpGolombCodedInt);
                                                    this.isFilling = false;
                                                }
                                                return;
                                            }
                                            bits = 0;
                                            signedExpGolombCodedInt2 = 0;
                                            i7 = signedExpGolombCodedInt2;
                                            i6 = bits;
                                            i5 = 0;
                                            signedExpGolombCodedInt = 0;
                                            this.sliceHeader.setAll(nalUnitUtil$SpsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit2, z3, unsignedExpGolombCodedInt, i6, i7, i5, signedExpGolombCodedInt);
                                            this.isFilling = false;
                                        }
                                        return;
                                    }
                                    bit = false;
                                    z = bit;
                                    z2 = false;
                                    bit2 = false;
                                    if (this.nalUnitType != 5) {
                                    }
                                    if (z3) {
                                    }
                                    i4 = nalUnitUtil$SpsData.picOrderCountType;
                                    if (i4 != 0) {
                                    }
                                    signedExpGolombCodedInt2 = 0;
                                    i7 = signedExpGolombCodedInt2;
                                    i6 = bits;
                                    i5 = 0;
                                    signedExpGolombCodedInt = 0;
                                    this.sliceHeader.setAll(nalUnitUtil$SpsData, bits2, unsignedExpGolombCodedInt2, bits3, unsignedExpGolombCodedInt3, z, z2, bit2, z3, unsignedExpGolombCodedInt, i6, i7, i5, signedExpGolombCodedInt);
                                    this.isFilling = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean endNalUnit(long j, int i2, boolean z, boolean z2) {
            boolean z3 = true;
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z && this.readingSample) {
                    outputSample(i2 + ((int) (j - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            if (this.allowNonIdrKeyframes) {
                z2 = this.sliceHeader.isISlice();
            }
            boolean z4 = this.sampleIsKeyframe;
            int i3 = this.nalUnitType;
            if (i3 != 5 && (!z2 || i3 != 1)) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            this.sampleIsKeyframe = z5;
            return z5;
        }

        private void outputSample(int i2) {
            long j = this.sampleTimeUs;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z = this.sampleIsKeyframe;
            this.output.sampleMetadata(j, z ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i2, (TrackOutput.CryptoData) null);
        }

        static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;
            private NalUnitUtil$SpsData spsData;

            private SliceHeaderData() {
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            public void setSliceType(int i2) {
                this.sliceType = i2;
                this.hasSliceType = true;
            }

            public void setAll(NalUnitUtil$SpsData nalUnitUtil$SpsData, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.spsData = nalUnitUtil$SpsData;
                this.nalRefIdc = i2;
                this.sliceType = i3;
                this.frameNum = i4;
                this.picParameterSetId = i5;
                this.fieldPicFlag = z;
                this.bottomFieldFlagPresent = z2;
                this.bottomFieldFlag = z3;
                this.idrPicFlag = z4;
                this.idrPicId = i6;
                this.picOrderCntLsb = i7;
                this.deltaPicOrderCntBottom = i8;
                this.deltaPicOrderCnt0 = i9;
                this.deltaPicOrderCnt1 = i10;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i2 = this.sliceType;
                return i2 == 7 || i2 == 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                int i2;
                int i3;
                int i4;
                boolean z;
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil$SpsData nalUnitUtil$SpsData = (NalUnitUtil$SpsData) Assertions.checkStateNotNull(this.spsData);
                NalUnitUtil$SpsData nalUnitUtil$SpsData2 = (NalUnitUtil$SpsData) Assertions.checkStateNotNull(sliceHeaderData.spsData);
                return (this.frameNum == sliceHeaderData.frameNum && this.picParameterSetId == sliceHeaderData.picParameterSetId && this.fieldPicFlag == sliceHeaderData.fieldPicFlag && (!this.bottomFieldFlagPresent || !sliceHeaderData.bottomFieldFlagPresent || this.bottomFieldFlag == sliceHeaderData.bottomFieldFlag) && (((i2 = this.nalRefIdc) == (i3 = sliceHeaderData.nalRefIdc) || (i2 != 0 && i3 != 0)) && (((i4 = nalUnitUtil$SpsData.picOrderCountType) != 0 || nalUnitUtil$SpsData2.picOrderCountType != 0 || (this.picOrderCntLsb == sliceHeaderData.picOrderCntLsb && this.deltaPicOrderCntBottom == sliceHeaderData.deltaPicOrderCntBottom)) && ((i4 != 1 || nalUnitUtil$SpsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == sliceHeaderData.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == sliceHeaderData.deltaPicOrderCnt1)) && (z = this.idrPicFlag) == sliceHeaderData.idrPicFlag && (!z || this.idrPicId == sliceHeaderData.idrPicId))))) ? false : true;
            }
        }
    }
}
