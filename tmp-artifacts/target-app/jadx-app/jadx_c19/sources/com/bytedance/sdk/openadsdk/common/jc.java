package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.wie;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends RelativeLayout {
    public jc(Context context) {
        super(context);
        ycx();
    }

    private void ycx() {
        Context context = getContext();
        int iZb = dc.zb(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, dc.zb(context, 44.0f)));
        setBackgroundColor(-1);
        dj djVar = new dj(context);
        djVar.setId(520093720);
        djVar.setClickable(true);
        djVar.setFocusable(true);
        djVar.setImageDrawable(ea.ycx(context, "tt_leftbackicon_selector"));
        int iZb2 = dc.zb(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZb2, iZb2);
        layoutParams.leftMargin = iZb;
        layoutParams.addRule(15);
        addView((View) djVar, (ViewGroup.LayoutParams) layoutParams);
        dj djVar2 = new dj(context);
        djVar2.setId(520093716);
        djVar2.setClickable(true);
        djVar2.setFocusable(true);
        djVar2.setImageDrawable(ea.ycx(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iZb2, iZb2);
        layoutParams2.leftMargin = iZb;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView((View) djVar2, (ViewGroup.LayoutParams) layoutParams2);
        dj djVar3 = new dj(context);
        int i2 = wie.ag;
        djVar3.setId(i2);
        djVar3.setImageDrawable(com.bytedance.sdk.component.utils.wwx.sya(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iZb2, iZb2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iZb;
        addView((View) djVar3, (ViewGroup.LayoutParams) layoutParams3);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        fbyVar.setId(wie.qt);
        fbyVar.setSingleLine(true);
        fbyVar.setEllipsize(TextUtils.TruncateAt.END);
        fbyVar.setGravity(17);
        fbyVar.setTextColor(-16777216);
        fbyVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(dc.zb(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i2);
        int iZb3 = dc.zb(context, 25.0f);
        layoutParams4.rightMargin = iZb3;
        layoutParams4.leftMargin = iZb3;
        addView((View) fbyVar, (ViewGroup.LayoutParams) layoutParams4);
    }
}
