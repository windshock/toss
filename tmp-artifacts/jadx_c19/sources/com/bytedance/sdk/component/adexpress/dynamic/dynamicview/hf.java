package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class hf extends ul implements com.bytedance.sdk.component.adexpress.dynamic.sya {
    private boolean htf;
    private boolean ycx;
    private boolean zb;

    public hf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(fbyVar.jc().zb())) {
            dynamicRootView.setTimedown(this.fby);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        if (com.bytedance.sdk.component.adexpress.dj.lt.zb(this.xkz.getRenderRequest().dj())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.ry.jc().zb())) {
            ((TextView) this.syc).setText(String.valueOf((int) Double.parseDouble(this.ok.jc())));
            return true;
        }
        ((TextView) this.syc).setText(((int) Double.parseDouble(this.ok.jc())) + "s");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public void lt() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.ry.jc().zb()) || TextUtils.equals("skip-with-time-countdown", this.ry.jc().zb())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ul, this.fby);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                layoutParams.leftMargin = this.jw;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            setLayoutParams(layoutParams);
            return;
        }
        super.lt();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (TextUtils.isEmpty(((TextView) this.syc).getText())) {
            setMeasuredDimension(0, this.fby);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya
    public void ycx(CharSequence charSequence, boolean z, int i2, boolean z2) {
        String string = "";
        if (z2 || this.htf) {
            ((TextView) this.syc).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61avOJR9JymQWlOg==", "SOs5oQqxbA==", 86);
        }
        setVisibility(0);
        if (!z && this.xkz.getRenderRequest().ycx() && com.bytedance.sdk.component.adexpress.dj.lt.zb(this.xkz.getRenderRequest().dj())) {
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                ((TextView) this.syc).setText(i2 + "s");
            } else {
                ((TextView) this.syc).setText(String.format(com.bytedance.sdk.component.utils.wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_full_skip"), Integer.valueOf(i2)));
            }
            this.ycx = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.dj.zb() && !"open_ad".equals(this.xkz.getRenderRequest().dj()) && this.xkz.getRenderRequest().ycx()) {
            this.htf = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.ry.jc().zb())) {
            ((TextView) this.syc).setText(charSequence);
            return;
        }
        ((TextView) this.syc).setText(((Object) charSequence) + "s");
        this.zb = true;
        if (this.ycx) {
            CharSequence text = ((TextView) this.syc).getText();
            if (text != null) {
                string = text.toString();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.lud.ea.zb(string, this.ok.lud(), true)[0] + com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya() + this.ok.dj())), this.fby);
            layoutParams.gravity = 8388629;
            this.syc.setLayoutParams(layoutParams);
            this.ycx = false;
            requestLayout();
        }
    }
}
