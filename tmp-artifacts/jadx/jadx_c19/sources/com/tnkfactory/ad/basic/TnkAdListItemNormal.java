package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.off.TnkDirection;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListItemNormal extends TnkAdListBasicItem {
    public static final void a(TnkAdListItemNormal tnkAdListItemNormal, View view) {
        tnkAdListItemNormal.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        if (getDirection() == TnkDirection.INSTANCE.getBOTTOM()) {
            View divider = getDivider();
            if (divider != null) {
                divider.setVisibility(8);
            }
        } else {
            View divider2 = getDivider();
            if (divider2 != null) {
                divider2.setVisibility(0);
            }
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListItemNormal$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TnkAdListItemNormal.a(this.f$0, view2);
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

    public final View getDivider() {
        return getRoot().findViewById(R.id.com_tnk_off_item_divider);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem
    public ImageView getIconImageView() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_item_icon);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_item_normal;
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
