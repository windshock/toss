package o;

import im.toss.feature.credit.terms.network.response.IntegrationTermsResponse;
import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getQuestionnaireOptSwitch {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "/api/v3/credit-all/terms/integration/v2")
    Object onNavigationEvent(@getKey4(onNavigationEvent = "termsType") @NotNull String str, @NotNull access13800<? super BaseApiResponse<IntegrationTermsResponse>> access13800Var);
}
