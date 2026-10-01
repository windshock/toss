package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lt.pmi;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc implements ul<com.bytedance.sdk.component.adexpress.lt.pmi> {
    private com.bytedance.sdk.component.adexpress.dynamic.dj.ul dj;
    private int fby;
    private JSONObject jw;
    private int lt;
    private String lud;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud sya;
    private int ul;
    private com.bytedance.sdk.component.adexpress.lt.pmi ycx;
    private Context zb;

    public syc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar, String str, int i2, int i3, int i4, JSONObject jSONObject) {
        this.zb = context;
        this.sya = ludVar;
        this.dj = ulVar;
        this.lud = str;
        this.lt = i2;
        this.ul = i3;
        this.fby = i4;
        this.jw = jSONObject;
        lud();
    }

    private void lud() {
        final View.OnClickListener dynamicClickListener = this.sya.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "aOYsngaVZ9OFWNZemA==", "UuAkgTW1bNA=", 49);
        }
        if ("16".equals(this.lud)) {
            Context context = this.zb;
            com.bytedance.sdk.component.adexpress.lt.pmi pmiVar = new com.bytedance.sdk.component.adexpress.lt.pmi(context, com.bytedance.sdk.component.adexpress.sya.ycx.fby(context), this.lt, this.ul, this.fby, this.jw);
            this.ycx = pmiVar;
            if (pmiVar.getShakeLayout() != null) {
                this.ycx.getShakeLayout().setOnClickListener(dynamicClickListener);
            }
        } else {
            Context context2 = this.zb;
            this.ycx = new com.bytedance.sdk.component.adexpress.lt.pmi(context2, com.bytedance.sdk.component.adexpress.sya.ycx.ul(context2), this.lt, this.ul, this.fby, this.jw);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.ycx.setGravity(17);
        layoutParams.gravity = 17;
        this.ycx.setLayoutParams(layoutParams);
        this.ycx.setTranslationY(com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.zb, this.dj.giw()));
        this.ycx.setShakeText(this.dj.uf());
        this.ycx.setClipChildren(false);
        this.ycx.setOnShakeViewListener(new pmi.ycx() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.syc.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void ycx() throws Throwable {
        this.ycx.ycx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    public void zb() {
        this.ycx.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.ul
    /* renamed from: dj, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.lt.pmi sya() {
        return this.ycx;
    }
}
