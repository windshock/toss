package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lud2<E> {
    private final boolean IAuthTabCallbackDefault;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ AtomicReferenceArray onExtraCallbackWithResult;
    private final int onTransact;
    private final int onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final /* synthetic */ AtomicReferenceFieldUpdater onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(lud2.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater IAuthTabCallback = AtomicLongFieldUpdater.newUpdater(lud2.class, "_state$volatile");
    public static final djExternalSyntheticApiModelOutline0 onNavigationEvent = new djExternalSyntheticApiModelOutline0("REMOVE_FROZEN");

    private final /* synthetic */ AtomicReferenceArray asBinder() {
        return this.onExtraCallbackWithResult;
    }

    public lud2(int i, boolean z) {
        this.onWarmupCompleted = i;
        this.IAuthTabCallbackDefault = z;
        int i2 = i - 1;
        this.onTransact = i2;
        this.onExtraCallbackWithResult = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean IAuthTabCallback() {
        long j = IAuthTabCallback.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final int onNavigationEvent() {
        long j = IAuthTabCallback.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean onExtraCallback() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallback;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onExtraCallbackWithResult(@NotNull E e) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallback;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return Companion.onExtraCallback(j);
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.onTransact;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.IAuthTabCallbackDefault && asBinder().get(i2 & i3) != null) {
                int i4 = this.onWarmupCompleted;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (IAuthTabCallback.compareAndSet(this, j, Companion.IAuthTabCallback(j, 1073741823 & (i2 + 1)))) {
                asBinder().set(i2 & i3, e);
                lud2<E> lud2VarOnWarmupCompleted = this;
                while ((IAuthTabCallback.get(lud2VarOnWarmupCompleted) & 1152921504606846976L) != 0 && (lud2VarOnWarmupCompleted = lud2VarOnWarmupCompleted.onExtraCallbackWithResult().onWarmupCompleted(i2, e)) != null) {
                }
                return 0;
            }
        }
    }

    private final lud2<E> onWarmupCompleted(int i, E e) {
        Object obj = asBinder().get(this.onTransact & i);
        if (!(obj instanceof onExtraCallback) || ((onExtraCallback) obj).onNavigationEvent != i) {
            return null;
        }
        asBinder().set(i & this.onTransact, e);
        return this;
    }

    public final Object onWarmupCompleted() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallback;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return onNavigationEvent;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.onTransact;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = asBinder().get(this.onTransact & i);
            if (obj == null) {
                if (this.IAuthTabCallbackDefault) {
                    return null;
                }
            } else {
                if (obj instanceof onExtraCallback) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                if (IAuthTabCallback.compareAndSet(this, j, Companion.onNavigationEvent(j, i3))) {
                    asBinder().set(this.onTransact & i, null);
                    return obj;
                }
                if (this.IAuthTabCallbackDefault) {
                    lud2<E> lud2VarOnNavigationEvent = this;
                    do {
                        lud2VarOnNavigationEvent = lud2VarOnNavigationEvent.onNavigationEvent(i, i3);
                    } while (lud2VarOnNavigationEvent != null);
                    return obj;
                }
            }
        }
    }

    private final lud2<E> onNavigationEvent(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallback;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return onExtraCallbackWithResult();
            }
        } while (!IAuthTabCallback.compareAndSet(this, j, Companion.onNavigationEvent(j, i2)));
        asBinder().set(this.onTransact & i3, null);
        return null;
    }

    public final lud2<E> onExtraCallbackWithResult() {
        return onNavigationEvent(IAuthTabCallbackStub());
    }

    private final long IAuthTabCallbackStub() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = IAuthTabCallback;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    private final lud2<E> onNavigationEvent(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onExtraCallback;
        while (true) {
            lud2<E> lud2Var = (lud2) atomicReferenceFieldUpdater.get(this);
            if (lud2Var != null) {
                return lud2Var;
            }
            RequestBuilder.onWarmupCompleted(onExtraCallback, this, (Object) null, IAuthTabCallback(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final lud2<E> IAuthTabCallback(long j) {
        lud2<E> lud2Var = new lud2<>(this.onWarmupCompleted << 1, this.IAuthTabCallbackDefault);
        int i = (int) (1073741823 & j);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.onTransact;
            if ((i & i3) != (i3 & i2)) {
                Object onextracallback = asBinder().get(this.onTransact & i);
                if (onextracallback == null) {
                    onextracallback = new onExtraCallback(i);
                }
                lud2Var.asBinder().set(lud2Var.onTransact & i, onextracallback);
                i++;
            } else {
                IAuthTabCallback.set(lud2Var, Companion.IAuthTabCallback(j, 1152921504606846976L));
                return lud2Var;
            }
        }
    }

    public static final class onExtraCallback {
        public final int onNavigationEvent;

        public onExtraCallback(int i) {
            this.onNavigationEvent = i;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long IAuthTabCallback(long j, long j2) {
            return j & (~j2);
        }

        public final int onExtraCallback(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        private onWarmupCompleted() {
        }

        public final long onNavigationEvent(long j, int i) {
            return IAuthTabCallback(j, 1073741823L) | i;
        }

        public final long IAuthTabCallback(long j, int i) {
            return IAuthTabCallback(j, 1152921503533105152L) | (i << 30);
        }
    }
}
