package com.tnkfactory.ad.basic;

import android.widget.TextView;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListNoExist extends Item<setColorSchemeColors> {
    public final int a;

    public TnkAdListNoExist(int i2) {
        this.a = i2;
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        int i3 = this.a;
        if (i3 == 0) {
            TextView textView = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_adlist_no_item_script);
            if (textView != null) {
                textView.setText("참여할 수 있는 미션을\n준비 중이에요!");
                return;
            }
            return;
        }
        if (i3 == 1) {
            TextView textView2 = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_adlist_no_item_script);
            if (textView2 != null) {
                textView2.setText("구매할 수 있는 상품을\n준비 중이에요!");
                return;
            }
            return;
        }
        if (i3 != 2) {
            TextView textView3 = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_adlist_no_item_script);
            if (textView3 != null) {
                textView3.setText("참여할 수 있는 미션을\n준비 중이에요!");
                return;
            }
            return;
        }
        TextView textView4 = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_adlist_no_item_script);
        if (textView4 != null) {
            textView4.setText("참여 중 내역이 없습니다.");
        }
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_not_exist;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    public final int getType() {
        return this.a;
    }
}
