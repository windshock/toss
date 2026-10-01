package o;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeCloneJNI extends ComponentModela implements Executor {
    public static final jni_YGNodeCloneJNI onNavigationEvent = new jni_YGNodeCloneJNI();
    private static final GeckoHubImp onExtraCallback = GeckoHubImp.onNavigationEvent(jni_YGNodeRemoveChildJNI.IAuthTabCallback, djExternalSyntheticApiModelOutline3.onExtraCallbackWithResult("kotlinx.coroutines.io.parallelism", RangesKt___RangesKt.coerceAtLeast(64, djExternalSyntheticApiModelOutline2.onExtraCallback()), 0, 0, 12, null), null, 2, null);

    @Override // o.ComponentModela
    public Executor onExtraCallbackWithResult() {
        return this;
    }

    private jni_YGNodeCloneJNI() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        onWarmupCompleted(access13600.IAuthTabCallback, runnable);
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        return jni_YGNodeRemoveChildJNI.IAuthTabCallback.onWarmupCompleted(i, str);
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        onExtraCallback.onWarmupCompleted(coroutineContext, runnable);
    }

    @Override // o.GeckoHubImp
    public void onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        onExtraCallback.onExtraCallback(coroutineContext, runnable);
    }

    @Override // o.ComponentModela, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return "Dispatchers.IO";
    }
}
