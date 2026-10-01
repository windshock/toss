package com.bytedance.adsdk.zb.sya.ycx;

import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends xkz<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> {
    @Override // com.bytedance.adsdk.zb.sya.ycx.xkz, com.bytedance.adsdk.zb.sya.ycx.ry
    public /* bridge */ /* synthetic */ List sya() {
        return super.sya();
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.xkz
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.xkz, com.bytedance.adsdk.zb.sya.ycx.ry
    public /* bridge */ /* synthetic */ boolean zb() {
        return super.zb();
    }

    public sya(List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj>> list) {
        super(ycx(list));
    }

    private static List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj>> ycx(List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj>> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, ycx(list.get(i2)));
        }
        return list;
    }

    private static com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj> ycx(com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj> ycxVar) {
        com.bytedance.adsdk.zb.sya.zb.dj djVar = ycxVar.ycx;
        com.bytedance.adsdk.zb.sya.zb.dj djVar2 = ycxVar.zb;
        if (djVar == null || djVar2 == null || djVar.ycx().length == djVar2.ycx().length) {
            return ycxVar;
        }
        float[] fArrYcx = ycx(djVar.ycx(), djVar2.ycx());
        return ycxVar.ycx(djVar.ycx(fArrYcx), djVar2.ycx(fArrYcx));
    }

    static float[] ycx(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = fArr3[i3];
            if (f2 != f) {
                fArr3[i2] = f2;
                i2++;
                f = fArr3[i3];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i2);
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public com.bytedance.adsdk.zb.ycx.zb.ycx<com.bytedance.adsdk.zb.sya.zb.dj, com.bytedance.adsdk.zb.sya.zb.dj> ycx() {
        return new com.bytedance.adsdk.zb.ycx.zb.lud(this.ycx);
    }
}
