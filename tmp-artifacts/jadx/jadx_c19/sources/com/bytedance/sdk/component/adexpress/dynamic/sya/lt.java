package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lt.pmi;
import com.bytedance.sdk.component.adexpress.lt.thx;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends wie<com.bytedance.sdk.component.adexpress.lt.lt> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.wie
    protected void dj() {
    }

    public lt(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context, ludVar, ulVar);
        this.zb = context;
        this.dj = ulVar;
        this.sya = ludVar;
        ycx(i2, i3, i4, jSONObject, ulVar);
    }

    private void ycx(int i2, int i3, int i4, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) {
        int iRl;
        this.ycx = new com.bytedance.sdk.component.adexpress.lt.lt(this.zb, i2, i3, i4, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.zb;
        if (ulVar.rl() > 0) {
            iRl = ulVar.rl();
        } else {
            iRl = com.bytedance.sdk.component.adexpress.dj.zb() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, iRl);
        this.ycx.setLayoutParams(layoutParams);
        this.ycx.setClipChildren(false);
        this.ycx.setSlideText(this.dj.uf());
        thx thxVar = this.ycx;
        if (thxVar instanceof com.bytedance.sdk.component.adexpress.lt.lt) {
            ((com.bytedance.sdk.component.adexpress.lt.lt) thxVar).setShakeText(this.dj.uz());
            final com.bytedance.sdk.component.adexpress.lt.uh shakeView = ((com.bytedance.sdk.component.adexpress.lt.lt) this.ycx).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new pmi.ycx() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.lt.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.sya.getDynamicClickListener());
            }
        }
    }
}
