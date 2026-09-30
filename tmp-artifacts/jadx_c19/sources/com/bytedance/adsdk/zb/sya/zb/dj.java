package com.bytedance.adsdk.zb.sya.zb;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    private final float[] ycx;
    private final int[] zb;

    public dj(float[] fArr, int[] iArr) {
        this.ycx = fArr;
        this.zb = iArr;
    }

    public float[] ycx() {
        return this.ycx;
    }

    public int[] zb() {
        return this.zb;
    }

    public int sya() {
        return this.zb.length;
    }

    public void ycx(dj djVar, dj djVar2, float f) {
        if (djVar.zb.length != djVar2.zb.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + djVar.zb.length + " vs " + djVar2.zb.length + ")");
        }
        for (int i2 = 0; i2 < djVar.zb.length; i2++) {
            this.ycx[i2] = com.bytedance.adsdk.zb.lt.lud.ycx(djVar.ycx[i2], djVar2.ycx[i2], f);
            this.zb[i2] = com.bytedance.adsdk.zb.lt.zb.ycx(f, djVar.zb[i2], djVar2.zb[i2]);
        }
    }

    public dj ycx(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            iArr[i2] = ycx(fArr[i2]);
        }
        return new dj(fArr, iArr);
    }

    private int ycx(float f) {
        int iBinarySearch = Arrays.binarySearch(this.ycx, f);
        if (iBinarySearch >= 0) {
            return this.zb[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        if (i2 == 0) {
            return this.zb[0];
        }
        int[] iArr = this.zb;
        if (i2 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.ycx;
        int i3 = i2 - 1;
        float f2 = fArr[i3];
        return com.bytedance.adsdk.zb.lt.zb.ycx((f - f2) / (fArr[i2] - f2), iArr[i3], iArr[i2]);
    }
}
