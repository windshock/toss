package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.notification.group.BlockGroupRequest;
import viva.republica.toss.network.model.notification.group.RecentMessageGroupContentDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface withCacheFlags {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v4/messenger/content/blocked-service")
    Object onExtraCallback(@getUserCertList @NotNull BlockGroupRequest blockGroupRequest, @NotNull access13800<? super BaseApiResponse<Object>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v4/messenger/content/group-service")
    Object onExtraCallbackWithResult(@NotNull access13800<? super BaseApiResponse<RecentMessageGroupContentDto>> access13800Var);
}
