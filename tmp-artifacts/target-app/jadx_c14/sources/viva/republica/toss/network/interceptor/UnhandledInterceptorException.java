package viva.republica.toss.network.interceptor;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UnhandledInterceptorException extends IOException {
    private final Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnhandledInterceptorException(@NotNull Throwable th) {
        super("Unhandled interceptor exception: " + th.getMessage());
        Intrinsics.checkNotNullParameter(th, "");
        this.cause = th;
    }
}
