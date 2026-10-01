package com.bytedance.sdk.openadsdk.sya;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.wwx;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.sya.jc;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud extends com.bytedance.sdk.openadsdk.core.lt.lud implements View.OnClickListener, jc.sya {
    private final jc dj;
    private StateListDrawable lt;
    private FilterWord lud;
    private final int ul;
    public static FilterWord ycx = new FilterWord("100:1", "GOOD");
    public static FilterWord zb = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord sya = new FilterWord("100:3", "BAD");

    public lud(@NonNull Context context, int i2, jc jcVar) {
        super(context);
        this.ul = i2;
        this.dj = jcVar;
        if (jcVar != null) {
            jcVar.ycx(this);
        }
        ycx(i2);
        ycx();
        zb();
    }

    private void ycx(int i2) {
        if (i2 == 1) {
            this.lud = ycx;
        } else if (i2 == 2) {
            this.lud = zb;
        } else {
            if (i2 != 3) {
                return;
            }
            this.lud = sya;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx() {
        if (this.lt == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dc.zb(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(dc.zb(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(dc.zb(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.lt = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.lt.addState(new int[0], gradientDrawable);
        }
        setBackground(this.lt);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zb() {
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(getContext());
        fbyVar.setTextSize(this.dj.jw() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, dc.zb(getContext(), 12.0f), 0, dc.zb(getContext(), this.dj.jw() ? 8.0f : 4.0f));
        addView(fbyVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.lt.fby ycxVar = new ycx(getContext());
        ycxVar.setTextSize(this.dj.jw() ? 17 : 12);
        ycxVar.setTextColor(-16777216);
        ycxVar.setMaxLines(1);
        ycxVar.setSingleLine();
        ycxVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, dc.zb(getContext(), 12.0f));
        addView(ycxVar, layoutParams2);
        int i2 = this.ul;
        if (i2 == 1) {
            fbyVar.setText("😍");
            ycxVar.setText(wwx.ycx(getContext(), "tt_good"));
        } else if (i2 == 2) {
            ycxVar.setText(wwx.ycx(getContext(), "tt_not_bad"));
            fbyVar.setText("😐");
        } else {
            if (i2 != 3) {
                return;
            }
            ycxVar.setText(wwx.ycx(getContext(), "tt_bad"));
            fbyVar.setText("😡");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.dj.ycx(jc.ycx);
        } else {
            this.dj.ycx(this.lud);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.sya.jc.sya
    public void ycx(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.lud) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
