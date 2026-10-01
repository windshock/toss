package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends lt {
    public jw(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            this.syc = new ImageView(context);
        } else {
            this.syc = new com.bytedance.sdk.component.adexpress.lt.jw(context);
        }
        this.syc.setTag(3);
        addView(this.syc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            Drawable drawableYcx = com.bytedance.sdk.component.adexpress.dj.sya.ycx(getContext(), this.ok);
            if (drawableYcx != null) {
                this.syc.setBackground(drawableYcx);
            }
            int iDj = com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_close_btn");
            if (iDj > 0) {
                ((ImageView) this.syc).setImageResource(iDj);
            }
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.wie());
        View view = this.syc;
        if (view instanceof com.bytedance.sdk.component.adexpress.lt.jw) {
            ((com.bytedance.sdk.component.adexpress.lt.jw) view).setRadius((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.syc()));
            ((com.bytedance.sdk.component.adexpress.lt.jw) this.syc).setStrokeWidth(iYcx);
            ((com.bytedance.sdk.component.adexpress.lt.jw) this.syc).setStrokeColor(this.ok.dy());
            ((com.bytedance.sdk.component.adexpress.lt.jw) this.syc).setBgColor(this.ok.bhi());
            ((com.bytedance.sdk.component.adexpress.lt.jw) this.syc).setDislikeColor(this.ok.ul());
            ((com.bytedance.sdk.component.adexpress.lt.jw) this.syc).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, 1.0f));
        }
        return true;
    }
}
