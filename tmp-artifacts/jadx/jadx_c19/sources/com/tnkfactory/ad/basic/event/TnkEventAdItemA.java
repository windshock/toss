package com.tnkfactory.ad.basic.event;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.basic.TnkAdListBasicItem;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkEventAdItemA extends TnkAdListBasicItem {
    public static final void a(TnkEventAdItemA tnkEventAdItemA, View view) {
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_recommend_ad", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(tnkEventAdItemA.getAdItem().getAppId())), getWrite.IAuthTabCallback("item_name", tnkEventAdItemA.getAdItem().getTitle())}));
        tnkEventAdItemA.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
        Glide.IAuthTabCallback(((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.getContext()).onExtraCallbackWithResult(getAdItem().getIconUrl()).onExtraCallback((ImageView) viewOnNavigationEvent.findViewById(R.id.v_ad_item_icon));
        ((TextView) viewOnNavigationEvent.findViewById(R.id.tv_ad_item_desc)).setText("+" + getAdItem().getPointAmount() + "적립");
        setcolorschemecolors.onNavigationEvent().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.event.TnkEventAdItemA$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkEventAdItemA.a(this.f$0, view);
            }
        });
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public ImageView getIconImageView() {
        return (ImageView) getRoot().findViewById(R.id.v_ad_item_icon);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_event_ad_item;
    }
}
