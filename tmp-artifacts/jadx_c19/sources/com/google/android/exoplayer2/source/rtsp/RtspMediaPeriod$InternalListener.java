package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspMediaPeriod$InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
    final /* synthetic */ RtspMediaPeriod this$0;

    public void onLoadCanceled(RtpDataLoadable rtpDataLoadable, long j, long j2, boolean z) {
    }

    public void seekMap(SeekMap seekMap) {
    }

    private RtspMediaPeriod$InternalListener(RtspMediaPeriod rtspMediaPeriod) {
        this.this$0 = rtspMediaPeriod;
    }

    public TrackOutput track(int i2, int i3) {
        return ((RtspMediaPeriod$RtspLoaderWrapper) Assertions.checkNotNull((RtspMediaPeriod$RtspLoaderWrapper) RtspMediaPeriod.access$400(this.this$0).get(i2))).sampleQueue;
    }

    public void endTracks() {
        Handler handlerAccess$500 = RtspMediaPeriod.access$500(this.this$0);
        final RtspMediaPeriod rtspMediaPeriod = this.this$0;
        handlerAccess$500.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$InternalListener$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RtspMediaPeriod.access$2200(rtspMediaPeriod);
            }
        });
    }

    public void onLoadCompleted(RtpDataLoadable rtpDataLoadable, long j, long j2) {
        if (this.this$0.getBufferedPositionUs() == 0) {
            if (RtspMediaPeriod.access$600(this.this$0)) {
                return;
            }
            RtspMediaPeriod.access$700(this.this$0);
            RtspMediaPeriod.access$602(this.this$0, true);
            return;
        }
        for (int i2 = 0; i2 < RtspMediaPeriod.access$400(this.this$0).size(); i2++) {
            RtspMediaPeriod$RtspLoaderWrapper rtspMediaPeriod$RtspLoaderWrapper = (RtspMediaPeriod$RtspLoaderWrapper) RtspMediaPeriod.access$400(this.this$0).get(i2);
            if (rtspMediaPeriod$RtspLoaderWrapper.loadInfo.loadable == rtpDataLoadable) {
                rtspMediaPeriod$RtspLoaderWrapper.cancelLoad();
                return;
            }
        }
    }

    public Loader.LoadErrorAction onLoadError(RtpDataLoadable rtpDataLoadable, long j, long j2, IOException iOException, int i2) {
        if (!RtspMediaPeriod.access$800(this.this$0)) {
            RtspMediaPeriod.access$902(this.this$0, iOException);
        } else if (iOException.getCause() instanceof BindException) {
            if (RtspMediaPeriod.access$1008(this.this$0) < 3) {
                return Loader.RETRY;
            }
        } else {
            RtspMediaPeriod.access$1102(this.this$0, new RtspMediaSource.RtspPlaybackException(rtpDataLoadable.rtspMediaTrack.uri.toString(), iOException));
        }
        return Loader.DONT_RETRY;
    }

    public void onUpstreamFormatChanged(Format format) {
        Handler handlerAccess$500 = RtspMediaPeriod.access$500(this.this$0);
        final RtspMediaPeriod rtspMediaPeriod = this.this$0;
        handlerAccess$500.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$InternalListener$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RtspMediaPeriod.access$2200(rtspMediaPeriod);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
    public void onRtspSetupCompleted() throws NumberFormatException {
        RtspMediaPeriod.access$1200(this.this$0).startPlayback(0L);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
    public void onPlaybackStarted(long j, ImmutableList<RtspTrackTiming> immutableList) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            arrayList.add((String) Assertions.checkNotNull(((RtspTrackTiming) immutableList.get(i2)).uri.getPath()));
        }
        for (int i3 = 0; i3 < RtspMediaPeriod.access$1300(this.this$0).size(); i3++) {
            if (!arrayList.contains(((RtspMediaPeriod$RtpLoadInfo) RtspMediaPeriod.access$1300(this.this$0).get(i3)).getTrackUri().getPath())) {
                RtspMediaPeriod.access$1400(this.this$0).onSeekingUnsupported();
                if (RtspMediaPeriod.access$1500(this.this$0)) {
                    RtspMediaPeriod.access$1602(this.this$0, true);
                    RtspMediaPeriod.access$1702(this.this$0, -9223372036854775807L);
                    RtspMediaPeriod.access$1802(this.this$0, -9223372036854775807L);
                    RtspMediaPeriod.access$1902(this.this$0, -9223372036854775807L);
                }
            }
        }
        for (int i4 = 0; i4 < immutableList.size(); i4++) {
            RtspTrackTiming rtspTrackTiming = (RtspTrackTiming) immutableList.get(i4);
            RtpDataLoadable rtpDataLoadableAccess$2000 = RtspMediaPeriod.access$2000(this.this$0, rtspTrackTiming.uri);
            if (rtpDataLoadableAccess$2000 != null) {
                rtpDataLoadableAccess$2000.setTimestamp(rtspTrackTiming.rtpTimestamp);
                rtpDataLoadableAccess$2000.setSequenceNumber(rtspTrackTiming.sequenceNumber);
                if (RtspMediaPeriod.access$1500(this.this$0) && RtspMediaPeriod.access$1700(this.this$0) == RtspMediaPeriod.access$1800(this.this$0)) {
                    rtpDataLoadableAccess$2000.seekToUs(j, rtspTrackTiming.rtpTimestamp);
                }
            }
        }
        if (!RtspMediaPeriod.access$1500(this.this$0)) {
            if (RtspMediaPeriod.access$1900(this.this$0) != -9223372036854775807L) {
                RtspMediaPeriod rtspMediaPeriod = this.this$0;
                rtspMediaPeriod.seekToUs(RtspMediaPeriod.access$1900(rtspMediaPeriod));
                RtspMediaPeriod.access$1902(this.this$0, -9223372036854775807L);
                return;
            }
            return;
        }
        if (RtspMediaPeriod.access$1700(this.this$0) == RtspMediaPeriod.access$1800(this.this$0)) {
            RtspMediaPeriod.access$1702(this.this$0, -9223372036854775807L);
            RtspMediaPeriod.access$1802(this.this$0, -9223372036854775807L);
        } else {
            RtspMediaPeriod.access$1702(this.this$0, -9223372036854775807L);
            RtspMediaPeriod rtspMediaPeriod2 = this.this$0;
            rtspMediaPeriod2.seekToUs(RtspMediaPeriod.access$1800(rtspMediaPeriod2));
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
    public void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
        RtspMediaPeriod.access$1102(this.this$0, rtspPlaybackException);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
    public void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList) {
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) immutableList.get(i2);
            RtspMediaPeriod rtspMediaPeriod = this.this$0;
            RtspMediaPeriod$RtspLoaderWrapper rtspMediaPeriod$RtspLoaderWrapper = new RtspMediaPeriod$RtspLoaderWrapper(rtspMediaPeriod, rtspMediaTrack, i2, RtspMediaPeriod.access$2100(rtspMediaPeriod));
            RtspMediaPeriod.access$400(this.this$0).add(rtspMediaPeriod$RtspLoaderWrapper);
            rtspMediaPeriod$RtspLoaderWrapper.startLoading();
        }
        RtspMediaPeriod.access$1400(this.this$0).onSourceInfoRefreshed(rtspSessionTiming);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
    public void onSessionTimelineRequestFailed(String str, @Nullable Throwable th) {
        RtspMediaPeriod.access$902(this.this$0, th == null ? new IOException(str) : new IOException(str, th));
    }
}
