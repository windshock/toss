package com.tnkfactory.ad.basic;

import android.view.View;
import android.view.ViewGroup;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.style.DpUtil;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCurationPromotion extends TnkAdListBasicItem {
    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
        if (getAdItem().getAppId() == 0) {
            Intrinsics.checkNotNull(viewOnNavigationEvent, "");
            ((ViewGroup) viewOnNavigationEvent).getChildAt(0).setVisibility(4);
            return;
        }
        Intrinsics.checkNotNull(viewOnNavigationEvent, "");
        ViewGroup viewGroup = (ViewGroup) viewOnNavigationEvent;
        viewGroup.getChildAt(0).setVisibility(0);
        int direction = getDirection();
        TnkDirection tnkDirection = TnkDirection.INSTANCE;
        if ((direction & tnkDirection.getLEFT()) == tnkDirection.getLEFT()) {
            DpUtil dpUtil = DpUtil.INSTANCE;
            viewGroup.setPadding(dpUtil.dpToPx(20.0f), viewGroup.getPaddingTop(), dpUtil.dpToPx(5.0f), viewGroup.getPaddingBottom());
        } else {
            DpUtil dpUtil2 = DpUtil.INSTANCE;
            viewGroup.setPadding(dpUtil2.dpToPx(5.0f), viewGroup.getPaddingTop(), dpUtil2.dpToPx(20.0f), viewGroup.getPaddingBottom());
        }
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_promotion;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }
}
