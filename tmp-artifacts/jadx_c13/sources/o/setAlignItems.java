package o;

import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAlignItems {
    public static final void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        Iterator<CoroutineExceptionHandler> it = setAlignContent.onWarmupCompleted().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (setFlexLines unused) {
                return;
            } catch (Throwable th2) {
                setAlignContent.onWarmupCompleted(inst.onExtraCallback(th, th2));
            }
        }
        try {
            setExecute.onNavigationEvent(th, new getSumOfCrossSize(coroutineContext));
        } catch (Throwable unused2) {
        }
        setAlignContent.onWarmupCompleted(th);
    }
}
