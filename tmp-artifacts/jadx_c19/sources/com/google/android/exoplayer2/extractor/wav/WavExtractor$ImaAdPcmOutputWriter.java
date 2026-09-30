package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class WavExtractor$ImaAdPcmOutputWriter implements WavExtractor$OutputWriter {
    private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final ParsableByteArray decodedData;
    private final ExtractorOutput extractorOutput;
    private final Format format;
    private final int framesPerBlock;
    private final byte[] inputData;
    private long outputFrameCount;
    private int pendingInputBytes;
    private int pendingOutputBytes;
    private long startTimeUs;
    private final int targetSampleSizeFrames;
    private final TrackOutput trackOutput;
    private final WavFormat wavFormat;

    private static int numOutputFramesToBytes(int i2, int i3) {
        return (i2 << 1) * i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public WavExtractor$ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        this.wavFormat = wavFormat;
        int iMax = Math.max(1, wavFormat.frameRateHz / 10);
        this.targetSampleSizeFrames = iMax;
        ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
        parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        this.framesPerBlock = littleEndianUnsignedShort;
        int i2 = wavFormat.numChannels;
        int i3 = (((wavFormat.blockSize - (i2 << 2)) << 3) / (wavFormat.bitsPerSample * i2)) + 1;
        if (littleEndianUnsignedShort != i3) {
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i3 + "; got: " + littleEndianUnsignedShort, (Throwable) null);
        }
        int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
        this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
        this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i2));
        int i4 = ((wavFormat.frameRateHz * wavFormat.blockSize) << 3) / littleEndianUnsignedShort;
        this.format = new Format.Builder().setSampleMimeType("audio/raw").setAverageBitrate(i4).setPeakBitrate(i4).setMaxInputSize(numOutputFramesToBytes(iMax, i2)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
    }

    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    public void reset(long j) {
        this.pendingInputBytes = 0;
        this.startTimeUs = j;
        this.pendingOutputBytes = 0;
        this.outputFrameCount = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    public void init(int i2, long j) {
        this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, this.framesPerBlock, i2, j));
        this.trackOutput.format(this.format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
    
        r1 = true;
     */
    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sampleData(ExtractorInput extractorInput, long j) throws IOException {
        boolean z;
        int iNumOutputBytesToFrames;
        int iCeilDivide = Util.ceilDivide(this.targetSampleSizeFrames - numOutputBytesToFrames(this.pendingOutputBytes), this.framesPerBlock) * this.wavFormat.blockSize;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.pendingInputBytes >= iCeilDivide) {
                    break;
                }
                int i2 = extractorInput.read(this.inputData, this.pendingInputBytes, (int) Math.min(iCeilDivide - r2, j));
                if (i2 != -1) {
                    this.pendingInputBytes += i2;
                }
            }
            int i3 = this.pendingInputBytes / this.wavFormat.blockSize;
            if (i3 > 0) {
                decode(this.inputData, i3, this.decodedData);
                this.pendingInputBytes -= i3 * this.wavFormat.blockSize;
                int iLimit = this.decodedData.limit();
                this.trackOutput.sampleData(this.decodedData, iLimit);
                int i4 = this.pendingOutputBytes + iLimit;
                this.pendingOutputBytes = i4;
                int iNumOutputBytesToFrames2 = numOutputBytesToFrames(i4);
                int i5 = this.targetSampleSizeFrames;
                if (iNumOutputBytesToFrames2 >= i5) {
                    writeSampleMetadata(i5);
                }
            }
            if (z && (iNumOutputBytesToFrames = numOutputBytesToFrames(this.pendingOutputBytes)) > 0) {
                writeSampleMetadata(iNumOutputBytesToFrames);
            }
            return z;
        }
        z = true;
    }

    private void writeSampleMetadata(int i2) {
        long j = this.startTimeUs;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
        int iNumOutputFramesToBytes = numOutputFramesToBytes(i2);
        this.trackOutput.sampleMetadata(j + jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, (TrackOutput.CryptoData) null);
        this.outputFrameCount += i2;
        this.pendingOutputBytes -= iNumOutputFramesToBytes;
    }

    private void decode(byte[] bArr, int i2, ParsableByteArray parsableByteArray) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < this.wavFormat.numChannels; i4++) {
                decodeBlockForChannel(bArr, i3, i4, parsableByteArray.getData());
            }
        }
        int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i2);
        parsableByteArray.setPosition(0);
        parsableByteArray.setLimit(iNumOutputFramesToBytes);
    }

    private void decodeBlockForChannel(byte[] bArr, int i2, int i3, byte[] bArr2) {
        WavFormat wavFormat = this.wavFormat;
        int i4 = wavFormat.blockSize;
        int i5 = wavFormat.numChannels;
        int i6 = (i2 * i4) + (i3 << 2);
        int i7 = i4 / i5;
        int iConstrainValue = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
        int iMin = Math.min(bArr[i6 + 2] & 255, 88);
        int i8 = STEP_TABLE[iMin];
        int i9 = (((i2 * this.framesPerBlock) * i5) + i3) << 1;
        bArr2[i9] = (byte) iConstrainValue;
        bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
        for (int i10 = 0; i10 < ((i7 - 4) << 1); i10++) {
            byte b = bArr[(((i10 / 8) * i5) << 2) + (i5 << 2) + i6 + ((i10 / 2) % 4)];
            int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
            int i12 = ((((i11 & 7) << 1) + 1) * i8) >> 3;
            if ((i11 & 8) != 0) {
                i12 = -i12;
            }
            iConstrainValue = Util.constrainValue(iConstrainValue + i12, -32768, 32767);
            i9 += i5 << 1;
            bArr2[i9] = (byte) iConstrainValue;
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            int i13 = INDEX_TABLE[i11];
            int[] iArr = STEP_TABLE;
            iMin = Util.constrainValue(iMin + i13, 0, iArr.length - 1);
            i8 = iArr[iMin];
        }
    }

    private int numOutputBytesToFrames(int i2) {
        return i2 / (this.wavFormat.numChannels << 1);
    }

    private int numOutputFramesToBytes(int i2) {
        return numOutputFramesToBytes(i2, this.wavFormat.numChannels);
    }
}
