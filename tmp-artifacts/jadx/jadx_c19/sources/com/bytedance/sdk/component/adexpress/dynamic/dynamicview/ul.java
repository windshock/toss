package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul extends lt {
    public ul(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ycx ycxVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ycx(context);
        this.syc = ycxVar;
        ycxVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.syc, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.dj.zb() && "fillButton".equals(this.ry.jc().zb())) {
            ((TextView) this.syc).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.syc).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.ok.pmi() << 1;
            widgetLayoutParams.height -= this.ok.pmi() << 1;
            widgetLayoutParams.topMargin += this.ok.pmi();
            int iPmi = widgetLayoutParams.leftMargin + this.ok.pmi();
            widgetLayoutParams.leftMargin = iPmi;
            widgetLayoutParams.setMarginStart(iPmi);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        super.jw();
        if (TextUtils.equals("download-progress-button", this.ry.jc().zb()) && TextUtils.isEmpty(this.ok.jc())) {
            this.syc.setVisibility(4);
            return true;
        }
        this.syc.setTextAlignment(this.ok.fby());
        ((TextView) this.syc).setText(this.ok.jc());
        ((TextView) this.syc).setTextColor(this.ok.ul());
        ((TextView) this.syc).setTextSize(this.ok.lud());
        ((TextView) this.syc).setGravity(17);
        ((TextView) this.syc).setIncludeFontPadding(false);
        if ("fillButton".equals(this.ry.jc().zb())) {
            this.syc.setPadding(0, 0, 0, 0);
        } else {
            this.syc.setPadding(this.ok.sya(), this.ok.zb(), this.ok.dj(), this.ok.ycx());
        }
        return true;
    }
}
