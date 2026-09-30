package com.tnkfactory.ad.style;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import com.xwray.groupie.Item;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import o.clearRegisters;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ITnkOffAdItem extends Item<setColorSchemeColors> {
    public static final Companion Companion = new Companion(null);
    public AdListVo adItem;
    private int mPosition;
    public TnkContext tnkContext;
    private final Lazy adEventHandler$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.style.ITnkOffAdItem$$ExternalSyntheticLambda0
        public final Object invoke() {
            return ITnkOffAdItem.adEventHandler_delegate$lambda$0(this.f$0);
        }
    });
    private final Lazy tnkOffNavi$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.style.ITnkOffAdItem$$ExternalSyntheticLambda1
        public final Object invoke() {
            return ITnkOffAdItem.tnkOffNavi_delegate$lambda$1(this.f$0);
        }
    });
    private int direction = TnkDirection.INSTANCE.getNONE();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ITnkOffAdItem newInstance(@NotNull TnkContext tnkContext, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull AdListVo adListVo) throws IllegalAccessException, InstantiationException {
            Intrinsics.checkNotNullParameter(tnkContext, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(adListVo, "");
            Object objNewInstance = clearRegisters.onNavigationEvent(kClass).newInstance();
            ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
            iTnkOffAdItem.setTnkContext(tnkContext);
            iTnkOffAdItem.onItemInit(tnkContext, adListVo);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
            return iTnkOffAdItem;
        }
    }

    /* renamed from: com.tnkfactory.ad.style.ITnkOffAdItem$onItemClick$2, reason: invalid class name */
    public static final class AnonymousClass2 implements AdEventListener {
        public AnonymousClass2() {
        }

        public static final Unit a() {
            return Unit.INSTANCE;
        }

        public static final Unit b() {
            return Unit.INSTANCE;
        }

        @Override // com.tnkfactory.ad.off.AdEventListener
        public void onComplete(AdListVo adListVo, boolean z) {
            Intrinsics.checkNotNullParameter(adListVo, "");
            if (z) {
                TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
        @Override // com.tnkfactory.ad.off.AdEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onError(TnkError tnkError) {
            Intrinsics.checkNotNullParameter(tnkError, "");
            if (tnkError.getCode() == 99) {
                TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
                if (TextUtils.isEmpty(tnkAdConfig.getDefaultSystemMessage())) {
                    ITnkOffAdItem.this.getTnkOffNavi().showDialog(ITnkOffAdItem.this.getTnkContext().getActivity(), tnkError.getMessage(), new Function0() { // from class: com.tnkfactory.ad.style.ITnkOffAdItem$onItemClick$2$$ExternalSyntheticLambda1
                        public final Object invoke() {
                            return ITnkOffAdItem.AnonymousClass2.b();
                        }
                    });
                } else {
                    ITnkOffAdItem.this.getTnkOffNavi().showDialog(ITnkOffAdItem.this.getTnkContext().getActivity(), tnkAdConfig.getDefaultSystemMessage(), new Function0() { // from class: com.tnkfactory.ad.style.ITnkOffAdItem$onItemClick$2$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return ITnkOffAdItem.AnonymousClass2.a();
                        }
                    });
                }
            }
            TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdEventHandler adEventHandler_delegate$lambda$0(ITnkOffAdItem iTnkOffAdItem) {
        return iTnkOffAdItem.getTnkContext().getEventHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TnkOffNavi tnkOffNavi_delegate$lambda$1(ITnkOffAdItem iTnkOffAdItem) {
        return iTnkOffAdItem.getTnkContext().getNavi();
    }

    public final AdEventHandler getAdEventHandler() {
        return (AdEventHandler) this.adEventHandler$delegate.getValue();
    }

    public final AdListVo getAdItem() {
        AdListVo adListVo = this.adItem;
        if (adListVo != null) {
            return adListVo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final String getCampaignText() {
        return AdListVoKt.getCampaignName(getAdItem());
    }

    public final String getClassSimpleName() {
        return getClass().getSimpleName();
    }

    public final int getDirection() {
        return this.direction;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    public final String getOrgMntPoint() {
        String currency = Resources.getResources().formatCurrency(getAdItem().getOrg_pnt_amt());
        Intrinsics.checkNotNullExpressionValue(currency, "");
        return currency;
    }

    public final String getRewardPoint() {
        String currency = Resources.getResources().formatCurrency(getAdItem().getPointAmount());
        Intrinsics.checkNotNullExpressionValue(currency, "");
        return currency;
    }

    public final String getSubTitle() {
        return StringsKt.replace$default(getAdItem().getCorp_desc(), " ", " ", false, 4, (Object) null);
    }

    public final String getTitle() {
        String strReplace$default = StringsKt.replace$default(getAdItem().getTitle(), " ", " ", false, 4, (Object) null);
        return TextUtils.isEmpty(strReplace$default) ? getAdItem().getApp_nm() : strReplace$default;
    }

    public final TnkContext getTnkContext() {
        TnkContext tnkContext = this.tnkContext;
        if (tnkContext != null) {
            return tnkContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TnkOffNavi getTnkOffNavi() {
        return (TnkOffNavi) this.tnkOffNavi$delegate.getValue();
    }

    public final boolean isComplete() {
        return AdListVoKt.isInstallComplete(getAdItem(), getTnkContext().getActivity());
    }

    public final void onItemClick() {
        AdListCuration adListCuration = null;
        for (AdListCuration adListCuration2 : TnkCore.INSTANCE.getOffRepository().getCuriation()) {
            List<Long> app_id_list = adListCuration2.getApp_id_list();
            if (app_id_list != null && app_id_list.contains(Long.valueOf(getAdItem().getAppId()))) {
                adListCuration = adListCuration2;
            }
        }
        TnkAssert tnkAssert = TnkAssert.INSTANCE;
        long appId = getAdItem().getAppId();
        int refererTab = tnkAssert.getMOfferwallTabClick().getRefererTab();
        tnkAssert.offerwallDetailShow(String.valueOf(appId), String.valueOf(refererTab), this.mPosition, String.valueOf(adListCuration != null ? adListCuration.getCrt_id() : 0), getAdItem().getCampaignType(), getAdItem().getAdType());
        getAdEventHandler().onItemSelected(getAdItem(), new AnonymousClass2());
    }

    public final void onItemInit(@NotNull TnkContext tnkContext, @NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        setAdItem(adListVo);
        setTnkContext(tnkContext);
    }

    public final void setAdItem(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        this.adItem = adListVo;
    }

    public final void setDirection(int i2) {
        this.direction = i2;
    }

    public final void setMPosition(int i2) {
        this.mPosition = i2;
    }

    public void setPosition(int i2) {
        this.mPosition = i2;
    }

    public final void setTnkContext(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.tnkContext = tnkContext;
    }

    public final void setViewItem(@Nullable TextView textView, @Nullable TextView textView2, @Nullable TextView textView3, @Nullable View view, @Nullable TextView textView4, @Nullable TextView textView5, @Nullable TextView textView6) {
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
            Drawable pointIconDrawable = tnkAdConfig.getPointIconDrawable();
            if (pointIconDrawable != null) {
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    imageView.setImageDrawable(pointIconDrawable);
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
        if (textView6 != null && isComplete()) {
            textView6.setText("확인하고 리워드 받기");
            textView6.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(0);
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
        if (getAdItem().getOrg_pnt_amt() == 0) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            if (textView5 != null) {
                textView5.setText(AdListVoKt.getCampaignName(getAdItem()));
            }
        } else if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(getOrgMntPoint());
            textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
        }
        if (getAdItem().getMultiYn()) {
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
                textView3.setText(getAdItem().getPointUnit());
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
            }
        } else if (pointEffectType2 == 2) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(getAdItem().getPnt_txt())) {
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        if (textView != null) {
            textView.setText(getAdItem().getPnt_txt());
        }
    }
}
