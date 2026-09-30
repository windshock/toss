package com.bytedance.adsdk.ugeno.ul.zb;

import android.view.View;
import com.bytedance.adsdk.ugeno.jw.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx implements sya.lud {
    @Override // com.bytedance.adsdk.ugeno.jw.sya.lud
    public void ycx(View view, float f) {
        float width = f < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight();
        view.setPivotX(width);
        view.setPivotY(height * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
