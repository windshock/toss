package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class maybeUpdateAnimatable {
    public static final <T> Object onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        return onLoadStarted.onExtraCallback(coroutineContext, function2, access13800Var);
    }

    public static final <T> GeckoHubImp1<T> onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, @NotNull setRandomHost setrandomhost, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        return onLoadStarted.onWarmupCompleted(findresandmsg, coroutineContext, setrandomhost, function2);
    }

    public static final <T> T onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) onLoadCleared.onNavigationEvent(coroutineContext, function2);
    }

    public static final getPackageType onWarmupCompleted(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext, @NotNull setRandomHost setrandomhost, @NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        return onLoadStarted.onExtraCallback(findresandmsg, coroutineContext, setrandomhost, function2);
    }
}
