package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.rwd.TnkImageLoader;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListPopupItem extends TnkAdListBasicItem {
    public static final void a(TnkAdListPopupItem tnkAdListPopupItem, View view) {
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_recommend_popup_item", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(tnkAdListPopupItem.getAdItem().getAppId())), getWrite.IAuthTabCallback("item_name", tnkAdListPopupItem.getAdItem().getTitle())}));
        tnkAdListPopupItem.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        ImageView adImageView = getAdImageView();
        if (adImageView != null) {
            TnkImageLoader.INSTANCE.loadImage(adImageView, getAdItem().getImgUrl());
        }
        getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListPopupItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkAdListPopupItem.a(this.f$0, view);
            }
        });
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public ImageView getAdImageView() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_item_image);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getCampnTypeView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_campaign);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public ImageView getIconImageView() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_item_icon);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_list_popup_item;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getMultiRewardView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_multi_reward_text);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getOrgPntAmtView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_org_pnt_amt);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getPointView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_point);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getReceiptView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_complete);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getSubTitleView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_sub_title);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getTitleView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_title);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public View getUnitIconView() {
        return getRoot().findViewById(R.id.com_tnk_off_item_unit_icon);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public TextView getUnitView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_unit);
    }
}
