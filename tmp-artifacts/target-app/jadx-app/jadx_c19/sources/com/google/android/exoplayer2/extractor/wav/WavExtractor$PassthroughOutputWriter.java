package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class WavExtractor$PassthroughOutputWriter implements WavExtractor$OutputWriter {
    private final ExtractorOutput extractorOutput;
    private final Format format;
    private long outputFrameCount;
    private int pendingOutputBytes;
    private long startTimeUs;
    private final int targetSampleSizeBytes;
    private final TrackOutput trackOutput;
    private final WavFormat wavFormat;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public WavExtractor$PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i2) throws ParserException {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        this.wavFormat = wavFormat;
        int i3 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
        if (wavFormat.blockSize != i3) {
            throw ParserException.createForMalformedContainer("Expected block size: " + i3 + "; got: " + wavFormat.blockSize, (Throwable) null);
        }
        int i4 = wavFormat.frameRateHz * i3;
        int i5 = i4 << 3;
        int iMax = Math.max(i3, i4 / 10);
        this.targetSampleSizeBytes = iMax;
        this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i5).setPeakBitrate(i5).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i2).build();
    }

    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    public void reset(long j) {
        this.startTimeUs = j;
        this.pendingOutputBytes = 0;
        this.outputFrameCount = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    public void init(int i2, long j) {
        this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, 1, i2, j));
        this.trackOutput.format(this.format);
    }

    @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor$OutputWriter
    public boolean sampleData(ExtractorInput extractorInput, long j) throws IOException {
        int i2;
        int i3;
        long j2 = j;
        while (j2 > 0 && (i2 = this.pendingOutputBytes) < (i3 = this.targetSampleSizeBytes)) {
            int iSampleData = this.trackOutput.sampleData(extractorInput, (int) Math.min(i3 - i2, j2), true);
            if (iSampleData == -1) {
                j2 = 0;
            } else {
                this.pendingOutputBytes += iSampleData;
                j2 -= iSampleData;
            }
        }
        int i4 = this.wavFormat.blockSize;
        int i5 = this.pendingOutputBytes / i4;
        if (i5 > 0) {
            long j3 = this.startTimeUs;
            long jScaleLargeTimestamp = Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, r1.frameRateHz);
            int i6 = i5 * i4;
            int i7 = this.pendingOutputBytes - i6;
            this.trackOutput.sampleMetadata(j3 + jScaleLargeTimestamp, 1, i6, i7, (TrackOutput.CryptoData) null);
            this.outputFrameCount += i5;
            this.pendingOutputBytes = i7;
        }
        return j2 <= 0;
    }
}
