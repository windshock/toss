package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok extends dj {
    public ok(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() {
        int i2;
        int i3;
        this.sya.setTag(2097610711, Integer.valueOf(this.zb.dj()));
        View view = this.sya;
        if (view == null || !com.bytedance.sdk.component.adexpress.dj.zb.ycx(view.getContext())) {
            i2 = 1;
            i3 = 0;
        } else {
            i3 = 1;
            i2 = 0;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "shineValue", i3, i2).setDuration((int) (this.zb.jc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        return arrayList;
    }
}
