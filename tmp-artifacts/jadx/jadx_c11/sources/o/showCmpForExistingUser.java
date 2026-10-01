package o;

import im.toss.securities.core.markettime.data.model.IntegratedTradingHoursDto;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface showCmpForExistingUser {
    @setCollectAndroidID
    @initCertListOnMemory(onExtraCallbackWithResult = "v2/system/trading-hours/integrated")
    Object onNavigationEvent(@NotNull access13800<? super SecuritiesBaseApiResponse<IntegratedTradingHoursDto>> access13800Var);
}
