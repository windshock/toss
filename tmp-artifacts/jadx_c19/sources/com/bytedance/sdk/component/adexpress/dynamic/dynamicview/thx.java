package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class thx extends ul implements com.bytedance.sdk.component.adexpress.dynamic.sya {
    private int htf;
    private int[] ycx;
    private int zb;

    public thx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        ((TextView) this.syc).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public void lt() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ul, this.fby);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (TextUtils.isEmpty(((TextView) this.syc).getText())) {
            setMeasuredDimension(0, this.fby);
        } else {
            setMeasuredDimension(this.ul, this.fby);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya
    public void ycx(CharSequence charSequence, boolean z, int i2, boolean z2) {
        String strYcx = com.bytedance.sdk.component.utils.wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_screen_skip_tx");
        if (i2 == 0) {
            this.syc.setVisibility(0);
            ((TextView) this.syc).setText("| ".concat(String.valueOf(strYcx)));
            this.syc.measure(-2, -2);
            this.ycx = new int[]{this.syc.getMeasuredWidth() + 1, this.syc.getMeasuredHeight()};
            View view = this.syc;
            int[] iArr = this.ycx;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.syc).setGravity(17);
            ((TextView) this.syc).setIncludeFontPadding(false);
            ycx();
            this.syc.setPadding(this.ok.sya(), this.zb, this.ok.dj(), this.htf);
        }
        requestLayout();
    }

    private void ycx() {
        int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.lud());
        this.zb = ((this.fby - iYcx) / 2) - this.ok.ycx();
        this.htf = 0;
    }
}
