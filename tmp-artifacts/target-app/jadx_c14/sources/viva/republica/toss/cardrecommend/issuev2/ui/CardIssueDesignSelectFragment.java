package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.AdInternalSettings;
import o.DynamicLoader;
import o.GetTSAName;
import o.PageContext;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RecomposerawaitIdle2;
import o.RippleNode;
import o.TypographyKtExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.getCertValue;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getProcessNameAPI28;
import o.preFillDefault;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.view.CardDesignSelectView;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueDesignSelectFragment extends CardIssueBaseFragment<getCertValue> {
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new PropertyReference1Impl<>(CardIssueDesignSelectFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueDesignSelectBinding;", 0)};
    public static final int onExtraCallback = 8;
    private CardDesignSelectView onExtraCallbackWithResult;
    private final PageContext onNavigationEvent;
    private final List<CardDesignSelectView> onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[CardRecommendCardImage.onNavigationEvent.values().length];
            try {
                iArr[CardRecommendCardImage.onNavigationEvent.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardRecommendCardImage.onNavigationEvent.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public CardIssueDesignSelectFragment() {
        super(R.layout.fragment_card_issue_design_select);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.IAuthTabCallback);
        this.onWarmupCompleted = new ArrayList();
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, GetTSAName> {
        public static final onExtraCallback IAuthTabCallback = new onExtraCallback();

        onExtraCallback() {
            super(1, GetTSAName.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueDesignSelectBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final GetTSAName invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return GetTSAName.onNavigationEvent(view);
        }
    }

    private final GetTSAName IAuthTabCallback() {
        return (GetTSAName) this.onNavigationEvent.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
    }

    private final TdsTopV1View onNavigationEvent() {
        TdsTopV1View tdsTopV1View = IAuthTabCallback().IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        return tdsTopV1View;
    }

    private final TdsBottomCtaV1View onWarmupCompleted() {
        TdsBottomCtaV1View tdsBottomCtaV1View = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    private final LinearLayout onExtraCallbackWithResult() {
        LinearLayout linearLayout = IAuthTabCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, java.lang.Object, viva.republica.toss.cardrecommend.issuev2.ui.view.CardDesignSelectView] */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final getCertValue getcertvalue = (getCertValue) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        onNavigationEvent().setUpperText(getcertvalue.onTransact());
        String strIAuthTabCallbackStub = getcertvalue.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null && !StringsKt.isBlank(strIAuthTabCallbackStub)) {
            onNavigationEvent().setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
            onNavigationEvent().setLowerText(getcertvalue.IAuthTabCallbackStub());
        }
        LinearLayout linearLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
        for (getProcessNameAPI28 getprocessnameapi28 : getcertvalue.onExtraCallbackWithResult()) {
            Context context = linearLayoutOnExtraCallbackWithResult.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ?? cardDesignSelectView = new CardDesignSelectView(context, null, 0, 6, null);
            DisplayMetrics displayMetrics = cardDesignSelectView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(32, displayMetrics);
            DisplayMetrics displayMetrics2 = cardDesignSelectView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallback((View) cardDesignSelectView, iOnNavigationEvent, 0, varyMatches.onNavigationEvent(32, displayMetrics2), 0);
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            cardDesignSelectView.setLayoutParams(layoutParams);
            cardDesignSelectView.setCard(getprocessnameapi28);
            cardDesignSelectView.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDesignSelectFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CardIssueDesignSelectFragment.onWarmupCompleted(this.f$0, cardDesignSelectView, view2);
                }
            });
            this.onWarmupCompleted.add(cardDesignSelectView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayoutOnExtraCallbackWithResult, (View) cardDesignSelectView);
        }
        IAuthTabCallback((CardDesignSelectView) CollectionsKt.first(this.onWarmupCompleted));
        TdsBottomCtaV1View.setCta$default(onWarmupCompleted(), getcertvalue.onWarmupCompleted().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDesignSelectFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueDesignSelectFragment.onWarmupCompleted(this.f$0, getcertvalue, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        final DynamicLoader dynamicLoaderOnNavigationEvent = getcertvalue.onWarmupCompleted().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            TdsBottomCtaV1View.setSecondary$default(onWarmupCompleted(), dynamicLoaderOnNavigationEvent.onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDesignSelectFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return CardIssueDesignSelectFragment.onWarmupCompleted(this.f$0, dynamicLoaderOnNavigationEvent, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        String strOnWarmupCompleted = getcertvalue.onWarmupCompleted().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            onWarmupCompleted().setTopDescription(strOnWarmupCompleted);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(CardIssueDesignSelectFragment cardIssueDesignSelectFragment, CardDesignSelectView cardDesignSelectView, View view) {
        cardIssueDesignSelectFragment.IAuthTabCallback(cardDesignSelectView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueDesignSelectFragment cardIssueDesignSelectFragment, getCertValue getcertvalue, View view) {
        getProcessNameAPI28 getprocessnameapi28OnWarmupCompleted;
        Intrinsics.checkNotNullParameter(view, "");
        CardDesignSelectView cardDesignSelectView = cardIssueDesignSelectFragment.onExtraCallbackWithResult;
        if (cardDesignSelectView != null && (getprocessnameapi28OnWarmupCompleted = cardDesignSelectView.onWarmupCompleted()) != null) {
            getDigestAlgorithms<getCertValue> getdigestalgorithmsWriteTypedObject = cardIssueDesignSelectFragment.writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(cardIssueDesignSelectFragment);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueDesignSelectFragment.extraCallback();
            AdInternalSettings adInternalSettings = new AdInternalSettings(getprocessnameapi28OnWarmupCompleted.onNavigationEvent());
            createAdSizeApi createadsizeapiOnWarmupCompleted = getcertvalue.onWarmupCompleted().onExtraCallback().onWarmupCompleted();
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, adInternalSettings, createadsizeapiOnWarmupCompleted != null ? createadsizeapiOnWarmupCompleted.IAuthTabCallback() : null, getcertvalue.onWarmupCompleted().onExtraCallback().onNavigationEvent(), (Map) null, 32, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(CardIssueDesignSelectFragment cardIssueDesignSelectFragment, DynamicLoader dynamicLoader, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms.onExtraCallbackWithResult(cardIssueDesignSelectFragment.writeTypedObject(), RippleNode.onNavigationEvent(cardIssueDesignSelectFragment), dynamicLoader.onWarmupCompleted(), cardIssueDesignSelectFragment.extraCallback(), dynamicLoader.onNavigationEvent(), (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(CardDesignSelectView cardDesignSelectView) {
        getProcessNameAPI28 getprocessnameapi28OnWarmupCompleted = cardDesignSelectView.onWarmupCompleted();
        if (getprocessnameapi28OnWarmupCompleted != null) {
            CardDesignSelectView cardDesignSelectView2 = this.onExtraCallbackWithResult;
            if (cardDesignSelectView2 != null) {
                cardDesignSelectView2.setSelected(false);
            }
            cardDesignSelectView.setSelected(true);
            this.onExtraCallbackWithResult = cardDesignSelectView;
            IAuthTabCallback().onExtraCallbackWithResult.setText(getprocessnameapi28OnWarmupCompleted.IAuthTabCallback());
            int i = onExtraCallbackWithResult.onExtraCallbackWithResult[getprocessnameapi28OnWarmupCompleted.onWarmupCompleted().onExtraCallbackWithResult().ordinal()];
            if (i == 1) {
                TdsImageView tdsImageView = IAuthTabCallback().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                ViewGroup.LayoutParams layoutParams = tdsImageView.getLayoutParams();
                if (layoutParams != null) {
                    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    layoutParams.width = varyMatches.onNavigationEvent(148, displayMetrics);
                    DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    layoutParams.height = varyMatches.onNavigationEvent(234, displayMetrics2);
                    TdsImageView tdsImageView2 = IAuthTabCallback().onNavigationEvent;
                    Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                    Context context = IAuthTabCallback().onNavigationEvent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(getprocessnameapi28OnWarmupCompleted.onWarmupCompleted().onNavigationEvent());
                    DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                    int iOnNavigationEvent = varyMatches.onNavigationEvent(148, displayMetrics3);
                    DisplayMetrics displayMetrics4 = getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                    TdsImageView.setImage$default(tdsImageView2, onnavigationeventOnExtraCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(234, displayMetrics4)), (Function1) null, (Function1) null, 6, (Object) null);
                    tdsImageView.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            if (i != 2) {
                return;
            }
            TdsImageView tdsImageView3 = IAuthTabCallback().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsImageView3, "");
            ViewGroup.LayoutParams layoutParams2 = tdsImageView3.getLayoutParams();
            if (layoutParams2 != null) {
                DisplayMetrics displayMetrics5 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                layoutParams2.width = varyMatches.onNavigationEvent(234, displayMetrics5);
                DisplayMetrics displayMetrics6 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                layoutParams2.height = varyMatches.onNavigationEvent(148, displayMetrics6);
                TdsImageView tdsImageView4 = IAuthTabCallback().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(tdsImageView4, "");
                Context context2 = IAuthTabCallback().onNavigationEvent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(getprocessnameapi28OnWarmupCompleted.onWarmupCompleted().onNavigationEvent());
                DisplayMetrics displayMetrics7 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(234, displayMetrics7);
                DisplayMetrics displayMetrics8 = getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                TdsImageView.setImage$default(tdsImageView4, onnavigationeventOnExtraCallback2.onExtraCallback(iOnNavigationEvent2, varyMatches.onNavigationEvent(148, displayMetrics8)), (Function1) null, (Function1) null, 6, (Object) null);
                tdsImageView3.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
