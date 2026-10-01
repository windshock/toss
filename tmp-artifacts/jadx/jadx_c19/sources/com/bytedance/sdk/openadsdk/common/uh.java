package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.core.lt.dj;
import com.bytedance.sdk.openadsdk.core.lt.sya;
import com.bytedance.sdk.openadsdk.utils.dc;
import com.bytedance.sdk.openadsdk.utils.ea;
import com.bytedance.sdk.openadsdk.utils.wie;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class uh extends sya {
    public uh(Context context) {
        super(context);
        ycx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx() {
        Context context = getContext();
        int iZb = dc.zb(context, 12.0f);
        int iZb2 = dc.zb(context, 10.0f);
        int iZb3 = dc.zb(context, 24.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, dc.zb(context, 44.0f)));
        setBackgroundColor(-1);
        dj djVar = new dj(context);
        djVar.setId(520093720);
        djVar.setClickable(true);
        djVar.setFocusable(true);
        djVar.setImageDrawable(ea.ycx(context, "tt_leftbackicon_selector"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iZb3, iZb3);
        layoutParams.setMargins(iZb, iZb2, 0, iZb2);
        layoutParams.gravity = (ycx(context) ? 5 : 3) | 16;
        addView(djVar, layoutParams);
        if (ycx(context)) {
            djVar.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(context, "tt_titlebar_forward"));
        }
        dj djVar2 = new dj(context);
        djVar2.setId(wie.sg);
        djVar2.setClickable(true);
        djVar2.setFocusable(true);
        djVar2.setImageResource(com.bytedance.sdk.component.utils.wwx.dj(context, "tt_history_titlebar_delete"));
        djVar2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iZb3, iZb3);
        layoutParams2.setMargins(0, iZb2, iZb, iZb2);
        layoutParams2.gravity = (ycx(context) ? 3 : 5) | 16;
        addView(djVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.lt.fby fbyVar = new com.bytedance.sdk.openadsdk.core.lt.fby(context);
        fbyVar.setId(wie.qt);
        fbyVar.setSingleLine(true);
        fbyVar.setText(context.getString(com.bytedance.sdk.component.utils.wwx.zb(context, "tt_history_title")));
        fbyVar.setEllipsize(TextUtils.TruncateAt.END);
        int i2 = Build.VERSION.SDK_INT;
        fbyVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface typefaceCreate = i2 >= 28 ? Typeface.create(fbyVar.getTypeface(), 500, false) : null;
        if (typefaceCreate != null) {
            fbyVar.setTypeface(typefaceCreate);
        }
        fbyVar.setGravity(17);
        fbyVar.setTextColor(-16777216);
        fbyVar.setTextSize(1, 17.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        addView(fbyVar, layoutParams3);
    }

    private boolean ycx(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private boolean ycx(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.getDirectionality(c) == 1 || Character.getDirectionality(c) == 2) {
                return true;
            }
        }
        return false;
    }
}
