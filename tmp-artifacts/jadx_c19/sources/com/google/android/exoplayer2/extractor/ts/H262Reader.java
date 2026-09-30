package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final NalUnitTargetBuffer userData;
    private final ParsableByteArray userDataParsable;
    private final UserDataReader userDataReader;

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    public H262Reader() {
        this(null);
    }

    H262Reader(@Nullable UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(START_USER_DATA, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = -9223372036854775807L;
        this.sampleTimeUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i2) {
        this.pesTimeUs = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void consume(ParsableByteArray parsableByteArray) {
        int i2;
        long j;
        boolean z;
        int i3;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i4 = iFindNalUnit + 3;
            int i5 = parsableByteArray.getData()[i4] & 255;
            int i6 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i6 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i5, i6 < 0 ? -i6 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId));
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i6 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i3 = 0;
                } else {
                    i3 = -i6;
                }
                if (this.userData.endNalUnit(i3)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i5 == START_USER_DATA && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i5);
                }
            }
            if (i5 == 0 || i5 == START_SEQUENCE_HEADER) {
                int i7 = iLimit - iFindNalUnit;
                if (!this.sampleHasPicture || !this.hasOutputFormat) {
                    i2 = i5;
                    if (this.startedFirstSample || this.sampleHasPicture) {
                        this.samplePosition = this.totalBytesWritten - i7;
                        j = this.pesTimeUs;
                        if (j == -9223372036854775807L) {
                            long j2 = this.sampleTimeUs;
                            j = j2 != -9223372036854775807L ? j2 + this.frameDurationUs : -9223372036854775807L;
                        }
                        this.sampleTimeUs = j;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = -9223372036854775807L;
                        z = true;
                        this.startedFirstSample = true;
                    } else {
                        z = true;
                    }
                    this.sampleHasPicture = i2 == 0 ? z : false;
                } else {
                    long j3 = this.sampleTimeUs;
                    if (j3 != -9223372036854775807L) {
                        i2 = i5;
                        this.output.sampleMetadata(j3, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i7, i7, (TrackOutput.CryptoData) null);
                    }
                    if (this.startedFirstSample) {
                        this.samplePosition = this.totalBytesWritten - i7;
                        j = this.pesTimeUs;
                        if (j == -9223372036854775807L) {
                        }
                        this.sampleTimeUs = j;
                        this.sampleIsKeyframe = false;
                        this.pesTimeUs = -9223372036854775807L;
                        z = true;
                        this.startedFirstSample = true;
                        this.sampleHasPicture = i2 == 0 ? z : false;
                    }
                }
            } else if (i5 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i4;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str) {
        float f;
        int i2;
        float f2;
        int i3;
        long j;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        byte b = bArrCopyOf[4];
        byte b2 = bArrCopyOf[5];
        int i4 = ((b & 255) << 4) | ((b2 & 255) >> 4);
        int i5 = ((b2 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i6 = (bArrCopyOf[7] & 240) >> 4;
        if (i6 == 2) {
            f = i5 << 2;
            i2 = i4 * 3;
        } else if (i6 == 3) {
            f = i5 << 4;
            i2 = i4 * 9;
        } else {
            if (i6 != 4) {
                f2 = 1.0f;
                Format formatBuild = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i4).setHeight(i5).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i3 = (bArrCopyOf[7] & 15) - 1;
                if (i3 < 0) {
                    double[] dArr = FRAME_RATE_VALUES;
                    if (i3 < dArr.length) {
                        double d = dArr[i3];
                        byte b3 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        int i7 = (b3 & 96) >> 5;
                        if (i7 != (b3 & 31)) {
                            d *= (i7 + 1.0d) / (r8 + 1);
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                }
                return Pair.create(formatBuild, Long.valueOf(j));
            }
            f = i5 * 121;
            i2 = i4 * 100;
        }
        f2 = f / i2;
        Format formatBuild2 = new Format.Builder().setId(str).setSampleMimeType("video/mpeg2").setWidth(i4).setHeight(i5).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i3 = (bArrCopyOf[7] & 15) - 1;
        if (i3 < 0) {
        }
        return Pair.create(formatBuild2, Long.valueOf(j));
    }

    static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i2) {
            this.data = new byte[i2];
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public boolean onStartCode(int i2, int i3) {
            if (this.isFilling) {
                int i4 = this.length - i3;
                this.length = i4;
                if (this.sequenceExtensionPosition == 0 && i2 == H262Reader.START_EXTENSION) {
                    this.sequenceExtensionPosition = i4;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i2 == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i2, int i3) {
            if (this.isFilling) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i5 = this.length + i4;
                if (length < i5) {
                    this.data = Arrays.copyOf(bArr2, i5 << 1);
                }
                System.arraycopy(bArr, i2, this.data, this.length, i4);
                this.length += i4;
            }
        }
    }
}
