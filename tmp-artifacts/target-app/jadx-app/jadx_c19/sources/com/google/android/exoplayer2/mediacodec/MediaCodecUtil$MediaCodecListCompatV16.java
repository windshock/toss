package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MediaCodecUtil$MediaCodecListCompatV16 implements MediaCodecUtil$MediaCodecListCompat {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean secureDecodersExplicit() {
        return false;
    }

    private MediaCodecUtil$MediaCodecListCompatV16() {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public MediaCodecInfo getCodecInfoAt(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
