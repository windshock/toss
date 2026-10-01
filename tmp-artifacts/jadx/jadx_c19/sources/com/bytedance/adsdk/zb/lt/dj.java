package com.bytedance.adsdk.zb.lt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    private float ycx;
    private int zb;

    public void ycx(float f) {
        float f2 = this.ycx + f;
        this.ycx = f2;
        int i2 = this.zb + 1;
        this.zb = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.ycx = f2 / 2.0f;
            this.zb = i2 / 2;
        }
    }
}
