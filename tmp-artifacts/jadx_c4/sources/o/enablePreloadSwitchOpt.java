package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface enablePreloadSwitchOpt {
    @getIv8(onExtraCallback = "v3/credit/overviews/latest")
    Object onExtraCallback(@NotNull access13800<? super BaseApiResponse<CreditOverview>> access13800Var);

    @getIv8(onExtraCallback = "v3/credit/overviews/latest/timestamp")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<String>> access13800Var);

    @getIv8(onExtraCallback = "v3/credit/overviews")
    @getUserCertOnMemory
    Object onWarmupCompleted(@getCurCert(onExtraCallbackWithResult = "refresh") boolean z, @getCurCert(onExtraCallbackWithResult = "view") @NotNull String str, @NotNull access13800<? super BaseApiResponse<CreditOverview>> access13800Var);
}
