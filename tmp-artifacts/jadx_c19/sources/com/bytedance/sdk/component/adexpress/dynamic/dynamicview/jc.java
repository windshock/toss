package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends lt {
    public jc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            ImageView imageView = new ImageView(context);
            this.syc = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.ul = this.fby;
        } else {
            this.syc = new TextView(context);
        }
        this.syc.setTag(3);
        addView(this.syc, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().fby() && dynamicRootView.getRenderRequest().hf()) {
                return;
            }
            this.syc.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
            return true;
        }
        Drawable drawableYcx = com.bytedance.sdk.component.adexpress.dj.sya.ycx(getContext(), this.ok);
        if (drawableYcx != null) {
            ((ImageView) this.syc).setBackground(drawableYcx);
        }
        ((ImageView) this.syc).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iDj = com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_reward_full_feedback");
        if (iDj <= 0) {
            return true;
        }
        ((ImageView) this.syc).setImageResource(iDj);
        return true;
    }
}
