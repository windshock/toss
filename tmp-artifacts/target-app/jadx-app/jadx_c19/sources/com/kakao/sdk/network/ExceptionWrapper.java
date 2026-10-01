package com.kakao.sdk.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExceptionWrapper extends IOException {
    private final Throwable origin;

    public final Throwable IAuthTabCallback() {
        return this.origin;
    }

    public ExceptionWrapper(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        this.origin = th;
    }
}
