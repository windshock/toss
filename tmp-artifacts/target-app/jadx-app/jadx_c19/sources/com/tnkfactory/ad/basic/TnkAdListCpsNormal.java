package com.tnkfactory.ad.basic;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.style.DpUtil;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListCpsNormal extends TnkAdListCpsBasic {
    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_normal;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewAttachedToWindow(setcolorschemecolors);
        int direction = getDirection();
        TnkDirection tnkDirection = TnkDirection.INSTANCE;
        if ((direction & tnkDirection.getLEFT()) == tnkDirection.getLEFT()) {
            ViewGroup root = getRoot();
            DpUtil dpUtil = DpUtil.INSTANCE;
            root.setPadding(dpUtil.dpToPx(12.5f), getRoot().getPaddingTop(), dpUtil.dpToPx(0.0f), getRoot().getPaddingBottom());
        } else if ((getDirection() & tnkDirection.getRIGHT()) == tnkDirection.getRIGHT()) {
            ViewGroup root2 = getRoot();
            DpUtil dpUtil2 = DpUtil.INSTANCE;
            root2.setPadding(dpUtil2.dpToPx(0.0f), getRoot().getPaddingTop(), dpUtil2.dpToPx(12.5f), getRoot().getPaddingBottom());
        }
    }

    @Override // com.tnkfactory.ad.style.ITnkOffAdItem
    public void setPosition(int i2) {
        super.setPosition(i2);
        if (i2 % 2 == 0) {
            int direction = getDirection();
            TnkDirection tnkDirection = TnkDirection.INSTANCE;
            setDirection(direction | tnkDirection.getLEFT());
            setDirection(getDirection() & (~tnkDirection.getRIGHT()));
            return;
        }
        int direction2 = getDirection();
        TnkDirection tnkDirection2 = TnkDirection.INSTANCE;
        setDirection(direction2 & (~tnkDirection2.getLEFT()));
        setDirection(getDirection() | tnkDirection2.getRIGHT());
    }
}
