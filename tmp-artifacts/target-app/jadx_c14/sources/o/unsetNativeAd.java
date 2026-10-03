package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.visitor.TossPrepaidCardResponse;
import viva.republica.toss.network.model.visitor.VisitorOsGpsResultRequest;
import viva.republica.toss.network.model.visitor.VisitorTossMoneyVirtualAccountResponse;
import viva.republica.toss.network.model.visitor.VisitorTossPointBalanceResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface unsetNativeAd {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/visitor-tosspoint/balance")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<VisitorTossPointBalanceResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:PUT"})
    @getIv8(onExtraCallback = "v3/visitor/passport")
    @getUserCertOnMemory
    Object onExtraCallback(@getCurCert(onExtraCallbackWithResult = "sessionId") long j, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/visitor/virtual-account/inquiry")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<VisitorTossMoneyVirtualAccountResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/toss-prepaid-card/cards")
    Object onNavigationEvent(@NotNull access13800<? super BaseApiResponse<TossPrepaidCardResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/visitor/passport/os-gps-result")
    Object onNavigationEvent(@getUserCertList @NotNull VisitorOsGpsResultRequest visitorOsGpsResultRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/uss-card/toss-prepaid-card/tmoney/users")
    @gf
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<ReactInstanceManagerBuilderCompanion>> access13800Var);
}
