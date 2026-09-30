package o;

import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.tuba.variable.v1.VarsResult;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface isLimitAdTrackingEnabled {
    @setCollectAndroidID
    @getIv8(onExtraCallback = "/api/v1/tuba/guests/with-upsert")
    Object onExtraCallbackWithResult(@NotNull access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var);

    @getIv8(onExtraCallback = "/api/v1/tuba/members/with-upsert")
    Object onWarmupCompleted(@NotNull access13800<? super SecuritiesBaseApiResponse<VarsResult>> access13800Var);
}
