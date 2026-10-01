package o;

import im.toss.securities.widget.data.model.calendar.WidgetCalendar;
import im.toss.securities.widget.data.model.overview.FolderOverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r2ExternalSyntheticLambda0 {
    @getIv8(onExtraCallback = "v1/widget/overview/accounts")
    Object onExtraCallback(@getKey4(onNavigationEvent = "accountSeqs") @NotNull String str, @getKey4(onNavigationEvent = "includeProducts") boolean z, @NotNull access13800<? super SecuritiesBaseApiResponse<OverviewAccounts>> access13800Var);

    @initCertListOnMemory(onExtraCallbackWithResult = "/api/v1/widget/calendar")
    Object onExtraCallbackWithResult(@getKey4(onNavigationEvent = "day") @NotNull String str, @getKey4(onNavigationEvent = "duration") int i, @NotNull access13800<? super SecuritiesBaseApiResponse<WidgetCalendar>> access13800Var);

    @initCertListOnMemory(onExtraCallbackWithResult = "/api/v2/widget/watchlists")
    Object onNavigationEvent(@NotNull access13800<? super SecuritiesBaseApiResponse<WidgetWatchlists>> access13800Var);

    @getIv8(onExtraCallback = "v2/widget/overview/accounts")
    Object onWarmupCompleted(@getKey4(onNavigationEvent = "accountSeqs") @NotNull String str, @NotNull access13800<? super SecuritiesBaseApiResponse<FolderOverviewAccounts>> access13800Var);

    static /* synthetic */ Object onNavigationEvent(r2ExternalSyntheticLambda0 r2externalsyntheticlambda0, String str, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWidgetOverviewAccount");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return r2externalsyntheticlambda0.onExtraCallback(str, z, access13800Var);
    }

    static /* synthetic */ Object onExtraCallbackWithResult(r2ExternalSyntheticLambda0 r2externalsyntheticlambda0, String str, int i, access13800 access13800Var, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWidgetCalendar");
        }
        if ((i2 & 2) != 0) {
            i = 7;
        }
        return r2externalsyntheticlambda0.onExtraCallbackWithResult(str, i, access13800Var);
    }
}
