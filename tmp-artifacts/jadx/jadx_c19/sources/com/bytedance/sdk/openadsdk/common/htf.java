package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ycx;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.core.lt.ul;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.oby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class htf extends Dialog {
    private static final String[] zb = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};
    private TextView dj;
    private ImageView lt;
    private Button lud;
    private String sya;
    private final Handler ycx;

    public htf(@NonNull Context context) {
        super(context, com.bytedance.sdk.component.utils.wwx.lt(context, "tt_privacy_dialog_theme_ad_report"));
        this.ycx = new Handler(Looper.getMainLooper());
        this.sya = "";
    }

    public void ycx(tn tnVar) {
        try {
            this.sya = ycx.ycx(tnVar.fo()).toString();
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9odhwqqaMSZa9NviQGvOk/KJJQPs24=", "SOs5uAaoaA==", 61);
            com.bytedance.sdk.component.utils.htf.sya("TTPrivacyAdReportDialog", th.getMessage());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ycx(getContext()), new ViewGroup.LayoutParams(dc.dj(getContext()), (int) (dc.lt(getContext()) * 0.9d)));
        zb();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void zb() {
        final String strLt = oby.lt();
        final String strFby = oby.fby();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.lud.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.htf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) htf.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = {"8.2.0.4", strLt, strFby, str, str2, htf.this.sya};
                    for (int i2 = 0; i2 < htf.zb.length; i2++) {
                        sb.append(htf.zb[i2]);
                        sb.append(": ");
                        sb.append(strArr[i2]);
                        sb.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                    } catch (Throwable th) {
                        sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9odhwqqaMSZa9NviQGvOk/KJJQPs26D0Q==", "VOAOmQq/Yg==", 104);
                    }
                }
            }
        });
        this.lt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.htf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                htf.this.dj.setText("loading ...");
                htf.this.cancel();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.ycx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.htf.3
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(htf.this.sya)) {
                        htf.this.dj.setText("");
                    } else {
                        htf.this.dj.setText(htf.this.sya.substring(0, Math.min(htf.this.sya.length(), 100)));
                    }
                }
            }, 1000L);
        } catch (Exception e) {
            sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erSVU4A==", "b9odhwqqaMSZa9NviQGvOk/KJJQPs24=", "SOYigg==", 134);
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e);
        }
    }

    private View ycx(Context context) {
        lud ludVar = new lud(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ludVar.setBackground(ea.ycx(context, "tt_ad_report_info_bg"));
        ludVar.setOrientation(1);
        ludVar.setLayoutParams(layoutParams);
        ul ulVar = new ul(context);
        ulVar.setLayoutParams(new ViewGroup.LayoutParams(-1, ycx(44.0f)));
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ycx(191.0f), ycx(24.0f));
        layoutParams2.addRule(13);
        fbyVar.setGravity(17);
        fbyVar.setText("Ad Report");
        fbyVar.setTextColor(Color.parseColor("#161823"));
        fbyVar.setTextSize(1, 17.0f);
        fbyVar.setLayoutParams(layoutParams2);
        this.lt = new dj(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ycx(40.0f), ycx(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = ycx(8.0f);
        this.lt.setPadding(ycx(12.0f), ycx(14.0f), ycx(12.0f), ycx(14.0f));
        this.lt.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(context, "tt_ad_xmark"));
        this.lt.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, ycx(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = ycx(16.0f);
        layoutParams5.rightMargin = ycx(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(ycx(16.0f));
        layoutParams5.setMarginEnd(ycx(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        lud ludVar2 = new lud(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        ludVar2.setOrientation(1);
        ludVar2.setLayoutParams(layoutParams6);
        String strLt = oby.lt();
        String strFby = oby.fby();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        lud ludVarYcx = ycx(context, "SDK version", "8.2.0.4");
        lud ludVarYcx2 = ycx(context, "App", strLt);
        lud ludVarYcx3 = ycx(context, "App version", strFby);
        lud ludVarYcx4 = ycx(context, "OS", str);
        lud ludVarYcx5 = ycx(context, "Device", str2);
        lud ludVarYcx6 = ycx(context, "Creative info", "loading ...");
        lud ludVar3 = new lud(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ycx(76.0f));
        ludVar3.setBackgroundColor(-1);
        ludVar3.setLayoutParams(layoutParams7);
        this.lud = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iYcx = ycx(16.0f);
        layoutParams8.setMargins(iYcx, iYcx, iYcx, iYcx);
        this.lud.setBackground(ea.ycx(context, "tt_ad_report_info_button_bg"));
        this.lud.setText("copy all");
        this.lud.setTextColor(Color.parseColor("#333333"));
        this.lud.setTextSize(14.0f);
        this.lud.setLayoutParams(layoutParams8);
        ludVar.addView(ulVar);
        ulVar.addView(fbyVar);
        ulVar.addView(this.lt);
        ludVar.addView(view);
        ludVar.addView(scrollView);
        scrollView.addView(ludVar2);
        ludVar2.addView(ludVarYcx);
        ludVar2.addView(ludVarYcx2);
        ludVar2.addView(ludVarYcx3);
        ludVar2.addView(ludVarYcx4);
        ludVar2.addView(ludVarYcx5);
        ludVar2.addView(ludVarYcx6);
        ludVar.addView(ludVar3);
        ludVar3.addView(this.lud);
        return ludVar;
    }

    private lud ycx(Context context, String str, String str2) {
        lud ludVar = new lud(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : ycx(74.0f));
        ludVar.setOrientation(1);
        ludVar.setPadding(0, ycx(16.0f), 0, ycx(16.0f));
        ludVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = ycx(7.0f);
        fbyVar.setIncludeFontPadding(false);
        fbyVar.setText(str);
        fbyVar.setTextColor(Color.parseColor("#333333"));
        fbyVar.setTextSize(16.0f);
        fbyVar.setTypeface(Typeface.defaultFromStyle(1));
        fbyVar.setLayoutParams(layoutParams2);
        ludVar.addView(fbyVar);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar2 = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        if (str.equals("Creative info")) {
            this.dj = fbyVar2;
            fbyVar2.setMaxLines(2);
            fbyVar2.setEllipsize(TextUtils.TruncateAt.END);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        fbyVar2.setIncludeFontPadding(false);
        fbyVar2.setTextColor(Color.parseColor("#666666"));
        fbyVar2.setText(str2);
        fbyVar2.setTextSize(14.0f);
        fbyVar2.setLayoutParams(layoutParams3);
        ludVar.addView(fbyVar2);
        return ludVar;
    }

    private int ycx(float f) {
        return dc.zb(getContext(), f);
    }
}
