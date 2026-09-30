package o;

import im.toss.components.tuba.distribution.DistributionRequestBody;
import im.toss.network.model.BaseApiResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface UtilsKtExternalSyntheticLambda14 {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/tuba/distributions/is-target/by-device-id")
    writeRaw<BaseApiResponse<Boolean>> IAuthTabCallback(@getKey4(onNavigationEvent = "code") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/tuba/distributions/is-target-checks-guest-header/by-device-id")
    writeRaw<BaseApiResponse<Map<String, Boolean>>> onExtraCallback(@getUserCertList @NotNull DistributionRequestBody distributionRequestBody);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/tuba/distributions/is-target")
    writeRaw<BaseApiResponse<Boolean>> onExtraCallback(@getKey4(onNavigationEvent = "code") @NotNull String str);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/tuba/distributions/is-target-checks-header/by-ga-no")
    writeRaw<BaseApiResponse<Map<String, Boolean>>> onWarmupCompleted(@getUserCertList @NotNull DistributionRequestBody distributionRequestBody);
}
