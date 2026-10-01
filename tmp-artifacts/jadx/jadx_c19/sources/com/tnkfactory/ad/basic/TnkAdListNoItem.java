package com.tnkfactory.ad.basic;

import android.widget.TextView;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListNoItem extends Item<setColorSchemeColors> {
    public final String a;

    public TnkAdListNoItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = str;
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        TextView textView = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_adlist_popular_script);
        if (textView != null) {
            textView.setText(this.a);
        }
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_no_item;
    }

    public final String getMsg() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }
}
