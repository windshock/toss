package com.tnkfactory.ad.basic;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.rwd.TnkImageLoader;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TnkAdListBasicItem extends ITnkOffAdItem {
    public ViewGroup root;

    public static final void a(TnkAdListBasicItem tnkAdListBasicItem, View view) {
        tnkAdListBasicItem.onItemClick();
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        View rewardBgLayout;
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNull(view, "");
        setRoot((ViewGroup) view);
        View view2 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(getTitle());
        }
        TextView subTitleView = getSubTitleView();
        if (subTitleView != null) {
            subTitleView.setText(getSubTitle());
        }
        ImageView iconImageView = getIconImageView();
        if (iconImageView != null) {
            TnkImageLoader.INSTANCE.loadImage(iconImageView, getAdItem().getIconUrl());
        }
        ImageView adImageView = getAdImageView();
        if (adImageView != null) {
            TnkImageLoader.INSTANCE.loadImage(adImageView, getAdItem().getImgUrl());
        }
        if (getAdItem().getDayLimited()) {
            TextView pointView = getPointView();
            if (pointView != null) {
                pointView.setVisibility(8);
            }
            TextView orgPntAmtView = getOrgPntAmtView();
            if (orgPntAmtView != null) {
                orgPntAmtView.setVisibility(8);
            }
            TextView unitView = getUnitView();
            if (unitView != null) {
                unitView.setVisibility(8);
            }
            View unitIconView = getUnitIconView();
            if (unitIconView != null) {
                unitIconView.setVisibility(8);
            }
            TextView multiRewardView = getMultiRewardView();
            if (multiRewardView != null) {
                multiRewardView.setVisibility(8);
            }
            TextView campnTypeView = getCampnTypeView();
            if (campnTypeView != null) {
                campnTypeView.setVisibility(8);
            }
            TextView receiptView = getReceiptView();
            if (receiptView != null) {
                receiptView.setVisibility(0);
            }
        } else {
            setViewItem(getPointView(), getOrgPntAmtView(), getUnitView(), getUnitIconView(), getMultiRewardView(), getCampnTypeView(), getReceiptView());
            TextView pointView2 = getPointView();
            if (pointView2 != null && (rewardBgLayout = getRewardBgLayout()) != null) {
                rewardBgLayout.setVisibility(pointView2.getVisibility());
            }
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListBasicItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                TnkAdListBasicItem.a(this.f$0, view3);
            }
        });
    }

    public ImageView getAdImageView() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_item_image);
    }

    public final String getCampaignType() {
        return String.valueOf(getAdItem().getCampaignType());
    }

    public TextView getCampnTypeView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_campaign);
    }

    public final Drawable getIconDrawable() {
        return getTnkContext().getActivity().getResources().getDrawable(R.drawable.com_tnk_offerwall_ico_point_unit);
    }

    public ImageView getIconImageView() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_item_icon);
    }

    public final String getIconUrl() {
        return getAdItem().getIconUrl();
    }

    public final String getImageUrl() {
        return getAdItem().getImgUrl();
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_item_basic;
    }

    public TextView getMultiRewardView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_multi_reward_text);
    }

    public TextView getOrgPntAmtView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_org_pnt_amt);
    }

    public final long getOrgPoint() {
        return getAdItem().getOrg_pnt_amt();
    }

    public final String getOrgPointString() {
        return getOrgMntPoint();
    }

    public final long getPoint() {
        return getAdItem().getPointAmount();
    }

    public final String getPointString() {
        return getRewardPoint();
    }

    public TextView getPointView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_point);
    }

    public TextView getReceiptView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_complete);
    }

    public final RecyclerView getRecyclerView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return null;
        }
        if (!(parent instanceof RecyclerView)) {
            return getRecyclerView(view);
        }
        RecyclerView parent2 = view.getParent();
        Intrinsics.checkNotNull(parent2, "");
        return parent2;
    }

    public View getRewardBgLayout() {
        return getRoot().findViewById(R.id.com_tnk_off_item_reward_layout);
    }

    public final ViewGroup getRoot() {
        ViewGroup viewGroup = this.root;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    public final int getStatus() {
        if (isComplete()) {
            return 1;
        }
        if (getAdItem().getDayLimited()) {
            return 2;
        }
        return getAdItem().getOnError() ? 3 : 0;
    }

    public TextView getSubTitleView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_sub_title);
    }

    public TextView getTitleView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_title);
    }

    public final String getUnit() {
        return getAdItem().getPointUnit();
    }

    public View getUnitIconView() {
        return getRoot().findViewById(R.id.com_tnk_off_item_unit_icon);
    }

    public TextView getUnitView() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_unit);
    }

    @Override // com.xwray.groupie.Item
    public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewAttachedToWindow(setcolorschemecolors);
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        RecyclerView recyclerView = getRecyclerView(view);
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            ViewGroup.LayoutParams layoutParams = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.getLayoutParams();
            RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
            if (gridLayoutManager.onExtraCallback().IAuthTabCallback(layoutParams2 != null ? layoutParams2.getViewLayoutPosition() : 0, 12) < 6) {
                int direction = getDirection();
                TnkDirection tnkDirection = TnkDirection.INSTANCE;
                setDirection(direction & (~tnkDirection.getRIGHT()));
                setDirection(getDirection() | tnkDirection.getLEFT());
                return;
            }
            int direction2 = getDirection();
            TnkDirection tnkDirection2 = TnkDirection.INSTANCE;
            setDirection(direction2 & (~tnkDirection2.getLEFT()));
            setDirection(getDirection() | tnkDirection2.getRIGHT());
        }
    }

    public final void setRoot(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.root = viewGroup;
    }
}
