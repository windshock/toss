package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class r8lambdawm4poh0toUcK03Yte94uAzTj6Xc {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final int IAuthTabCallback;
    private final boolean onExtraCallback;
    private final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg onWarmupCompleted;

    public r8lambdawm4poh0toUcK03Yte94uAzTj6Xc(@NotNull r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, int i, boolean z) {
        Intrinsics.checkNotNullParameter(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, "");
        this.onWarmupCompleted = r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg;
        this.IAuthTabCallback = i;
        this.onExtraCallback = z;
    }

    public final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = this.onWarmupCompleted;
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 35;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
