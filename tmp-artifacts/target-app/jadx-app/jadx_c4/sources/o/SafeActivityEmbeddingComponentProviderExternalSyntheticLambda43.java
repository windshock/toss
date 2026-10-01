package o;

import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import kotlin.Unit;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SafeActivityEmbeddingComponentProviderExternalSyntheticLambda43 {
    Object onExtraCallback(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @NotNull access13800<? super Unit> access13800Var);

    Object onExtraCallback(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, boolean z, @NotNull access13800<? super Boolean> access13800Var);

    Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super kotlin.Result<AppsInTossCashReceipt>> access13800Var);

    Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull access13800<? super JsonObject> access13800Var);

    Object onNavigationEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull access13800<? super AppsInTossPurchaseHistoryInfo> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull access13800<? super AppsInTossRefundRequestResult> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super AppsInTossPurchasedDetailItem> access13800Var);

    Object onWarmupCompleted(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @Nullable String str4, @NotNull access13800<? super SafeActivityEmbeddingComponentProviderExternalSyntheticLambda31> access13800Var);

    Object onWarmupCompleted(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> access13800Var);
}
