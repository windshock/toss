package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie extends lt {
    private TextView htf;
    private TextView thx;
    private LinearLayout tn;
    private TextView wwx;
    private TextView ycx;
    private TextView zb;

    public wie(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.ycx = new TextView(this.ea);
        this.zb = new TextView(this.ea);
        this.htf = new TextView(this.ea);
        this.tn = new LinearLayout(this.ea);
        this.thx = new TextView(this.ea);
        this.wwx = new TextView(this.ea);
        this.ycx.setTag(9);
        this.zb.setTag(10);
        this.htf.setTag(12);
        this.tn.addView(this.htf);
        this.tn.addView(this.wwx);
        this.tn.addView(this.zb);
        this.tn.addView(this.thx);
        this.tn.addView(this.ycx);
        addView(this.tn, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    protected boolean dj() {
        this.ycx.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ycx.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.zb.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.zb.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.htf.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.htf.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ul, this.fby);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() {
        this.htf.setText("Function");
        this.zb.setText("Permission list");
        this.thx.setText(" | ");
        this.wwx.setText(" | ");
        this.ycx.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar = this.ok;
        if (ulVar != null) {
            this.htf.setTextColor(ulVar.ul());
            this.htf.setTextSize(this.ok.lud());
            this.zb.setTextColor(this.ok.ul());
            this.zb.setTextSize(this.ok.lud());
            this.thx.setTextColor(this.ok.ul());
            this.wwx.setTextColor(this.ok.ul());
            this.ycx.setTextColor(this.ok.ul());
            this.ycx.setTextSize(this.ok.lud());
            return false;
        }
        this.htf.setTextColor(-1);
        this.htf.setTextSize(12.0f);
        this.zb.setTextColor(-1);
        this.zb.setTextSize(12.0f);
        this.thx.setTextColor(-1);
        this.wwx.setTextColor(-1);
        this.ycx.setTextColor(-1);
        this.ycx.setTextSize(12.0f);
        return false;
    }
}
