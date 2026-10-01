package com.tnkfactory.ad.basic;

import android.view.View;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListCpsMyRecent extends TnkAdListCpsNormal {
    public static final void a(final TnkAdListCpsMyRecent tnkAdListCpsMyRecent, setColorSchemeColors setcolorschemecolors, View view) {
        tnkAdListCpsMyRecent.getTnkOffNavi().showLoading(true);
        setcolorschemecolors.onNavigationEvent().postDelayed(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsMyRecent$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TnkAdListCpsMyRecent.a(this.f$0);
            }
        }, 1000L);
        TnkCore.INSTANCE.getOffRepository().removeAdItemClickHistory(tnkAdListCpsMyRecent.getAdItem().getAppId());
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull final setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View removeView = getRemoveView();
        if (removeView != null) {
            removeView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsMyRecent$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListCpsMyRecent.a(this.f$0, setcolorschemecolors, view);
                }
            });
        }
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_my_recent;
    }

    public final View getRemoveView() {
        return getRoot().findViewById(R.id.com_tnk_off_cps_recent_remove);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsNormal, com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }

    public static final void a(TnkAdListCpsMyRecent tnkAdListCpsMyRecent) {
        tnkAdListCpsMyRecent.getTnkOffNavi().showLoading(false);
    }
}
