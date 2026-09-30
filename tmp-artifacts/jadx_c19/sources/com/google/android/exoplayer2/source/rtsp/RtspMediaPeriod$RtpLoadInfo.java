package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspMediaPeriod$RtpLoadInfo {
    private final RtpDataLoadable loadable;
    public final RtspMediaTrack mediaTrack;
    final /* synthetic */ RtspMediaPeriod this$0;
    private String transport;

    public RtspMediaPeriod$RtpLoadInfo(RtspMediaPeriod rtspMediaPeriod, RtspMediaTrack rtspMediaTrack, int i2, RtpDataChannel.Factory factory) {
        this.this$0 = rtspMediaPeriod;
        this.mediaTrack = rtspMediaTrack;
        this.loadable = new RtpDataLoadable(i2, rtspMediaTrack, new RtpDataLoadable.EventListener() { // from class: com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod$RtpLoadInfo$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.source.rtsp.RtpDataLoadable.EventListener
            public final void onTransportReady(String str, RtpDataChannel rtpDataChannel) {
                RtspMediaPeriod$RtpLoadInfo.$r8$lambda$esDWTpgVpANmX5ej6BZG28Qd3tQ(this.f$0, str, rtpDataChannel);
            }
        }, RtspMediaPeriod.access$2400(rtspMediaPeriod), factory);
    }

    public static /* synthetic */ void $r8$lambda$esDWTpgVpANmX5ej6BZG28Qd3tQ(RtspMediaPeriod$RtpLoadInfo rtspMediaPeriod$RtpLoadInfo, String str, RtpDataChannel rtpDataChannel) {
        rtspMediaPeriod$RtpLoadInfo.transport = str;
        RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener = rtpDataChannel.getInterleavedBinaryDataListener();
        if (interleavedBinaryDataListener != null) {
            RtspMediaPeriod.access$1200(rtspMediaPeriod$RtpLoadInfo.this$0).registerInterleavedDataChannel(rtpDataChannel.getLocalPort(), interleavedBinaryDataListener);
            RtspMediaPeriod.access$602(rtspMediaPeriod$RtpLoadInfo.this$0, true);
        }
        RtspMediaPeriod.access$2600(rtspMediaPeriod$RtpLoadInfo.this$0);
    }

    public boolean isTransportReady() {
        return this.transport != null;
    }

    public String getTransport() {
        Assertions.checkStateNotNull(this.transport);
        return this.transport;
    }

    public Uri getTrackUri() {
        return this.loadable.rtspMediaTrack.uri;
    }
}
