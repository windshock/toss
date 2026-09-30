package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx7 {
    public static /* synthetic */ setIndicatorDirection onExtraCallbackWithResult(Function1 function1, Object obj, setIndicatorDirection setindicatordirection, int i, Object obj2) {
        if ((i & 2) != 0) {
            setindicatordirection = null;
        }
        return onNavigationEvent(function1, obj, setindicatordirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> setIndicatorDirection onNavigationEvent(@NotNull Function1<? super E, Unit> function1, E e, @Nullable setIndicatorDirection setindicatordirection) {
        try {
            function1.invoke(e);
            return setindicatordirection;
        } catch (Throwable th) {
            if (setindicatordirection != null && setindicatordirection.getCause() != th) {
                setExecute.onNavigationEvent(setindicatordirection, th);
                return setindicatordirection;
            }
            return new setIndicatorDirection("Exception in undelivered element handler for " + e, th);
        }
    }

    public static final <E> void onExtraCallback(@NotNull Function1<? super E, Unit> function1, E e, @NotNull CoroutineContext coroutineContext) {
        setIndicatorDirection setindicatordirectionOnNavigationEvent = onNavigationEvent(function1, e, null);
        if (setindicatordirectionOnNavigationEvent != null) {
            inst.onNavigationEvent(coroutineContext, setindicatordirectionOnNavigationEvent);
        }
    }
}
