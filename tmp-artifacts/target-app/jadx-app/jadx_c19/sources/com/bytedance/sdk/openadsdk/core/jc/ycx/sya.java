package com.bytedance.sdk.openadsdk.core.jc.ycx;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.ry.ycx;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya implements ycx {
    private final View ycx;

    public sya(View view) {
        this.ycx = view;
    }

    public int ycx() {
        View view = this.ycx;
        int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
        return measuredHeight <= 0 ? dc.lt(pmi.ycx()) : measuredHeight;
    }

    public int zb() {
        View view = this.ycx;
        int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
        return measuredWidth <= 0 ? dc.dj(pmi.ycx()) : measuredWidth;
    }
}
