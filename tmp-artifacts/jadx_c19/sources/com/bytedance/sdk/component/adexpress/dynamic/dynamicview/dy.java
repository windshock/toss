package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy extends lt implements com.bytedance.sdk.component.adexpress.dynamic.zb {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public boolean lud() {
        return true;
    }

    public dy(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        ImageView imageView = new ImageView(context);
        this.syc = imageView;
        imageView.setTag(5);
        addView(this.syc, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().hf()) {
            return;
        }
        this.syc.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.syc).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.xkz.mIsMute);
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            Drawable drawableYcx = com.bytedance.sdk.component.adexpress.dj.sya.ycx(getContext(), this.ok);
            if (drawableYcx == null) {
                return true;
            }
            ((ImageView) this.syc).setBackground(drawableYcx);
            return true;
        }
        int iBhi = this.ok.bhi();
        ((ImageView) this.syc).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.dj.fby.ycx(0, Integer.valueOf(iBhi), new int[]{this.fby / 2}, null, null, null));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zb
    public void setSoundMute(boolean z) {
        int iDj;
        if (z) {
            iDj = com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_reward_full_mute");
        } else {
            iDj = com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_reward_full_unmute");
        }
        ((ImageView) this.syc).setImageResource(iDj);
        if (((ImageView) this.syc).getDrawable() != null) {
            ((ImageView) this.syc).getDrawable().setAutoMirrored(true);
        }
    }
}
