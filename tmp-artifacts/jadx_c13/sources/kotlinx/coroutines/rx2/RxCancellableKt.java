package kotlinx.coroutines.rx2;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import o.inst;
import o.setExecute;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxCancellableKt {
    public static final void onNavigationEvent(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } catch (Throwable th2) {
            setExecute.onNavigationEvent(th, th2);
            inst.onNavigationEvent(coroutineContext, th);
        }
    }
}
