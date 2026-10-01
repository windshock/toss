package com.bytedance.adsdk.zb.ycx.zb;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends ul<Float> {
    public dj(List<com.bytedance.adsdk.zb.ul.ycx<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public Float ycx(com.bytedance.adsdk.zb.ul.ycx<Float> ycxVar, float f) {
        return Float.valueOf(sya(ycxVar, f));
    }

    float sya(com.bytedance.adsdk.zb.ul.ycx<Float> ycxVar, float f) {
        if (ycxVar.ycx == null || ycxVar.zb == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.sya != null) {
            Float f2 = ycxVar.ul;
            dj();
            fby();
            throw null;
        }
        return com.bytedance.adsdk.zb.lt.lud.ycx(ycxVar.lt(), ycxVar.ul(), f);
    }

    public float jw() {
        return sya(sya(), lud());
    }
}
