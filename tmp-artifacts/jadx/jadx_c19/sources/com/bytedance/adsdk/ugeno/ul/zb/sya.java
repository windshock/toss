package com.bytedance.adsdk.ugeno.ul.zb;

import android.view.View;
import com.bytedance.adsdk.ugeno.jw.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya implements sya.lud {
    final float ycx = 0.8f;
    final float zb = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.jw.sya.lud
    public void ycx(View view, float f) {
        float f2 = ((f < 0.0f ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = f < 0.0f ? 0.5f : -0.5f;
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(Math.abs((f * f3) + 1.0f));
    }
}
