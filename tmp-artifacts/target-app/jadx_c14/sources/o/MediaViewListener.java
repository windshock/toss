package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.common.CheckVersionReq;
import viva.republica.toss.network.model.common.CheckVersionResponse;
import viva.republica.toss.network.model.init.CheckoutReq;
import viva.republica.toss.network.model.init.v2.CheckoutResult;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface MediaViewListener {
    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/core/apps/version/check")
    Object IAuthTabCallback(@getUserCertList @NotNull CheckVersionReq checkVersionReq, @NotNull access13800<? super BaseApiResponse<CheckVersionResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @getIv8(onExtraCallback = "v3/core/apps/checkout")
    writeRaw<BaseApiResponse<CheckoutResult>> onWarmupCompleted(@getUserCertList @NotNull CheckoutReq checkoutReq);
}
