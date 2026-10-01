package o;

import im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossCashReceiptRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoResponse;
import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryDetailRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossPurchaseHistoryListRequest;
import im.toss.appsintoss.data.remote.model.AppsInTossRefundRequest;
import im.toss.appsintoss.data.remote.model.CreateOrderRequest;
import im.toss.appsintoss.data.remote.model.CreateOrderResponse;
import im.toss.appsintoss.data.remote.model.ProcessProductGrantRequest;
import im.toss.appsintoss.data.remote.model.SubmitOrderRequest;
import im.toss.appsintoss.iap.model.AppsInTossCashReceipt;
import im.toss.appsintoss.iap.model.AppsInTossPurchaseHistoryInfo;
import im.toss.appsintoss.iap.model.AppsInTossPurchasedDetailItem;
import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult;
import im.toss.network.model.BaseApiResponse;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss/order/get-purchase-list")
    Object IAuthTabCallback(@getUserCertList @NotNull AppsInTossPurchaseHistoryListRequest appsInTossPurchaseHistoryListRequest, @NotNull access13800<? super BaseApiResponse<AppsInTossPurchaseHistoryInfo>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "/api/v3/apps-in-toss/order/get-cash-receipt")
    Object onExtraCallback(@getUserCertList @NotNull AppsInTossCashReceiptRequest appsInTossCashReceiptRequest, @NotNull access13800<? super BaseApiResponse<AppsInTossCashReceipt>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss/order/request-refund")
    Object onExtraCallback(@getUserCertList @NotNull AppsInTossRefundRequest appsInTossRefundRequest, @NotNull access13800<? super BaseApiResponse<AppsInTossRefundRequestResult>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/catalog/get-product-list")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull AppsInTossAvailableProductListRequest appsInTossAvailableProductListRequest, @NotNull access13800<? super BaseApiResponse<JsonObject>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/v1/orders/issue")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull ProcessProductGrantRequest processProductGrantRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss/order/get-purchase-detail")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull AppsInTossPurchaseHistoryDetailRequest appsInTossPurchaseHistoryDetailRequest, @NotNull access13800<? super BaseApiResponse<AppsInTossPurchasedDetailItem>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/catalog/get-product-detail")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull AppsInTossProductInfoRequest appsInTossProductInfoRequest, @NotNull access13800<? super BaseApiResponse<AppsInTossProductInfoResponse>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/v1/orders")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull CreateOrderRequest createOrderRequest, @NotNull access13800<? super BaseApiResponse<CreateOrderResponse>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/receipt/submit-android")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull SubmitOrderRequest submitOrderRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/order/create-order-for-android")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull CreateOrderRequest createOrderRequest, @NotNull access13800<? super BaseApiResponse<CreateOrderResponse>> access13800Var);

    @getIv8(onExtraCallback = "api/v3/apps-in-toss/v1/receipts")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull SubmitOrderRequest submitOrderRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);
}
