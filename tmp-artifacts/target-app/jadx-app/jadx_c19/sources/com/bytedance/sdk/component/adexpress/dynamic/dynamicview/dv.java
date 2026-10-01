package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dv extends lt {
    private int ycx;

    public dv(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.ycx = 0;
        com.bytedance.sdk.component.adexpress.lt.tn tnVar = new com.bytedance.sdk.component.adexpress.lt.tn(context, null);
        this.syc = tnVar;
        tnVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.syc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iYcx = (int) ((com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.lud()) * 5.0f) + com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya() + com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.dj())));
        if (this.ul > iYcx && 4 == this.ok.fby()) {
            this.ycx = (this.ul - iYcx) / 2;
        }
        this.ul = iYcx;
        return new FrameLayout.LayoutParams(this.ul, this.fby);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public void lt() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ul, this.fby);
        layoutParams.topMargin = this.jc;
        int i2 = this.jw + this.ycx;
        layoutParams.leftMargin = i2;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        DynamicRootView dynamicRootView;
        super.jw();
        double dRy = this.ok.ry();
        if (com.bytedance.sdk.component.adexpress.dj.zb() && (dRy < 0.0d || dRy > 5.0d || ((dynamicRootView = this.xkz) != null && dynamicRootView.getRenderRequest() != null && this.xkz.getRenderRequest().jc() != 4))) {
            this.syc.setVisibility(8);
            return true;
        }
        double d = (dRy < 0.0d || dRy > 5.0d) ? 5.0d : dRy;
        this.syc.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.lt.tn) this.syc).ycx(d, this.ok.ul(), (int) this.ok.lud(), ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.zb())) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.ycx())) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.lud())));
        return true;
    }
}
