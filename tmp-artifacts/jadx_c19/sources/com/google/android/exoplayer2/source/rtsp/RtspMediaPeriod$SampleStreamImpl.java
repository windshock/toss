package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspMediaPeriod$SampleStreamImpl implements SampleStream {
    final /* synthetic */ RtspMediaPeriod this$0;
    private final int track;

    public RtspMediaPeriod$SampleStreamImpl(RtspMediaPeriod rtspMediaPeriod, int i2) {
        this.this$0 = rtspMediaPeriod;
        this.track = i2;
    }

    public boolean isReady() {
        return this.this$0.isReady(this.track);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$RtspPlaybackException */
    public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
        if (RtspMediaPeriod.access$1100(this.this$0) != null) {
            throw RtspMediaPeriod.access$1100(this.this$0);
        }
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        return this.this$0.readData(this.track, formatHolder, decoderInputBuffer, i2);
    }

    public int skipData(long j) {
        return this.this$0.skipData(this.track, j);
    }
}
