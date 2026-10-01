package com.bytedance.sdk.openadsdk.sya;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.dc;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends ScrollView {
    private final jc ycx;
    private final com.bytedance.sdk.openadsdk.core.lt.lud zb;

    public lt(Context context, jc jcVar) {
        super(context);
        this.ycx = jcVar;
        com.bytedance.sdk.openadsdk.core.lt.lud ludVar = new com.bytedance.sdk.openadsdk.core.lt.lud(context);
        this.zb = ludVar;
        ludVar.setOrientation(1);
        addView((View) ludVar, new FrameLayout.LayoutParams(-1, -2));
        if (jcVar.fby() == 0) {
            ycx();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void ycx() {
        if (this.ycx.fby() != 0) {
            return;
        }
        this.ycx.ycx(dc.dj(getContext()), dc.lt(getContext()));
    }

    public void ycx(List<FilterWord> list) {
        List<FilterWord> listSya = sya(list);
        if (listSya == null) {
            return;
        }
        zb(listSya);
    }

    private void zb(List<FilterWord> list) {
        this.zb.removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            FilterWord filterWord = list.get(i2);
            if (filterWord != null) {
                this.zb.addView(new ul(getContext(), filterWord, this.ycx));
            }
            if (i2 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iZb = dc.zb(getContext(), this.ycx.jw() ? 16.0f : 8.0f);
                layoutParams.topMargin = iZb;
                layoutParams.bottomMargin = iZb;
                this.zb.addView(new ea(getContext()), layoutParams);
            }
        }
    }

    private static List<FilterWord> sya(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (list.get(i4).hasSecondOptions()) {
                i3 = i4;
            }
        }
        if (i3 != -1 && i3 <= list.size()) {
            i2 = i3;
        }
        FilterWord filterWord = list.get(i2);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }
}
