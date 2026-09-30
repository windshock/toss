package ua.naiksoftware.stomp;

import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.Http1ExchangeCodecAbstractSource;
import o.access8000;
import o.getWrite;
import o.newKnownLengthSink;
import org.jetbrains.annotations.NotNull;
import ua.naiksoftware.stomp.dto.LifecycleEvent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StompClientImplKt {
    public static final Map<String, Object> closeLogParams(@NotNull LifecycleEvent lifecycleEvent) {
        Object objM31constructorimpl;
        Intrinsics.checkNotNullParameter(lifecycleEvent, "");
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(Boolean.valueOf(newKnownLengthSink.Companion.onExtraCallback(Http1ExchangeCodecAbstractSource.SEAND_4260_CONNECT_TELEMETRY, false)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(objM31constructorimpl)) {
            objM31constructorimpl = bool;
        }
        if (!((Boolean) objM31constructorimpl).booleanValue()) {
            return access8000.IAuthTabCallback();
        }
        return access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("closeCode", lifecycleEvent.getCloseCode()), getWrite.IAuthTabCallback("closeReason", lifecycleEvent.getCloseReason()));
    }
}
