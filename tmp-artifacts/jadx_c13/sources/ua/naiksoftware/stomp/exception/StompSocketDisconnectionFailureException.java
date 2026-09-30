package ua.naiksoftware.stomp.exception;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StompSocketDisconnectionFailureException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StompSocketDisconnectionFailureException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
