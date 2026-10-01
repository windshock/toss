package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class tru extends lt implements com.bytedance.sdk.component.adexpress.dynamic.sya {
    private int htf;
    private int thx;
    private boolean wwx;
    int ycx;
    boolean zb;

    public tru(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.thx = 0;
        setTag(Integer.valueOf(getClickArea()));
        ycx();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().hf()) {
            return;
        }
        View view = this.syc;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public void lt() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.zb) {
            layoutParams.leftMargin = this.jw;
        } else {
            layoutParams.leftMargin = this.jw + this.thx;
        }
        if (this.wwx && this.ok != null) {
            layoutParams.leftMargin = ((this.jw + this.thx) - ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya()))) - ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.dj()));
        }
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            layoutParams.topMargin = this.jc - ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.zb()));
        } else {
            layoutParams.topMargin = this.jc;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        if (com.bytedance.sdk.component.adexpress.dj.lt.zb(this.xkz.getRenderRequest().dj())) {
            return true;
        }
        super.jw();
        setPadding((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.zb()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.dj()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.ycx()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.wwx && this.ok != null) {
            setMeasuredDimension(this.htf + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.sya())) + ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), this.ok.dj())), this.fby);
            return;
        }
        if (this.zb) {
            setMeasuredDimension(this.ul, this.fby);
        } else {
            setMeasuredDimension(this.ycx, this.fby);
        }
    }

    private void ycx() {
        List<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> listEa = this.ry.ea();
        if (listEa == null || listEa.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dj.fby> it = listEa.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dj.fby next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.jc().zb())) {
                int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, next.fby() + (com.bytedance.sdk.component.adexpress.dj.zb() ? next.ry() : 0));
                this.htf = iYcx;
                this.ycx = this.ul - iYcx;
            }
        }
        this.thx = this.ul - this.ycx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya
    public void ycx(CharSequence charSequence, boolean z, int i2, boolean z2) {
        if (z2 && this.wwx != z2) {
            this.wwx = z2;
            lt();
            return;
        }
        if (z && this.zb != z) {
            this.zb = z;
            lt();
        }
        this.zb = z;
    }
}
