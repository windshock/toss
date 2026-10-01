package o;

import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY {
    @initCertListOnMemory(onExtraCallbackWithResult = "/api/v1/widget/mini-charts")
    Object IAuthTabCallback(@getKey4(onNavigationEvent = "productCodes") @Nullable String str, @getKey4(onNavigationEvent = "indexCodes") @Nullable String str2, @NotNull access13800<? super SecuritiesBaseApiResponse<WidgetMiniCharts>> access13800Var);
}
