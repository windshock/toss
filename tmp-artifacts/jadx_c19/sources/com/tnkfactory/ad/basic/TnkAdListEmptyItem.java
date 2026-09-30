package com.tnkfactory.ad.basic;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListEmptyItem extends Item<setColorSchemeColors> {
    public int a;

    public TnkAdListEmptyItem() {
        this(0, 1, null);
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_row_empty_item_dummy).setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, this.a));
    }

    public final int getHeight() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_empty_item;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    public final void setHeight(int i2) {
        this.a = i2;
    }

    public TnkAdListEmptyItem(int i2) {
        this.a = i2;
    }

    public /* synthetic */ TnkAdListEmptyItem(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
