package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.TossBankCurrencyDetailResponse;
import viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse;
import viva.republica.toss.network.model.bank.TossBankFailover;

@g3
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getMediaViewApi {
    @initCertListOnMemory(onExtraCallbackWithResult = "api-public/fx/v2/fx-rates/{currency}/trend")
    Object IAuthTabCallback(@getIvD(onNavigationEvent = "currency") @NotNull String str, @getKey4(onNavigationEvent = "range") @NotNull String str2, @NotNull access13800<? super TossBankCurrencyTrendResponse> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @initCertListOnMemory(onExtraCallbackWithResult = "api-public/bank/toss-core/failover")
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<TossBankFailover>> access13800Var);

    @initCertListOnMemory(onExtraCallbackWithResult = "api-public/fx/v2/fx-rates/{currency}")
    Object onExtraCallbackWithResult(@getIvD(onNavigationEvent = "currency") @NotNull String str, @NotNull access13800<? super TossBankCurrencyDetailResponse> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true"})
    @gf
    @initCertListOnMemory(onExtraCallbackWithResult = "health")
    wasLastName onNavigationEvent();

    static /* synthetic */ Object onExtraCallbackWithResult(getMediaViewApi getmediaviewapi, String str, String str2, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyTrend");
        }
        if ((i & 2) != 0) {
            str2 = then.DATE_YEAR_MONTH_DATE;
        }
        return getmediaviewapi.IAuthTabCallback(str, str2, access13800Var);
    }
}
