package com.tnkfactory.ad.basic;

import android.view.View;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListCpsSearchRecent extends TnkAdListCpsNormal {
    public static final void a(final TnkAdListCpsSearchRecent tnkAdListCpsSearchRecent, setColorSchemeColors setcolorschemecolors, View view) {
        tnkAdListCpsSearchRecent.getTnkOffNavi().showLoading(true);
        setcolorschemecolors.onNavigationEvent().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsSearchRecent$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TnkAdListCpsSearchRecent.a(this.f$0);
            }
        }, 1000L);
        TnkCore.INSTANCE.getOffRepository().removeAdItemClickHistory(tnkAdListCpsSearchRecent.getAdItem().getAppId());
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull final setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View removeView = getRemoveView();
        if (removeView != null) {
            removeView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsSearchRecent$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListCpsSearchRecent.a(this.f$0, setcolorschemecolors, view);
                }
            });
        }
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_recent;
    }

    public final View getRemoveView() {
        return getRoot().findViewById(R.id.com_tnk_off_cps_recent_remove);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }

    public static final void a(TnkAdListCpsSearchRecent tnkAdListCpsSearchRecent) {
        tnkAdListCpsSearchRecent.getTnkOffNavi().showLoading(false);
    }
}
