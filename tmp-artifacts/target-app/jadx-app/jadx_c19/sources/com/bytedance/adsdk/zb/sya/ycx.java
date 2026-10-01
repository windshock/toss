package com.bytedance.adsdk.zb.sya;

import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private final PointF sya;
    private final PointF ycx;
    private final PointF zb;

    public ycx() {
        this.ycx = new PointF();
        this.zb = new PointF();
        this.sya = new PointF();
    }

    public ycx(PointF pointF, PointF pointF2, PointF pointF3) {
        this.ycx = pointF;
        this.zb = pointF2;
        this.sya = pointF3;
    }

    public void ycx(float f, float f2) {
        this.ycx.set(f, f2);
    }

    public PointF ycx() {
        return this.ycx;
    }

    public void zb(float f, float f2) {
        this.zb.set(f, f2);
    }

    public PointF zb() {
        return this.zb;
    }

    public void sya(float f, float f2) {
        this.sya.set(f, f2);
    }

    public PointF sya() {
        return this.sya;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.sya.x), Float.valueOf(this.sya.y), Float.valueOf(this.ycx.x), Float.valueOf(this.ycx.y), Float.valueOf(this.zb.x), Float.valueOf(this.zb.y));
    }
}
