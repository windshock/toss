package o;

import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface maybeRemoveAttachStateListener<T> extends access13800<T> {
    @Deprecated
    void IAuthTabCallback(T t, @Nullable Function1<? super Throwable, Unit> function1);

    <R extends T> void IAuthTabCallback(R r, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote);

    void IAuthTabCallback(@NotNull Function1<? super Throwable, Unit> function1);

    boolean IAuthTabCallback();

    void onExtraCallback(@NotNull Object obj);

    boolean onExtraCallback(@Nullable Throwable th);

    Object onNavigationEvent(@NotNull Throwable th);

    void onNavigationEvent(@NotNull GeckoHubImp geckoHubImp, T t);

    boolean onNavigationEvent();

    <R extends T> Object onWarmupCompleted(R r, @Nullable Object obj, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote);

    boolean onWarmupCompleted();

    public static final class onWarmupCompleted {
        public static /* synthetic */ boolean IAuthTabCallback(maybeRemoveAttachStateListener mayberemoveattachstatelistener, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return mayberemoveattachstatelistener.onExtraCallback(th);
        }
    }
}
