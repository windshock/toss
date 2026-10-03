package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography10;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2BigView;
import im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView;
import im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2MediumView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.SessionTrackerb;
import o.getSignaturePolicyId;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSignaturePolicyId extends isSignaturePolicyImplied implements RequireInput {
    private boolean IAuthTabCallback;
    private final CardIssueOverviewViewModel IAuthTabCallbackDefault;
    private final createAudienceNetworkAdsApi IAuthTabCallbackStub;
    private final TypographyKtExternalSyntheticLambda0 asBinder;
    private final Lazy asInterface;
    private Function0<Unit> onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private TdsAgreementRowV2GroupView onNavigationEvent;
    private final getDigestAlgorithms<?> onTransact;
    private View onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public getSignaturePolicyId(@NotNull Context context, @NotNull createAudienceNetworkAdsApi createaudiencenetworkadsapi, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createaudiencenetworkadsapi, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallbackStub = createaudiencenetworkadsapi;
        this.asBinder = typographyKtExternalSyntheticLambda0;
        this.onTransact = getdigestalgorithms;
        this.IAuthTabCallbackDefault = cardIssueOverviewViewModel;
        this.IAuthTabCallback = createaudiencenetworkadsapi.onTransact();
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda9
            public final Object invoke() {
                return getSignaturePolicyId.IAuthTabCallbackDefault();
            }
        });
    }

    public final boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final View IAuthTabCallbackStub() {
        return this.onWarmupCompleted;
    }

    private final SessionTrackerb asBinder() {
        return (SessionTrackerb) this.asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionTrackerb IAuthTabCallbackDefault() {
        Response response = Response.onNavigationEvent;
        return ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(getSignaturePolicyId getsignaturepolicyid, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
        getsignaturepolicyid.IAuthTabCallback = z;
        Function0<Unit> function0 = getsignaturepolicyid.onExtraCallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(getSignaturePolicyId getsignaturepolicyid, TdsAgreementRowV2BigView tdsAgreementRowV2BigView, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb.onExtraCallbackWithResult(getsignaturepolicyid.asBinder(), tdsAgreementRowV2BigView.getContext(), (String) createAudienceNetworkAdsApi.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1363808036, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1363808036, new Object[]{getsignaturepolicyid.IAuthTabCallbackStub}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[LOOP:0: B:16:0x004e->B:18:0x0054, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit onNavigationEvent(java.util.List r2, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2BigView r3, android.view.View r4) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            r0 = 0
            if (r4 == 0) goto L15
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L45
        L15:
            java.util.Iterator r4 = r2.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r4.next()
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L19
            r4 = 0
            r3.onExtraCallback(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            r4 = 8
            r3.setVisibility(r4)
            goto L33
        L45:
            r4 = 1119092736(0x42b40000, float:90.0)
            r3.onExtraCallback(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r0)
            goto L4e
        L5e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSignaturePolicyId.onNavigationEvent(java.util.List, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2BigView, android.view.View):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getSignaturePolicyId getsignaturepolicyid, View view) {
        createAdSizeApi createadsizeapiOnNavigationEvent = getsignaturepolicyid.IAuthTabCallbackStub.onNavigationEvent();
        if (createadsizeapiOnNavigationEvent != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(getsignaturepolicyid.onTransact, getsignaturepolicyid.asBinder, createadsizeapiOnNavigationEvent, getsignaturepolicyid.IAuthTabCallbackDefault, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(getSignaturePolicyId getsignaturepolicyid, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
        getsignaturepolicyid.IAuthTabCallback = z;
        Function0<Unit> function0 = getsignaturepolicyid.onExtraCallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(getSignaturePolicyId getsignaturepolicyid, TdsAgreementRowV2MediumView tdsAgreementRowV2MediumView, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        SessionTrackerb.onExtraCallbackWithResult(getsignaturepolicyid.asBinder(), tdsAgreementRowV2MediumView.getContext(), (String) createAudienceNetworkAdsApi.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1363808036, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1363808036, new Object[]{getsignaturepolicyid.IAuthTabCallbackStub}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[LOOP:0: B:16:0x004e->B:18:0x0054, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit IAuthTabCallback(java.util.List r2, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2MediumView r3, android.view.View r4) {
        /*
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            r0 = 0
            if (r4 == 0) goto L15
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L45
        L15:
            java.util.Iterator r4 = r2.iterator()
        L19:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r4.next()
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L19
            r4 = 0
            r3.onExtraCallback(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            r4 = 8
            r3.setVisibility(r4)
            goto L33
        L45:
            r4 = 1119092736(0x42b40000, float:90.0)
            r3.onExtraCallback(r4, r0)
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r0)
            goto L4e
        L5e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSignaturePolicyId.IAuthTabCallback(java.util.List, im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2MediumView, android.view.View):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(getSignaturePolicyId getsignaturepolicyid, View view) {
        createAdSizeApi createadsizeapiOnNavigationEvent = getsignaturepolicyid.IAuthTabCallbackStub.onNavigationEvent();
        if (createadsizeapiOnNavigationEvent != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(getsignaturepolicyid.onTransact, getsignaturepolicyid.asBinder, createadsizeapiOnNavigationEvent, getsignaturepolicyid.IAuthTabCallbackDefault, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        Float fValueOf = Float.valueOf(24.0f);
        final ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        int i = 1;
        linearLayout.setOrientation(1);
        String upperCase = ((String) createAudienceNetworkAdsApi.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1419239673, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1419239674, new Object[]{this.IAuthTabCallbackStub}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (Intrinsics.areEqual(upperCase, "LARGE")) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final TdsAgreementRowV2BigView tdsAgreementRowV2BigView = new TdsAgreementRowV2BigView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            tdsAgreementRowV2BigView.IAuthTabCallback(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallbackStub.asInterface(), false, 1, (Object) null));
            tdsAgreementRowV2BigView.setFocusable(false);
            tdsAgreementRowV2BigView.setFocusableInTouchMode(false);
            tdsAgreementRowV2BigView.setImportantForAccessibility(2);
            TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2BigView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
            if (tdsCheckBoxV2View != null) {
                tdsCheckBoxV2View.setCheckedState(this.IAuthTabCallback);
                ConstraintLayout.onExtraCallbackWithResult layoutParams = tdsCheckBoxV2View.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = layoutParams;
                    onextracallbackwithresult.ITrustedWebActivityCallbackStub = 0.0f;
                    tdsCheckBoxV2View.setLayoutParams(onextracallbackwithresult);
                    tdsCheckBoxV2View.setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj, Object obj2) {
                            return getSignaturePolicyId.onWarmupCompleted(this.f$0, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                    tdsCheckBoxV2View.setClickable(false);
                    tdsCheckBoxV2View.setFocusable(false);
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            if (this.IAuthTabCallbackStub.asBinder()) {
                BaseTextView baseTextView = (BaseTextView) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), 671659157, -671659153, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2BigView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
                if (baseTextView != null) {
                    baseTextView.onNavigationEvent(response.Bold);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            String str = (String) createAudienceNetworkAdsApi.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1363808036, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1363808036, new Object[]{this.IAuthTabCallbackStub}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (str != null && str.length() != 0) {
                tdsAgreementRowV2BigView.onExtraCallback(true);
                TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2BigView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        return getSignaturePolicyId.onExtraCallback(this.f$0, tdsAgreementRowV2BigView, (View) obj);
                    }
                }}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
            } else {
                List<NativeAdBaseApi> listOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
                if (listOnExtraCallback != null && !listOnExtraCallback.isEmpty()) {
                    if (this.IAuthTabCallbackStub.getInterfaceDescriptor()) {
                        tdsAgreementRowV2BigView.onExtraCallback(90.0f, true);
                    }
                    TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2BigView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda2
                        public final Object invoke(Object obj) {
                            return getSignaturePolicyId.onNavigationEvent(arrayList, tdsAgreementRowV2BigView, (View) obj);
                        }
                    }}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
                } else {
                    tdsAgreementRowV2BigView.onExtraCallback(false);
                }
            }
            if (this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
                transparentBackground.onExtraCallback(tdsAgreementRowV2BigView);
                tdsAgreementRowV2BigView.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getSignaturePolicyId.onExtraCallback(this.f$0, view);
                    }
                });
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsAgreementRowV2BigView);
            this.onNavigationEvent = tdsAgreementRowV2BigView;
        } else {
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            final TdsAgreementRowV2MediumView tdsAgreementRowV2MediumView = new TdsAgreementRowV2MediumView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            tdsAgreementRowV2MediumView.IAuthTabCallback(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallbackStub.asInterface(), false, 1, (Object) null));
            tdsAgreementRowV2MediumView.setFocusable(false);
            tdsAgreementRowV2MediumView.setFocusableInTouchMode(false);
            tdsAgreementRowV2MediumView.setImportantForAccessibility(2);
            TdsCheckBoxV2View tdsCheckBoxV2View2 = (TdsCheckBoxV2View) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2MediumView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
            if (tdsCheckBoxV2View2 != null) {
                tdsCheckBoxV2View2.setCheckedState(this.IAuthTabCallback);
                ConstraintLayout.onExtraCallbackWithResult layoutParams2 = tdsCheckBoxV2View2.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = layoutParams2;
                    onextracallbackwithresult2.ITrustedWebActivityCallbackStub = 0.0f;
                    tdsCheckBoxV2View2.setLayoutParams(onextracallbackwithresult2);
                    tdsCheckBoxV2View2.setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj, Object obj2) {
                            return getSignaturePolicyId.IAuthTabCallback(this.f$0, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                    tdsCheckBoxV2View2.setClickable(false);
                    tdsCheckBoxV2View2.setFocusable(false);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            if (this.IAuthTabCallbackStub.asBinder()) {
                BaseTextView baseTextView2 = (BaseTextView) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), 671659157, -671659153, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2MediumView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
                if (baseTextView2 != null) {
                    baseTextView2.onNavigationEvent(response.Bold);
                    Unit unit4 = Unit.INSTANCE;
                }
            }
            String str2 = (String) createAudienceNetworkAdsApi.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1363808036, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1363808036, new Object[]{this.IAuthTabCallbackStub}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            if (str2 != null && str2.length() != 0) {
                tdsAgreementRowV2MediumView.onExtraCallback(true);
                TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2MediumView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda5
                    public final Object invoke(Object obj) {
                        return getSignaturePolicyId.onExtraCallbackWithResult(this.f$0, tdsAgreementRowV2MediumView, (View) obj);
                    }
                }}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
            } else {
                List<NativeAdBaseApi> listOnExtraCallback2 = this.IAuthTabCallbackStub.onExtraCallback();
                if (listOnExtraCallback2 != null && !listOnExtraCallback2.isEmpty()) {
                    if (this.IAuthTabCallbackStub.getInterfaceDescriptor()) {
                        tdsAgreementRowV2MediumView.onExtraCallback(90.0f, true);
                    }
                    TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1182601398, 1182601404, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2MediumView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda6
                        public final Object invoke(Object obj) {
                            return getSignaturePolicyId.IAuthTabCallback(arrayList, tdsAgreementRowV2MediumView, (View) obj);
                        }
                    }}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
                } else {
                    tdsAgreementRowV2MediumView.onExtraCallback(false);
                }
            }
            if (this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
                transparentBackground.onExtraCallback(tdsAgreementRowV2MediumView);
                tdsAgreementRowV2MediumView.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getSignaturePolicyId.IAuthTabCallback(this.f$0, view);
                    }
                });
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsAgreementRowV2MediumView);
            this.onNavigationEvent = tdsAgreementRowV2MediumView;
        }
        List<NativeAdBaseApi> listOnExtraCallback3 = this.IAuthTabCallbackStub.onExtraCallback();
        if (listOnExtraCallback3 != null) {
            for (final NativeAdBaseApi nativeAdBaseApi : listOnExtraCallback3) {
                Context context3 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                final ConstraintLayout constraintLayout = new ConstraintLayout(context3);
                arrayList.add(constraintLayout);
                if (!this.IAuthTabCallbackStub.getInterfaceDescriptor()) {
                    constraintLayout.setVisibility(8);
                }
                constraintLayout.setPadding(setTagsokhttp.onExtraCallbackWithResult(constraintLayout, fValueOf), constraintLayout.getPaddingTop(), setTagsokhttp.onExtraCallbackWithResult(constraintLayout, fValueOf), constraintLayout.getPaddingBottom());
                int iOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(constraintLayout, 24);
                Integer numIAuthTabCallback = nativeAdBaseApi.IAuthTabCallback();
                setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{constraintLayout, Integer.valueOf(iOnExtraCallbackWithResult * (numIAuthTabCallback != null ? numIAuthTabCallback.intValue() : i))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.AgreementView$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        getSignaturePolicyId.onWarmupCompleted(nativeAdBaseApi, this, constraintLayout, view);
                    }
                });
                BaseTextView baseTextView3 = (BaseTextView) SubTypography10.class.getDeclaredConstructor(Context.class).newInstance(constraintLayout.getContext());
                Intrinsics.checkNotNull(baseTextView3);
                baseTextView3.setId(View.generateViewId());
                Class cls = Integer.TYPE;
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(onextracallbackwithresult3);
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = -2;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = -2;
                onextracallbackwithresult4.IPostMessageServiceStubProxy = 0;
                onextracallbackwithresult4.setEngagementSignalsCallback = 0;
                baseTextView3.setLayoutParams(onextracallbackwithresult3);
                baseTextView3.onNavigationEvent(response.Bold);
                Context context4 = baseTextView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Configuration configuration = context4.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                getUrlokhttp geturlokhttp = new getUrlokhttp(new onNavigationEvent(configuration));
                baseTextView3.setTextColor(geturlokhttp.ITrustedWebActivityCallbackDefault() == getSpecialFeatureOptInStatus.Dark ? geturlokhttp.getInterfaceDescriptor().onMinimized() : geturlokhttp.requestPostMessageChannel().onActivityLayout());
                baseTextView3.setText(" • ");
                Intrinsics.checkNotNull(baseTextView3);
                setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, baseTextView3);
                Context context5 = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                TdsImageView tdsImageView = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                tdsImageView.setId(View.generateViewId());
                String strOnExtraCallbackWithResult = nativeAdBaseApi.onExtraCallbackWithResult();
                tdsImageView.setVisibility((strOnExtraCallbackWithResult == null || ((StringsKt.isBlank(strOnExtraCallbackWithResult) ? 1 : 0) ^ i) != i) ? 8 : 0);
                DisplayMetrics displayMetrics = tdsImageView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics);
                DisplayMetrics displayMetrics2 = tdsImageView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult5 = new ConstraintLayout.onExtraCallbackWithResult(iOnNavigationEvent, varyMatches.onNavigationEvent(20, displayMetrics2));
                onextracallbackwithresult5.ICustomTabsCallback = 0;
                onextracallbackwithresult5.IPostMessageServiceStubProxy = 0;
                onextracallbackwithresult5.IAuthTabCallback = 0;
                tdsImageView.setLayoutParams(onextracallbackwithresult5);
                tdsImageView.setImageResource(R.drawable.icon_arrow_right_mono);
                setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, tdsImageView);
                BaseTextView baseTextView4 = (BaseTextView) Typography7.class.getDeclaredConstructor(Context.class).newInstance(constraintLayout.getContext());
                Intrinsics.checkNotNull(baseTextView4);
                baseTextView4.setId(View.generateViewId());
                DisplayMetrics displayMetrics3 = baseTextView4.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(20, displayMetrics3);
                DisplayMetrics displayMetrics4 = baseTextView4.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult6 = new ConstraintLayout.onExtraCallbackWithResult(iOnNavigationEvent2, varyMatches.onNavigationEvent(20, displayMetrics4));
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).width = 0;
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).height = -2;
                onextracallbackwithresult6.IPostMessageServiceStubProxy = baseTextView3.getId();
                onextracallbackwithresult6.receiveFile = baseTextView3.getId();
                onextracallbackwithresult6.IPostMessageService = tdsImageView.getId();
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult6).leftMargin = setTagsokhttp.onExtraCallbackWithResult(baseTextView4, Float.valueOf(8.0f));
                baseTextView4.setLayoutParams(onextracallbackwithresult6);
                Context context6 = baseTextView4.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                Configuration configuration2 = context6.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                baseTextView4.setTextColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).ICustomTabsCallbackStubProxy());
                baseTextView4.setPadding(0, 0, 0, setTagsokhttp.onExtraCallbackWithResult(baseTextView4, 8));
                baseTextView4.setText(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(nativeAdBaseApi.onExtraCallback(), false, 1, (Object) null));
                Intrinsics.checkNotNull(baseTextView4);
                setProxySelectorokhttp.onExtraCallbackWithResult(constraintLayout, baseTextView4);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, constraintLayout);
                i = 1;
            }
            Unit unit5 = Unit.INSTANCE;
        }
        createNativeBannerAdViewApi createnativebanneradviewapiOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
        if (createnativebanneradviewapiOnWarmupCompleted != null) {
            Context context7 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapiOnWarmupCompleted, context7, this.asBinder, this.IAuthTabCallbackDefault, this.onTransact);
            if (linearLayoutOnWarmupCompleted != null) {
                linearLayout.addView(linearLayoutOnWarmupCompleted);
                Unit unit6 = Unit.INSTANCE;
            }
        }
        this.onWarmupCompleted = linearLayout;
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(NativeAdBaseApi nativeAdBaseApi, getSignaturePolicyId getsignaturepolicyid, ConstraintLayout constraintLayout, View view) {
        String strOnExtraCallbackWithResult = nativeAdBaseApi.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null || StringsKt.isBlank(strOnExtraCallbackWithResult)) {
            TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = getsignaturepolicyid.onNavigationEvent;
            if (tdsAgreementRowV2GroupView != null) {
                TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback());
                if (tdsCheckBoxV2View != null) {
                    tdsCheckBoxV2View.setCheckedState(!getsignaturepolicyid.IAuthTabCallback);
                }
            }
            getsignaturepolicyid.IAuthTabCallback = !getsignaturepolicyid.IAuthTabCallback;
            Function0<Unit> function0 = getsignaturepolicyid.onExtraCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        SessionTrackerb.onExtraCallbackWithResult(getsignaturepolicyid.asBinder(), constraintLayout.getContext(), nativeAdBaseApi.onExtraCallbackWithResult(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    public final void IAuthTabCallback(boolean z) {
        TdsAgreementRowV2GroupView tdsAgreementRowV2GroupView = this.onNavigationEvent;
        if (tdsAgreementRowV2GroupView != null) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
            TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) TdsAgreementRowV2GroupView.onWarmupCompleted(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1288425965, 1288425968, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{tdsAgreementRowV2GroupView}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback);
            if (tdsCheckBoxV2View != null) {
                tdsCheckBoxV2View.setCheckedState(z);
            }
        }
        this.IAuthTabCallback = z;
        Function0<Unit> function0 = this.onExtraCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        return getWrite.IAuthTabCallback(this.IAuthTabCallbackStub.IAuthTabCallback(), Boolean.valueOf(this.IAuthTabCallback));
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0;
    }
}
