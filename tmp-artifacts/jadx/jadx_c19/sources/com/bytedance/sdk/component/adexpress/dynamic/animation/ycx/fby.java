package com.bytedance.sdk.component.adexpress.dynamic.animation.ycx;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby extends dj {
    public fby(View view, com.bytedance.sdk.component.adexpress.dynamic.dj.ycx ycxVar) {
        super(view, ycxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ycx.dj
    List<ObjectAnimator> ycx() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.sya, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.zb.jc() * 1000.0d));
        ((ViewGroup) this.sya.getParent()).setClipChildren(false);
        ((ViewGroup) this.sya.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.sya.getParent().getParent().getParent()).setClipChildren(false);
        this.sya.setTag(2097610712, this.zb.fby());
        ArrayList arrayList = new ArrayList();
        arrayList.add(ycx(duration));
        return arrayList;
    }
}
