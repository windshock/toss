package o;

import im.toss.websocket.network.model.TossWebSocketSessionMetaDto;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class resumeSession {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final toDate onWarmupCompleted(@NotNull TossWebSocketSessionMetaDto tossWebSocketSessionMetaDto) {
        int i = 2 % 2;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(tossWebSocketSessionMetaDto, "");
        String strOnWarmupCompleted = tossWebSocketSessionMetaDto.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            strOnWarmupCompleted = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strOnExtraCallbackWithResult = tossWebSocketSessionMetaDto.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult == null) {
            strOnExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strOnNavigationEvent = tossWebSocketSessionMetaDto.onNavigationEvent();
        if (strOnNavigationEvent == null) {
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strOnExtraCallback = tossWebSocketSessionMetaDto.onExtraCallback();
        if (strOnExtraCallback == null) {
            int i4 = onWarmupCompleted + 111;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 25;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str = strOnExtraCallback;
        }
        toDate todate = new toDate(strOnWarmupCompleted, strOnExtraCallbackWithResult, strOnNavigationEvent, str);
        int i9 = onNavigationEvent + 97;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 59 / 0;
        }
        return todate;
    }
}
