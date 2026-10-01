package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.BillingClientKotlinKt$;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.getPackageType;
import o.getResRootDir;
import o.pauseMyRequest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BillingClientKotlinKt {
    static final void IAuthTabCallback(pauseMyRequest pausemyrequest, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(new ProductDetailsResult(billingResult, queryProductDetailsResult.getProductDetailsList()));
    }

    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull access13800<? super BillingResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new BillingClientKotlinKt$.ExternalSyntheticLambda5(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull access13800<? super ConsumeResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.consumeAsync(consumeParams, new BillingClientKotlinKt$.ExternalSyntheticLambda2(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object createAlternativeBillingOnlyReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull access13800<? super CreateAlternativeBillingOnlyReportingDetailsResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new BillingClientKotlinKt$.ExternalSyntheticLambda8(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object createBillingProgramReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, @RecentlyNonNull access13800<? super CreateBillingProgramReportingDetailsResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.createBillingProgramReportingDetailsAsync(billingProgramReportingDetailsParams, new BillingClientKotlinKt$.ExternalSyntheticLambda1(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    @Deprecated
    public static final Object createExternalOfferReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull access13800<? super CreateExternalOfferReportingDetailsResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.createExternalOfferReportingDetailsAsync(new BillingClientKotlinKt$.ExternalSyntheticLambda6(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object isAlternativeBillingOnlyAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull access13800<? super BillingResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.isAlternativeBillingOnlyAvailableAsync(new BillingClientKotlinKt$.ExternalSyntheticLambda7(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object isBillingProgramAvailable(@RecentlyNonNull BillingClient billingClient, int i2, @RecentlyNonNull access13800<? super IsBillingProgramAvailableResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.isBillingProgramAvailableAsync(i2, new BillingClientKotlinKt$.ExternalSyntheticLambda0(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    @Deprecated
    public static final Object isExternalOfferAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull access13800<? super BillingResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.isExternalOfferAvailableAsync(new BillingClientKotlinKt$.ExternalSyntheticLambda3(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    static final void onExtraCallback(pauseMyRequest pausemyrequest, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(billingResult);
    }

    static final void onExtraCallback(pauseMyRequest pausemyrequest, BillingResult billingResult, BillingProgramAvailabilityDetails billingProgramAvailabilityDetails) {
        Intrinsics.checkNotNull(billingResult);
        Intrinsics.checkNotNull(billingProgramAvailabilityDetails);
        pausemyrequest.IAuthTabCallback(new IsBillingProgramAvailableResult(billingResult, billingProgramAvailabilityDetails));
    }

    static final void onExtraCallback(pauseMyRequest pausemyrequest, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    static final void onExtraCallbackWithResult(pauseMyRequest pausemyrequest, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(billingResult);
    }

    static final void onNavigationEvent(pauseMyRequest pausemyrequest, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    static final void onNavigationEvent(pauseMyRequest pausemyrequest, BillingResult billingResult, String str) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(new ConsumeResult(billingResult, str));
    }

    static final void onNavigationEvent(pauseMyRequest pausemyrequest, BillingResult billingResult, List list) {
        Intrinsics.checkNotNull(billingResult);
        Intrinsics.checkNotNull(list);
        pausemyrequest.IAuthTabCallback(new PurchasesResult(billingResult, list));
    }

    static final void onWarmupCompleted(pauseMyRequest pausemyrequest, BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(billingResult);
    }

    static final void onWarmupCompleted(pauseMyRequest pausemyrequest, BillingResult billingResult, BillingProgramReportingDetails billingProgramReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        pausemyrequest.IAuthTabCallback(new CreateBillingProgramReportingDetailsResult(billingResult, billingProgramReportingDetails));
    }

    public static final Object queryProductDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryProductDetailsParams queryProductDetailsParams, @RecentlyNonNull access13800<? super ProductDetailsResult> access13800Var) {
        final pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            public final void onProductDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull QueryProductDetailsResult queryProductDetailsResult) {
                BillingClientKotlinKt.IAuthTabCallback(pausemyrequestOnExtraCallback, billingResult, queryProductDetailsResult);
            }
        });
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }

    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryPurchasesParams queryPurchasesParams, @RecentlyNonNull access13800<? super PurchasesResult> access13800Var) {
        pauseMyRequest pausemyrequestOnExtraCallback = getResRootDir.onExtraCallback((getPackageType) null, 1, (Object) null);
        billingClient.queryPurchasesAsync(queryPurchasesParams, new BillingClientKotlinKt$.ExternalSyntheticLambda9(pausemyrequestOnExtraCallback));
        return pausemyrequestOnExtraCallback.IAuthTabCallback(access13800Var);
    }
}
