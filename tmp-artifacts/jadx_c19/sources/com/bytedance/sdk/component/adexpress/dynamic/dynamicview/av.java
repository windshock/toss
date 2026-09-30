package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class av extends lt implements com.bytedance.sdk.component.adexpress.dynamic.sya {
    private boolean ycx;

    public av(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.ul = this.fby;
        ImageView imageView = new ImageView(context);
        this.syc = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.syc, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().hf()) {
                this.syc.setVisibility(8);
                setVisibility(8);
            }
            this.ycx = dynamicRootView.getRenderRequest().ry();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        Drawable drawableSya;
        super.jw();
        View view = this.syc;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableYcx = com.bytedance.sdk.component.adexpress.dj.sya.ycx(getContext(), this.ok);
            if (drawableYcx != null) {
                ((ImageView) this.syc).setBackground(drawableYcx);
            }
            if (this.ycx) {
                drawableSya = com.bytedance.sdk.component.utils.wwx.sya(getContext(), "tt_close_btn");
            } else {
                drawableSya = com.bytedance.sdk.component.utils.wwx.sya(getContext(), "tt_skip_btn");
            }
            if (drawableSya != null) {
                drawableSya.setAutoMirrored(true);
                ((ImageView) this.syc).setImageDrawable(drawableSya);
            }
            int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.zb());
            this.syc.setPadding(iYcx, iYcx, iYcx, iYcx);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya
    public void ycx(CharSequence charSequence, boolean z, int i2, boolean z2) {
        setVisibility((z || z2) ? 0 : 8);
    }
}
