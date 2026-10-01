package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressiveMediaPeriod$SampleStreamImpl implements SampleStream {
    final /* synthetic */ ProgressiveMediaPeriod this$0;
    private final int track;

    public ProgressiveMediaPeriod$SampleStreamImpl(ProgressiveMediaPeriod progressiveMediaPeriod, int i2) {
        this.this$0 = progressiveMediaPeriod;
        this.track = i2;
    }

    public boolean isReady() {
        return this.this$0.isReady(this.track);
    }

    public void maybeThrowError() throws IOException {
        this.this$0.maybeThrowError(this.track);
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        return this.this$0.readData(this.track, formatHolder, decoderInputBuffer, i2);
    }

    public int skipData(long j) {
        return this.this$0.skipData(this.track, j);
    }
}
