package o;

import im.toss.appsintoss.game.model.GamePromotionRewardExecutionRequest;
import im.toss.appsintoss.game.model.GamePromotionRewardKeyResponse;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface OverlayControlleroverlayInfo1ExternalSyntheticLambda0 {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss/promotion/execute-promotion/get-key")
    Object onExtraCallback(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @NotNull access13800<? super BaseApiResponse<GamePromotionRewardKeyResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss/promotion/execute-promotion/execute-promotion")
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @getUserCertList @NotNull GamePromotionRewardExecutionRequest gamePromotionRewardExecutionRequest, @NotNull access13800<? super BaseApiResponse<GamePromotionRewardKeyResponse>> access13800Var);
}
