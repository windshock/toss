package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.onboarding.PushBlockRequest;
import viva.republica.toss.network.model.onboarding.PushNotificationContentDto;
import viva.republica.toss.network.model.onboarding.PushUnblockRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface FullScreenAdShowAdConfig {
    @getIv8(onExtraCallback = "v3/onboarding2/push/block")
    @gf
    Object IAuthTabCallback(@getUserCertList @NotNull PushBlockRequest pushBlockRequest, @NotNull access13800<? super SimpleDraweeView> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:DELETE"})
    @getIv8(onExtraCallback = "v3/onboarding2/push/unblock")
    Object onExtraCallback(@getUserCertList @NotNull PushUnblockRequest pushUnblockRequest, @NotNull access13800<? super BaseApiResponse<List<String>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/onboarding2/push/content")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<List<PushNotificationContentDto>>> access13800Var);
}
