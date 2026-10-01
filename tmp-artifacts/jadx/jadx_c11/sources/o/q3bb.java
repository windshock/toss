package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class q3bb {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final AtomicInteger onExtraCallback = new AtomicInteger(0);
    private final AtomicInteger onNavigationEvent = new AtomicInteger(0);
    private final AtomicInteger onExtraCallbackWithResult = new AtomicInteger(0);
    private final AtomicInteger IAuthTabCallback = new AtomicInteger(0);
    private final AtomicInteger onWarmupCompleted = new AtomicInteger(0);

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.incrementAndGet();
        if (i3 == 0) {
            throw null;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.incrementAndGet();
        int i4 = asInterface + 65;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.incrementAndGet();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback.addAndGet(i);
            int i4 = 85 / 0;
        } else {
            this.IAuthTabCallback.addAndGet(i);
        }
        int i5 = onTransact + 113;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            this.onWarmupCompleted.addAndGet(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.onWarmupCompleted.addAndGet(i);
        int i4 = onTransact + 115;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    public final q3bd onExtraCallbackWithResult() {
        int i = 2 % 2;
        q3bd q3bdVar = new q3bd(this.onExtraCallback.getAndSet(0), this.onNavigationEvent.getAndSet(0), this.onExtraCallbackWithResult.getAndSet(0), this.IAuthTabCallback.getAndSet(0), this.onWarmupCompleted.getAndSet(0));
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return q3bdVar;
    }

    public final void onExtraCallbackWithResult(@NotNull q3bd q3bdVar) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(q3bdVar, "");
        this.onExtraCallback.addAndGet(q3bdVar.onExtraCallbackWithResult());
        this.onNavigationEvent.addAndGet(q3bdVar.IAuthTabCallback());
        this.onExtraCallbackWithResult.addAndGet(q3bdVar.onExtraCallback());
        this.IAuthTabCallback.addAndGet(q3bdVar.onNavigationEvent());
        this.onWarmupCompleted.addAndGet(q3bdVar.onWarmupCompleted());
        int i4 = asInterface + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
