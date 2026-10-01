package o;

import im.toss.feature.credit.overview.network.response.CreditOverview;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface enableLitePreloadOpt {
    Object IAuthTabCallback(@NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var);

    void IAuthTabCallback();

    Object onExtraCallback(@NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var);

    Object onExtraCallback(boolean z, @NotNull String str, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var);

    Object onWarmupCompleted(@NotNull access13800<? super kotlin.Result<String>> access13800Var);

    Object onWarmupCompleted(@NotNull enableShowReminderOnAppPauseOpt enableshowreminderonapppauseopt, @NotNull access13800<? super kotlin.Result<CreditOverview>> access13800Var);
}
