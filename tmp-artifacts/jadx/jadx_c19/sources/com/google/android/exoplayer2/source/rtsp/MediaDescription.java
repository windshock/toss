package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String key;
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        public static RtpMapAttribute parse(String str) throws ParserException {
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
            Assertions.checkArgument(strArrSplitAtFirst.length == 2);
            int i2 = RtspMessageUtil.parseInt(strArrSplitAtFirst[0]);
            String[] strArrSplit = Util.split(strArrSplitAtFirst[1].trim(), "/");
            Assertions.checkArgument(strArrSplit.length >= 2);
            return new RtpMapAttribute(i2, strArrSplit[0], RtspMessageUtil.parseInt(strArrSplit[1]), strArrSplit.length == 3 ? RtspMessageUtil.parseInt(strArrSplit[2]) : -1);
        }

        private RtpMapAttribute(int i2, String str, int i3, int i4) {
            this.payloadType = i2;
            this.mediaEncoding = str;
            this.clockRate = i3;
            this.encodingParameters = i4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || RtpMapAttribute.class != obj.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) obj;
            return this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters;
        }

        public int hashCode() {
            int i2 = this.payloadType;
            return ((((((i2 + 217) * 31) + this.mediaEncoding.hashCode()) * 31) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    public static final class Builder {
        private static final String RTP_MAP_ATTR_AUDIO_FMT = "%d %s/%d/%d";
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_MONO = 11;
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_STEREO = 10;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMA = 8;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMU = 0;
        private final HashMap<String, String> attributes = new HashMap<>();
        private int bitrate = -1;
        private String connection;
        private String key;
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String str, int i2, String str2, int i3) {
            this.mediaType = str;
            this.port = i2;
            this.transportProtocol = str2;
            this.payloadType = i3;
        }

        public Builder setMediaTitle(String str) {
            this.mediaTitle = str;
            return this;
        }

        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public Builder setBitrate(int i2) {
            this.bitrate = i2;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public MediaDescription build() {
            RtpMapAttribute rtpMapAttribute;
            try {
                if (this.attributes.containsKey(SessionDescription.ATTR_RTPMAP)) {
                    rtpMapAttribute = RtpMapAttribute.parse((String) Util.castNonNull(this.attributes.get(SessionDescription.ATTR_RTPMAP)));
                } else {
                    rtpMapAttribute = RtpMapAttribute.parse(getRtpMapStringByPayloadType(this.payloadType));
                }
                return new MediaDescription(this, ImmutableMap.copyOf(this.attributes), rtpMapAttribute);
            } catch (ParserException e) {
                throw new IllegalStateException((Throwable) e);
            }
        }

        private static String getRtpMapStringByPayloadType(int i2) {
            Assertions.checkArgument(i2 < 96);
            if (i2 == 0) {
                return constructAudioRtpMap(0, "PCMU", 8000, 1);
            }
            if (i2 == 8) {
                return constructAudioRtpMap(8, "PCMA", 8000, 1);
            }
            if (i2 == 10) {
                return constructAudioRtpMap(10, "L16", 44100, 2);
            }
            if (i2 == 11) {
                return constructAudioRtpMap(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i2);
        }

        private static String constructAudioRtpMap(int i2, String str, int i3, int i4) {
            return Util.formatInvariant(RTP_MAP_ATTR_AUDIO_FMT, new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)});
        }
    }

    private MediaDescription(Builder builder, ImmutableMap<String, String> immutableMap, RtpMapAttribute rtpMapAttribute) {
        this.mediaType = builder.mediaType;
        this.port = builder.port;
        this.transportProtocol = builder.transportProtocol;
        this.payloadType = builder.payloadType;
        this.mediaTitle = builder.mediaTitle;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.attributes = immutableMap;
        this.rtpMapAttribute = rtpMapAttribute;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaDescription.class != obj.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        return this.mediaType.equals(mediaDescription.mediaType) && this.port == mediaDescription.port && this.transportProtocol.equals(mediaDescription.transportProtocol) && this.payloadType == mediaDescription.payloadType && this.bitrate == mediaDescription.bitrate && this.attributes.equals(mediaDescription.attributes) && this.rtpMapAttribute.equals(mediaDescription.rtpMapAttribute) && Util.areEqual(this.mediaTitle, mediaDescription.mediaTitle) && Util.areEqual(this.connection, mediaDescription.connection) && Util.areEqual(this.key, mediaDescription.key);
    }

    public int hashCode() {
        int iHashCode = this.mediaType.hashCode();
        int i2 = this.port;
        int iHashCode2 = this.transportProtocol.hashCode();
        int i3 = this.payloadType;
        int i4 = this.bitrate;
        int iHashCode3 = this.attributes.hashCode();
        int iHashCode4 = this.rtpMapAttribute.hashCode();
        String str = this.mediaTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.connection;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.key;
        return ((((((((((((((((((iHashCode + 217) * 31) + i2) * 31) + iHashCode2) * 31) + i3) * 31) + i4) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public ImmutableMap<String, String> getFmtpParametersAsMap() {
        String str = (String) this.attributes.get(SessionDescription.ATTR_FMTP);
        if (str == null) {
            return ImmutableMap.of();
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(strArrSplitAtFirst.length == 2, str);
        String[] strArrSplit = strArrSplitAtFirst[1].split(";\\s?", 0);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (String str2 : strArrSplit) {
            String[] strArrSplitAtFirst2 = Util.splitAtFirst(str2, "=");
            builder.put(strArrSplitAtFirst2[0], strArrSplitAtFirst2[1]);
        }
        return builder.buildOrThrow();
    }
}
