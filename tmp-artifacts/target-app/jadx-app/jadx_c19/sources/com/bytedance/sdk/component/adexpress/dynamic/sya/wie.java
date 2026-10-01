package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lt.thx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie<E extends thx> implements ul<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.dj.ul dj;
    protected int lud;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud sya;
    protected thx ycx;
    protected Context zb;

    public wie(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar, int i2) {
        this.lud = i2;
        this.zb = context;
        this.sya = ludVar;
        this.dj = ulVar;
        dj();
    }

    public wie(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) {
        this(context, ludVar, ulVar, 0);
    }

    protected void dj() {
        this.ycx = new thx(this.zb, this.dj.dc());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, 100 - this.lud);
        this.ycx.setLayoutParams(layoutParams);
        try {
            this.ycx.setGuideText(this.dj.uf());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "aOIkkQaJee6OXtJPjRK0", "UuAkgTW1bNA=", 43);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void ycx() throws Throwable {
        this.ycx.ycx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void zb() {
        this.ycx.zb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    /* renamed from: lud, reason: merged with bridge method [inline-methods] */
    public E sya() {
        return (E) this.ycx;
    }
}
