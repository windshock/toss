package com.bytedance.sdk.openadsdk.core.widget;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.fby;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.core.lt.ul;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.oty;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends Dialog {
    private fby dj;
    private boolean dy;
    private String ea;
    private final Context fby;
    private String jc;
    private String jw;
    private com.bytedance.sdk.openadsdk.core.lt.ycx lt;
    private com.bytedance.sdk.openadsdk.core.lt.ycx lud;
    private String ok;
    private float pmi;
    private int ry;
    private fby sya;
    private boolean syc;
    private int uh;
    private View ul;
    private int wie;
    private OnBackInvokedCallback xkz;
    public InterfaceC0025zb ycx;
    private dj zb;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.zb$zb, reason: collision with other inner class name */
    public interface InterfaceC0025zb {
        void ycx();

        void zb();
    }

    static class ycx implements OnBackInvokedCallback {
        private final WeakReference<zb> ycx;

        ycx(zb zbVar) {
            this.ycx = new WeakReference<>(zbVar);
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            zb zbVar = this.ycx.get();
            if (zbVar != null) {
                htf.ycx("CustomCommonDialog", "onBackInvoked");
                zbVar.onBackPressed();
            }
        }
    }

    public zb(Context context) {
        super(context, wwx.lt(context, "tt_custom_dialog"));
        this.ry = -1;
        this.syc = false;
        this.dy = false;
        this.fby = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean zAv = pmi.dj().av();
        this.dy = zAv;
        if (zAv) {
            this.wie = Color.argb(166, 0, 0, 0);
            this.pmi = 16.0f;
            this.uh = Color.parseColor("#000000");
            setContentView(zb(this.fby));
        } else {
            setContentView(ycx(this.fby));
        }
        if (oty.ycx()) {
            htf.ycx("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.xkz = new ycx(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.xkz);
        }
        setCanceledOnTouchOutside(false);
        zb();
        ycx();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        htf.ycx("CustomCommonDialog", "onBackPressed");
    }

    private void ycx() {
        this.lt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zb.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0025zb interfaceC0025zb = zb.this.ycx;
                if (interfaceC0025zb != null) {
                    interfaceC0025zb.ycx();
                }
            }
        });
        this.lud.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zb.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0025zb interfaceC0025zb = zb.this.ycx;
                if (interfaceC0025zb != null) {
                    interfaceC0025zb.zb();
                }
            }
        });
    }

    private void zb() {
        if (!TextUtils.isEmpty(this.jc)) {
            this.sya.setText(this.jc);
            this.sya.setVisibility(0);
        } else {
            this.sya.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.jw)) {
            this.dj.setText(this.jw);
        }
        if (!TextUtils.isEmpty(this.ea)) {
            this.lt.setText(this.ea);
        } else {
            this.lt.setText(wwx.ycx(pmi.ycx(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.ok)) {
            this.lud.setText(this.ok);
        } else {
            this.lud.setText(wwx.ycx(pmi.ycx(), "tt_negtive_txt"));
        }
        int i2 = this.ry;
        if (i2 != -1) {
            this.zb.setImageResource(i2);
            this.zb.setVisibility(0);
        } else {
            this.zb.setVisibility(8);
        }
        if (this.syc) {
            this.ul.setVisibility(8);
            this.lud.setVisibility(8);
        } else {
            this.lud.setVisibility(0);
            this.ul.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        zb();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        sya();
    }

    private void sya() {
        if (this.xkz == null || !oty.ycx()) {
            return;
        }
        htf.ycx("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.xkz);
    }

    private View ycx(Context context) {
        ul ulVar = new ul(context);
        ulVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lud ludVar = new lud(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        ludVar.setMinimumWidth(ycx(260.0f));
        ludVar.setPadding(0, ycx(32.0f), 0, 0);
        ludVar.setBackground(ea.ycx(context, "tt_custom_dialog_bg"));
        ludVar.setOrientation(1);
        ludVar.setLayoutParams(layoutParams);
        this.sya = new fby(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = ycx(16.0f);
        layoutParams2.rightMargin = ycx(16.0f);
        layoutParams2.bottomMargin = ycx(16.0f);
        this.sya.setGravity(17);
        this.sya.setVisibility(0);
        this.sya.setTextColor(Color.parseColor("#333333"));
        this.sya.setTextSize(18.0f);
        this.sya.setLayoutParams(layoutParams2);
        this.zb = new dj(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = ycx(16.0f);
        layoutParams3.rightMargin = ycx(16.0f);
        layoutParams3.bottomMargin = ycx(10.0f);
        this.zb.setMaxHeight(ycx(150.0f));
        this.zb.setMaxWidth(ycx(150.0f));
        this.zb.setVisibility(0);
        this.zb.setLayoutParams(layoutParams3);
        this.dj = new fby(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = ycx(20.0f);
        layoutParams4.rightMargin = ycx(20.0f);
        this.dj.setGravity(17);
        this.dj.setLineSpacing(ycx(3.0f), 1.2f);
        this.dj.setTextSize(18.0f);
        this.dj.setTextColor(Color.parseColor("#000000"));
        this.dj.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = ycx(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        lud ludVar2 = new lud(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        ludVar2.setOrientation(0);
        ludVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.lt.ycx ycxVar = new com.bytedance.sdk.openadsdk.core.lt.ycx(context);
        this.lud = ycxVar;
        ycxVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = ycx(10.0f);
        layoutParams7.weight = 1.0f;
        this.lud.setPadding(0, ycx(16.0f), 0, ycx(16.0f));
        this.lud.setBackground(null);
        this.lud.setGravity(17);
        this.lud.setSingleLine(true);
        this.lud.setTextColor(Color.parseColor("#999999"));
        this.lud.setTextSize(16.0f);
        this.lud.setLayoutParams(layoutParams7);
        this.ul = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.ul.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.ul.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.lt.ycx ycxVar2 = new com.bytedance.sdk.openadsdk.core.lt.ycx(context);
        this.lt = ycxVar2;
        ycxVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = ycx(10.0f);
        layoutParams9.weight = 1.0f;
        this.lt.setPadding(0, ycx(16.0f), 0, ycx(16.0f));
        this.lt.setBackground(null);
        this.lt.setGravity(17);
        this.lt.setSingleLine(true);
        this.lt.setTextColor(Color.parseColor("#38ADFF"));
        this.lt.setTextSize(16.0f);
        this.lt.setLayoutParams(layoutParams9);
        ulVar.addView(ludVar);
        ludVar.addView(this.sya);
        ludVar.addView(this.zb);
        ludVar.addView(this.dj);
        ludVar.addView(view);
        ludVar.addView(ludVar2);
        ludVar2.addView(this.lud);
        ludVar2.addView(this.ul);
        ludVar2.addView(this.lt);
        return ulVar;
    }

    private View zb(Context context) {
        ul ulVar = new ul(context);
        ulVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lud ludVar = new lud(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        ludVar.setMinimumWidth(ycx(280.0f));
        ludVar.setPadding(0, ycx(32.0f), 0, 0);
        ludVar.setBackground(ea.ycx(context, "tt_custom_dialog_bg_new"));
        ludVar.setOrientation(1);
        ludVar.setLayoutParams(layoutParams);
        this.sya = new fby(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = ycx(16.0f);
        layoutParams2.rightMargin = ycx(16.0f);
        layoutParams2.bottomMargin = ycx(16.0f);
        this.sya.setGravity(17);
        this.sya.setVisibility(0);
        this.sya.setTextColor(Color.parseColor("#333333"));
        this.sya.setTextSize(20.0f);
        this.sya.setTypeface(Typeface.defaultFromStyle(1));
        this.sya.setLineSpacing(0.0f, 1.3f);
        this.sya.setLetterSpacing(0.015f);
        this.sya.setLayoutParams(layoutParams2);
        this.zb = new dj(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = ycx(16.0f);
        layoutParams3.rightMargin = ycx(16.0f);
        layoutParams3.bottomMargin = ycx(10.0f);
        this.zb.setMaxHeight(ycx(150.0f));
        this.zb.setMaxWidth(ycx(150.0f));
        this.zb.setVisibility(0);
        this.zb.setLayoutParams(layoutParams3);
        this.dj = new fby(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = ycx(20.0f);
        layoutParams4.rightMargin = ycx(20.0f);
        this.dj.setGravity(17);
        this.dj.setLineSpacing(0.0f, 1.3f);
        this.dj.setLetterSpacing(0.004f);
        this.dj.setTextSize(15.0f);
        this.dj.setTextColor(this.wie);
        this.dj.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = ycx(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        lud ludVar2 = new lud(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        ludVar2.setOrientation(0);
        ludVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.lt.ycx ycxVar = new com.bytedance.sdk.openadsdk.core.lt.ycx(context);
        this.lud = ycxVar;
        ycxVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = ycx(10.0f);
        layoutParams7.weight = 1.0f;
        this.lud.setPadding(0, ycx(16.0f), 0, ycx(16.0f));
        this.lud.setBackground(null);
        this.lud.setGravity(17);
        this.lud.setSingleLine(true);
        this.lud.setTextSize(2, this.pmi);
        this.lud.setLineSpacing(0.0f, 1.3f);
        this.lud.setLetterSpacing(0.0019f);
        this.lud.setTypeface(Typeface.defaultFromStyle(0));
        this.lud.setTextColor(ColorStateList.valueOf(this.wie));
        this.lud.setLayoutParams(layoutParams7);
        this.ul = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.ul.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.ul.setLayoutParams(layoutParams8);
        com.bytedance.sdk.openadsdk.core.lt.ycx ycxVar2 = new com.bytedance.sdk.openadsdk.core.lt.ycx(context);
        this.lt = ycxVar2;
        ycxVar2.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = ycx(10.0f);
        layoutParams9.weight = 1.0f;
        this.lt.setPadding(0, ycx(16.0f), 0, ycx(16.0f));
        this.lt.setBackground(null);
        this.lt.setGravity(17);
        this.lt.setSingleLine(true);
        int i2 = Build.VERSION.SDK_INT;
        this.lt.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i2 >= 28 ? Typeface.create(this.lt.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            this.lt.setTypeface(typefaceCreate);
        }
        this.lt.setLineSpacing(0.0f, 1.3f);
        this.lt.setLetterSpacing(0.0019f);
        this.lt.setTextColor(ColorStateList.valueOf(this.uh));
        this.lt.setTextSize(this.pmi);
        this.lt.setLayoutParams(layoutParams9);
        ulVar.addView(ludVar);
        ludVar.addView(this.sya);
        ludVar.addView(this.zb);
        ludVar.addView(this.dj);
        ludVar.addView(view);
        ludVar.addView(ludVar2);
        ludVar2.addView(this.lud);
        ludVar2.addView(this.ul);
        ludVar2.addView(this.lt);
        return ulVar;
    }

    private int ycx(float f) {
        return dc.zb(getContext(), f);
    }

    public zb ycx(InterfaceC0025zb interfaceC0025zb) {
        this.ycx = interfaceC0025zb;
        return this;
    }

    public zb ycx(String str) {
        this.jw = str;
        return this;
    }

    public zb zb(String str) {
        this.jc = str;
        return this;
    }

    public zb sya(String str) {
        this.ea = str;
        return this;
    }

    public zb dj(String str) {
        this.ok = str;
        return this;
    }
}
