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
public final class TnkAdRecommendItemCps extends TnkAdListCpsBasic {
    public static final void a(TnkAdRecommendItemCps tnkAdRecommendItemCps, View view) {
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_today_ad", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(tnkAdRecommendItemCps.getAdItem().getAppId())), getWrite.IAuthTabCallback("item_name", tnkAdRecommendItemCps.getAdItem().getTitle())}));
        tnkAdRecommendItemCps.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdRecommendItemCps$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkAdRecommendItemCps.a(this.f$0, view);
            }
        });
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_recommend_cps_item;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }
}
