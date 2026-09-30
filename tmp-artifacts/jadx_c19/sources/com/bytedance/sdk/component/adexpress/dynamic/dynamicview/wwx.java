package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wwx extends lt implements com.bytedance.sdk.component.adexpress.dynamic.sya {
    private int htf;
    private int ycx;
    private int zb;

    public wwx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        ycx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.zb()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.dj()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.ycx()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public void lt() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = this.jw;
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = this.jc;
        layoutParams.setMarginStart(i2);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.htf == 0) {
            setMeasuredDimension(this.zb, this.fby);
        } else {
            setMeasuredDimension(this.ycx, this.fby);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya
    public void ycx(CharSequence charSequence, boolean z, int i2, boolean z2) {
        this.htf = i2;
    }

    private void ycx() {
        List<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> listEa = this.ry.ea();
        if (listEa == null || listEa.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar : listEa) {
            if (fbyVar.jc().ycx() == 21) {
                this.ycx = (int) (this.ul - com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, fbyVar.fby()));
            }
            if (fbyVar.jc().ycx() == 20) {
                this.zb = (int) (this.ul - com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, fbyVar.fby()));
            }
        }
    }
}
