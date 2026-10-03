package viva.republica.toss.cardrecommend.issuev2.ui.shinhan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.CommonModule_closeView;
import o.DynamicLoader;
import o.MicrosoftObjectIdentifiers;
import o.PageContext;
import o.Pfx;
import o.PublicKeyAndChallenge;
import o.PullRefreshStateKtExternalSyntheticLambda0;
import o.TSA_RequestTimeStamp;
import o.TypographyKtExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getSpecialFeatureOptInStatus;
import o.getTestDevicesList;
import o.getUrlokhttp;
import o.makeFallbackLoader;
import o.mergeParams;
import o.preFillDefault;
import o.reportDexLoadingIssue;
import o.setBodyokhttp;
import o.setCallToAction;
import o.x509TrustManager;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueShinhanProductDescriptionFragment extends Hilt_CardIssueShinhanProductDescriptionFragment<Pfx> {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueShinhanProductDescriptionFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueShinhanProductDescriptionBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final PageContext onExtraCallback;

    @Inject
    public zzag tossClock;

    public CardIssueShinhanProductDescriptionFragment() {
        super(R.layout.fragment_card_issue_shinhan_product_description);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onExtraCallbackWithResult);
    }

    public final zzag onExtraCallbackWithResult() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, TSA_RequestTimeStamp> {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, TSA_RequestTimeStamp.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueShinhanProductDescriptionBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_RequestTimeStamp invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return TSA_RequestTimeStamp.onExtraCallback(view);
        }
    }

    private final TSA_RequestTimeStamp onExtraCallback() {
        return (TSA_RequestTimeStamp) this.onExtraCallback.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        DynamicLoader dynamicLoaderOnExtraCallback;
        String strOnNavigationEvent;
        View viewOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final Pfx pfx = (Pfx) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        TdsTopV2View tdsTopV2View = onExtraCallback().onNavigationEvent;
        tdsTopV2View.setUpperGap(24);
        tdsTopV2View.setLowerGap(0);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        String strOnTransact = pfx.onTransact();
        if (strOnTransact == null) {
            strOnTransact = "";
        }
        tdsTopV2View.setTitleText(strOnTransact);
        if (pfx.asInterface() != null) {
            tdsTopV2View.setRightType(TdsTopV2View.IAuthTabCallback.BUTTON);
            x509TrustManager x509trustmanager = (x509TrustManager) TdsTopV2View.onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{tdsTopV2View}, RNSScreenManagerDelegate.onNavigationEvent(), -1402869773);
            if (x509trustmanager != null) {
                x509trustmanager.onWarmupCompleted().IAuthTabCallback(setCallToAction.onWarmupCompleted.Primary);
                x509trustmanager.asInterface().IAuthTabCallback(setCallToAction.onExtraCallback.Weak);
                x509trustmanager.asBinder().IAuthTabCallback(setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback());
                x509trustmanager.onNavigationEvent(pfx.asInterface().onExtraCallbackWithResult());
            }
            x509TrustManager x509trustmanager2 = (x509TrustManager) TdsTopV2View.onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{tdsTopV2View}, RNSScreenManagerDelegate.onNavigationEvent(), -1402869773);
            if (x509trustmanager2 != null) {
                x509trustmanager2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.shinhan.CardIssueShinhanProductDescriptionFragment$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return CardIssueShinhanProductDescriptionFragment.onExtraCallback(this.f$0, pfx);
                    }
                });
            }
        }
        TdsListRowV1View tdsListRowV1View = onExtraCallback().onWarmupCompleted;
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
        String strIAuthTabCallbackStub = pfx.IAuthTabCallbackStub();
        tdsListRowV1View.setCenterText2(strIAuthTabCallbackStub != null ? mergeParams.IAuthTabCallback(strIAuthTabCallbackStub, false, 1, (Object) null) : null);
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        tdsListRowV1View.setCenterText2Color(geturlokhttpOnExtraCallback.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttpOnExtraCallback.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttpOnExtraCallback.requestPostMessageChannel().onMinimized());
        List<makeFallbackLoader> listOnWarmupCompleted = pfx.onWarmupCompleted();
        ArrayList<MicrosoftObjectIdentifiers> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        for (makeFallbackLoader makefallbackloader : listOnWarmupCompleted) {
            arrayList.add(makefallbackloader != null ? PublicKeyAndChallenge.onExtraCallback(makefallbackloader) : null);
        }
        for (MicrosoftObjectIdentifiers microsoftObjectIdentifiers : arrayList) {
            LinearLayout linearLayout = onExtraCallback().IAuthTabCallback;
            if (microsoftObjectIdentifiers != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                viewOnWarmupCompleted = microsoftObjectIdentifiers.onWarmupCompleted(contextRequireContext);
            } else {
                viewOnWarmupCompleted = null;
            }
            linearLayout.addView(viewOnWarmupCompleted);
        }
        final TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallback().onExtraCallback;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult = pfx.onExtraCallbackWithResult();
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, (reportdexloadingissueOnExtraCallbackWithResult == null || (dynamicLoaderOnExtraCallback = reportdexloadingissueOnExtraCallbackWithResult.onExtraCallback()) == null || (strOnNavigationEvent = dynamicLoaderOnExtraCallback.onNavigationEvent()) == null) ? "" : strOnNavigationEvent, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.shinhan.CardIssueShinhanProductDescriptionFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueShinhanProductDescriptionFragment.onWarmupCompleted(this.f$0, tdsBottomCtaV1View, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CardIssueShinhanProductDescriptionFragment cardIssueShinhanProductDescriptionFragment, Pfx pfx) {
        cardIssueShinhanProductDescriptionFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(pfx.asInterface().onWarmupCompleted())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(CardIssueShinhanProductDescriptionFragment cardIssueShinhanProductDescriptionFragment, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        DynamicLoader dynamicLoaderOnExtraCallback;
        DynamicLoader dynamicLoaderOnExtraCallback2;
        createAdSizeApi createadsizeapiOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = cardIssueShinhanProductDescriptionFragment.writeTypedObject();
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult = PullRefreshStateKtExternalSyntheticLambda0.onExtraCallbackWithResult(tdsBottomCtaV1View);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = cardIssueShinhanProductDescriptionFragment.extraCallback();
        String str = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(cardIssueShinhanProductDescriptionFragment.onExtraCallbackWithResult().asBinder());
        Intrinsics.checkNotNullExpressionValue(str, "");
        getTestDevicesList gettestdeviceslist = new getTestDevicesList(str);
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult = ((Pfx) cardIssueShinhanProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult();
        String strIAuthTabCallback = (reportdexloadingissueOnExtraCallbackWithResult == null || (dynamicLoaderOnExtraCallback2 = reportdexloadingissueOnExtraCallbackWithResult.onExtraCallback()) == null || (createadsizeapiOnWarmupCompleted = dynamicLoaderOnExtraCallback2.onWarmupCompleted()) == null) ? null : createadsizeapiOnWarmupCompleted.IAuthTabCallback();
        reportDexLoadingIssue reportdexloadingissueOnExtraCallbackWithResult2 = ((Pfx) cardIssueShinhanProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult();
        getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnExtraCallbackWithResult, cardIssueOverviewViewModelExtraCallback, gettestdeviceslist, strIAuthTabCallback, (reportdexloadingissueOnExtraCallbackWithResult2 == null || (dynamicLoaderOnExtraCallback = reportdexloadingissueOnExtraCallbackWithResult2.onExtraCallback()) == null) ? null : dynamicLoaderOnExtraCallback.onNavigationEvent(), (Map) null, 32, (Object) null);
        return Unit.INSTANCE;
    }
}
