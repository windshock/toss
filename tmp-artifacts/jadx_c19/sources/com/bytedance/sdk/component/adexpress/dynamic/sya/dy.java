package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lt.htf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy implements ul {
    private com.bytedance.sdk.component.adexpress.dynamic.dj.ul dj;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud sya;
    private htf ycx;
    private Context zb;

    public dy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) {
        this.zb = context;
        this.sya = ludVar;
        this.dj = ulVar;
        dj();
    }

    private void dj() {
        this.ycx = new htf(this.zb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, 120.0f));
        layoutParams.gravity = 17;
        this.ycx.setLayoutParams(layoutParams);
        this.ycx.setClipChildren(false);
        this.ycx.setGuideText(this.dj.uf());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar = this.sya;
        if (ludVar != null) {
            this.ycx.setOnClickListener((View.OnClickListener) ludVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void ycx() throws Throwable {
        htf htfVar = this.ycx;
        if (htfVar != null) {
            htfVar.ycx();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void zb() {
        htf htfVar = this.ycx;
        if (htfVar != null) {
            htfVar.zb();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public ViewGroup sya() {
        return this.ycx;
    }
}
