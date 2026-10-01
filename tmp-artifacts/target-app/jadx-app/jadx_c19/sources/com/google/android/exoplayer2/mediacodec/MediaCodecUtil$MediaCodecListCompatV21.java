package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MediaCodecUtil$MediaCodecListCompatV21 implements MediaCodecUtil$MediaCodecListCompat {
    private final int codecKind;
    private MediaCodecInfo[] mediaCodecInfos;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean secureDecodersExplicit() {
        return true;
    }

    public MediaCodecUtil$MediaCodecListCompatV21(boolean z, boolean z2) {
        this.codecKind = (z || z2) ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public int getCodecCount() {
        ensureMediaCodecInfosInitialized();
        return this.mediaCodecInfos.length;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public MediaCodecInfo getCodecInfoAt(int i2) {
        ensureMediaCodecInfosInitialized();
        return this.mediaCodecInfos[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat
    public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull
    private void ensureMediaCodecInfosInitialized() {
        if (this.mediaCodecInfos == null) {
            this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
        }
    }
}
