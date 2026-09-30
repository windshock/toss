package okhttp3.internal.concurrent;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LockableKt {
    public static final void wait(@NotNull Lockable lockable) throws InterruptedException {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        lockable.wait();
    }

    public static final void notify(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        lockable.notify();
    }

    public static final void notifyAll(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        lockable.notifyAll();
    }

    public static final void awaitNanos(@NotNull Lockable lockable, long j) throws InterruptedException {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        long j2 = j / 1000000;
        if (j2 > 0 || j > 0) {
            lockable.wait(j2, (int) (j - (1000000 * j2)));
        }
    }

    public static final void assertLockNotHeld(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(lockable)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + lockable);
        }
    }

    public static final void assertLockHeld(@NotNull Lockable lockable) {
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(lockable)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lockable);
    }

    public static final <T> T withLock(@NotNull Lockable lockable, @NotNull Function0<? extends T> function0) {
        T t;
        Intrinsics.checkNotNullParameter(lockable, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function0, BuildConfig.FLAVOR);
        synchronized (lockable) {
            try {
                t = (T) function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return t;
    }
}
