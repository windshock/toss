package o;

import im.toss.network.model.BaseApiResponse;
import im.toss.websocket.network.model.TossWebSocketSessionMetaDto;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface parseTraceId {
    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true", "X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/ws-manager/session/server")
    writeRaw<BaseApiResponse<TossWebSocketSessionMetaDto>> onNavigationEvent();

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true", "X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/ws-manager/socket-push/received")
    wasLastName onWarmupCompleted(@getKey4(onNavigationEvent = "socketPushId") @NotNull String str);
}
