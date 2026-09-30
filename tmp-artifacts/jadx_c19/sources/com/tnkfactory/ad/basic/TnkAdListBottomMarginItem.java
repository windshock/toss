package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListBottomMarginItem extends Item<setColorSchemeColors> {
    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_bottom_margin_item;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }
}
