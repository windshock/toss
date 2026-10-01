package com.bytedance.adsdk.zb.ycx.zb;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ul<Integer> {
    public zb(List<com.bytedance.adsdk.zb.ul.ycx<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public Integer ycx(com.bytedance.adsdk.zb.ul.ycx<Integer> ycxVar, float f) {
        return Integer.valueOf(sya(ycxVar, f));
    }

    public int sya(com.bytedance.adsdk.zb.ul.ycx<Integer> ycxVar, float f) {
        if (ycxVar.ycx == null || ycxVar.zb == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.sya != null) {
            Float f2 = ycxVar.ul;
            dj();
            fby();
            throw null;
        }
        return com.bytedance.adsdk.zb.lt.zb.ycx(com.bytedance.adsdk.zb.lt.lud.zb(f, 0.0f, 1.0f), ycxVar.ycx.intValue(), ycxVar.zb.intValue());
    }

    public int jw() {
        return sya(sya(), lud());
    }
}
