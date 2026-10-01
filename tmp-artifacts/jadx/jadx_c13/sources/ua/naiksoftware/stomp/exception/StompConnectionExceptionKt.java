package ua.naiksoftware.stomp.exception;

import java.net.SocketException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.zzcy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StompConnectionExceptionKt {
    public static final boolean isStompKnownError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return zzcy.onNavigationEvent(th, 0, 1, (Object) null) || (th instanceof StompSocketBrokenException) || (th instanceof StompSocketDisconnectionFailureException) || (th instanceof SocketException);
    }

    public static final void logIfNotStompKnownError(@NotNull Throwable th, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (isStompKnownError(th)) {
            return;
        }
        function1.invoke(th);
    }
}
