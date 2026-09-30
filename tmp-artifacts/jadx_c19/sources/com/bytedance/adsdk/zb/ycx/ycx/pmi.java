package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Path;
import com.bytedance.adsdk.zb.sya.zb.uh;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class pmi implements ry, ycx.InterfaceC0014ycx {
    private final com.bytedance.adsdk.zb.jw dj;
    private boolean lt;
    private final com.bytedance.adsdk.zb.ycx.zb.ry lud;
    private final boolean sya;
    private final String zb;
    private final Path ycx = new Path();
    private final zb ul = new zb();

    public pmi(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.wie wieVar) {
        this.zb = wieVar.ycx();
        this.sya = wieVar.sya();
        this.dj = jwVar;
        com.bytedance.adsdk.zb.ycx.zb.ry ryVarYcx = wieVar.zb().ycx();
        this.lud = ryVarYcx;
        ycxVar.ycx(ryVarYcx);
        ryVarYcx.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        zb();
    }

    private void zb() {
        this.lt = false;
        this.dj.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(List<sya> list, List<sya> list2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            sya syaVar = list.get(i2);
            if (syaVar instanceof thx) {
                thx thxVar = (thx) syaVar;
                if (thxVar.zb() == uh.ycx.SIMULTANEOUSLY) {
                    this.ul.ycx(thxVar);
                    thxVar.ycx(this);
                } else if (syaVar instanceof uh) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((uh) syaVar);
                }
            }
        }
        this.lud.ycx((List<uh>) arrayList);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        if (this.lt) {
            return this.ycx;
        }
        this.ycx.reset();
        if (this.sya) {
            this.lt = true;
            return this.ycx;
        }
        Path pathUl = this.lud.ul();
        if (pathUl == null) {
            return this.ycx;
        }
        this.ycx.set(pathUl);
        this.ycx.setFillType(Path.FillType.EVEN_ODD);
        this.ul.ycx(this.ycx);
        this.lt = true;
        return this.ycx;
    }
}
