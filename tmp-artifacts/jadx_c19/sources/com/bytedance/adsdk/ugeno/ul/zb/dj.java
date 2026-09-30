package com.bytedance.adsdk.ugeno.ul.zb;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.jw.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj implements sya.lud {
    private String ycx;

    public void ycx(String str) {
        this.ycx = str;
    }

    @Override // com.bytedance.adsdk.ugeno.jw.sya.lud
    public void ycx(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        } else {
            view.setAlpha(0.0f);
        }
        if (TextUtils.equals(this.ycx, "cube")) {
            float height = f < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }
}
