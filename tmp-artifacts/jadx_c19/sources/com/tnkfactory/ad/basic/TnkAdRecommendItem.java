package com.tnkfactory.ad.basic;

import android.view.View;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdRecommendItem extends TnkAdListBasicItem {
    public static final void a(TnkAdRecommendItem tnkAdRecommendItem, View view) {
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_today_ad", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(tnkAdRecommendItem.getAdItem().getAppId())), getWrite.IAuthTabCallback("item_name", tnkAdRecommendItem.getAdItem().getTitle())}));
        tnkAdRecommendItem.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkAdRecommendItem.a(this.f$0, view);
            }
        });
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_recommend_item;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }
}
