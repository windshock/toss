package com.bytedance.adsdk.zb.ycx.ycx;

import com.bytedance.adsdk.zb.sya.zb.uh;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class thx implements sya, ycx.InterfaceC0014ycx {
    private final uh.ycx dj;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> lt;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> lud;
    private final List<ycx.InterfaceC0014ycx> sya = new ArrayList();
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> ul;
    private final String ycx;
    private final boolean zb;

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
    }

    public thx(com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.uh uhVar) {
        this.ycx = uhVar.ycx();
        this.zb = uhVar.lt();
        this.dj = uhVar.zb();
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = uhVar.dj().ycx();
        this.lud = ycxVarYcx;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx2 = uhVar.sya().ycx();
        this.lt = ycxVarYcx2;
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx3 = uhVar.lud().ycx();
        this.ul = ycxVarYcx3;
        ycxVar.ycx(ycxVarYcx);
        ycxVar.ycx(ycxVarYcx2);
        ycxVar.ycx(ycxVarYcx3);
        ycxVarYcx.ycx(this);
        ycxVarYcx2.ycx(this);
        ycxVarYcx3.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        for (int i2 = 0; i2 < this.sya.size(); i2++) {
            this.sya.get(i2).ycx();
        }
    }

    void ycx(ycx.InterfaceC0014ycx interfaceC0014ycx) {
        this.sya.add(interfaceC0014ycx);
    }

    uh.ycx zb() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> sya() {
        return this.lud;
    }

    public com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> dj() {
        return this.lt;
    }

    public com.bytedance.adsdk.zb.ycx.zb.ycx<?, Float> lud() {
        return this.ul;
    }

    public boolean lt() {
        return this.zb;
    }
}
