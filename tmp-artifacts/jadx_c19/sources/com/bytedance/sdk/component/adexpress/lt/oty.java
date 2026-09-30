package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class oty extends LinearLayout {
    private ycx dj;
    private com.bytedance.adsdk.zb.lt lt;
    private LinearLayout lud;
    private TextView sya;
    private com.bytedance.sdk.component.adexpress.dynamic.dj.jc ul;
    private TextView ycx;
    private com.bytedance.sdk.component.utils.dv zb;

    public interface ycx {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public oty(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.dj.jc jcVar) {
        super(context);
        this.ul = jcVar;
        ycx(context, view);
    }

    private void ycx(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.lud = (LinearLayout) findViewById(2097610722);
        this.ycx = (TextView) findViewById(2097610719);
        this.sya = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.zb.lt ltVar = (com.bytedance.adsdk.zb.lt) findViewById(2097610706);
        this.lt = ltVar;
        ltVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.lt.setImageAssetsFolder("images/");
        this.lt.ycx(true);
    }

    public void setShakeText(String str) {
        this.sya.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.lud;
    }

    public View getWriggleProgressIv() {
        return this.lt;
    }

    public TextView getTopTextView() {
        return this.ycx;
    }

    public void setOnShakeViewListener(ycx ycxVar) {
        this.dj = ycxVar;
    }

    public void ycx() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lt.oty.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    oty.this.lt.ycx();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "bPwkkgSwbOCVQ9NYrR+pJVr6JJoNimDClw6G", "Sfsj", 73);
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.zb == null) {
                this.zb = new com.bytedance.sdk.component.utils.dv(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.lt.oty.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.dj.jc jcVar = this.ul;
            if (jcVar != null) {
                jcVar.sya();
                this.ul.lud();
                this.ul.lt();
                this.ul.fby();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.zb.lt ltVar = this.lt;
            if (ltVar != null) {
                ltVar.lud();
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "bPwkkgSwbOCVQ9NYrR+pJVr6JJoNimDClw==", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", 117);
        }
    }
}
