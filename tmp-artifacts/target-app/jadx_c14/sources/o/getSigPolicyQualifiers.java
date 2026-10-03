package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getSigPolicyQualifiers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSigPolicyQualifiers extends isSignaturePolicyImplied implements RequireInput, SignerLocation, getCertifiedAttributes {
    private List<? extends isSignaturePolicyImplied> IAuthTabCallback;
    private final CardIssueOverviewViewModel IAuthTabCallbackStub;
    private createNativeAdViewAttributesApi asBinder;
    private final getDigestAlgorithms<?> asInterface;
    private final createNativeAdViewApi onExtraCallback;
    private LinearLayout onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private Function0<Unit> onTransact;
    private final TypographyKtExternalSyntheticLambda0 onWarmupCompleted;

    public getSigPolicyQualifiers(@NotNull Context context, @NotNull createNativeAdViewApi createnativeadviewapi, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativeadviewapi, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onNavigationEvent = context;
        this.onExtraCallback = createnativeadviewapi;
        this.onWarmupCompleted = typographyKtExternalSyntheticLambda0;
        this.asInterface = getdigestalgorithms;
        this.IAuthTabCallbackStub = cardIssueOverviewViewModel;
        for (createNativeAdViewAttributesApi createnativeadviewattributesapi : createnativeadviewapi.IAuthTabCallback()) {
            if (Intrinsics.areEqual(createnativeadviewattributesapi.onExtraCallbackWithResult(), this.onExtraCallback.onExtraCallback())) {
                this.asBinder = createnativeadviewattributesapi;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        LinearLayout linearLayout = new LinearLayout(this.onNavigationEvent);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsTabV1View tdsTabV1View = new TdsTabV1View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        TdsTabV1View.setTabLayout$default(tdsTabV1View, 1, (TdsTabV1View.onExtraCallback) null, false, 6, (Object) null);
        Iterator<T> it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            tdsTabV1View.onWarmupCompleted(tdsTabV1View.onNavigationEvent(((createNativeAdViewAttributesApi) it.next()).onExtraCallback()));
        }
        tdsTabV1View.IAuthTabCallback().selectTab(tdsTabV1View.onExtraCallback(this.onExtraCallback.IAuthTabCallback().indexOf(this.asBinder)));
        tdsTabV1View.onNavigationEvent(new onWarmupCompleted(tdsTabV1View));
        linearLayout.addView(tdsTabV1View);
        linearLayout.addView(asInterface());
        return linearLayout;
    }

    public static final class onWarmupCompleted implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ TdsTabV1View onWarmupCompleted;

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        onWarmupCompleted(TdsTabV1View tdsTabV1View) {
            this.onWarmupCompleted = tdsTabV1View;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onTabSelected(TabLayout.Tab tab) {
            getSigPolicyQualifiers getsigpolicyqualifiers = getSigPolicyQualifiers.this;
            getsigpolicyqualifiers.asBinder = getsigpolicyqualifiers.onExtraCallback.IAuthTabCallback().get(((Integer) TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this.onWarmupCompleted}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue());
            getSigPolicyQualifiers getsigpolicyqualifiers2 = getSigPolicyQualifiers.this;
            List<createNativeAdRatingApi> listIAuthTabCallback = getsigpolicyqualifiers2.onExtraCallback.IAuthTabCallback().get(((Integer) TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1014209357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this.onWarmupCompleted}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1014209355)).intValue()).IAuthTabCallback();
            ArrayList arrayList = null;
            if (listIAuthTabCallback.isEmpty()) {
                listIAuthTabCallback = null;
            }
            if (listIAuthTabCallback != null) {
                List<createNativeAdRatingApi> list = listIAuthTabCallback;
                TdsTabV1View tdsTabV1View = this.onWarmupCompleted;
                getSigPolicyQualifiers getsigpolicyqualifiers3 = getSigPolicyQualifiers.this;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (createNativeAdRatingApi createnativeadratingapi : list) {
                    Context context = tdsTabV1View.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    arrayList2.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, context, getsigpolicyqualifiers3.onWarmupCompleted, getsigpolicyqualifiers3.IAuthTabCallbackStub, (getDigestAlgorithms<?>) getsigpolicyqualifiers3.asInterface));
                }
                arrayList = arrayList2;
            }
            getsigpolicyqualifiers2.onExtraCallback(arrayList);
            LinearLayout linearLayoutOnExtraCallbackWithResult = getSigPolicyQualifiers.this.onExtraCallbackWithResult();
            if (linearLayoutOnExtraCallbackWithResult != null) {
                linearLayoutOnExtraCallbackWithResult.removeAllViews();
            }
            List<isSignaturePolicyImplied> listIAuthTabCallbackDefault = getSigPolicyQualifiers.this.IAuthTabCallbackDefault();
            if (listIAuthTabCallbackDefault != null) {
                final getSigPolicyQualifiers getsigpolicyqualifiers4 = getSigPolicyQualifiers.this;
                int i = 0;
                for (Object obj : listIAuthTabCallbackDefault) {
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
                    List<? extends isSignaturePolicyImplied> listIAuthTabCallbackDefault2 = getsigpolicyqualifiers4.IAuthTabCallbackDefault();
                    if (listIAuthTabCallbackDefault2 == null) {
                        listIAuthTabCallbackDefault2 = CollectionsKt.emptyList();
                    }
                    setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getclaimedattributes.onWarmupCompleted(listIAuthTabCallbackDefault2, i, issignaturepolicyimplied, true));
                    LinearLayout linearLayoutOnExtraCallbackWithResult2 = getsigpolicyqualifiers4.onExtraCallbackWithResult();
                    if (linearLayoutOnExtraCallbackWithResult2 != null) {
                        linearLayoutOnExtraCallbackWithResult2.addView(viewOnWarmupCompleted);
                    }
                    if (issignaturepolicyimplied instanceof RequireInput) {
                        ((RequireInput) issignaturepolicyimplied).onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.CardIssueTabView$createView$1$1$2$$ExternalSyntheticLambda0
                            public final Object invoke() {
                                return getSigPolicyQualifiers.onWarmupCompleted.onExtraCallbackWithResult(getsigpolicyqualifiers4);
                            }
                        });
                    }
                    i++;
                }
            }
            List<isSignaturePolicyImplied> listIAuthTabCallbackDefault3 = getSigPolicyQualifiers.this.IAuthTabCallbackDefault();
            if (listIAuthTabCallbackDefault3 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listIAuthTabCallbackDefault3) {
                    if (obj2 instanceof getSigPolicyId) {
                        arrayList3.add(obj2);
                    }
                }
                getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList3);
                if (getsigpolicyid != null) {
                    getsigpolicyid.IAuthTabCallbackDefault();
                }
            }
            Function0 function0 = getSigPolicyQualifiers.this.onTransact;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(getSigPolicyQualifiers getsigpolicyqualifiers) {
            Function0 function0 = getsigpolicyqualifiers.onTransact;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public final LinearLayout onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LinearLayout asInterface() {
        LinearLayout linearLayout = new LinearLayout(this.onNavigationEvent);
        linearLayout.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(linearLayout, varyMatches.onNavigationEvent(40, displayMetrics));
        this.onExtraCallbackWithResult = linearLayout;
        List<createNativeAdRatingApi> listIAuthTabCallback = this.onExtraCallback.IAuthTabCallback().get(this.onExtraCallback.IAuthTabCallback().indexOf(this.asBinder)).IAuthTabCallback();
        ArrayList arrayList = null;
        if (listIAuthTabCallback.isEmpty()) {
            listIAuthTabCallback = null;
        }
        if (listIAuthTabCallback != null) {
            List<createNativeAdRatingApi> list = listIAuthTabCallback;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (createNativeAdRatingApi createnativeadratingapi : list) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                arrayList.add(getSubjectPublicKeyInfo.onExtraCallback(createnativeadratingapi, context, this.onWarmupCompleted, this.IAuthTabCallbackStub, this.asInterface));
            }
        }
        this.IAuthTabCallback = arrayList;
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
                View viewOnWarmupCompleted = issignaturepolicyimplied.onWarmupCompleted();
                if (i == 0) {
                    DisplayMetrics displayMetrics2 = viewOnWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(viewOnWarmupCompleted, varyMatches.onNavigationEvent(24, displayMetrics2));
                }
                getClaimedAttributes getclaimedattributes = getClaimedAttributes.onExtraCallback;
                List<? extends isSignaturePolicyImplied> listEmptyList = this.IAuthTabCallback;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getclaimedattributes.onWarmupCompleted(listEmptyList, i, issignaturepolicyimplied, true));
                LinearLayout linearLayout2 = this.onExtraCallbackWithResult;
                if (linearLayout2 != null) {
                    linearLayout2.addView(viewOnWarmupCompleted);
                }
                if (issignaturepolicyimplied instanceof RequireInput) {
                    ((RequireInput) issignaturepolicyimplied).onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.CardIssueTabView$$ExternalSyntheticLambda0
                        public final Object invoke() {
                            return getSigPolicyQualifiers.IAuthTabCallbackStub(this.f$0);
                        }
                    });
                }
                i++;
            }
        }
        List<? extends isSignaturePolicyImplied> list2 = this.IAuthTabCallback;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof getSigPolicyId) {
                    arrayList2.add(obj2);
                }
            }
            getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList2);
            if (getsigpolicyid != null) {
                getsigpolicyid.IAuthTabCallbackDefault();
            }
        }
        Function0<Unit> function0 = this.onTransact;
        if (function0 != null) {
            function0.invoke();
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(getSigPolicyQualifiers getsigpolicyqualifiers) {
        Function0<Unit> function0 = getsigpolicyqualifiers.onTransact;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        return getWrite.IAuthTabCallback(this.onExtraCallback.onWarmupCompleted(), this.asBinder.onExtraCallbackWithResult());
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
        this.onTransact = function0;
    }

    public final List<isSignaturePolicyImplied> IAuthTabCallbackDefault() {
        return this.IAuthTabCallback;
    }

    public final void onExtraCallback(@Nullable List<? extends isSignaturePolicyImplied> list) {
        this.IAuthTabCallback = list;
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
        Iterator<T> it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual((createNativeAdViewAttributesApi) next, this.asBinder)) {
                break;
            }
        }
        createNativeAdViewAttributesApi createnativeadviewattributesapi = (createNativeAdViewAttributesApi) next;
        if (createnativeadviewattributesapi != null) {
            return createnativeadviewattributesapi.onNavigationEvent();
        }
        return null;
    }
}
