package o;

import im.toss.appsintoss.login.model.GameCenterProfileResponse;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SafeWindowLayoutComponentProviderExternalSyntheticLambda5 {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "api/v3/apps-in-toss-growth/game-center/game-profile")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "x-app-name") @Nullable String str, @initCertList(onExtraCallbackWithResult = "x-deployment-id") @Nullable String str2, @NotNull access13800<? super BaseApiResponse<GameCenterProfileResponse>> access13800Var);
}
