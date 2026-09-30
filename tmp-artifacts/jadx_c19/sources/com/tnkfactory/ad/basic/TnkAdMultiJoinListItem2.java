package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkAdHideUtil;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.TnkImageLoader;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.xwray.groupie.Item;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdMultiJoinListItem2 extends Item<setColorSchemeColors> {
    public final MultiCampaignJoinListItem a;
    public final OnMultiJoinItemClickListener b;
    public final AdEventHandler c;

    public interface OnMultiJoinItemClickListener {
        public static final Companion Companion = Companion.a;
        public static final int EVENT_ITEM_REMOVE = 1;

        public static final class Companion {
            public static final int EVENT_ITEM_REMOVE = 1;
            public static final /* synthetic */ Companion a = new Companion();
        }

        boolean onEvent(int i2, long j);
    }

    public TnkAdMultiJoinListItem2(@NotNull MultiCampaignJoinListItem multiCampaignJoinListItem, @NotNull TnkContext tnkContext, @NotNull OnMultiJoinItemClickListener onMultiJoinItemClickListener) {
        Intrinsics.checkNotNullParameter(multiCampaignJoinListItem, "");
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(onMultiJoinItemClickListener, "");
        this.a = multiCampaignJoinListItem;
        this.b = onMultiJoinItemClickListener;
        this.c = tnkContext.getEventHandler();
    }

    public static final void a(TnkAdMultiJoinListItem2 tnkAdMultiJoinListItem2, View view) {
        tnkAdMultiJoinListItem2.c.onItemSelected(tnkAdMultiJoinListItem2.a.getApp_id(), new AdEventListener() { // from class: com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2$bind$1$3$1
            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onComplete(AdListVo adListVo, boolean z) {
                Intrinsics.checkNotNullParameter(adListVo, "");
            }

            @Override // com.tnkfactory.ad.off.AdEventListener
            public void onError(TnkError tnkError) {
                Intrinsics.checkNotNullParameter(tnkError, "");
            }
        });
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        final View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNull(view);
        View progressState = getProgressState(view);
        if (progressState != null) {
            progressState.setVisibility(this.a.getPay_cnt() == 0 ? 8 : 0);
        }
        View exclamation = getExclamation(view);
        if (exclamation != null) {
            exclamation.setVisibility((this.a.getInst_dt() == 0 && this.a.getPay_cnt() == 0) ? 0 : 8);
        }
        View hideButton = getHideButton(view);
        if (hideButton != null) {
            hideButton.setVisibility((this.a.getInst_dt() == 0 && this.a.getPay_cnt() == 0) ? 0 : 8);
        }
        TextView titleView = getTitleView(view);
        if (titleView != null) {
            titleView.setText(this.a.getApp_nm());
        }
        TnkImageLoader tnkImageLoader = TnkImageLoader.INSTANCE;
        ImageView iconImageView = getIconImageView(view);
        Intrinsics.checkNotNullExpressionValue(iconImageView, "");
        tnkImageLoader.loadImage(iconImageView, this.a.getIcon_url());
        TextView pointView = getPointView(view);
        if (pointView != null) {
            pointView.setText(Resources.getResources().formatCurrency(this.a.getPnt_amt()));
        }
        TextView unitView = getUnitView(view);
        ImageView imageView = null;
        if (unitView != null) {
            unitView.setText(this.a.getPnt_unit());
            unitView.setVisibility(TnkAdConfig.INSTANCE.getUsePointUnit() ? 0 : 8);
        } else {
            unitView = null;
        }
        ImageView unitIconView = getUnitIconView(view);
        if (unitIconView != null) {
            unitIconView.setVisibility(TnkAdConfig.INSTANCE.getUsePointUnit() ? 8 : 0);
            imageView = unitIconView;
        }
        TextView remainDay = getRemainDay(view);
        if (remainDay != null) {
            remainDay.setText(this.a.getValid_lbl());
        }
        TextView startDate = getStartDate(view);
        if (startDate != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.a.getPay_dt());
            int i3 = calendar.get(1);
            int i4 = calendar.get(2);
            startDate.setText(i3 + "." + (i4 + 1) + "." + calendar.get(5));
        }
        int pointEffectType = TnkAdConfig.INSTANCE.getPointEffectType();
        if (pointEffectType == 1) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (unitView != null) {
                unitView.setVisibility(0);
            }
        } else if (pointEffectType == 2) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (unitView != null) {
                unitView.setVisibility(8);
            }
        }
        getCampnTypeView(view).setText("미션달성 시");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TnkAdMultiJoinListItem2.a(this.f$0, view2);
            }
        });
        TextView campaignCount = getCampaignCount(view);
        if (campaignCount != null) {
            campaignCount.setText(String.valueOf(this.a.getCmpn_cnt()));
        }
        TextView remainCount = getRemainCount(view);
        if (remainCount != null) {
            remainCount.setText(String.valueOf(this.a.getPay_cnt()));
        }
        TextView payCount = getPayCount(view);
        if (payCount != null) {
            payCount.setText(String.valueOf(this.a.getCmpn_cnt() - this.a.getPay_cnt()));
        }
        ProgressBar progress = getProgress(view);
        if (progress != null) {
            progress.setMax(100);
        }
        ProgressBar progress2 = getProgress(view);
        if (progress2 != null) {
            progress2.setProgress((int) ((this.a.getPay_cnt() / this.a.getCmpn_cnt()) * 100.0f));
        }
        View hideButton2 = getHideButton(view);
        if (hideButton2 != null) {
            hideButton2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TnkAdMultiJoinListItem2.a(view, this, view2);
                }
            });
        }
    }

    public final AdEventHandler getAdEventHandler() {
        return this.c;
    }

    public final TextView getCampaignCount(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_size);
    }

    public final TextView getCampnTypeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_campaign);
    }

    public final View getExclamation(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.findViewById(R.id.com_tnk_iv_exclamation);
    }

    public final View getHideButton(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.findViewById(R.id.com_tnk_off_multi_join_hide_button);
    }

    public final ImageView getIconImageView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (ImageView) view.findViewById(R.id.com_tnk_off_multi_join_item_icon);
    }

    public final MultiCampaignJoinListItem getItem() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_multi_join_item;
    }

    public final TextView getMultiRewardView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_multi_reward_text);
    }

    public final OnMultiJoinItemClickListener getOnEvent() {
        return this.b;
    }

    public final TextView getPayCount(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_pay_count);
    }

    public final TextView getPointView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_point);
    }

    public final ProgressBar getProgress(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (ProgressBar) view.findViewById(R.id.com_tnk_progress_circular);
    }

    public final View getProgressState(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.findViewById(R.id.com_tnk_off_multi_progress_state_layout);
    }

    public final TextView getReceiptView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_complete);
    }

    public final TextView getRemainCount(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_complete_count);
    }

    public final TextView getRemainDay(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_remain_day);
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    public final TextView getStartDate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_start_date);
    }

    public final TextView getTitleView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_title);
    }

    public final ImageView getUnitIconView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (ImageView) view.findViewById(R.id.com_tnk_off_multi_join_item_unit_icon);
    }

    public final TextView getUnitView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_unit);
    }

    public static final void a(View view, final TnkAdMultiJoinListItem2 tnkAdMultiJoinListItem2, View view2) {
        TnkAdHideUtil tnkAdHideUtil = TnkAdHideUtil.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        tnkAdHideUtil.hideApp(context, tnkAdMultiJoinListItem2.a.getApp_nm(), tnkAdMultiJoinListItem2.a.getApp_id(), new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2$$ExternalSyntheticLambda0
            public final Object invoke() {
                return TnkAdMultiJoinListItem2.a(this.f$0);
            }
        }, new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdMultiJoinListItem2$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TnkAdMultiJoinListItem2.a();
            }
        });
    }

    public static final Unit a(TnkAdMultiJoinListItem2 tnkAdMultiJoinListItem2) {
        tnkAdMultiJoinListItem2.b.onEvent(1, tnkAdMultiJoinListItem2.a.getApp_id());
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
