package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.Loader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspMediaPeriod$RtspLoaderWrapper {
    private boolean canceled;
    public final RtspMediaPeriod$RtpLoadInfo loadInfo;
    private final Loader loader;
    private boolean released;
    private final SampleQueue sampleQueue;
    final /* synthetic */ RtspMediaPeriod this$0;

    public RtspMediaPeriod$RtspLoaderWrapper(RtspMediaPeriod rtspMediaPeriod, RtspMediaTrack rtspMediaTrack, int i2, RtpDataChannel.Factory factory) {
        this.this$0 = rtspMediaPeriod;
        this.loadInfo = new RtspMediaPeriod$RtpLoadInfo(rtspMediaPeriod, rtspMediaTrack, i2, factory);
        this.loader = new Loader("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i2);
        SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(RtspMediaPeriod.access$2300(rtspMediaPeriod));
        this.sampleQueue = sampleQueueCreateWithoutDrm;
        sampleQueueCreateWithoutDrm.setUpstreamFormatChangeListener(RtspMediaPeriod.access$2400(rtspMediaPeriod));
    }

    public long getBufferedPositionUs() {
        return this.sampleQueue.getLargestQueuedTimestampUs();
    }

    public void startLoading() {
        this.loader.startLoading(this.loadInfo.loadable, RtspMediaPeriod.access$2400(this.this$0), 0);
    }

    public boolean isSampleQueueReady() {
        return this.sampleQueue.isReady(this.canceled);
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        return this.sampleQueue.read(formatHolder, decoderInputBuffer, i2, this.canceled);
    }

    public int skipData(long j) {
        int skipCount = this.sampleQueue.getSkipCount(j, this.canceled);
        this.sampleQueue.skip(skipCount);
        return skipCount;
    }

    public void cancelLoad() {
        if (this.canceled) {
            return;
        }
        this.loadInfo.loadable.cancelLoad();
        this.canceled = true;
        RtspMediaPeriod.access$2500(this.this$0);
    }

    public void seekTo(long j) {
        if (this.canceled) {
            return;
        }
        this.loadInfo.loadable.resetForSeek();
        this.sampleQueue.reset();
        this.sampleQueue.setStartTimeUs(j);
    }

    public void release() {
        if (this.released) {
            return;
        }
        this.loader.release();
        this.sampleQueue.release();
        this.released = true;
    }
}
