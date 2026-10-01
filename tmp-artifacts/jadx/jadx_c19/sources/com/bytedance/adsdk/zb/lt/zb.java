package com.bytedance.adsdk.zb.lt;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private static float ycx(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float zb(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int ycx(float f, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f2 = (i2 >>> 24) / 255.0f;
        float f3 = ((i2 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f;
        float f4 = ((i2 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f;
        float f5 = (i3 >>> 24) / 255.0f;
        float f6 = ((i3 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f;
        float f7 = ((i3 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f;
        float fZb = zb(f3);
        float fZb2 = zb(f4);
        float fZb3 = zb((i2 & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f);
        float fZb4 = zb(f6);
        float fZb5 = zb(f7);
        float fZb6 = zb((i3 & OggPageHeader.MAX_SEGMENT_COUNT) / 255.0f);
        return (Math.round((f2 + ((f5 - f2) * f)) * 255.0f) << 24) | (Math.round(ycx(fZb + ((fZb4 - fZb) * f)) * 255.0f) << 16) | (Math.round(ycx(fZb2 + ((fZb5 - fZb2) * f)) * 255.0f) << 8) | Math.round(ycx(fZb3 + ((fZb6 - fZb3) * f)) * 255.0f);
    }
}
