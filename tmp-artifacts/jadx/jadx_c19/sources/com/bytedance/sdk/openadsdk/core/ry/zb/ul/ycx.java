package com.bytedance.sdk.openadsdk.core.ry.zb.ul;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends com.bytedance.adsdk.ugeno.jc.zb.ycx {
    private final com.bytedance.adsdk.ugeno.jc.zb.ycx ycx;
    private final com.bytedance.adsdk.ugeno.jc.zb.ycx zb;

    public ycx(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.jc.zb.ycx ycxVar = new com.bytedance.adsdk.ugeno.jc.zb.ycx(context);
        this.ycx = ycxVar;
        addView(ycxVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.jc.zb.ycx ycxVar2 = new com.bytedance.adsdk.ugeno.jc.zb.ycx(context);
        this.zb = ycxVar2;
        ycxVar2.setBackgroundColor(0);
        addView(ycxVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.zb.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zb.setOnTouchListener(onTouchListener);
    }

    public com.bytedance.adsdk.ugeno.jc.zb.ycx getVideoView() {
        return this.ycx;
    }

    public com.bytedance.adsdk.ugeno.jc.zb.ycx getMarkView() {
        return this.zb;
    }
}
