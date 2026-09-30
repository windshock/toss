package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul extends dj {
    public ul(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() {
        this.sya.setTag(2097610709, Integer.valueOf(this.zb.sya()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.zb.jc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        return arrayList;
    }
}
