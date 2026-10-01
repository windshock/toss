package com.bytedance.sdk.openadsdk.sya;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea extends View {
    private final int ycx;

    public ea(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    public ea(Context context, int i2) {
        super(context);
        setBackgroundColor(i2);
        this.ycx = dc.zb(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), this.ycx);
    }
}
