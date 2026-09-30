package com.tnkfactory.ad.basic;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.RVParams;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.DeviceManager;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.TnkImageLoader;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.VideoActionListener;
import com.tnkfactory.ad.rwd.VideoAdView;
import com.tnkfactory.ad.rwd.VideoProgressListener;
import com.tnkfactory.ad.rwd.YouTubeVideoView;
import com.tnkfactory.ad.rwd.data.constants.Constants;
import com.tnkfactory.ad.style.DpUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListDetailView extends ConstraintLayout implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final FragmentActivity a;
    public final AdListVo b;
    public final Function0 c;
    public final TnkContext d;
    public final Lazy e;
    public final TextFieldSizeKtExternalSyntheticLambda2 f;
    public final Lazy g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public ViewGroup f29i;
    public AdEventHandler j;
    public AdActionInfoVo k;
    public final AdListDetailView$adEventListener$1 l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdListDetailView(@NotNull FragmentActivity fragmentActivity, @NotNull AdListVo adListVo, int i2, @Nullable Function0<Unit> function0) throws NoWhenBranchMatchedException {
        Object next;
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        this.a = fragmentActivity;
        this.b = adListVo;
        this.c = function0;
        this.d = new TnkContext(fragmentActivity);
        this.e = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda1
            public final Object invoke() {
                return AdListDetailView.b(this.f$0);
            }
        });
        this.f = getLifecycleRegistry();
        this.g = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda2
            public final Object invoke() {
                return AdListDetailView.a(this.f$0);
            }
        });
        this.j = new AdEventHandler(fragmentActivity);
        Iterator<T> it = adListVo.getCampaignItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!((AdActionInfoVo) next).getPayYn()) {
                    break;
                }
            }
        }
        AdActionInfoVo adActionInfoVo = (AdActionInfoVo) next;
        if (adActionInfoVo == null && (adActionInfoVo = (AdActionInfoVo) CollectionsKt.firstOrNull(this.b.getCampaignItems())) == null) {
            adActionInfoVo = new AdActionInfoVo(0L, 0L, null, null, 0, 0, null, 0, null, null, null, null, null, null, 0L, 0L, false, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 0, -1, null);
        }
        this.k = adActionInfoVo;
        View viewInflate = getLayoutInflater().inflate(i2, (ViewGroup) this, true);
        Intrinsics.checkNotNull(viewInflate, "");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f29i = viewGroup;
        viewGroup.setFitsSystemWindows(true);
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED);
        if (isAttachedToWindow()) {
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
            a();
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) throws NoWhenBranchMatchedException {
                    this.removeOnAttachStateChangeListener(this);
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
                    this.a();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
        }
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                }
            });
        } else {
            getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        }
        this.l = new AdListDetailView$adEventListener$1(this);
    }

    public static final LayoutInflater a(AdListDetailView adListDetailView) {
        return LayoutInflater.from(adListDetailView.a);
    }

    public static final /* synthetic */ void access$setCurrentSeekTime$p(AdListDetailView adListDetailView, int i2) {
    }

    public static final /* synthetic */ void access$setVideoComplete$p(AdListDetailView adListDetailView, boolean z) {
    }

    public static final void access$setVideoViewSize(AdListDetailView adListDetailView, ViewGroup viewGroup, int i2, int i3) {
        float measuredWidth = adListDetailView.f29i.getMeasuredWidth();
        float measuredHeight = adListDetailView.f29i.getMeasuredHeight();
        float f = i2;
        float f2 = i3;
        float fDpToPx = measuredWidth / measuredHeight > f / f2 ? (measuredHeight / f2) * 0.8f : (measuredWidth - DpUtil.INSTANCE.dpToPx(40.0f)) / f;
        viewGroup.getLayoutParams().width = (int) (f * fDpToPx);
        viewGroup.getLayoutParams().height = (int) (fDpToPx * f2);
        viewGroup.requestLayout();
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 b(AdListDetailView adListDetailView) {
        return new TextFieldSizeKtExternalSyntheticLambda2(adListDetailView);
    }

    public static final void c(AdListDetailView adListDetailView, View view) {
        adListDetailView.customClose();
    }

    public static final void d(AdListDetailView adListDetailView, View view) {
        adListDetailView.d.getNavi().moveToMyMenu(3);
    }

    private final TextView getActionComplete() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_action_complete);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getActionCountView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_action_item_count);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final View getActionFoldArrow() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_action_icon);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getActionListView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_action_items);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final TextView getActionSize() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_action_size);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final View getAppDescFoldArrow() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_join_desc_icon);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final TextView getAppDescTextView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_app_desc);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final TextView getCampnTypeView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_campaign);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final TextView getCancelButton() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_close);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final View getConfirmButton() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_confirm);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final ImageView getContentImageView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_image);
        if (viewFindViewById instanceof ImageView) {
            return (ImageView) viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getContentView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_content_layout);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getContentViewBg() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_content_background);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final TextView getDescriptionView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_sub_title);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final ImageView getIconImageView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_icon);
        if (viewFindViewById instanceof ImageView) {
            return (ImageView) viewFindViewById;
        }
        return null;
    }

    private final ViewGroup getImageBg() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_image_background);
        if (viewFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewFindViewById;
        }
        return null;
    }

    private final TextView getJoinDescriptionView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_join_desc);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final LinearLayout getJoinDetailFold() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_join_desc_fold);
        if (viewFindViewById instanceof LinearLayout) {
            return (LinearLayout) viewFindViewById;
        }
        return null;
    }

    private final TextView getJoinDetailFoldText() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_join_desc_script);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final LayoutInflater getLayoutInflater() {
        Object value = this.g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LayoutInflater) value;
    }

    private final ConstraintLayout getLayoutJoinDetail() {
        ConstraintLayout constraintLayoutFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_app_info_layout);
        if (constraintLayoutFindViewById instanceof ConstraintLayout) {
            return constraintLayoutFindViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldSizeKtExternalSyntheticLambda2 getLifecycleRegistry() {
        return (TextFieldSizeKtExternalSyntheticLambda2) this.e.getValue();
    }

    private final View getMyMenu() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_my);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    private final TextView getPointView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_point);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final TextView getTitleView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_title);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final TextView getTvConfirmDesc() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_confirm_desc);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final TextView getUnitView() {
        View viewFindViewById = this.f29i.findViewById(R.id.com_tnk_off_detail_unit);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final void setConfirmButtonV2(View view) throws NoWhenBranchMatchedException {
        if (view == null) {
            return;
        }
        if (Utils.isNull(this.k.getBtn_lbl()) || getTvConfirmDesc() == null) {
            TextView tvConfirmDesc = getTvConfirmDesc();
            if (tvConfirmDesc != null) {
                tvConfirmDesc.setVisibility(8);
            }
            setViewItem(true, getComTnkOffDetailTvConfirmPoint(), null, getComTnkOffDetailTvConfirmUnit(), getComTnkOffDetailTvConfirmIcon(), getComTnkOffDetailTvConfirmMulti(), getComTnkOffDetailTvConfirmCampaign(), null);
        } else {
            TextView tvConfirmDesc2 = getTvConfirmDesc();
            if (tvConfirmDesc2 != null) {
                tvConfirmDesc2.setVisibility(0);
            }
            TextView tvConfirmDesc3 = getTvConfirmDesc();
            if (tvConfirmDesc3 != null) {
                tvConfirmDesc3.setText(Utils.fromHtml(StringsKt.replace$default(this.k.getBtn_lbl(), Constants.PLACE_HOLDER_UNIT, this.b.getPointUnit(), false, 4, (Object) null)));
            }
            TextView comTnkOffDetailTvConfirmPoint = getComTnkOffDetailTvConfirmPoint();
            if (comTnkOffDetailTvConfirmPoint != null) {
                comTnkOffDetailTvConfirmPoint.setVisibility(8);
            }
            TextView comTnkOffDetailTvConfirmUnit = getComTnkOffDetailTvConfirmUnit();
            if (comTnkOffDetailTvConfirmUnit != null) {
                comTnkOffDetailTvConfirmUnit.setVisibility(8);
            }
            View comTnkOffDetailTvConfirmIcon = getComTnkOffDetailTvConfirmIcon();
            if (comTnkOffDetailTvConfirmIcon != null) {
                comTnkOffDetailTvConfirmIcon.setVisibility(8);
            }
            TextView comTnkOffDetailTvConfirmMulti = getComTnkOffDetailTvConfirmMulti();
            if (comTnkOffDetailTvConfirmMulti != null) {
                comTnkOffDetailTvConfirmMulti.setVisibility(8);
            }
            TextView comTnkOffDetailTvConfirmCampaign = getComTnkOffDetailTvConfirmCampaign();
            if (comTnkOffDetailTvConfirmCampaign != null) {
                comTnkOffDetailTvConfirmCampaign.setVisibility(8);
            }
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AdListDetailView.b(this.f$0, view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void customClose() {
        try {
            Function0 function0 = this.c;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "");
            ((ViewGroup) parent).removeView(this);
        } catch (Exception unused) {
        }
    }

    public final void drawActionItem(final boolean z) {
        int i2;
        ViewGroup actionListView = getActionListView();
        if (actionListView != null) {
            actionListView.removeAllViews();
        }
        if (this.b.getCampaignItems().size() <= 1) {
            ViewGroup actionListView2 = getActionListView();
            if (actionListView2 != null) {
                actionListView2.setVisibility(8);
            }
            ViewGroup actionCountView = getActionCountView();
            if (actionCountView != null) {
                actionCountView.setVisibility(8);
                return;
            }
            return;
        }
        int size = this.b.getCampaignItems().size();
        for (int i3 = 0; i3 < size && (!z || i3 <= 3); i3++) {
            AdActionInfoVo adActionInfoVo = this.b.getCampaignItems().get(i3);
            Intrinsics.checkNotNullExpressionValue(adActionInfoVo, "");
            ConstraintLayout adDetailActionItem = new AdDetailActionItem(this.a, adActionInfoVo);
            adDetailActionItem.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            ViewGroup actionListView3 = getActionListView();
            if (actionListView3 != null) {
                actionListView3.addView(adDetailActionItem);
            }
        }
        if (getActionCountView() != null) {
            TextView actionComplete = getActionComplete();
            if (actionComplete != null) {
                ArrayList<AdActionInfoVo> campaignItems = this.b.getCampaignItems();
                if (campaignItems == null || !campaignItems.isEmpty()) {
                    Iterator<T> it = campaignItems.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (((AdActionInfoVo) it.next()).getPayYn() && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i2 = 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                actionComplete.setText(sb.toString());
            }
            TextView actionSize = getActionSize();
            if (actionSize != null) {
                int size2 = this.b.getCampaignItems().size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(size2);
                actionSize.setText(sb2.toString());
            }
        }
        ViewGroup actionListView4 = getActionListView();
        if (actionListView4 != null) {
            actionListView4.setVisibility(0);
        }
        ViewGroup actionCountView2 = getActionCountView();
        if (actionCountView2 != null) {
            actionCountView2.setVisibility(0);
        }
        if (this.b.getCampaignItems().size() < 5) {
            View actionFoldArrow = getActionFoldArrow();
            if (actionFoldArrow != null) {
                actionFoldArrow.setVisibility(8);
            }
        } else {
            View actionFoldArrow2 = getActionFoldArrow();
            if (actionFoldArrow2 != null) {
                actionFoldArrow2.setVisibility(0);
            }
            View actionFoldArrow3 = getActionFoldArrow();
            if (actionFoldArrow3 != null) {
                actionFoldArrow3.setBackgroundResource(z ? R.drawable.down_arrow_lighter : R.drawable.com_tnk_offerwall_up_arrow_lighter);
            }
        }
        View actionFoldArrow4 = getActionFoldArrow();
        if (actionFoldArrow4 != null) {
            actionFoldArrow4.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListDetailView.a(this.f$0, z, view);
                }
            });
        }
    }

    public final AdActionInfoVo getActionInfo() {
        return this.k;
    }

    public final AdEventListener getAdEventListener() {
        return this.l;
    }

    public final TextView getComTnkOffDetailCampaign() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_campaign);
    }

    public final TextView getComTnkOffDetailMultiRewardText() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_multi_reward_text);
    }

    public final TextView getComTnkOffDetailOrgPntAmt() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_org_pnt_amt);
    }

    public final TextView getComTnkOffDetailPoint() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_point);
    }

    public final TextView getComTnkOffDetailReceipt() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_receipt);
    }

    public final TextView getComTnkOffDetailTvConfirmCampaign() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_tv_confirm_campaign);
    }

    public final View getComTnkOffDetailTvConfirmIcon() {
        return this.f29i.findViewById(R.id.com_tnk_off_detail_tv_confirm_icon);
    }

    public final TextView getComTnkOffDetailTvConfirmMulti() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_tv_confirm_multi);
    }

    public final TextView getComTnkOffDetailTvConfirmPoint() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_tv_confirm_point);
    }

    public final TextView getComTnkOffDetailTvConfirmUnit() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_tv_confirm_unit);
    }

    public final TextView getComTnkOffDetailUnit() {
        return (TextView) this.f29i.findViewById(R.id.com_tnk_off_detail_unit);
    }

    public final View getComTnkOffDetailUnitIcon() {
        return this.f29i.findViewById(R.id.com_tnk_off_detail_unit_icon);
    }

    public final boolean getDescTruncated() {
        return this.m;
    }

    public final AdListVo getDetailAdItem() {
        return this.b;
    }

    public final AdEventHandler getEventHandler() {
        return this.j;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.f;
    }

    public final FragmentActivity getMContext() {
        return this.a;
    }

    public final Function0<Unit> getOnClose() {
        return this.c;
    }

    public final String getOrgMntPoint() {
        return Resources.getResources().formatCurrency(this.b.getOrg_pnt_amt());
    }

    public final String getRewardPoint() {
        return Resources.getResources().formatCurrency(this.b.getPointAmount());
    }

    public final ViewGroup getRootView() {
        return this.f29i;
    }

    public final TnkContext getTnkContext() {
        return this.d;
    }

    public final void joinDetail() {
        if (TextUtils.isEmpty(this.k.getActionDesc())) {
            ConstraintLayout layoutJoinDetail = getLayoutJoinDetail();
            if (layoutJoinDetail != null) {
                layoutJoinDetail.setVisibility(8);
                return;
            }
            return;
        }
        ConstraintLayout layoutJoinDetail2 = getLayoutJoinDetail();
        if (layoutJoinDetail2 != null) {
            layoutJoinDetail2.setVisibility(0);
        }
        List listIAuthTabCallback = new Regex("\n").IAuthTabCallback(this.k.getActionDesc(), 0);
        StringBuilder sb = new StringBuilder();
        this.m = false;
        int size = listIAuthTabCallback.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            sb.append((String) listIAuthTabCallback.get(i2));
            if (i2 >= 4 && i2 != listIAuthTabCallback.size() - 1) {
                this.m = true;
                break;
            } else if (sb.length() > 150) {
                this.m = true;
                break;
            } else {
                sb.append("\n");
                i2++;
            }
        }
        TextView appDescTextView = getAppDescTextView();
        if (appDescTextView != null) {
            appDescTextView.setText(joinDesc(this.k.getActionDesc()));
        }
        TextView appDescTextView2 = getAppDescTextView();
        if (appDescTextView2 != null) {
            appDescTextView2.setMaxLines(this.m ? 3 : 99);
        }
        LinearLayout joinDetailFold = getJoinDetailFold();
        if (joinDetailFold != null) {
            joinDetailFold.setVisibility(this.m ? 0 : 8);
        }
        LinearLayout joinDetailFold2 = getJoinDetailFold();
        if (joinDetailFold2 != null) {
            joinDetailFold2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListDetailView.a(this.f$0, view);
                }
            });
        }
    }

    public final void setActionInfo(@NotNull AdActionInfoVo adActionInfoVo) {
        Intrinsics.checkNotNullParameter(adActionInfoVo, "");
        this.k = adActionInfoVo;
    }

    public final void setDescTruncated(boolean z) {
        this.m = z;
    }

    public final void setEventHandler(@NotNull AdEventHandler adEventHandler) {
        Intrinsics.checkNotNullParameter(adEventHandler, "");
        this.j = adEventHandler;
    }

    public final void setRootView(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.f29i = viewGroup;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setViewItem(boolean z, @Nullable TextView textView, @Nullable TextView textView2, @Nullable TextView textView3, @Nullable View view, @Nullable TextView textView4, @Nullable TextView textView5, @Nullable TextView textView6) throws NoWhenBranchMatchedException {
        ImageView imageView;
        AdActionInfoVo adActionInfoVo;
        TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
        boolean usePointUnit = tnkAdConfig.getUsePointUnit();
        if (usePointUnit) {
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            if (usePointUnit) {
                throw new NoWhenBranchMatchedException();
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (z) {
                Drawable pointIconDrawableWhite = tnkAdConfig.getPointIconDrawableWhite();
                if (pointIconDrawableWhite != null) {
                    imageView = view instanceof ImageView ? (ImageView) view : null;
                    if (imageView != null) {
                        imageView.setImageDrawable(pointIconDrawableWhite);
                    }
                }
            } else {
                Drawable pointIconDrawable = tnkAdConfig.getPointIconDrawable();
                if (pointIconDrawable != null) {
                    imageView = view instanceof ImageView ? (ImageView) view : null;
                    if (imageView != null) {
                        imageView.setImageDrawable(pointIconDrawable);
                    }
                }
            }
        }
        int pointEffectType = tnkAdConfig.getPointEffectType();
        if (pointEffectType == 1) {
            if (view != null) {
                view.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else if (pointEffectType == 2) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        if (textView6 != null) {
            AdListVo adListVo = this.b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (AdListVoKt.isInstallComplete(adListVo, context) && (adActionInfoVo = (AdActionInfoVo) CollectionsKt.firstOrNull(this.b.getCampaignItems())) != null && !adActionInfoVo.getPayYn()) {
                textView6.setText("확인하고 리워드 받기");
                textView6.setVisibility(0);
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                if (textView5 != null) {
                    textView5.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        if (this.b.getOrg_pnt_amt() == 0) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            if (textView5 != null) {
                textView5.setText(AdListVoKt.getCampaignName(this.b));
            }
        } else if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(getOrgMntPoint());
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        if (this.b.getMultiYn()) {
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (textView4 != null) {
            textView4.setVisibility(8);
        }
        if (textView != null) {
            textView.setText(getRewardPoint());
        }
        boolean usePointUnit2 = tnkAdConfig.getUsePointUnit();
        if (usePointUnit2) {
            if (textView3 != null) {
                textView3.setText(this.b.getPointUnit());
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            if (usePointUnit2) {
                throw new NoWhenBranchMatchedException();
            }
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
        int pointEffectType2 = tnkAdConfig.getPointEffectType();
        if (pointEffectType2 == 1) {
            if (view != null) {
                view.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                return;
            }
            return;
        }
        if (pointEffectType2 == 2) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
    }

    public static final void b(AdListDetailView adListDetailView, View view) {
        try {
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            map.put("item_id", String.valueOf(adListDetailView.b.getAppId()));
            map.put("item_name", adListDetailView.b.getApp_nm());
            map.put("item_data", AdListVoKt.toJson(adListDetailView.b));
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("tnk_ev_ad_join_click", map);
        } catch (Exception unused) {
        }
        adListDetailView.j.onClickConfirm(adListDetailView.b, adListDetailView.h, adListDetailView.l);
    }

    public final void a() throws NoWhenBranchMatchedException {
        Object next;
        String str;
        Iterator<T> it = this.b.getCampaignItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!((AdActionInfoVo) next).getPayYn()) {
                    break;
                }
            }
        }
        if (((AdActionInfoVo) next) == null) {
            return;
        }
        ViewGroup contentView = getContentView();
        if (contentView != null) {
            contentView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.k.getDetailFeaturedImageUrl()) && getContentImageView() != null) {
            RequestBuilder<Drawable> requestBuilderOnExtraCallbackWithResult = Glide.onExtraCallbackWithResult(this.a).onExtraCallbackWithResult(this.k.getDetailFeaturedImageUrl());
            ImageView contentImageView = getContentImageView();
            Intrinsics.checkNotNull(contentImageView);
            requestBuilderOnExtraCallbackWithResult.onExtraCallback(contentImageView);
            ViewGroup imageBg = getImageBg();
            if (imageBg != null) {
                imageBg.setVisibility(0);
            }
        }
        if (this.k.getActionId() != 3 && getContentView() != null) {
            if (!Utils.isNull(this.k.getYoutubeId())) {
                ViewGroup contentView2 = getContentView();
                Intrinsics.checkNotNull(contentView2);
                a(contentView2, false);
            } else if (!Utils.isNull(this.k.getVideoUrl())) {
                final ViewGroup contentView3 = getContentView();
                Intrinsics.checkNotNull(contentView3);
                VideoAdView videoAdView = new VideoAdView(this.a, 1, false, 0, true);
                if (this.k.getVideoMute() == 1) {
                    videoAdView.setMuteOnStart(true);
                }
                if (this.k.getVideoStart() == 0) {
                    if (DeviceManager.INSTANCE.isWifiConnected()) {
                        videoAdView.setAutoStart(true);
                    }
                } else if (this.k.getVideoStart() == 1) {
                    videoAdView.setAutoStart(true);
                }
                videoAdView.setVideoProgressListener(new VideoProgressListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$initVideoView$1
                    @Override // com.tnkfactory.ad.rwd.VideoProgressListener
                    public void onProgress(int i2) {
                    }

                    @Override // com.tnkfactory.ad.rwd.VideoProgressListener
                    public void onSeekTime(int i2) {
                        AdListDetailView.access$setCurrentSeekTime$p(this.a, i2);
                    }
                });
                videoAdView.setVideoActionListener(new VideoActionListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$initVideoView$2
                    @Override // com.tnkfactory.ad.rwd.VideoActionListener
                    public void onCompletion(View view) {
                        Intrinsics.checkNotNullParameter(view, "");
                        AdListDetailView.access$setVideoComplete$p(this.a, true);
                    }

                    @Override // com.tnkfactory.ad.rwd.VideoActionListener
                    public void onSize(int i2, int i3) {
                        AdListDetailView.access$setVideoViewSize(this.a, contentView3, i2, i3);
                    }
                });
                videoAdView.setMediaPath(this.k.getVideoUrl());
                int iDip = Utils.dip(RVParams.WEBVIEW_FONT_SIZE_LARGEST);
                ViewGroup.LayoutParams layoutParams = contentView3.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "");
                layoutParams.width = -1;
                layoutParams.height = iDip;
                contentView3.setLayoutParams(layoutParams);
                contentView3.removeAllViews();
                contentView3.addView(videoAdView);
                contentView3.setVisibility(0);
                ViewGroup contentViewBg = getContentViewBg();
                if (contentViewBg != null) {
                    contentViewBg.setVisibility(0);
                }
                this.h = true;
            }
        }
        if (getIconImageView() != null) {
            String iconUrl = this.b.getIconUrl();
            TnkImageLoader tnkImageLoader = TnkImageLoader.INSTANCE;
            ImageView iconImageView = getIconImageView();
            Intrinsics.checkNotNull(iconImageView);
            tnkImageLoader.loadImage(iconImageView, iconUrl);
        }
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(this.b.getTitle());
        }
        if (!TextUtils.isEmpty(this.k.getCorp_desc())) {
            TextView descriptionView = getDescriptionView();
            if (descriptionView != null) {
                descriptionView.setText(StringsKt.replace$default(this.k.getCorp_desc(), " ", " ", false, 4, (Object) null));
            }
        } else if (TextUtils.isEmpty(StringsKt.trim(this.b.getCorp_desc()).toString())) {
            TextView descriptionView2 = getDescriptionView();
            if (descriptionView2 != null) {
                descriptionView2.setVisibility(8);
            }
        } else {
            TextView descriptionView3 = getDescriptionView();
            if (descriptionView3 != null) {
                descriptionView3.setText(StringsKt.replace$default(this.b.getCorp_desc(), " ", " ", false, 4, (Object) null));
            }
        }
        String rewardPoint = getRewardPoint();
        TextView pointView = getPointView();
        if (pointView != null) {
            pointView.setText(rewardPoint);
        }
        TextView unitView = getUnitView();
        if (unitView != null) {
            unitView.setText(this.b.getPointUnit());
        }
        TextView campnTypeView = getCampnTypeView();
        if (campnTypeView != null) {
            this.b.getCampaignType();
            campnTypeView.setText(AdListVoKt.getCampaignName(this.b));
            campnTypeView.setVisibility(0);
        }
        drawActionItem(false);
        joinDetail();
        if (getJoinDescriptionView() != null) {
            String joinDesc = this.k.getJoinDesc();
            if (Utils.isNull(joinDesc)) {
                str = AdListVoKt.isWebContents(this.b) ? Resources.getResources().extra_text_web : Resources.getResources().extra_text_app;
            } else {
                Iterator it2 = StringsKt.split$default(joinDesc, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
                String str2 = "<ul>";
                while (it2.hasNext()) {
                    str2 = ((Object) str2) + "<li>" + ((String) it2.next()) + "</li>";
                }
                str = ((Object) str2) + "</ul>";
            }
            TextView joinDescriptionView = getJoinDescriptionView();
            if (joinDescriptionView != null) {
                joinDescriptionView.setText(Utils.makeBulletSpannableV2(str));
            }
        }
        TextView cancelButton = getCancelButton();
        if (cancelButton != null) {
            cancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListDetailView.c(this.f$0, view);
                }
            });
        }
        View myMenu = getMyMenu();
        if (myMenu != null) {
            myMenu.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdListDetailView.d(this.f$0, view);
                }
            });
        }
        setViewItem(false, getComTnkOffDetailPoint(), getComTnkOffDetailOrgPntAmt(), getComTnkOffDetailUnit(), getComTnkOffDetailUnitIcon(), getComTnkOffDetailMultiRewardText(), getComTnkOffDetailCampaign(), getComTnkOffDetailReceipt());
        setConfirmButtonV2(getConfirmButton());
    }

    public final CharSequence joinDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Iterator it = StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
        String str2 = "<ul>";
        while (it.hasNext()) {
            str2 = ((Object) str2) + "<li>" + ((String) it.next()) + "</li>";
        }
        return Utils.makeBulletSpannableV2(((Object) str2) + "</ul>");
    }

    public static final void a(AdListDetailView adListDetailView, View view) {
        adListDetailView.m = !adListDetailView.m;
        TextView appDescTextView = adListDetailView.getAppDescTextView();
        if (appDescTextView != null) {
            appDescTextView.setMaxLines(adListDetailView.m ? 3 : 99);
        }
        TextView joinDetailFoldText = adListDetailView.getJoinDetailFoldText();
        if (joinDetailFoldText != null) {
            joinDetailFoldText.setText(adListDetailView.m ? "펼치기" : "접기");
        }
        View appDescFoldArrow = adListDetailView.getAppDescFoldArrow();
        if (appDescFoldArrow != null) {
            appDescFoldArrow.setBackgroundResource(adListDetailView.m ? R.drawable.down_arrow_lighter : R.drawable.com_tnk_offerwall_up_arrow_lighter);
        }
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        layoutParams.width = -1;
        layoutParams.height = -2;
        YouTubeVideoView youTubeVideoView = new YouTubeVideoView(this.a, 1, 0);
        youTubeVideoView.setLayoutParams(layoutParams);
        if (this.k.getVideoMute() == 1) {
            youTubeVideoView.setMuteOnStart(true);
        }
        if (z) {
            youTubeVideoView.setAutoStart(false);
        } else {
            if (this.k.getVideoStart() == 0) {
                if (DeviceManager.INSTANCE.isWifiConnected()) {
                    youTubeVideoView.setAutoStart(true);
                }
            } else if (this.k.getVideoStart() == 1) {
                youTubeVideoView.setAutoStart(true);
            }
            youTubeVideoView.setVideoProgressListener(new VideoProgressListener() { // from class: com.tnkfactory.ad.basic.AdListDetailView$initYoutubeVideoView$1
                @Override // com.tnkfactory.ad.rwd.VideoProgressListener
                public void onProgress(int i2) {
                }

                @Override // com.tnkfactory.ad.rwd.VideoProgressListener
                public void onSeekTime(int i2) {
                    AdListDetailView.access$setCurrentSeekTime$p(this.a, i2);
                }
            });
        }
        youTubeVideoView.setVideoActionListener(new AdListDetailView$initYoutubeVideoView$2(this, viewGroup));
        youTubeVideoView.setYoutubeId(this.k.getYoutubeId());
        int iDip = Utils.dip(RVParams.WEBVIEW_FONT_SIZE_LARGEST);
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "");
        layoutParams2.width = -1;
        layoutParams2.height = iDip;
        viewGroup.setLayoutParams(layoutParams2);
        viewGroup.removeAllViews();
        viewGroup.addView(youTubeVideoView);
        viewGroup.setVisibility(0);
        ViewGroup contentViewBg = getContentViewBg();
        if (contentViewBg != null) {
            contentViewBg.setVisibility(0);
        }
        this.h = true;
    }

    public static final void a(AdListDetailView adListDetailView, boolean z, View view) {
        adListDetailView.drawActionItem(!z);
    }
}
