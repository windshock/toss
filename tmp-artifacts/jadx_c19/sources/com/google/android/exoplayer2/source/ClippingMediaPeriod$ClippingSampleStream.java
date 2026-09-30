package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ClippingMediaPeriod$ClippingSampleStream implements SampleStream {
    public final SampleStream childStream;
    private boolean sentEos;
    final /* synthetic */ ClippingMediaPeriod this$0;

    public ClippingMediaPeriod$ClippingSampleStream(ClippingMediaPeriod clippingMediaPeriod, SampleStream sampleStream) {
        this.this$0 = clippingMediaPeriod;
        this.childStream = sampleStream;
    }

    public void clearSentEos() {
        this.sentEos = false;
    }

    public boolean isReady() {
        return !this.this$0.isPendingInitialDiscontinuity() && this.childStream.isReady();
    }

    public void maybeThrowError() throws IOException {
        this.childStream.maybeThrowError();
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (this.this$0.isPendingInitialDiscontinuity()) {
            return -3;
        }
        if (this.sentEos) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        int data = this.childStream.readData(formatHolder, decoderInputBuffer, i2);
        if (data == -5) {
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            int i3 = format.encoderDelay;
            if (i3 != 0 || format.encoderPadding != 0) {
                ClippingMediaPeriod clippingMediaPeriod = this.this$0;
                if (clippingMediaPeriod.startUs != 0) {
                    i3 = 0;
                }
                formatHolder.format = format.buildUpon().setEncoderDelay(i3).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
            }
            return -5;
        }
        ClippingMediaPeriod clippingMediaPeriod2 = this.this$0;
        long j = clippingMediaPeriod2.endUs;
        if (j == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j) && !(data == -3 && clippingMediaPeriod2.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
            return data;
        }
        decoderInputBuffer.clear();
        decoderInputBuffer.setFlags(4);
        this.sentEos = true;
        return -4;
    }

    public int skipData(long j) {
        if (this.this$0.isPendingInitialDiscontinuity()) {
            return -3;
        }
        return this.childStream.skipData(j);
    }
}
