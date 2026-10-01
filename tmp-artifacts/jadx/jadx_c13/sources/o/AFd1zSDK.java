package o;

import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import java.util.List;
import kotlin.Unit;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@g3
@setCollectAndroidID
/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFd1zSDK {
    @getIv8(onExtraCallback = "/api/v1/toss-app/log/bulk")
    Object onExtraCallbackWithResult(@getUserCertList @NotNull List<JsonObject> list, @NotNull access13800<? super SecuritiesBaseApiResponse<Unit>> access13800Var);

    @initCertListOnMemory(onExtraCallbackWithResult = "health")
    Object onWarmupCompleted(@NotNull access13800<? super Response<Unit>> access13800Var);
}
