package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class syc extends dj {
    public syc(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() {
        float f;
        float fYcx = com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.lt());
        float fYcx2 = com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.zb.ul());
        float f2 = 0.0f;
        if ("reverse".equals(this.zb.dy())) {
            f = fYcx2;
            fYcx2 = 0.0f;
            f2 = fYcx;
            fYcx = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.dj.zb.ycx(this.sya.getContext())) {
            fYcx = -fYcx;
            f2 = -f2;
        }
        this.sya.setTranslationX(fYcx);
        this.sya.setTranslationY(fYcx2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "translationX", fYcx, f2).setDuration((int) (this.zb.jc() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.sya, "translationY", fYcx2, f).setDuration((int) (this.zb.jc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        arrayList.add(ycx(duration2));
        return arrayList;
    }
}
