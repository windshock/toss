package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import im.toss.TossApplication;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getSigPolicyHash;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSigPolicyHash extends isSignaturePolicyImplied implements RequireInput, SignerLocation, getCertifiedAttributes {
    private final createAudienceNetworkActivity IAuthTabCallback;
    private final TypographyKtExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private LinearLayout asBinder;
    private final CardIssueOverviewViewModel asInterface;
    private Function0<Unit> onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private List<? extends isSignaturePolicyImplied> onNavigationEvent;
    private final getDigestAlgorithms<?> onTransact;
    private TdsCheckBoxV1View onWarmupCompleted;

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        return true;
    }

    public getSigPolicyHash(@NotNull Context context, @NotNull createAudienceNetworkActivity createaudiencenetworkactivity, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createaudiencenetworkactivity, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = createaudiencenetworkactivity;
        this.IAuthTabCallbackDefault = typographyKtExternalSyntheticLambda0;
        this.onTransact = getdigestalgorithms;
        this.asInterface = cardIssueOverviewViewModel;
        this.IAuthTabCallbackStub = createaudiencenetworkactivity.onExtraCallback();
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Object[] objArr = {linearLayout2, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(linearLayout2, varyMatches.onNavigationEvent(24, displayMetrics2));
        linearLayout2.addView(onExtraCallbackWithResult());
        BaseTextView baseTextView = (BaseTextView) Typography6.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = 1.0f;
        baseTextView.setLayoutParams(layoutParams);
        baseTextView.setGravity(16);
        DisplayMetrics displayMetrics3 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        Object[] objArr2 = {baseTextView, Integer.valueOf(varyMatches.onNavigationEvent(12, displayMetrics3))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        baseTextView.setText(this.IAuthTabCallback.onTransact());
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        linearLayout2.setGravity(16);
        if (this.IAuthTabCallback.IAuthTabCallbackDefault() != null) {
            Context context2 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TdsImageView tdsImageView = new TdsImageView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            DisplayMetrics displayMetrics4 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            layoutParams4.width = varyMatches.onNavigationEvent(24, displayMetrics4);
            DisplayMetrics displayMetrics5 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
            layoutParams4.height = varyMatches.onNavigationEvent(24, displayMetrics5);
            DisplayMetrics displayMetrics6 = tdsImageView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
            layoutParams4.setMarginStart(varyMatches.onNavigationEvent(8, displayMetrics6));
            tdsImageView.setLayoutParams(layoutParams3);
            tdsImageView.setImage(deprecated_authenticator.onWarmupCompleted("icon-question-circle"));
            tdsImageView.setContentDescription(tdsImageView.getContext().getString(R.string.app_credit_card_free_form_check_box_question_button_content_description));
            Object[] objArr3 = {tdsImageView, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.CheckboxView$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return getSigPolicyHash.onExtraCallback(this.f$0, (View) obj);
                }
            }};
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, objArr3, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsImageView);
        }
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.CheckboxView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getSigPolicyHash.onExtraCallbackWithResult(this.f$0, view);
            }
        });
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, linearLayout2);
        linearLayout.addView(IAuthTabCallbackDefault());
        createNativeBannerAdViewApi createnativebanneradviewapiOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
        if (createnativebanneradviewapiOnNavigationEvent != null) {
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapiOnNavigationEvent, context3, this.IAuthTabCallbackDefault, this.asInterface, this.onTransact);
            if (linearLayoutOnWarmupCompleted != null) {
                linearLayout.addView(linearLayoutOnWarmupCompleted);
            }
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(getSigPolicyHash getsigpolicyhash, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getDigestAlgorithms.onExtraCallbackWithResult(getsigpolicyhash.onTransact, getsigpolicyhash.IAuthTabCallbackDefault, getsigpolicyhash.IAuthTabCallback.IAuthTabCallbackDefault(), getsigpolicyhash.asInterface, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(getSigPolicyHash getsigpolicyhash, View view) {
        if (!getsigpolicyhash.IAuthTabCallback.IAuthTabCallback()) {
            TdsCheckBoxV1View tdsCheckBoxV1View = getsigpolicyhash.onWarmupCompleted;
            if (tdsCheckBoxV1View != null) {
                boolean z = false;
                if (tdsCheckBoxV1View != null && !tdsCheckBoxV1View.isChecked()) {
                    z = true;
                }
                tdsCheckBoxV1View.setChecked(z);
            }
            Function0<Unit> function0 = getsigpolicyhash.onExtraCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Object[] objArr = {getsigpolicyhash.IAuthTabCallback};
        createAdSizeApi createadsizeapi = (createAdSizeApi) createAudienceNetworkActivity.onExtraCallbackWithResult(1551567192, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), objArr, -1551567191, TossApplication.onSessionEnded.onExtraCallback());
        if (createadsizeapi != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(getsigpolicyhash.onTransact, getsigpolicyhash.IAuthTabCallbackDefault, createadsizeapi, getsigpolicyhash.asInterface, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    private final TdsCheckBoxV1View onExtraCallbackWithResult() {
        final TdsCheckBoxV1View tdsCheckBoxV1View = new TdsCheckBoxV1View(this.onExtraCallbackWithResult, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.onWarmupCompleted = tdsCheckBoxV1View;
        tdsCheckBoxV1View.setType(TdsCheckBoxV1View.onNavigationEvent.CIRCLE_BIG_PRIMARY);
        tdsCheckBoxV1View.setCheckedState(this.IAuthTabCallbackStub);
        if (this.IAuthTabCallback.IAuthTabCallback()) {
            transparentBackground.onExtraCallback(tdsCheckBoxV1View);
        }
        tdsCheckBoxV1View.setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.CheckboxView$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return getSigPolicyHash.onExtraCallback(this.f$0, tdsCheckBoxV1View, (TdsCheckBoxV1View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        return tdsCheckBoxV1View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(getSigPolicyHash getsigpolicyhash, TdsCheckBoxV1View tdsCheckBoxV1View, TdsCheckBoxV1View tdsCheckBoxV1View2, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV1View2, "");
        getsigpolicyhash.IAuthTabCallbackStub = z;
        int i = 0;
        if (z) {
            LinearLayout linearLayout = getsigpolicyhash.asBinder;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            List<createNativeAdRatingApi> listOnNavigationEvent = getsigpolicyhash.IAuthTabCallback.onExtraCallbackWithResult().onNavigationEvent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
            for (createNativeAdRatingApi createnativeadratingapi : listOnNavigationEvent) {
                Context context = tdsCheckBoxV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                arrayList.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, context, getsigpolicyhash.IAuthTabCallbackDefault, getsigpolicyhash.asInterface, getsigpolicyhash.onTransact));
            }
            getsigpolicyhash.onNavigationEvent = arrayList;
            for (Object obj : arrayList) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
                View viewOnWarmupCompleted = issignaturepolicyimplied.onWarmupCompleted();
                if (i == 0) {
                    DisplayMetrics displayMetrics = viewOnWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(viewOnWarmupCompleted, varyMatches.onNavigationEvent(24, displayMetrics));
                }
                getClaimedAttributes getclaimedattributes = getClaimedAttributes.onExtraCallback;
                List<? extends isSignaturePolicyImplied> listEmptyList = getsigpolicyhash.onNavigationEvent;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getclaimedattributes.onWarmupCompleted(listEmptyList, i, issignaturepolicyimplied, true));
                LinearLayout linearLayout2 = getsigpolicyhash.asBinder;
                if (linearLayout2 != null) {
                    linearLayout2.addView(viewOnWarmupCompleted);
                }
                i++;
            }
            List<? extends isSignaturePolicyImplied> list = getsigpolicyhash.onNavigationEvent;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof getSigPolicyId) {
                        arrayList2.add(obj2);
                    }
                }
                getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList2);
                if (getsigpolicyid != null) {
                    getsigpolicyid.IAuthTabCallbackDefault();
                }
            }
        } else {
            LinearLayout linearLayout3 = getsigpolicyhash.asBinder;
            if (linearLayout3 != null) {
                linearLayout3.removeAllViews();
            }
            List<createNativeAdRatingApi> listOnNavigationEvent2 = getsigpolicyhash.IAuthTabCallback.asInterface().onNavigationEvent();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent2, 10));
            for (createNativeAdRatingApi createnativeadratingapi2 : listOnNavigationEvent2) {
                Context context2 = tdsCheckBoxV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                arrayList3.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi2, context2, getsigpolicyhash.IAuthTabCallbackDefault, getsigpolicyhash.asInterface, getsigpolicyhash.onTransact));
            }
            getsigpolicyhash.onNavigationEvent = arrayList3;
            for (Object obj3 : arrayList3) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                isSignaturePolicyImplied issignaturepolicyimplied2 = (isSignaturePolicyImplied) obj3;
                View viewOnWarmupCompleted2 = issignaturepolicyimplied2.onWarmupCompleted();
                if (i == 0) {
                    DisplayMetrics displayMetrics2 = viewOnWarmupCompleted2.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(viewOnWarmupCompleted2, varyMatches.onNavigationEvent(24, displayMetrics2));
                }
                getClaimedAttributes getclaimedattributes2 = getClaimedAttributes.onExtraCallback;
                List<? extends isSignaturePolicyImplied> listEmptyList2 = getsigpolicyhash.onNavigationEvent;
                if (listEmptyList2 == null) {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted2, getclaimedattributes2.onWarmupCompleted(listEmptyList2, i, issignaturepolicyimplied2, true));
                LinearLayout linearLayout4 = getsigpolicyhash.asBinder;
                if (linearLayout4 != null) {
                    linearLayout4.addView(viewOnWarmupCompleted2);
                }
                i++;
            }
            List<? extends isSignaturePolicyImplied> list2 = getsigpolicyhash.onNavigationEvent;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof getSigPolicyId) {
                        arrayList4.add(obj4);
                    }
                }
                getSigPolicyId getsigpolicyid2 = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList4);
                if (getsigpolicyid2 != null) {
                    getsigpolicyid2.IAuthTabCallbackDefault();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final View IAuthTabCallbackDefault() {
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        this.asBinder = linearLayout;
        return linearLayout;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        return getWrite.IAuthTabCallback(this.IAuthTabCallback.asBinder(), Boolean.valueOf(this.IAuthTabCallbackStub));
    }

    @Override // o.getCertifiedAttributes
    public List<isSignaturePolicyImplied> IAuthTabCallbackStub() {
        Collection<? extends isSignaturePolicyImplied> collectionEmptyList;
        List<? extends isSignaturePolicyImplied> list = this.onNavigationEvent;
        List<isSignaturePolicyImplied> mutableList = list != null ? CollectionsKt.toMutableList(list) : null;
        List<? extends isSignaturePolicyImplied> list2 = this.onNavigationEvent;
        if (list2 == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                getCertifiedAttributes getcertifiedattributes = obj instanceof getCertifiedAttributes ? (getCertifiedAttributes) obj : null;
                if (getcertifiedattributes != null) {
                    arrayList.add(getcertifiedattributes);
                }
            }
            collectionEmptyList = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it.next()).IAuthTabCallbackStub();
                if (listIAuthTabCallbackStub == null) {
                    listIAuthTabCallbackStub = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(collectionEmptyList, listIAuthTabCallbackStub);
            }
        }
        if (mutableList != null) {
            mutableList.addAll(collectionEmptyList);
        }
        return mutableList;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = function0;
    }

    @Override // o.SignerLocation
    public createAdSizeApi onExtraCallback() {
        if (this.IAuthTabCallbackStub) {
            return this.IAuthTabCallback.onExtraCallbackWithResult().onWarmupCompleted();
        }
        return this.IAuthTabCallback.asInterface().onWarmupCompleted();
    }
}
