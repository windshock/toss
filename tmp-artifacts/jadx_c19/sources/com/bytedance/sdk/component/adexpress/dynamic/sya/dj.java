package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lt.thx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj extends wie<com.bytedance.sdk.component.adexpress.lt.ul> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.wie
    protected void dj() {
    }

    public dj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) {
        super(context, ludVar, ulVar);
        ycx(ulVar);
    }

    private void ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) {
        this.ycx = new com.bytedance.sdk.component.adexpress.lt.ul(this.zb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, ulVar.rl());
        this.ycx.setLayoutParams(layoutParams);
        this.ycx.setSlideText(this.dj.uf());
        thx thxVar = this.ycx;
        if (thxVar instanceof com.bytedance.sdk.component.adexpress.lt.ul) {
            ((com.bytedance.sdk.component.adexpress.lt.ul) thxVar).setButtonText(this.dj.jc());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.wie, com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void ycx() throws Throwable {
        this.ycx.ycx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.wie, com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void zb() {
        this.ycx.zb();
    }
}
