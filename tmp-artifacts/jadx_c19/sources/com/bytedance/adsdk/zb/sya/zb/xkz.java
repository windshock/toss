package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xkz {
    private boolean sya;
    private final List<com.bytedance.adsdk.zb.sya.ycx> ycx;
    private PointF zb;

    public xkz(PointF pointF, boolean z, List<com.bytedance.adsdk.zb.sya.ycx> list) {
        this.zb = pointF;
        this.sya = z;
        this.ycx = new ArrayList(list);
    }

    public xkz() {
        this.ycx = new ArrayList();
    }

    public void ycx(float f, float f2) {
        if (this.zb == null) {
            this.zb = new PointF();
        }
        this.zb.set(f, f2);
    }

    public PointF ycx() {
        return this.zb;
    }

    public void ycx(boolean z) {
        this.sya = z;
    }

    public boolean zb() {
        return this.sya;
    }

    public List<com.bytedance.adsdk.zb.sya.ycx> sya() {
        return this.ycx;
    }

    public void ycx(xkz xkzVar, xkz xkzVar2, float f) {
        if (this.zb == null) {
            this.zb = new PointF();
        }
        this.sya = xkzVar.zb() || xkzVar2.zb();
        if (xkzVar.sya().size() != xkzVar2.sya().size()) {
            xkzVar.sya().size();
            xkzVar2.sya().size();
        }
        int iMin = Math.min(xkzVar.sya().size(), xkzVar2.sya().size());
        if (this.ycx.size() < iMin) {
            for (int size = this.ycx.size(); size < iMin; size++) {
                this.ycx.add(new com.bytedance.adsdk.zb.sya.ycx());
            }
        } else if (this.ycx.size() > iMin) {
            for (int size2 = this.ycx.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.zb.sya.ycx> list = this.ycx;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFYcx = xkzVar.ycx();
        PointF pointFYcx2 = xkzVar2.ycx();
        ycx(com.bytedance.adsdk.zb.lt.lud.ycx(pointFYcx.x, pointFYcx2.x, f), com.bytedance.adsdk.zb.lt.lud.ycx(pointFYcx.y, pointFYcx2.y, f));
        for (int size3 = this.ycx.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.zb.sya.ycx ycxVar = xkzVar.sya().get(size3);
            com.bytedance.adsdk.zb.sya.ycx ycxVar2 = xkzVar2.sya().get(size3);
            PointF pointFYcx3 = ycxVar.ycx();
            PointF pointFZb = ycxVar.zb();
            PointF pointFSya = ycxVar.sya();
            PointF pointFYcx4 = ycxVar2.ycx();
            PointF pointFZb2 = ycxVar2.zb();
            PointF pointFSya2 = ycxVar2.sya();
            this.ycx.get(size3).ycx(com.bytedance.adsdk.zb.lt.lud.ycx(pointFYcx3.x, pointFYcx4.x, f), com.bytedance.adsdk.zb.lt.lud.ycx(pointFYcx3.y, pointFYcx4.y, f));
            this.ycx.get(size3).zb(com.bytedance.adsdk.zb.lt.lud.ycx(pointFZb.x, pointFZb2.x, f), com.bytedance.adsdk.zb.lt.lud.ycx(pointFZb.y, pointFZb2.y, f));
            this.ycx.get(size3).sya(com.bytedance.adsdk.zb.lt.lud.ycx(pointFSya.x, pointFSya2.x, f), com.bytedance.adsdk.zb.lt.lud.ycx(pointFSya.y, pointFSya2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.ycx.size() + "closed=" + this.sya + '}';
    }
}
