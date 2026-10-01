package com.bytedance.adsdk.zb.ycx.zb;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends ul<com.bytedance.adsdk.zb.sya.zb.dj> {
    private final com.bytedance.adsdk.zb.sya.zb.dj dj;

    public lud(List<com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj>> list) {
        super(list);
        com.bytedance.adsdk.zb.sya.zb.dj djVar = list.get(0).ycx;
        int iSya = djVar != null ? djVar.sya() : 0;
        this.dj = new com.bytedance.adsdk.zb.sya.zb.dj(new float[iSya], new int[iSya]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.zb.sya.zb.dj ycx(com.bytedance.adsdk.zb.ul.ycx<com.bytedance.adsdk.zb.sya.zb.dj> ycxVar, float f) {
        this.dj.ycx(ycxVar.ycx, ycxVar.zb, f);
        return this.dj;
    }
}
