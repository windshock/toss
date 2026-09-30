package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DefaultLogger extends Exception {
    private final Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public DefaultLogger(@NotNull Throwable th, @NotNull GeckoHubImp geckoHubImp, @NotNull CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + geckoHubImp + " threw an exception, context = " + coroutineContext, th);
        this.cause = th;
    }
}
