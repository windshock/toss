package o;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeFinalizeJNI implements Executor, Closeable {
    public final jni_YGNodeCalculateLayoutJNI IAuthTabCallback;
    public final ResizableAtomicArray<onWarmupCompleted> IAuthTabCallbackDefault;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final String asInterface;
    private volatile /* synthetic */ long controlState$volatile;
    public final int onExtraCallback;
    public final jni_YGNodeCalculateLayoutJNI onExtraCallbackWithResult;
    public final long onNavigationEvent;
    public final int onTransact;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static final /* synthetic */ AtomicLongFieldUpdater access000 = AtomicLongFieldUpdater.newUpdater(jni_YGNodeFinalizeJNI.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater asBinder = AtomicLongFieldUpdater.newUpdater(jni_YGNodeFinalizeJNI.class, "controlState$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater IAuthTabCallbackStub = AtomicIntegerFieldUpdater.newUpdater(jni_YGNodeFinalizeJNI.class, "_isTerminated$volatile");
    public static final djExternalSyntheticApiModelOutline0 onWarmupCompleted = new djExternalSyntheticApiModelOutline0("NOT_IN_STACK");

    public final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onNavigationEvent.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[onNavigationEvent.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            IAuthTabCallback = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater onTransact() {
        return asBinder;
    }

    public jni_YGNodeFinalizeJNI(int i, int i2, long j, @NotNull String str) {
        this.onExtraCallback = i;
        this.onTransact = i2;
        this.onNavigationEvent = j;
        this.asInterface = str;
        if (i <= 0) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.IAuthTabCallback = new jni_YGNodeCalculateLayoutJNI();
        this.onExtraCallbackWithResult = new jni_YGNodeCalculateLayoutJNI();
        this.IAuthTabCallbackDefault = new ResizableAtomicArray<>((i + 1) << 1);
        this.controlState$volatile = i << 42;
    }

    public final void IAuthTabCallback(@NotNull onWarmupCompleted onwarmupcompleted, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = access000;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iOnWarmupCompleted = (int) (2097151 & j);
            if (iOnWarmupCompleted == i) {
                iOnWarmupCompleted = i2 == 0 ? onWarmupCompleted(onwarmupcompleted) : i2;
            }
            if (iOnWarmupCompleted >= 0 && access000.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | iOnWarmupCompleted)) {
                return;
            }
        }
    }

    public final boolean onNavigationEvent(@NotNull onWarmupCompleted onwarmupcompleted) {
        long j;
        int iOnWarmupCompleted;
        if (onwarmupcompleted.onNavigationEvent() != onWarmupCompleted) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = access000;
        do {
            j = atomicLongFieldUpdater.get(this);
            iOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
            onwarmupcompleted.IAuthTabCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult((int) (2097151 & j)));
        } while (!access000.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | iOnWarmupCompleted));
        return true;
    }

    private final onWarmupCompleted IAuthTabCallbackStub() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = access000;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult((int) (2097151 & j));
            if (onwarmupcompletedOnExtraCallbackWithResult == null) {
                return null;
            }
            int iOnWarmupCompleted = onWarmupCompleted(onwarmupcompletedOnExtraCallbackWithResult);
            if (iOnWarmupCompleted >= 0 && access000.compareAndSet(this, j, iOnWarmupCompleted | ((2097152 + j) & (-2097152)))) {
                onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback(onWarmupCompleted);
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
        }
    }

    private final int onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
        Object objOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
        while (objOnNavigationEvent != onWarmupCompleted) {
            if (objOnNavigationEvent == null) {
                return 0;
            }
            onWarmupCompleted onwarmupcompleted2 = (onWarmupCompleted) objOnNavigationEvent;
            int iOnWarmupCompleted = onwarmupcompleted2.onWarmupCompleted();
            if (iOnWarmupCompleted != 0) {
                return iOnWarmupCompleted;
            }
            objOnNavigationEvent = onwarmupcompleted2.onNavigationEvent();
        }
        return -1;
    }

    public final boolean onNavigationEvent() {
        return IAuthTabCallbackStub.get(this) == 1;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        onExtraCallback(this, runnable, false, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        onWarmupCompleted(10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(long j) throws InterruptedException {
        int i;
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnNavigationEvent;
        if (IAuthTabCallbackStub.compareAndSet(this, 0, 1)) {
            onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            synchronized (this.IAuthTabCallbackDefault) {
                i = (int) (onTransact().get(this) & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult2 = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(i2);
                    Intrinsics.checkNotNull(onwarmupcompletedOnExtraCallbackWithResult2);
                    onWarmupCompleted onwarmupcompleted = onwarmupcompletedOnExtraCallbackWithResult2;
                    if (onwarmupcompleted != onwarmupcompletedOnExtraCallbackWithResult) {
                        while (onwarmupcompleted.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(onwarmupcompleted);
                            onwarmupcompleted.join(j);
                        }
                        onwarmupcompleted.IAuthTabCallback.onWarmupCompleted(this.onExtraCallbackWithResult);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.onExtraCallbackWithResult.IAuthTabCallback();
            this.IAuthTabCallback.IAuthTabCallback();
            while (true) {
                if (onwarmupcompletedOnExtraCallbackWithResult != null) {
                    jni_ygnodeisdirtyjniOnNavigationEvent = onwarmupcompletedOnExtraCallbackWithResult.onExtraCallback(true);
                    if (jni_ygnodeisdirtyjniOnNavigationEvent != null) {
                        continue;
                    }
                } else {
                    jni_ygnodeisdirtyjniOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
                    if (jni_ygnodeisdirtyjniOnNavigationEvent == null && (jni_ygnodeisdirtyjniOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent()) == null) {
                        break;
                    }
                }
                onNavigationEvent(jni_ygnodeisdirtyjniOnNavigationEvent);
            }
            if (onwarmupcompletedOnExtraCallbackWithResult != null) {
                onwarmupcompletedOnExtraCallbackWithResult.onNavigationEvent(onNavigationEvent.TERMINATED);
            }
            access000.set(this, 0L);
            asBinder.set(this, 0L);
        }
    }

    public static /* synthetic */ void onExtraCallback(jni_YGNodeFinalizeJNI jni_ygnodefinalizejni, Runnable runnable, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        jni_ygnodefinalizejni.onExtraCallbackWithResult(runnable, z, z2);
    }

    public final void onExtraCallbackWithResult(@NotNull Runnable runnable, boolean z, boolean z2) {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnWarmupCompleted = onWarmupCompleted(runnable, z);
        boolean z3 = jni_ygnodeisdirtyjniOnWarmupCompleted.onTransact;
        long jAddAndGet = z3 ? asBinder.addAndGet(this, 2097152L) : 0L;
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult(), jni_ygnodeisdirtyjniOnWarmupCompleted, z2);
        if (jni_ygnodeisdirtyjniIAuthTabCallback != null && !IAuthTabCallback(jni_ygnodeisdirtyjniIAuthTabCallback)) {
            throw new RejectedExecutionException(this.asInterface + " was terminated");
        }
        if (z3) {
            onNavigationEvent(jAddAndGet);
        } else {
            IAuthTabCallback();
        }
    }

    public final jni_YGNodeIsDirtyJNI onWarmupCompleted(@NotNull Runnable runnable, boolean z) {
        long jIAuthTabCallback = jni_YGNodeRemoveAllChildrenJNI.onTransact.IAuthTabCallback();
        if (runnable instanceof jni_YGNodeIsDirtyJNI) {
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni = (jni_YGNodeIsDirtyJNI) runnable;
            jni_ygnodeisdirtyjni.asInterface = jIAuthTabCallback;
            jni_ygnodeisdirtyjni.onTransact = z;
            return jni_ygnodeisdirtyjni;
        }
        return jni_YGNodeRemoveAllChildrenJNI.onExtraCallbackWithResult(runnable, jIAuthTabCallback, z);
    }

    private final void onNavigationEvent(long j) {
        if (asInterface() || IAuthTabCallback(j)) {
            return;
        }
        asInterface();
    }

    public final void IAuthTabCallback() {
        if (asInterface() || IAuthTabCallback(this, 0L, 1, null)) {
            return;
        }
        asInterface();
    }

    static /* synthetic */ boolean IAuthTabCallback(jni_YGNodeFinalizeJNI jni_ygnodefinalizejni, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = asBinder.get(jni_ygnodefinalizejni);
        }
        return jni_ygnodefinalizejni.IAuthTabCallback(j);
    }

    private final boolean IAuthTabCallback(long j) {
        if (RangesKt___RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.onExtraCallback) {
            int iOnWarmupCompleted = onWarmupCompleted();
            if (iOnWarmupCompleted == 1 && this.onExtraCallback > 1) {
                onWarmupCompleted();
            }
            if (iOnWarmupCompleted > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean asInterface() {
        onWarmupCompleted onwarmupcompletedIAuthTabCallbackStub;
        do {
            onwarmupcompletedIAuthTabCallbackStub = IAuthTabCallbackStub();
            if (onwarmupcompletedIAuthTabCallbackStub == null) {
                return false;
            }
        } while (!onWarmupCompleted.onNavigationEvent.compareAndSet(onwarmupcompletedIAuthTabCallbackStub, -1, 0));
        LockSupport.unpark(onwarmupcompletedIAuthTabCallbackStub);
        return true;
    }

    private final int onWarmupCompleted() {
        synchronized (this.IAuthTabCallbackDefault) {
            if (onNavigationEvent()) {
                return -1;
            }
            long j = asBinder.get(this);
            int i = (int) (j & 2097151);
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iCoerceAtLeast >= this.onExtraCallback) {
                return 0;
            }
            if (i >= this.onTransact) {
                return 0;
            }
            int i2 = ((int) (onTransact().get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.IAuthTabCallbackDefault.onExtraCallbackWithResult(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this, i2);
            this.IAuthTabCallbackDefault.IAuthTabCallback(i2, onwarmupcompleted);
            if (i2 != ((int) (2097151 & asBinder.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            onwarmupcompleted.start();
            return iCoerceAtLeast + 1;
        }
    }

    private final jni_YGNodeIsDirtyJNI IAuthTabCallback(onWarmupCompleted onwarmupcompleted, jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni, boolean z) {
        onNavigationEvent onnavigationevent;
        if (onwarmupcompleted == null || (onnavigationevent = onwarmupcompleted.onExtraCallback) == onNavigationEvent.TERMINATED) {
            return jni_ygnodeisdirtyjni;
        }
        if (!jni_ygnodeisdirtyjni.onTransact && onnavigationevent == onNavigationEvent.BLOCKING) {
            return jni_ygnodeisdirtyjni;
        }
        onwarmupcompleted.onWarmupCompleted = true;
        return onwarmupcompleted.IAuthTabCallback.onExtraCallback(jni_ygnodeisdirtyjni, z);
    }

    private final onWarmupCompleted onExtraCallbackWithResult() {
        Thread threadCurrentThread = Thread.currentThread();
        onWarmupCompleted onwarmupcompleted = threadCurrentThread instanceof onWarmupCompleted ? (onWarmupCompleted) threadCurrentThread : null;
        if (onwarmupcompleted == null || !Intrinsics.areEqual(jni_YGNodeFinalizeJNI.this, this)) {
            return null;
        }
        return onwarmupcompleted;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iOnExtraCallback; i6++) {
            onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = this.IAuthTabCallbackDefault.onExtraCallbackWithResult(i6);
            if (onwarmupcompletedOnExtraCallbackWithResult != null) {
                int iOnNavigationEvent = onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                int i7 = onExtraCallbackWithResult.IAuthTabCallback[onwarmupcompletedOnExtraCallbackWithResult.onExtraCallback.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iOnNavigationEvent);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iOnNavigationEvent);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iOnNavigationEvent > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iOnNavigationEvent);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = asBinder.get(this);
        return this.asInterface + '@' + getResCount.onExtraCallbackWithResult(this) + "[Pool Size {core = " + this.onExtraCallback + ", max = " + this.onTransact + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.IAuthTabCallback.onExtraCallbackWithResult() + ", global blocking queue size = " + this.onExtraCallbackWithResult.onExtraCallbackWithResult() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.onExtraCallback - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void onNavigationEvent(@NotNull jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni) {
        try {
            jni_ygnodeisdirtyjni.run();
            ResourceDecoderRegistryEntry unused = ResourceEncoderRegistryEntry.IAuthTabCallback;
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    public final class onWarmupCompleted extends Thread {
        private static final /* synthetic */ AtomicIntegerFieldUpdater onNavigationEvent = AtomicIntegerFieldUpdater.newUpdater(onWarmupCompleted.class, "workerCtl$volatile");
        public final jni_YGNodeSetAlwaysFormsContainingBlockJNI IAuthTabCallback;
        private int IAuthTabCallbackStub;
        private final Ref.ObjectRef<jni_YGNodeIsDirtyJNI> asBinder;
        private long asInterface;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public onNavigationEvent onExtraCallback;
        private long onTransact;
        public boolean onWarmupCompleted;
        private volatile /* synthetic */ int workerCtl$volatile;

        private onWarmupCompleted() {
            setDaemon(true);
            setContextClassLoader(jni_YGNodeFinalizeJNI.this.getClass().getClassLoader());
            this.IAuthTabCallback = new jni_YGNodeSetAlwaysFormsContainingBlockJNI();
            this.asBinder = new Ref.ObjectRef<>();
            this.onExtraCallback = onNavigationEvent.DORMANT;
            this.nextParkedWorker = jni_YGNodeFinalizeJNI.onWarmupCompleted;
            int iNanoTime = (int) System.nanoTime();
            this.IAuthTabCallbackStub = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final int onWarmupCompleted() {
            return this.indexInArray;
        }

        public final void onWarmupCompleted(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(jni_YGNodeFinalizeJNI.this.asInterface);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public onWarmupCompleted(jni_YGNodeFinalizeJNI jni_ygnodefinalizejni, int i) {
            this();
            onWarmupCompleted(i);
        }

        public final void IAuthTabCallback(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final Object onNavigationEvent() {
            return this.nextParkedWorker;
        }

        private final boolean IAuthTabCallbackDefault() {
            long j;
            if (this.onExtraCallback == onNavigationEvent.CPU_ACQUIRED) {
                return true;
            }
            jni_YGNodeFinalizeJNI jni_ygnodefinalizejni = jni_YGNodeFinalizeJNI.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterOnTransact = jni_YGNodeFinalizeJNI.onTransact();
            do {
                j = atomicLongFieldUpdaterOnTransact.get(jni_ygnodefinalizejni);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!jni_YGNodeFinalizeJNI.onTransact().compareAndSet(jni_ygnodefinalizejni, j, j - 4398046511104L));
            this.onExtraCallback = onNavigationEvent.CPU_ACQUIRED;
            return true;
        }

        public final boolean onNavigationEvent(@NotNull onNavigationEvent onnavigationevent) {
            onNavigationEvent onnavigationevent2 = this.onExtraCallback;
            boolean z = onnavigationevent2 == onNavigationEvent.CPU_ACQUIRED;
            if (z) {
                jni_YGNodeFinalizeJNI.onTransact().addAndGet(jni_YGNodeFinalizeJNI.this, 4398046511104L);
            }
            if (onnavigationevent2 != onnavigationevent) {
                this.onExtraCallback = onnavigationevent;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            asInterface();
        }

        private final void asInterface() {
            loop0: while (true) {
                boolean z = false;
                while (!jni_YGNodeFinalizeJNI.this.onNavigationEvent() && this.onExtraCallback != onNavigationEvent.TERMINATED) {
                    jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnExtraCallback = onExtraCallback(this.onWarmupCompleted);
                    if (jni_ygnodeisdirtyjniOnExtraCallback != null) {
                        this.asInterface = 0L;
                        IAuthTabCallback(jni_ygnodeisdirtyjniOnExtraCallback);
                    } else {
                        this.onWarmupCompleted = false;
                        if (this.asInterface == 0) {
                            onTransact();
                        } else if (z) {
                            onNavigationEvent(onNavigationEvent.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.asInterface);
                            this.asInterface = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            onNavigationEvent(onNavigationEvent.TERMINATED);
        }

        private final void onTransact() {
            if (!onExtraCallback()) {
                jni_YGNodeFinalizeJNI.this.onNavigationEvent(this);
                return;
            }
            onNavigationEvent.set(this, -1);
            while (onExtraCallback() && onNavigationEvent.get(this) == -1 && !jni_YGNodeFinalizeJNI.this.onNavigationEvent() && this.onExtraCallback != onNavigationEvent.TERMINATED) {
                onNavigationEvent(onNavigationEvent.PARKING);
                Thread.interrupted();
                asBinder();
            }
        }

        private final boolean onExtraCallback() {
            return this.nextParkedWorker != jni_YGNodeFinalizeJNI.onWarmupCompleted;
        }

        private final void IAuthTabCallback(jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni) {
            this.onTransact = 0L;
            if (this.onExtraCallback == onNavigationEvent.PARKING) {
                this.onExtraCallback = onNavigationEvent.BLOCKING;
            }
            if (jni_ygnodeisdirtyjni.onTransact) {
                if (onNavigationEvent(onNavigationEvent.BLOCKING)) {
                    jni_YGNodeFinalizeJNI.this.IAuthTabCallback();
                }
                jni_YGNodeFinalizeJNI.this.onNavigationEvent(jni_ygnodeisdirtyjni);
                jni_YGNodeFinalizeJNI.onTransact().addAndGet(jni_YGNodeFinalizeJNI.this, -2097152L);
                if (this.onExtraCallback != onNavigationEvent.TERMINATED) {
                    this.onExtraCallback = onNavigationEvent.DORMANT;
                    return;
                }
                return;
            }
            jni_YGNodeFinalizeJNI.this.onNavigationEvent(jni_ygnodeisdirtyjni);
        }

        public final int IAuthTabCallback(int i) {
            int i2 = this.IAuthTabCallbackStub;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.IAuthTabCallbackStub = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & IntCompanionObject.MAX_VALUE) % i;
        }

        private final void asBinder() {
            if (this.onTransact == 0) {
                this.onTransact = System.nanoTime() + jni_YGNodeFinalizeJNI.this.onNavigationEvent;
            }
            LockSupport.parkNanos(jni_YGNodeFinalizeJNI.this.onNavigationEvent);
            if (System.nanoTime() - this.onTransact >= 0) {
                this.onTransact = 0L;
                access000();
            }
        }

        private final void access000() {
            jni_YGNodeFinalizeJNI jni_ygnodefinalizejni = jni_YGNodeFinalizeJNI.this;
            synchronized (jni_ygnodefinalizejni.IAuthTabCallbackDefault) {
                if (jni_ygnodefinalizejni.onNavigationEvent()) {
                    return;
                }
                if (((int) (jni_YGNodeFinalizeJNI.onTransact().get(jni_ygnodefinalizejni) & 2097151)) <= jni_ygnodefinalizejni.onExtraCallback) {
                    return;
                }
                if (onNavigationEvent.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    onWarmupCompleted(0);
                    jni_ygnodefinalizejni.IAuthTabCallback(this, i, 0);
                    int andDecrement = (int) (jni_YGNodeFinalizeJNI.onTransact().getAndDecrement(jni_ygnodefinalizejni) & 2097151);
                    if (andDecrement != i) {
                        onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = jni_ygnodefinalizejni.IAuthTabCallbackDefault.onExtraCallbackWithResult(andDecrement);
                        Intrinsics.checkNotNull(onwarmupcompletedOnExtraCallbackWithResult);
                        onWarmupCompleted onwarmupcompleted = onwarmupcompletedOnExtraCallbackWithResult;
                        jni_ygnodefinalizejni.IAuthTabCallbackDefault.IAuthTabCallback(i, onwarmupcompleted);
                        onwarmupcompleted.onWarmupCompleted(i);
                        jni_ygnodefinalizejni.IAuthTabCallback(onwarmupcompleted, andDecrement, i);
                    }
                    jni_ygnodefinalizejni.IAuthTabCallbackDefault.IAuthTabCallback(andDecrement, null);
                    Unit unit = Unit.INSTANCE;
                    this.onExtraCallback = onNavigationEvent.TERMINATED;
                }
            }
        }

        public final jni_YGNodeIsDirtyJNI onExtraCallback(boolean z) {
            return IAuthTabCallbackDefault() ? onExtraCallbackWithResult(z) : onExtraCallbackWithResult();
        }

        private final jni_YGNodeIsDirtyJNI onExtraCallbackWithResult() {
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
            if (jni_ygnodeisdirtyjniIAuthTabCallback != null) {
                return jni_ygnodeisdirtyjniIAuthTabCallback;
            }
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnNavigationEvent = jni_YGNodeFinalizeJNI.this.onExtraCallbackWithResult.onNavigationEvent();
            return jni_ygnodeisdirtyjniOnNavigationEvent == null ? onNavigationEvent(1) : jni_ygnodeisdirtyjniOnNavigationEvent;
        }

        private final jni_YGNodeIsDirtyJNI onExtraCallbackWithResult(boolean z) {
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallbackStub;
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallbackStub2;
            if (z) {
                boolean z2 = IAuthTabCallback(jni_YGNodeFinalizeJNI.this.onExtraCallback << 1) == 0;
                if (z2 && (jni_ygnodeisdirtyjniIAuthTabCallbackStub2 = IAuthTabCallbackStub()) != null) {
                    return jni_ygnodeisdirtyjniIAuthTabCallbackStub2;
                }
                jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
                if (jni_ygnodeisdirtyjniOnWarmupCompleted != null) {
                    return jni_ygnodeisdirtyjniOnWarmupCompleted;
                }
                if (!z2 && (jni_ygnodeisdirtyjniIAuthTabCallbackStub = IAuthTabCallbackStub()) != null) {
                    return jni_ygnodeisdirtyjniIAuthTabCallbackStub;
                }
            } else {
                jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallbackStub3 = IAuthTabCallbackStub();
                if (jni_ygnodeisdirtyjniIAuthTabCallbackStub3 != null) {
                    return jni_ygnodeisdirtyjniIAuthTabCallbackStub3;
                }
            }
            return onNavigationEvent(3);
        }

        private final jni_YGNodeIsDirtyJNI IAuthTabCallbackStub() {
            if (IAuthTabCallback(2) == 0) {
                jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnNavigationEvent = jni_YGNodeFinalizeJNI.this.IAuthTabCallback.onNavigationEvent();
                return jni_ygnodeisdirtyjniOnNavigationEvent != null ? jni_ygnodeisdirtyjniOnNavigationEvent : jni_YGNodeFinalizeJNI.this.onExtraCallbackWithResult.onNavigationEvent();
            }
            jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniOnNavigationEvent2 = jni_YGNodeFinalizeJNI.this.onExtraCallbackWithResult.onNavigationEvent();
            return jni_ygnodeisdirtyjniOnNavigationEvent2 != null ? jni_ygnodeisdirtyjniOnNavigationEvent2 : jni_YGNodeFinalizeJNI.this.IAuthTabCallback.onNavigationEvent();
        }

        private final jni_YGNodeIsDirtyJNI onNavigationEvent(int i) {
            int i2 = (int) (jni_YGNodeFinalizeJNI.onTransact().get(jni_YGNodeFinalizeJNI.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iIAuthTabCallback = IAuthTabCallback(i2);
            jni_YGNodeFinalizeJNI jni_ygnodefinalizejni = jni_YGNodeFinalizeJNI.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iIAuthTabCallback++;
                if (iIAuthTabCallback > i2) {
                    iIAuthTabCallback = 1;
                }
                onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = jni_ygnodefinalizejni.IAuthTabCallbackDefault.onExtraCallbackWithResult(iIAuthTabCallback);
                if (onwarmupcompletedOnExtraCallbackWithResult != null && onwarmupcompletedOnExtraCallbackWithResult != this) {
                    long jOnWarmupCompleted = onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted(i, this.asBinder);
                    if (jOnWarmupCompleted == -1) {
                        Ref.ObjectRef<jni_YGNodeIsDirtyJNI> objectRef = this.asBinder;
                        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni = objectRef.element;
                        objectRef.element = null;
                        return jni_ygnodeisdirtyjni;
                    }
                    if (jOnWarmupCompleted > 0) {
                        jMin = Math.min(jMin, jOnWarmupCompleted);
                    }
                }
            }
            if (jMin == LongCompanionObject.MAX_VALUE) {
                jMin = 0;
            }
            this.asInterface = jMin;
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent CPU_ACQUIRED = new onNavigationEvent("CPU_ACQUIRED", 0);
        public static final onNavigationEvent BLOCKING = new onNavigationEvent("BLOCKING", 1);
        public static final onNavigationEvent PARKING = new onNavigationEvent("PARKING", 2);
        public static final onNavigationEvent DORMANT = new onNavigationEvent("DORMANT", 3);
        public static final onNavigationEvent TERMINATED = new onNavigationEvent("TERMINATED", 4);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            return new onNavigationEvent[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            return $ENTRIES;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
        }

        public static onNavigationEvent valueOf(String str) {
            return (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
        }

        public static onNavigationEvent[] values() {
            return (onNavigationEvent[]) $VALUES.clone();
        }
    }

    private final boolean IAuthTabCallback(jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni) {
        if (jni_ygnodeisdirtyjni.onTransact) {
            return this.onExtraCallbackWithResult.onNavigationEvent(jni_ygnodeisdirtyjni);
        }
        return this.IAuthTabCallback.onNavigationEvent(jni_ygnodeisdirtyjni);
    }
}
