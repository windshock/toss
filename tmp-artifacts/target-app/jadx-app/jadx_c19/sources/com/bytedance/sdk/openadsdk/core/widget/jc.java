package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.lt.fby;
import com.bytedance.sdk.openadsdk.core.lt.lud;
import com.bytedance.sdk.openadsdk.core.model.av;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.sya.ycx;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.wie;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc extends FrameLayout {
    private wie dj;
    private ycx ea;
    private tn fby;
    private boolean jc;
    private String jw;
    private PAGLogoView lt;
    private TextView lud;
    private TextView sya;
    private fby ul;
    private boolean ycx;
    private pmi zb;

    public jc(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(wie.te);
    }

    public void ycx(tn tnVar, String str, ycx ycxVar, boolean z) {
        this.fby = tnVar;
        this.jw = str;
        this.jc = z;
        this.ea = ycxVar;
    }

    public void setClickListener(ycx ycxVar) {
        this.ea = ycxVar;
        TextView textView = this.lud;
        if (textView != null) {
            textView.setOnClickListener(ycxVar);
            this.lud.setOnTouchListener(this.ea);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            ycx();
        }
    }

    private void ycx() {
        if (this.ycx) {
            return;
        }
        this.ycx = true;
        zb();
        this.lud.setOnClickListener(this.ea);
        this.lud.setOnTouchListener(this.ea);
        String strBah = this.fby.bah();
        if (!TextUtils.isEmpty(strBah)) {
            this.lud.setText(strBah);
        }
        if (this.zb != null && this.fby.yyc() != null && !TextUtils.isEmpty(this.fby.yyc().ycx())) {
            com.bytedance.sdk.openadsdk.htf.zb.zb().ycx(this.fby.yyc(), this.zb, this.fby);
        }
        wie wieVar = this.dj;
        if (wieVar != null) {
            dc.ycx((TextView) null, wieVar, this.fby);
            if (this.fby.znc() != null) {
                this.dj.setVisibility(0);
            }
        }
        if (this.sya != null) {
            if (this.fby.znc() != null && !TextUtils.isEmpty(this.fby.znc().zb())) {
                this.sya.setText(this.fby.znc().zb());
            } else if (!TextUtils.isEmpty(this.fby.sp())) {
                this.sya.setText(this.fby.sp());
            } else {
                this.sya.setVisibility(8);
            }
        }
        if (this.ul != null) {
            String strSpv = this.fby.spv();
            if (!TextUtils.isEmpty(strSpv)) {
                this.ul.setText(strSpv);
            } else {
                this.ul.setVisibility(8);
            }
        }
        this.lt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (!com.bytedance.sdk.openadsdk.utils.zb.lud() || !pmi.dj().av()) {
                        TTWebsiteActivity.ycx(jc.this.getContext(), jc.this.fby, jc.this.jw);
                    } else {
                        IABLandingPageActivity.ycx(jc.this.getContext(), jc.this.fby, jc.this.jw);
                    }
                } catch (Throwable th) {
                    sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9", "a+IsjAK+ZcKsS9lZhR+nClrtJoATkGjej1/DGd0=", "VOAOmQq/Yg==", 142);
                }
            }
        });
    }

    private void zb() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z = this.fby.pvm() == 1;
        setBackgroundColor(-16777216);
        lud ludVar = new lud(context);
        ludVar.setGravity(1);
        ludVar.setOrientation(1);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(dc.zb(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int iZb = dc.zb(context, 24.0f);
        layoutParams.rightMargin = iZb;
        layoutParams.leftMargin = iZb;
        addView((View) ludVar, (ViewGroup.LayoutParams) layoutParams);
        pmi pmiVar = new pmi(context);
        this.zb = pmiVar;
        pmiVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dc.zb(context, 80.0f), dc.zb(context, 80.0f));
        layoutParams2.bottomMargin = dc.zb(context, 12.0f);
        ludVar.addView(this.zb, layoutParams2);
        fby fbyVar = new fby(context);
        this.sya = fbyVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fbyVar.setEllipsize(truncateAt);
        this.sya.setGravity(17);
        this.sya.setMaxLines(2);
        this.sya.setMaxWidth(dc.zb(context, 180.0f));
        this.sya.setTextColor(-1);
        this.sya.setTextSize(2, 24.0f);
        ludVar.addView(this.sya, new LinearLayout.LayoutParams(-1, -2));
        fby fbyVar2 = new fby(context);
        this.ul = fbyVar2;
        fbyVar2.setEllipsize(truncateAt);
        this.ul.setGravity(17);
        this.ul.setMaxLines(2);
        this.ul.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.ul.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = dc.zb(context, 8.0f);
        ludVar.addView(this.ul, layoutParams3);
        this.dj = new wie(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, dc.zb(context, 16.0f));
        layoutParams4.topMargin = dc.zb(context, 12.0f);
        this.dj.setVisibility(8);
        ludVar.addView(this.dj, layoutParams4);
        fby fbyVar3 = new fby(context);
        this.lud = fbyVar3;
        fbyVar3.setId(520093707);
        this.lud.setGravity(17);
        this.lud.setText(wwx.ycx(context, "tt_video_download_apk"));
        this.lud.setTextColor(-1);
        this.lud.setTextSize(2, 16.0f);
        this.lud.setBackground(ea.ycx(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, dc.zb(context, 44.0f));
        layoutParams5.topMargin = dc.zb(context, 54.0f);
        ludVar.addView(this.lud, layoutParams5);
        if (!this.jc && this.fby.sim() && av.sya(this.fby)) {
            this.lud.setVisibility(8);
        }
        this.lt = PAGLogoView.createPAGLogoViewByMaterial(context, this.fby);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, dc.zb(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = dc.zb(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = dc.zb(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = dc.zb(context, 24.0f);
        }
        addView(this.lt, layoutParams6);
    }
}
