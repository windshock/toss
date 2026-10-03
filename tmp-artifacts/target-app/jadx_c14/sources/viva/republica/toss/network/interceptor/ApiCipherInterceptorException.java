package viva.republica.toss.network.interceptor;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ApiCipherInterceptorException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCipherInterceptorException(@NotNull Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCipherInterceptorException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
