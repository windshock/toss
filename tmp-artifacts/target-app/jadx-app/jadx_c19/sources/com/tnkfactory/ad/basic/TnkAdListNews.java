package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListNews extends TnkAdListBasicItem {
    public static final void a(TnkAdListNews tnkAdListNews, View view) {
        tnkAdListNews.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(getTitle());
        }
        if (Intrinsics.areEqual(getAdItem().getPayYn(), "Y")) {
            view.setAlpha(0.5f);
            TextView newsComliete = getNewsComliete();
            if (newsComliete != null) {
                newsComliete.setVisibility(0);
            }
            LinearLayout rewardLayout = getRewardLayout();
            if (rewardLayout != null) {
                rewardLayout.setVisibility(8);
            }
        } else {
            view.setAlpha(1.0f);
            TextView newsComliete2 = getNewsComliete();
            if (newsComliete2 != null) {
                newsComliete2.setVisibility(8);
            }
            LinearLayout rewardLayout2 = getRewardLayout();
            if (rewardLayout2 != null) {
                rewardLayout2.setVisibility(0);
            }
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListNews$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TnkAdListNews.a(this.f$0, view2);
            }
        });
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_news;
    }

    public final TextView getNewsComliete() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_news_complete);
    }

    public final LinearLayout getRewardLayout() {
        return (LinearLayout) getRoot().findViewById(R.id.com_tnk_off_detail_ll_reward);
    }
}
