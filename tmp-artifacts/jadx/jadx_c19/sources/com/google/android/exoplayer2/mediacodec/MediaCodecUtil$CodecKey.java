package com.google.android.exoplayer2.mediacodec;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MediaCodecUtil$CodecKey {
    public final String mimeType;
    public final boolean secure;
    public final boolean tunneling;

    public MediaCodecUtil$CodecKey(String str, boolean z, boolean z2) {
        this.mimeType = str;
        this.secure = z;
        this.tunneling = z2;
    }

    public int hashCode() {
        int iHashCode = this.mimeType.hashCode();
        return ((((iHashCode + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != MediaCodecUtil$CodecKey.class) {
            return false;
        }
        MediaCodecUtil$CodecKey mediaCodecUtil$CodecKey = (MediaCodecUtil$CodecKey) obj;
        return TextUtils.equals(this.mimeType, mediaCodecUtil$CodecKey.mimeType) && this.secure == mediaCodecUtil$CodecKey.secure && this.tunneling == mediaCodecUtil$CodecKey.tunneling;
    }
}
