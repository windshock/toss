package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import java.util.ArrayList;
import java.util.Iterator;
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
import o.BrickModulesListExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.DynamicLoader;
import o.NTTObjectIdentifiers;
import o.PageContext;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SigPolicyQualifiers;
import o.TSA_RequestTimeStamp_Sign;
import o.TypographyKtExternalSyntheticLambda0;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.createDefaultMediaViewVideoRendererApi;
import o.doCallInitialize;
import o.getAuthSafe;
import o.getCommitmentTypeId;
import o.getDigestAlgorithms;
import o.getKeySize;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTestDevicesList;
import o.getUrlokhttp;
import o.preFillDefault;
import o.setBodyokhttp;
import o.setCallToAction;
import o.x509TrustManager;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueProductDescriptionFragment extends Hilt_CardIssueProductDescriptionFragment<getAuthSafe> {
    private getCommitmentTypeId IAuthTabCallback;
    private final PageContext onWarmupCompleted;

    @Inject
    public zzag tossClock;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new PropertyReference1Impl<>(CardIssueProductDescriptionFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCardIssueProductDescriptionBinding;", 0)};
    public static final int onExtraCallback = 8;

    public CardIssueProductDescriptionFragment() {
        super(R.layout.fragment_card_issue_product_description);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onNavigationEvent);
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, TSA_RequestTimeStamp_Sign> {
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, TSA_RequestTimeStamp_Sign.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCardIssueProductDescriptionBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final TSA_RequestTimeStamp_Sign invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return TSA_RequestTimeStamp_Sign.onWarmupCompleted(view);
        }
    }

    private final TSA_RequestTimeStamp_Sign onExtraCallbackWithResult() {
        return (TSA_RequestTimeStamp_Sign) this.onWarmupCompleted.onExtraCallbackWithResult(this, onExtraCallbackWithResult[0]);
    }

    public final zzag IAuthTabCallback() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String strOnNavigationEvent;
        createDefaultMediaViewVideoRendererApi.onWarmupCompleted onwarmupcompletedOnExtraCallback;
        createDefaultMediaViewVideoRendererApi.onWarmupCompleted onwarmupcompletedOnExtraCallback2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TdsTopV2View tdsTopV2View = onExtraCallbackWithResult().onExtraCallback;
        tdsTopV2View.setUpperGap(16);
        tdsTopV2View.setLowerGap(16);
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setTitleText(((getAuthSafe) readTypedObject()).access000());
        if (((getAuthSafe) readTypedObject()).extraCallbackWithResult() != null) {
            tdsTopV2View.setRightType(TdsTopV2View.IAuthTabCallback.BUTTON);
            x509TrustManager x509trustmanager = (x509TrustManager) TdsTopV2View.onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{tdsTopV2View}, RNSScreenManagerDelegate.onNavigationEvent(), -1402869773);
            if (x509trustmanager != null) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = x509trustmanager.onWarmupCompleted();
                createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiExtraCallbackWithResult = ((getAuthSafe) readTypedObject()).extraCallbackWithResult();
                getsupportedhighspeedresolutionsforOnWarmupCompleted.IAuthTabCallback((createdefaultmediaviewvideorendererapiExtraCallbackWithResult == null || (onwarmupcompletedOnExtraCallback2 = createdefaultmediaviewvideorendererapiExtraCallbackWithResult.onExtraCallback()) == null) ? null : getKeySize.onExtraCallbackWithResult(onwarmupcompletedOnExtraCallback2));
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforAsInterface = x509trustmanager.asInterface();
                createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiExtraCallbackWithResult2 = ((getAuthSafe) readTypedObject()).extraCallbackWithResult();
                getsupportedhighspeedresolutionsforAsInterface.IAuthTabCallback((createdefaultmediaviewvideorendererapiExtraCallbackWithResult2 == null || (onwarmupcompletedOnExtraCallback = createdefaultmediaviewvideorendererapiExtraCallbackWithResult2.onExtraCallback()) == null) ? null : getKeySize.IAuthTabCallback(onwarmupcompletedOnExtraCallback));
                x509trustmanager.asBinder().IAuthTabCallback(setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback());
                createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiExtraCallbackWithResult3 = ((getAuthSafe) readTypedObject()).extraCallbackWithResult();
                x509trustmanager.onNavigationEvent(createdefaultmediaviewvideorendererapiExtraCallbackWithResult3 != null ? createdefaultmediaviewvideorendererapiExtraCallbackWithResult3.onNavigationEvent() : null);
            }
            x509TrustManager x509trustmanager2 = (x509TrustManager) TdsTopV2View.onNavigationEvent(1402869775, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{tdsTopV2View}, RNSScreenManagerDelegate.onNavigationEvent(), -1402869773);
            if (x509trustmanager2 != null) {
                x509trustmanager2.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda2
                    public final Object invoke() {
                        return CardIssueProductDescriptionFragment.onWarmupCompleted(this.f$0);
                    }
                });
            }
        }
        if (((getAuthSafe) readTypedObject()).IAuthTabCallbackStub().length() > 0) {
            TdsListRowV1View tdsListRowV1View = onExtraCallbackWithResult().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
            tdsListRowV1View.setVisibility(0);
            onExtraCallbackWithResult().onNavigationEvent.setPaddingTop(0);
            TdsListRowV1View tdsListRowV1View2 = onExtraCallbackWithResult().onNavigationEvent;
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1C);
            getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
            tdsListRowV1View2.setCenterText1Color(geturlokhttpOnExtraCallback.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttpOnExtraCallback.getInterfaceDescriptor().ICustomTabsCallbackStubProxy() : geturlokhttpOnExtraCallback.requestPostMessageChannel().onMinimized());
            tdsListRowV1View2.setCenterText1(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(((getAuthSafe) readTypedObject()).IAuthTabCallbackStub(), false, 1, (Object) null));
        }
        List<doCallInitialize> listOnWarmupCompleted = ((getAuthSafe) readTypedObject()).onWarmupCompleted();
        ArrayList<SigPolicyQualifiers> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            arrayList.add(NTTObjectIdentifiers.onExtraCallback((doCallInitialize) it.next()));
        }
        for (SigPolicyQualifiers sigPolicyQualifiers : arrayList) {
            LinearLayout linearLayout = onExtraCallbackWithResult().IAuthTabCallback;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            linearLayout.addView(sigPolicyQualifiers.onNavigationEvent(contextRequireContext));
        }
        final TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallbackWithResult().onWarmupCompleted;
        String strOnWarmupCompleted = ((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            tdsBottomCtaV1View.setTopDescription(strOnWarmupCompleted);
        }
        TdsScrollView tdsScrollView = onExtraCallbackWithResult().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsScrollView, "");
        getCommitmentTypeId getcommitmenttypeid = new getCommitmentTypeId(tdsScrollView, ((getAuthSafe) readTypedObject()).asInterface(), ((getAuthSafe) readTypedObject()).onTransact(), ((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return CardIssueProductDescriptionFragment.IAuthTabCallback(tdsBottomCtaV1View, this, (String) obj);
            }
        });
        getcommitmenttypeid.onWarmupCompleted();
        this.IAuthTabCallback = getcommitmenttypeid;
        if (((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().onNavigationEvent() != null) {
            Intrinsics.checkNotNull(tdsBottomCtaV1View);
            DynamicLoader dynamicLoaderOnNavigationEvent = ((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().onNavigationEvent();
            TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, (dynamicLoaderOnNavigationEvent == null || (strOnNavigationEvent = dynamicLoaderOnNavigationEvent.onNavigationEvent()) == null) ? "" : strOnNavigationEvent, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return CardIssueProductDescriptionFragment.IAuthTabCallback(this.f$0, (View) obj);
                }
            }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        }
        if (((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().IAuthTabCallback() != null) {
            DynamicLoader dynamicLoaderIAuthTabCallback = ((getAuthSafe) readTypedObject()).onExtraCallbackWithResult().IAuthTabCallback();
            tdsBottomCtaV1View.setBottomButton(dynamicLoaderIAuthTabCallback != null ? dynamicLoaderIAuthTabCallback.onNavigationEvent() : null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return CardIssueProductDescriptionFragment.IAuthTabCallbackStub(this.f$0, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment) {
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapiExtraCallbackWithResult = ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).extraCallbackWithResult();
        cardIssueProductDescriptionFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(createdefaultmediaviewvideorendererapiExtraCallbackWithResult != null ? createdefaultmediaviewvideorendererapiExtraCallbackWithResult.IAuthTabCallback() : null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, final CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, str, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return CardIssueProductDescriptionFragment.onExtraCallbackWithResult(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(final CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getCommitmentTypeId getcommitmenttypeid = cardIssueProductDescriptionFragment.IAuthTabCallback;
        if (getcommitmenttypeid != null) {
            getcommitmenttypeid.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return CardIssueProductDescriptionFragment.IAuthTabCallback(this.f$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment) {
        cardIssueProductDescriptionFragment.onExtraCallbackWithResult(((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().onExtraCallback().onWarmupCompleted(), ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().onExtraCallback().onNavigationEvent());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        DynamicLoader dynamicLoaderOnNavigationEvent = ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().onNavigationEvent();
        createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoaderOnNavigationEvent != null ? dynamicLoaderOnNavigationEvent.onWarmupCompleted() : null;
        DynamicLoader dynamicLoaderOnNavigationEvent2 = ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().onNavigationEvent();
        cardIssueProductDescriptionFragment.onExtraCallbackWithResult(createadsizeapiOnWarmupCompleted, dynamicLoaderOnNavigationEvent2 != null ? dynamicLoaderOnNavigationEvent2.onNavigationEvent() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallbackStub(CardIssueProductDescriptionFragment cardIssueProductDescriptionFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        DynamicLoader dynamicLoaderIAuthTabCallback = ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().IAuthTabCallback();
        createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoaderIAuthTabCallback != null ? dynamicLoaderIAuthTabCallback.onWarmupCompleted() : null;
        DynamicLoader dynamicLoaderIAuthTabCallback2 = ((getAuthSafe) cardIssueProductDescriptionFragment.readTypedObject()).onExtraCallbackWithResult().IAuthTabCallback();
        cardIssueProductDescriptionFragment.onExtraCallbackWithResult(createadsizeapiOnWarmupCompleted, dynamicLoaderIAuthTabCallback2 != null ? dynamicLoaderIAuthTabCallback2.onNavigationEvent() : null);
        return Unit.INSTANCE;
    }

    public void onDestroyView() {
        getCommitmentTypeId getcommitmenttypeid = this.IAuthTabCallback;
        if (getcommitmenttypeid != null) {
            getcommitmenttypeid.onExtraCallbackWithResult();
        }
        this.IAuthTabCallback = null;
        super.onDestroyView();
    }

    private final void onExtraCallbackWithResult(createAdSizeApi createadsizeapi, String str) {
        if (createadsizeapi instanceof createAdSizeApi.onWarmupCompleted) {
            getDigestAlgorithms<L> getdigestalgorithmsWriteTypedObject = writeTypedObject();
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(this);
            CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = extraCallback();
            String str2 = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(IAuthTabCallback().asBinder());
            Intrinsics.checkNotNullExpressionValue(str2, "");
            getDigestAlgorithms.onExtraCallback(getdigestalgorithmsWriteTypedObject, typographyKtExternalSyntheticLambda0OnNavigationEvent, cardIssueOverviewViewModelExtraCallback, new getTestDevicesList(str2), ((createAdSizeApi.onWarmupCompleted) createadsizeapi).IAuthTabCallback(), str, (Map) null, 32, (Object) null);
            return;
        }
        getDigestAlgorithms.onExtraCallbackWithResult(writeTypedObject(), RippleNode.onNavigationEvent(this), createadsizeapi, extraCallback(), str, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
    }
}
