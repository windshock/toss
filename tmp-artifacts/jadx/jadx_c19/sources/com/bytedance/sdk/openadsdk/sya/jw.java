package com.bytedance.sdk.openadsdk.sya;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lt.sya;
import com.bytedance.sdk.openadsdk.sya.jc;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.wie;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends sya implements jc.dj, jc.sya, jc.ycx, jc.zb {
    private final jc dj;
    private com.bytedance.sdk.openadsdk.core.lt.fby ea;
    private View fby;
    private com.bytedance.sdk.openadsdk.core.lt.dj jc;
    private View jw;
    private TextView lt;
    private com.bytedance.sdk.openadsdk.core.lt.fby lud;
    private int ok;
    private int ry;
    private int sya;
    private ea ul;
    private FilterWord xkz;
    lt ycx;
    private int zb;

    public jw(Context context, jc jcVar) {
        this(context, jcVar, null);
    }

    public jw(Context context, jc jcVar, List<FilterWord> list) {
        super(context);
        this.dj = jcVar;
        jcVar.ycx((jc.sya) this);
        jcVar.ycx((jc.zb) this);
        jcVar.ycx((jc.dj) this);
        jcVar.ycx((jc.ycx) this);
        sya();
        ycx(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        zb(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void sya() {
        if (this.ok > 0) {
            return;
        }
        this.ok = dc.dj(getContext());
        int iLt = dc.lt(getContext());
        this.ry = iLt;
        this.dj.ycx(this.ok, iLt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.ok == 0) {
                sya();
            }
            layoutParams.width = Math.min(this.ok, this.ry) - (dc.zb(getContext(), 16.0f) << 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx(Context context) {
        this.sya = dc.zb(context, 8.0f);
        this.zb = dc.zb(context, 20.0f);
        int iZb = dc.zb(context, 56.0f);
        int iZb2 = dc.zb(context, 30.0f);
        int iZb3 = dc.zb(context, 12.0f);
        if (dj()) {
            iZb3 = this.zb;
        }
        if (!dj()) {
            iZb = iZb2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, dc.zb(getContext(), 98.0f));
        view.setBackground(wwx.sya(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.sya);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.lt.dj djVar = new com.bytedance.sdk.openadsdk.core.lt.dj(context);
        int iZb4 = dc.zb(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iZb4, iZb4);
        layoutParams3.setMargins(0, iZb3, iZb3, 0);
        layoutParams3.gravity = 8388661;
        djVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ea.ycx(context, "tt_titlebar_close_seletor"));
        addView(djVar, layoutParams3);
        djVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.jw.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jw.this.dj.lud();
            }
        });
        com.bytedance.sdk.openadsdk.core.lt.dj djVar2 = new com.bytedance.sdk.openadsdk.core.lt.dj(context);
        this.jc = djVar2;
        djVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.jw.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jw.this.zb();
            }
        });
        this.jc.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iZb4, iZb4);
        layoutParams4.setMargins(iZb3, iZb3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableYcx = com.bytedance.sdk.openadsdk.utils.ea.ycx(context, "tt_leftbackicon_selector");
        drawableYcx.setAutoMirrored(true);
        this.jc.setImageDrawable(drawableYcx);
        addView(this.jc, layoutParams4);
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar = new com.bytedance.sdk.openadsdk.core.lt.lud(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iZb3, iZb, iZb3, iZb3);
        ludVar.setOrientation(1);
        addView(ludVar, layoutParams5);
        View viewSya = sya(context);
        this.fby = viewSya;
        ludVar.addView(viewSya);
        View viewDj = dj(context);
        this.jw = viewDj;
        ludVar.addView(viewDj);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVarZb = zb(context);
        this.lud = fbyVarZb;
        ludVar.addView(fbyVarZb);
    }

    private com.bytedance.sdk.openadsdk.core.lt.fby zb(Context context) {
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dj() ? this.zb : dc.zb(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.sya);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.sya);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i2 = this.sya;
        fbyVar.setPadding(0, i2, 0, i2);
        fbyVar.setGravity(17);
        fbyVar.setBackground(stateListDrawable);
        fbyVar.setTextColor(-1);
        fbyVar.setTextSize(16.0f);
        fbyVar.setText(wwx.ycx(context, "tt_suggestion_commit"));
        fbyVar.setEnabled(false);
        fbyVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.jw.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jw.this.dj.dj();
            }
        });
        fbyVar.setLayoutParams(layoutParams);
        return fbyVar;
    }

    private View sya(Context context) {
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar = new com.bytedance.sdk.openadsdk.core.lt.lud(context);
        ludVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ludVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(wwx.ycx(context, "tt_like_this_ad"));
        textView.setTextSize(dj() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        ludVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(wwx.ycx(context, "tt_feel_hint"));
        textView2.setTextSize(dj() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (dj()) {
            layoutParams2.topMargin = dc.zb(context, 4.0f);
        }
        ludVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar2 = new com.bytedance.sdk.openadsdk.core.lt.lud(context);
        ludVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iZb = dc.zb(context, 16.0f);
        int iZb2 = dc.zb(context, 12.0f);
        int iZb3 = dc.zb(context, 8.0f);
        if (dj()) {
            layoutParams3.topMargin = iZb;
            layoutParams3.bottomMargin = iZb;
        } else {
            layoutParams3.topMargin = iZb2;
            layoutParams3.bottomMargin = iZb3;
        }
        ludVar.addView(ludVar2, layoutParams3);
        ludVar2.addView(new lud(context, 1, this.dj));
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar3 = new lud(context, 2, this.dj);
        ViewGroup.LayoutParams layoutParams4 = ludVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iZb;
        layoutParams7.rightMargin = iZb;
        ludVar2.addView(ludVar3, layoutParams5);
        ludVar2.addView(new lud(context, 3, this.dj));
        ea eaVar = new ea(context);
        this.ul = eaVar;
        ludVar.addView(eaVar);
        this.lt = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!dj()) {
            iZb = iZb3;
        }
        layoutParams8.topMargin = iZb;
        this.lt.setTextColor(-16777216);
        this.lt.setPadding(iZb2, iZb3, iZb2, iZb3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iZb3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.lt.setBackground(gradientDrawable);
        this.lt.setText(wwx.ycx(context, "tt_report_this_ad"));
        this.lt.setTextSize(dj() ? 14 : 12);
        Drawable drawableSya = wwx.sya(context, "tt_report_ad_arrow");
        drawableSya.setBounds(0, 0, iZb2, iZb2);
        this.lt.setCompoundDrawables(null, null, drawableSya, null);
        this.lt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.jw.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jw.this.ycx();
            }
        });
        ludVar.addView(this.lt, layoutParams8);
        return ludVar;
    }

    private boolean dj() {
        if (this.ok == 0) {
            sya();
        }
        return this.ok < this.ry;
    }

    private View dj(Context context) {
        int iZb;
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar = new com.bytedance.sdk.openadsdk.core.lt.lud(context);
        ludVar.setOrientation(1);
        if (!dj()) {
            iZb = dc.zb(context, 200.0f);
        } else {
            iZb = dc.zb(context, 358.0f);
        }
        ludVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iZb));
        TextView textView = new TextView(context);
        textView.setText(wwx.ycx(context, "tt_select_reason"));
        textView.setTextSize(dj() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = dc.zb(context, dj() ? 24.0f : 4.0f);
        ludVar.addView(textView, layoutParams);
        lt ltVar = new lt(context, this.dj);
        this.ycx = ltVar;
        ludVar.addView(ltVar);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        this.ea = fbyVar;
        fbyVar.setId(wie.gmd);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dj() ? this.zb : dc.zb(context, 6.0f);
        layoutParams2.gravity = 17;
        this.ea.setLayoutParams(layoutParams2);
        this.ea.setFocusable(false);
        this.ea.setHint(wwx.ycx(context, "tt_add_bad_reason"));
        this.ea.setHintTextColor(Color.parseColor("#57000000"));
        this.ea.setTextColor(Color.rgb(22, 24, 35));
        this.ea.setTextSize(15.0f);
        this.ea.setGravity(8388615);
        this.ea.setVisibility(0);
        this.ea.setPadding(0, dc.zb(context, 15.0f), 0, dc.zb(context, 14.0f));
        this.ea.setEllipsize(TextUtils.TruncateAt.END);
        this.ea.setSingleLine();
        this.ea.setMaxLines(1);
        this.ea.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.sya.jw.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jw.this.dj.lt();
            }
        });
        ludVar.addView(this.ea, layoutParams2);
        ludVar.addView(new ea(context, Color.argb(128, 0, 0, 0)));
        ludVar.setVisibility(8);
        return ludVar;
    }

    private void zb(List<FilterWord> list) {
        this.ycx.ycx(list);
    }

    public void ycx() {
        View view = this.jw;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.fby;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.lt.dj djVar = this.jc;
        if (djVar != null) {
            djVar.setVisibility(0);
        }
        jc jcVar = this.dj;
        if (jcVar == null || !jcVar.sya()) {
            return;
        }
        this.xkz = this.dj.zb();
    }

    public void zb() {
        View view = this.jw;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.fby;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.lt.dj djVar = this.jc;
        if (djVar != null) {
            djVar.setVisibility(8);
        }
        jc jcVar = this.dj;
        if (jcVar != null) {
            FilterWord filterWord = this.xkz;
            if (filterWord != null) {
                jcVar.ycx(filterWord);
            } else {
                jcVar.ycx(jc.ycx);
            }
            this.dj.sya(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sya.jc.sya
    public void ycx(FilterWord filterWord) {
        if (filterWord != null) {
            if (this.lud != null && TextUtils.isEmpty(this.dj.ul())) {
                this.lud.setEnabled(!jc.ycx.equals(filterWord));
            }
            if (lud.ycx.equals(filterWord) || lud.zb.equals(filterWord)) {
                this.lt.setVisibility(8);
                this.ul.setVisibility(8);
            }
            if (lud.sya.equals(filterWord) || jc.ycx.equals(filterWord)) {
                this.lt.setVisibility(0);
                this.ul.setVisibility(0);
            }
        }
    }

    public void ycx(int i2) {
        if (jc.sya == i2) {
            this.xkz = null;
            zb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sya.jc.dj
    public void ycx(String str) {
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar;
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar2 = this.ea;
        if (fbyVar2 != null) {
            fbyVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            jc jcVar = this.dj;
            if (jcVar == null || (fbyVar = this.lud) == null) {
                return;
            }
            fbyVar.setEnabled(jcVar.sya());
            return;
        }
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar3 = this.lud;
        if (fbyVar3 != null) {
            fbyVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sya.jc.ycx
    public void ycx(List<FilterWord> list) {
        zb(list);
    }
}
