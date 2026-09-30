package com.bytedance.adsdk.ugeno.zb.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class lt {
    float[] dj;
    int[] fby;
    int[] jw;
    float[] lt;
    float[] lud;
    float[] sya;
    float[] ul;
    int ycx;
    int zb;

    lt() {
    }

    void ycx(int i2) {
        float[] fArr = this.sya;
        if (fArr == null || fArr.length < i2) {
            this.sya = new float[i2];
            this.dj = new float[i2];
            this.lud = new float[i2];
            this.lt = new float[i2];
            this.ul = new float[i2];
            this.fby = new int[i2];
            this.jw = new int[i2];
        }
    }
}
