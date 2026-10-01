package com.bytedance.adsdk.zb.ul;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private float ycx;
    private float zb;

    public sya(float f, float f2) {
        this.ycx = f;
        this.zb = f2;
    }

    public sya() {
        this(1.0f, 1.0f);
    }

    public float ycx() {
        return this.ycx;
    }

    public float zb() {
        return this.zb;
    }

    public void ycx(float f, float f2) {
        this.ycx = f;
        this.zb = f2;
    }

    public boolean zb(float f, float f2) {
        return this.ycx == f && this.zb == f2;
    }

    public String toString() {
        return ycx() + "x" + zb();
    }
}
