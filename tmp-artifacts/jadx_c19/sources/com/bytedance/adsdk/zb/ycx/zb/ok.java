package com.bytedance.adsdk.zb.ycx.zb;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok extends ul<com.bytedance.adsdk.zb.ul.sya> {
    private final com.bytedance.adsdk.zb.ul.sya dj;

    public ok(List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.ul.sya>> list) {
        super(list);
        this.dj = new com.bytedance.adsdk.zb.ul.sya();
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.zb.ul.sya ycx(com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.ul.sya> ycxVar, float f) {
        com.bytedance.adsdk.zb.ul.sya syaVar;
        com.bytedance.adsdk.zb.ul.sya syaVar2 = ycxVar.ycx;
        if (syaVar2 == null || (syaVar = ycxVar.zb) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.zb.ul.sya syaVar3 = syaVar2;
        com.bytedance.adsdk.zb.ul.sya syaVar4 = syaVar;
        if (this.sya != null) {
            Float f2 = ycxVar.ul;
            dj();
            fby();
            throw null;
        }
        this.dj.ycx(com.bytedance.adsdk.zb.lt.lud.ycx(syaVar3.ycx(), syaVar4.ycx(), f), com.bytedance.adsdk.zb.lt.lud.ycx(syaVar3.zb(), syaVar4.zb(), f));
        return this.dj;
    }
}
