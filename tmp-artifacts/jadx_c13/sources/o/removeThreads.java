package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeThreads {
    public static final int IAuthTabCallback(int i) {
        return (i - 1) & (-32);
    }

    public static final int onWarmupCompleted(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <E> getProcessUptime<E> onNavigationEvent() {
        return putAllThreads.Companion.onWarmupCompleted();
    }

    public static final Object[] onExtraCallback(@Nullable Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }
}
