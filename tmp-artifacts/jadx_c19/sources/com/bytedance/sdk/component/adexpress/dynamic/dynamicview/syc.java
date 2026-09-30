package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc extends lt {
    String ycx;
    com.bytedance.sdk.component.adexpress.dynamic.dj.fby zb;

    public syc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar, String str) {
        super(context, dynamicRootView, fbyVar);
        this.ycx = str;
        this.zb = fbyVar;
        com.bytedance.sdk.component.adexpress.lt.jc lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.lt.jc getLottieView() {
        String strGiw;
        com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar = this.ry;
        if (fbyVar == null || fbyVar.jc() == null || this.ea == null || TextUtils.isEmpty(this.ycx)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = this.ry.jc().lud();
        if (ltVarLud == null) {
            strGiw = "";
        } else {
            strGiw = ltVarLud.giw();
        }
        if (TextUtils.isEmpty(strGiw)) {
            return null;
        }
        String str = this.ycx + "static/lotties/" + strGiw + ".json";
        com.bytedance.sdk.component.adexpress.lt.jc jcVar = new com.bytedance.sdk.component.adexpress.lt.jc(this.ea);
        jcVar.setImageLottieTosPath(str);
        jcVar.fby();
        return jcVar;
    }
}
