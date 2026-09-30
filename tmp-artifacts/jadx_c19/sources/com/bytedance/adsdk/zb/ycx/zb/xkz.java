package com.bytedance.adsdk.zb.ycx.zb;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xkz extends ycx<PointF, PointF> {
    protected com.bytedance.adsdk.zb.ul.zb<Float> dj;
    private final ycx<Float, Float> fby;
    private final ycx<Float, Float> jw;
    private final PointF lt;
    protected com.bytedance.adsdk.zb.ul.zb<Float> lud;
    private final PointF ul;

    public xkz(ycx<Float, Float> ycxVar, ycx<Float, Float> ycxVar2) {
        super(Collections.EMPTY_LIST);
        this.lt = new PointF();
        this.ul = new PointF();
        this.fby = ycxVar;
        this.jw = ycxVar2;
        ycx(fby());
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    public void ycx(float f) {
        this.fby.ycx(f);
        this.jw.ycx(f);
        this.lt.set(this.fby.ul().floatValue(), this.jw.ul().floatValue());
        for (int i2 = 0; i2 < this.ycx.size(); i2++) {
            this.ycx.get(i2).ycx();
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: jw, reason: merged with bridge method [inline-methods] */
    public PointF ul() {
        return ycx(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx
    /* renamed from: zb, reason: merged with bridge method [inline-methods] */
    public PointF ycx(com.bytedance.adsdk.zb.ul.ycx<PointF> ycxVar, float f) {
        if (this.dj != null && this.fby.sya() != null) {
            this.fby.lud();
            throw null;
        }
        if (this.lud != null && this.jw.sya() != null) {
            this.jw.lud();
            throw null;
        }
        this.ul.set(this.lt.x, 0.0f);
        PointF pointF = this.ul;
        pointF.set(pointF.x, this.lt.y);
        return this.ul;
    }
}
