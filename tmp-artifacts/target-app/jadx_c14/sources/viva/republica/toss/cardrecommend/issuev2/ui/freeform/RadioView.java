package viva.republica.toss.cardrecommend.issuev2.ui.freeform;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.TdsSegmentedControlV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.SignerLocation;
import o.TypographyKtExternalSyntheticLambda0;
import o.createAdSizeApi;
import o.createNativeAdRatingApi;
import o.createNativeBannerAdViewApi;
import o.getCertifiedAttributes;
import o.getClaimedAttributes;
import o.getDigestAlgorithms;
import o.getSigPolicyId;
import o.getSubjectPublicKeyInfo;
import o.getWrite;
import o.isSignaturePolicyImplied;
import o.setMinWebSocketMessageToCompressokhttp;
import o.transparentBackground;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.network.model.cardsales.funnel.field.RadioField;
import viva.republica.toss.network.model.cardsales.funnel.field.RadioOption;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RadioView extends isSignaturePolicyImplied implements RequireInput, SignerLocation, getCertifiedAttributes {
    private List<? extends isSignaturePolicyImplied> IAuthTabCallback;
    private final CardIssueOverviewViewModel IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private final getDigestAlgorithms<?> asBinder;
    private Function0<Unit> asInterface;
    private final TypographyKtExternalSyntheticLambda0 onExtraCallback;
    private final RadioField onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private LinearLayout onWarmupCompleted;

    public RadioView(@NotNull Context context, @NotNull RadioField radioField, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(radioField, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onNavigationEvent = context;
        this.onExtraCallbackWithResult = radioField;
        this.onExtraCallback = typographyKtExternalSyntheticLambda0;
        this.asBinder = getdigestalgorithms;
        this.IAuthTabCallbackDefault = cardIssueOverviewViewModel;
        this.IAuthTabCallbackStub = radioField.onExtraCallback();
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onNavigationEvent);
        linearLayout.setOrientation(1);
        linearLayout.addView(asBinder());
        createNativeBannerAdViewApi createnativebanneradviewapiOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
        if (createnativebanneradviewapiOnNavigationEvent != null) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapiOnNavigationEvent, context, this.onExtraCallback, this.IAuthTabCallbackDefault, this.asBinder);
            if (linearLayoutOnWarmupCompleted != null) {
                linearLayout.addView(linearLayoutOnWarmupCompleted);
            }
        }
        linearLayout.addView(onExtraCallbackWithResult());
        return linearLayout;
    }

    private final TdsSegmentedControlV1View asBinder() {
        final TdsSegmentedControlV1View tdsSegmentedControlV1View = new TdsSegmentedControlV1View(this.onNavigationEvent, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        DisplayMetrics displayMetrics = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        Object[] objArr = {tdsSegmentedControlV1View, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics))};
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
        DisplayMetrics displayMetrics2 = tdsSegmentedControlV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(tdsSegmentedControlV1View, varyMatches.onNavigationEvent(24, displayMetrics2));
        tdsSegmentedControlV1View.setLabel(this.onExtraCallbackWithResult.IAuthTabCallbackDefault());
        tdsSegmentedControlV1View.setMessage(this.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Iterator<T> it = this.onExtraCallbackWithResult.IAuthTabCallbackStub().iterator();
        while (it.hasNext()) {
            tdsSegmentedControlV1View.onWarmupCompleted(((RadioOption) it.next()).onNavigationEvent());
        }
        tdsSegmentedControlV1View.postDelayed(new Runnable() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RadioView.onWarmupCompleted(tdsSegmentedControlV1View, this);
            }
        }, 300L);
        tdsSegmentedControlV1View.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return RadioView.onWarmupCompleted(this.f$0, tdsSegmentedControlV1View, (View) obj, ((Integer) obj2).intValue());
            }
        });
        if (this.onExtraCallbackWithResult.onWarmupCompleted()) {
            transparentBackground.onExtraCallback(tdsSegmentedControlV1View);
            tdsSegmentedControlV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RadioView.onWarmupCompleted(this.f$0, view);
                }
            });
        }
        return tdsSegmentedControlV1View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(TdsSegmentedControlV1View tdsSegmentedControlV1View, RadioView radioView) {
        Iterator<RadioOption> it = radioView.onExtraCallbackWithResult.IAuthTabCallbackStub().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().onExtraCallbackWithResult(), radioView.IAuthTabCallbackStub)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        TdsSegmentedControlV1View.onExtraCallback(tdsSegmentedControlV1View, numValueOf != null ? numValueOf.intValue() : 0, false, false, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(final RadioView radioView, TdsSegmentedControlV1View tdsSegmentedControlV1View, View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (i < 0) {
            return Unit.INSTANCE;
        }
        radioView.IAuthTabCallbackStub = radioView.onExtraCallbackWithResult.IAuthTabCallbackStub().get(i).onExtraCallbackWithResult();
        List<createNativeAdRatingApi> listOnExtraCallback = radioView.onExtraCallbackWithResult.IAuthTabCallbackStub().get(i).onExtraCallback();
        ArrayList arrayList = null;
        if (listOnExtraCallback.isEmpty()) {
            listOnExtraCallback = null;
        }
        if (listOnExtraCallback != null) {
            List<createNativeAdRatingApi> list = listOnExtraCallback;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (createNativeAdRatingApi createnativeadratingapi : list) {
                Context context = tdsSegmentedControlV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                arrayList.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, context, radioView.onExtraCallback, radioView.IAuthTabCallbackDefault, radioView.asBinder));
            }
        }
        radioView.IAuthTabCallback = arrayList;
        LinearLayout linearLayout = radioView.onWarmupCompleted;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        List<? extends isSignaturePolicyImplied> list2 = radioView.IAuthTabCallback;
        if (list2 != null) {
            int i2 = 0;
            for (Object obj : list2) {
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
                View viewOnWarmupCompleted = issignaturepolicyimplied.onWarmupCompleted();
                if (i2 == 0) {
                    DisplayMetrics displayMetrics = viewOnWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(viewOnWarmupCompleted, varyMatches.onNavigationEvent(24, displayMetrics));
                }
                getClaimedAttributes getclaimedattributes = getClaimedAttributes.onExtraCallback;
                List<? extends isSignaturePolicyImplied> listEmptyList = radioView.IAuthTabCallback;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getclaimedattributes.onWarmupCompleted(listEmptyList, i2, issignaturepolicyimplied, true));
                LinearLayout linearLayout2 = radioView.onWarmupCompleted;
                if (linearLayout2 != null) {
                    linearLayout2.addView(viewOnWarmupCompleted);
                }
                if (issignaturepolicyimplied instanceof RequireInput) {
                    ((RequireInput) issignaturepolicyimplied).onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView$$ExternalSyntheticLambda3
                        public final Object invoke() {
                            return RadioView.IAuthTabCallback(this.f$0);
                        }
                    });
                }
                i2++;
            }
        }
        List<? extends isSignaturePolicyImplied> list3 = radioView.IAuthTabCallback;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (obj2 instanceof getSigPolicyId) {
                    arrayList2.add(obj2);
                }
            }
            getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList2);
            if (getsigpolicyid != null) {
                getsigpolicyid.IAuthTabCallbackDefault();
            }
        }
        Function0<Unit> function0 = radioView.asInterface;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(RadioView radioView) {
        Function0<Unit> function0 = radioView.asInterface;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(RadioView radioView, View view) {
        createAdSizeApi createadsizeapiIAuthTabCallback = radioView.onExtraCallbackWithResult.IAuthTabCallback();
        if (createadsizeapiIAuthTabCallback != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(radioView.asBinder, radioView.onExtraCallback, createadsizeapiIAuthTabCallback, radioView.IAuthTabCallbackDefault, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
    }

    private final LinearLayout onExtraCallbackWithResult() {
        LinearLayout linearLayout = new LinearLayout(this.onNavigationEvent);
        linearLayout.setOrientation(1);
        this.onWarmupCompleted = linearLayout;
        return linearLayout;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        return getWrite.IAuthTabCallback(this.onExtraCallbackWithResult.asBinder(), this.IAuthTabCallbackStub);
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public boolean IAuthTabCallback() {
        List<? extends isSignaturePolicyImplied> list = this.IAuthTabCallback;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((isSignaturePolicyImplied) obj) instanceof RequireInput) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((isSignaturePolicyImplied) it.next()).onTransact()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.asInterface = function0;
    }

    @Override // o.getCertifiedAttributes
    public List<isSignaturePolicyImplied> IAuthTabCallbackStub() {
        List<? extends isSignaturePolicyImplied> listEmptyList = this.IAuthTabCallback;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listFilterIsInstance = CollectionsKt.filterIsInstance(listEmptyList, getCertifiedAttributes.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = listFilterIsInstance.iterator();
        while (it.hasNext()) {
            List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it.next()).IAuthTabCallbackStub();
            if (listIAuthTabCallbackStub == null) {
                listIAuthTabCallbackStub = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listIAuthTabCallbackStub);
        }
        return CollectionsKt.plus(listEmptyList, arrayList);
    }

    @Override // o.SignerLocation
    public createAdSizeApi onExtraCallback() {
        Object next;
        Iterator<T> it = this.onExtraCallbackWithResult.IAuthTabCallbackStub().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((RadioOption) next).onExtraCallbackWithResult(), this.IAuthTabCallbackStub)) {
                break;
            }
        }
        RadioOption radioOption = (RadioOption) next;
        if (radioOption != null) {
            return radioOption.onWarmupCompleted();
        }
        return null;
    }
}
