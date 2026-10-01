package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface MediaCodecUtil$MediaCodecListCompat {
    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i2);

    boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean secureDecodersExplicit();
}
