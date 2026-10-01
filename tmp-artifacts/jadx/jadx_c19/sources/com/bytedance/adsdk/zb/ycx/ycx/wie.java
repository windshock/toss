package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.PointF;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie implements uh, ycx.InterfaceC0014ycx {
    private com.bytedance.adsdk.zb.sya.zb.xkz dj;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> sya;
    private final com.bytedance.adsdk.zb.jw ycx;
    private final String zb;

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
    }

    public wie(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.ry ryVar) {
        this.ycx = jwVar;
        this.zb = ryVar.ycx();
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = ryVar.zb().ycx();
        this.sya = ycxVarYcx;
        ycxVar.ycx(ycxVarYcx);
        ycxVarYcx.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.ycx.invalidateSelf();
    }

    public com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> zb() {
        return this.sya;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    @Override // com.bytedance.adsdk.zb.ycx.ycx.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.zb.sya.zb.xkz ycx(com.bytedance.adsdk.zb.sya.zb.xkz xkzVar) {
        boolean z;
        List<com.bytedance.adsdk.zb.sya.ycx> list;
        com.bytedance.adsdk.zb.sya.zb.xkz xkzVar2;
        List<com.bytedance.adsdk.zb.sya.ycx> list2;
        int i2;
        List<com.bytedance.adsdk.zb.sya.ycx> listSya = xkzVar.sya();
        if (listSya.size() > 2) {
            float fFloatValue = this.sya.ul().floatValue();
            if (fFloatValue != 0.0f) {
                com.bytedance.adsdk.zb.sya.zb.xkz xkzVarZb = zb(xkzVar);
                xkzVarZb.ycx(xkzVar.ycx().x, xkzVar.ycx().y);
                List<com.bytedance.adsdk.zb.sya.ycx> listSya2 = xkzVarZb.sya();
                boolean zZb = xkzVar.zb();
                int i3 = 0;
                int i4 = 0;
                while (i3 < listSya.size()) {
                    com.bytedance.adsdk.zb.sya.ycx ycxVar = listSya.get(i3);
                    com.bytedance.adsdk.zb.sya.ycx ycxVar2 = listSya.get(ycx(i3 - 1, listSya.size()));
                    com.bytedance.adsdk.zb.sya.ycx ycxVar3 = listSya.get(ycx(i3 - 2, listSya.size()));
                    PointF pointFSya = (i3 != 0 || zZb) ? ycxVar2.sya() : xkzVar.ycx();
                    PointF pointFZb = (i3 != 0 || zZb) ? ycxVar2.zb() : pointFSya;
                    PointF pointFYcx = ycxVar.ycx();
                    PointF pointFSya2 = ycxVar3.sya();
                    PointF pointFSya3 = ycxVar.sya();
                    if (xkzVar.zb() || i3 != 0) {
                        z = false;
                    } else {
                        z = true;
                        if (i3 != listSya.size() - 1) {
                        }
                    }
                    if (pointFZb.equals(pointFSya) && pointFYcx.equals(pointFSya) && !z) {
                        float f = pointFSya.x;
                        float f2 = pointFSya2.x;
                        float f3 = pointFSya.y;
                        float f4 = pointFSya2.y;
                        float f5 = pointFSya3.x;
                        list = listSya;
                        float f6 = pointFSya3.y;
                        com.bytedance.adsdk.zb.sya.zb.xkz xkzVar3 = xkzVarZb;
                        List<com.bytedance.adsdk.zb.sya.ycx> list3 = listSya2;
                        double d = f - f2;
                        float f7 = f3 - f4;
                        i2 = i3;
                        int i5 = i4;
                        float fHypot = (float) Math.hypot(d, f7);
                        float fHypot2 = (float) Math.hypot(f5 - f, f6 - f3);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f8 = pointFSya.x;
                        float f9 = ((pointFSya2.x - f8) * fMin) + f8;
                        float f10 = pointFSya.y;
                        float f11 = ((pointFSya2.y - f10) * fMin) + f10;
                        float f12 = ((pointFSya3.x - f8) * fMin2) + f8;
                        float f13 = ((pointFSya3.y - f10) * fMin2) + f10;
                        list2 = list3;
                        com.bytedance.adsdk.zb.sya.ycx ycxVar4 = list2.get(ycx(i5 - 1, list3.size()));
                        com.bytedance.adsdk.zb.sya.ycx ycxVar5 = list2.get(i5);
                        ycxVar4.zb(f9, f11);
                        ycxVar4.sya(f9, f11);
                        xkzVar2 = xkzVar3;
                        if (i2 == 0) {
                            xkzVar2.ycx(f9, f11);
                        }
                        ycxVar5.ycx(f9 - ((f9 - f8) * 0.5519f), f11 - ((f11 - f10) * 0.5519f));
                        com.bytedance.adsdk.zb.sya.ycx ycxVar6 = list2.get(i5 + 1);
                        ycxVar5.zb(f12 - ((f12 - f8) * 0.5519f), f13 - ((f13 - f10) * 0.5519f));
                        ycxVar5.sya(f12, f13);
                        ycxVar6.ycx(f12, f13);
                        i4 = i5 + 2;
                    } else {
                        list = listSya;
                        xkzVar2 = xkzVarZb;
                        list2 = listSya2;
                        i2 = i3;
                        int i6 = i4;
                        com.bytedance.adsdk.zb.sya.ycx ycxVar7 = list2.get(ycx(i6 - 1, list2.size()));
                        com.bytedance.adsdk.zb.sya.ycx ycxVar8 = list2.get(i6);
                        ycxVar7.zb(ycxVar2.zb().x, ycxVar2.zb().y);
                        ycxVar7.sya(ycxVar2.sya().x, ycxVar2.sya().y);
                        ycxVar8.ycx(ycxVar.ycx().x, ycxVar.ycx().y);
                        i4 = i6 + 1;
                    }
                    i3 = i2 + 1;
                    xkzVarZb = xkzVar2;
                    listSya2 = list2;
                    listSya = list;
                }
                return xkzVarZb;
            }
        }
        return xkzVar;
    }

    private com.bytedance.adsdk.zb.sya.zb.xkz zb(com.bytedance.adsdk.zb.sya.zb.xkz xkzVar) {
        List<com.bytedance.adsdk.zb.sya.ycx> listSya = xkzVar.sya();
        boolean zZb = xkzVar.zb();
        int size = listSya.size() - 1;
        int i2 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.zb.sya.ycx ycxVar = listSya.get(size);
            com.bytedance.adsdk.zb.sya.ycx ycxVar2 = listSya.get(ycx(size - 1, listSya.size()));
            PointF pointFSya = (size != 0 || zZb) ? ycxVar2.sya() : xkzVar.ycx();
            i2 = (((size != 0 || zZb) ? ycxVar2.zb() : pointFSya).equals(pointFSya) && ycxVar.ycx().equals(pointFSya) && !(!xkzVar.zb() && size == 0 && size == listSya.size() - 1)) ? i2 + 2 : i2 + 1;
            size--;
        }
        com.bytedance.adsdk.zb.sya.zb.xkz xkzVar2 = this.dj;
        if (xkzVar2 == null || xkzVar2.sya().size() != i2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new com.bytedance.adsdk.zb.sya.ycx());
            }
            this.dj = new com.bytedance.adsdk.zb.sya.zb.xkz(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.dj.ycx(zZb);
        return this.dj;
    }

    private static int ycx(int i2, int i3) {
        return i2 - (zb(i2, i3) * i3);
    }

    private static int zb(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i4 == i2) ? i4 : i4 - 1;
    }
}
