package com.google.android.exoplayer2.source.rtsp;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspResponse {
    public final RtspHeaders headers;
    public final String messageBody;
    public final int status;

    public RtspResponse(int i2, RtspHeaders rtspHeaders, String str) {
        this.status = i2;
        this.headers = rtspHeaders;
        this.messageBody = str;
    }

    public RtspResponse(int i2, RtspHeaders rtspHeaders) {
        this(i2, rtspHeaders, "");
    }
}
