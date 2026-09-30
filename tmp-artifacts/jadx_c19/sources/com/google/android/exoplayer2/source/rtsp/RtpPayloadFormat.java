package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_AMR = "AMR";
    private static final String RTP_MEDIA_AMR_WB = "AMR-WB";
    private static final String RTP_MEDIA_H263_1998 = "H263-1998";
    private static final String RTP_MEDIA_H263_2000 = "H263-2000";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_H265 = "H265";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    private static final String RTP_MEDIA_MPEG4_VIDEO = "MP4V-ES";
    private static final String RTP_MEDIA_OPUS = "OPUS";
    private static final String RTP_MEDIA_PCMA = "PCMA";
    private static final String RTP_MEDIA_PCMU = "PCMU";
    private static final String RTP_MEDIA_PCM_L16 = "L16";
    private static final String RTP_MEDIA_PCM_L8 = "L8";
    private static final String RTP_MEDIA_VP8 = "VP8";
    private static final String RTP_MEDIA_VP9 = "VP9";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isFormatSupported(MediaDescription mediaDescription) {
        switch (Ascii.toUpperCase(mediaDescription.rtpMapAttribute.mediaEncoding)) {
            case "MPEG4-GENERIC":
            case "L8":
            case "AC3":
            case "AMR":
            case "L16":
            case "VP8":
            case "VP9":
            case "H264":
            case "H265":
            case "OPUS":
            case "PCMA":
            case "PCMU":
            case "AMR-WB":
            case "MP4V-ES":
            case "H263-1998":
            case "H263-2000":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getMimeTypeFromRtpMediaType(String str) {
        switch (Ascii.toUpperCase(str)) {
            case "MPEG4-GENERIC":
                return "audio/mp4a-latm";
            case "L8":
            case "L16":
                return "audio/raw";
            case "AC3":
                return "audio/ac3";
            case "AMR":
                return "audio/3gpp";
            case "VP8":
                return "video/x-vnd.on2.vp8";
            case "VP9":
                return "video/x-vnd.on2.vp9";
            case "H264":
                return "video/avc";
            case "H265":
                return "video/hevc";
            case "OPUS":
                return "audio/opus";
            case "PCMA":
                return "audio/g711-alaw";
            case "PCMU":
                return "audio/g711-mlaw";
            case "AMR-WB":
                return "audio/amr-wb";
            case "MP4V-ES":
                return "video/mp4v-es";
            case "H263-1998":
            case "H263-2000":
                return "video/3gpp";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int getRawPcmEncodingType(String str) {
        Assertions.checkArgument(str.equals(RTP_MEDIA_PCM_L8) || str.equals(RTP_MEDIA_PCM_L16));
        return str.equals(RTP_MEDIA_PCM_L8) ? 3 : 268435456;
    }

    public RtpPayloadFormat(Format format, int i2, int i3, Map<String, String> map) {
        this.rtpPayloadType = i2;
        this.clockRate = i3;
        this.format = format;
        this.fmtpParameters = ImmutableMap.copyOf(map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtpPayloadFormat.class != obj.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
        return this.rtpPayloadType == rtpPayloadFormat.rtpPayloadType && this.clockRate == rtpPayloadFormat.clockRate && this.format.equals(rtpPayloadFormat.format) && this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters);
    }

    public int hashCode() {
        int i2 = this.rtpPayloadType;
        return ((((((i2 + 217) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
