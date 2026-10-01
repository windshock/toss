package com.bytedance.adsdk.zb.ycx.zb;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends ul<Integer> {
    public lt(List<com.bytedance.adsdk.zb.ul.ycx<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public Integer ycx(com.bytedance.adsdk.zb.ul.ycx<Integer> ycxVar, float f) {
        return Integer.valueOf(sya(ycxVar, f));
    }

    int sya(com.bytedance.adsdk.zb.ul.ycx<Integer> ycxVar, float f) {
        if (ycxVar.ycx == null || ycxVar.zb == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.sya != null) {
            Float f2 = ycxVar.ul;
            dj();
            fby();
            throw null;
        }
        return com.bytedance.adsdk.zb.lt.lud.ycx(ycxVar.fby(), ycxVar.jw(), f);
    }

    public int jw() {
        return sya(sya(), lud());
    }
}
