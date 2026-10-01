package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import o.BufferOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class CheckRequestBodyModelGroup extends CheckRequestBodyModelChannels implements BufferOutputStream {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(CheckRequestBodyModelGroup.class, Object.class, "_queue$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater IAuthTabCallback = AtomicReferenceFieldUpdater.newUpdater(CheckRequestBodyModelGroup.class, Object.class, "_delayed$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(CheckRequestBodyModelGroup.class, "_isCompleted$volatile");

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return BufferOutputStream.onNavigationEvent.onWarmupCompleted(this, j, runnable, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeTypedObject() {
        return onExtraCallback.get(this) == 1;
    }

    private final void onNavigationEvent(boolean z) {
        onExtraCallback.set(this, z ? 1 : 0);
    }

    @Override // o.CheckRequestBodyModelLocalChannel
    protected boolean onNavigationEvent() {
        if (!asInterface()) {
            return false;
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
        if (onnavigationevent != null && !onnavigationevent.onWarmupCompleted()) {
            return false;
        }
        Object obj = onNavigationEvent.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof lud2 ? ((lud2) obj).IAuthTabCallback() : obj == CheckRequestBodyModelGroupType.onExtraCallback;
    }

    @Override // o.CheckRequestBodyModelLocalChannel
    protected long IAuthTabCallback() {
        onExtraCallback onextracallbackIAuthTabCallback;
        if (super.IAuthTabCallback() == 0) {
            return 0L;
        }
        Object obj = onNavigationEvent.get(this);
        if (obj != null) {
            if (!(obj instanceof lud2)) {
                if (obj == CheckRequestBodyModelGroupType.onExtraCallback) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((lud2) obj).IAuthTabCallback()) {
                return 0L;
            }
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
        if (onnavigationevent == null || (onextracallbackIAuthTabCallback = onnavigationevent.IAuthTabCallback()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j = onextracallbackIAuthTabCallback.onWarmupCompleted;
        ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
        return RangesKt___RangesKt.coerceAtLeast(j - (resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime()), 0L);
    }

    @Override // o.CheckRequestBodyModelLocalChannel
    public void onExtraCallback() {
        isDeleteIfFail.onExtraCallbackWithResult.onExtraCallbackWithResult();
        onNavigationEvent(true);
        IAuthTabCallbackStubProxy();
        while (asBinder() <= 0) {
        }
        extraCallback();
    }

    @Override // o.BufferOutputStream
    public void onWarmupCompleted(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        long jOnWarmupCompleted = CheckRequestBodyModelGroupType.onWarmupCompleted(j);
        if (jOnWarmupCompleted < 4611686018427387903L) {
            ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
            long jOnNavigationEvent = resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime();
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(jOnWarmupCompleted + jOnNavigationEvent, mayberemoveattachstatelistener);
            IAuthTabCallback(jOnNavigationEvent, iAuthTabCallback);
            maybeAddAttachStateListener.onExtraCallbackWithResult(mayberemoveattachstatelistener, iAuthTabCallback);
        }
    }

    protected final setDeployments onExtraCallbackWithResult(long j, @NotNull Runnable runnable) {
        long jOnWarmupCompleted = CheckRequestBodyModelGroupType.onWarmupCompleted(j);
        if (jOnWarmupCompleted < 4611686018427387903L) {
            ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
            long jOnNavigationEvent = resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime();
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(jOnWarmupCompleted + jOnNavigationEvent, runnable);
            IAuthTabCallback(jOnNavigationEvent, onwarmupcompleted);
            return onwarmupcompleted;
        }
        return setStrategy.onNavigationEvent;
    }

    @Override // o.CheckRequestBodyModelLocalChannel
    public long asBinder() {
        if (IAuthTabCallbackDefault()) {
            return 0L;
        }
        getInterfaceDescriptor();
        Runnable runnableAccess000 = access000();
        if (runnableAccess000 != null) {
            runnableAccess000.run();
            return 0L;
        }
        return IAuthTabCallback();
    }

    @Override // o.GeckoHubImp
    public final void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        onExtraCallbackWithResult(runnable);
    }

    public void onExtraCallbackWithResult(@NotNull Runnable runnable) {
        getInterfaceDescriptor();
        if (IAuthTabCallback(runnable)) {
            access100();
        } else {
            GeckoHubImpa.onExtraCallback.onExtraCallbackWithResult(runnable);
        }
    }

    private final boolean IAuthTabCallback(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onNavigationEvent;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (writeTypedObject()) {
                return false;
            }
            if (obj == null) {
                if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof lud2)) {
                if (obj == CheckRequestBodyModelGroupType.onExtraCallback) {
                    return false;
                }
                lud2 lud2Var = new lud2(8, true);
                Intrinsics.checkNotNull(obj, "");
                lud2Var.onExtraCallbackWithResult((Runnable) obj);
                lud2Var.onExtraCallbackWithResult(runnable);
                if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, obj, lud2Var)) {
                    return true;
                }
            } else {
                Intrinsics.checkNotNull(obj, "");
                lud2 lud2Var2 = (lud2) obj;
                int iOnExtraCallbackWithResult = lud2Var2.onExtraCallbackWithResult(runnable);
                if (iOnExtraCallbackWithResult == 0) {
                    return true;
                }
                if (iOnExtraCallbackWithResult == 1) {
                    RequestBuilder.onWarmupCompleted(onNavigationEvent, this, obj, lud2Var2.onExtraCallbackWithResult());
                } else if (iOnExtraCallbackWithResult == 2) {
                    return false;
                }
            }
        }
    }

    private final Runnable access000() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onNavigationEvent;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof lud2)) {
                if (obj == CheckRequestBodyModelGroupType.onExtraCallback) {
                    return null;
                }
                if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, obj, (Object) null)) {
                    Intrinsics.checkNotNull(obj, "");
                    return (Runnable) obj;
                }
            } else {
                Intrinsics.checkNotNull(obj, "");
                lud2 lud2Var = (lud2) obj;
                Object objOnWarmupCompleted = lud2Var.onWarmupCompleted();
                if (objOnWarmupCompleted != lud2.onNavigationEvent) {
                    return (Runnable) objOnWarmupCompleted;
                }
                RequestBuilder.onWarmupCompleted(onNavigationEvent, this, obj, lud2Var.onExtraCallbackWithResult());
            }
        }
    }

    private final void getInterfaceDescriptor() {
        onExtraCallback onextracallbackOnExtraCallbackWithResult;
        onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
        if (onnavigationevent == null || onnavigationevent.onWarmupCompleted()) {
            return;
        }
        ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
        long jOnNavigationEvent = resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime();
        do {
            synchronized (onnavigationevent) {
                onExtraCallback onextracallbackOnExtraCallbackWithResult2 = onnavigationevent.onExtraCallbackWithResult();
                onextracallbackOnExtraCallbackWithResult = null;
                if (onextracallbackOnExtraCallbackWithResult2 != null) {
                    onExtraCallback onextracallback = onextracallbackOnExtraCallbackWithResult2;
                    if (onextracallback.onWarmupCompleted(jOnNavigationEvent) && IAuthTabCallback(onextracallback)) {
                        onextracallbackOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(0);
                    }
                }
            }
        } while (onextracallbackOnExtraCallbackWithResult != null);
    }

    private final void IAuthTabCallbackStubProxy() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onNavigationEvent;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, (Object) null, CheckRequestBodyModelGroupType.onExtraCallback)) {
                    return;
                }
            } else if (!(obj instanceof lud2)) {
                if (obj == CheckRequestBodyModelGroupType.onExtraCallback) {
                    return;
                }
                lud2 lud2Var = new lud2(8, true);
                Intrinsics.checkNotNull(obj, "");
                lud2Var.onExtraCallbackWithResult((Runnable) obj);
                if (RequestBuilder.onWarmupCompleted(onNavigationEvent, this, obj, lud2Var)) {
                    return;
                }
            } else {
                ((lud2) obj).onExtraCallback();
                return;
            }
        }
    }

    public final void IAuthTabCallback(long j, @NotNull onExtraCallback onextracallback) {
        int iOnWarmupCompleted = onWarmupCompleted(j, onextracallback);
        if (iOnWarmupCompleted == 0) {
            if (onNavigationEvent(onextracallback)) {
                access100();
            }
        } else if (iOnWarmupCompleted == 1) {
            onExtraCallbackWithResult(j, onextracallback);
        } else if (iOnWarmupCompleted != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    private final boolean onNavigationEvent(onExtraCallback onextracallback) {
        onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
        return (onnavigationevent != null ? onnavigationevent.IAuthTabCallback() : null) == onextracallback;
    }

    private final int onWarmupCompleted(long j, onExtraCallback onextracallback) {
        if (writeTypedObject()) {
            return 1;
        }
        onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
        if (onnavigationevent == null) {
            RequestBuilder.onWarmupCompleted(IAuthTabCallback, this, (Object) null, new onNavigationEvent(j));
            Object obj = IAuthTabCallback.get(this);
            Intrinsics.checkNotNull(obj);
            onnavigationevent = (onNavigationEvent) obj;
        }
        return onextracallback.onNavigationEvent(j, onnavigationevent, this);
    }

    protected final void IAuthTabCallbackStub() {
        onNavigationEvent.set(this, null);
        IAuthTabCallback.set(this, null);
    }

    private final void extraCallback() {
        onExtraCallback onExtraCallback2;
        ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
        long jOnNavigationEvent = resourceDecoderRegistryEntry != null ? resourceDecoderRegistryEntry.onNavigationEvent() : System.nanoTime();
        while (true) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) IAuthTabCallback.get(this);
            if (onnavigationevent == null || (onExtraCallback2 = onnavigationevent.onExtraCallback()) == null) {
                return;
            } else {
                onExtraCallbackWithResult(jOnNavigationEvent, onExtraCallback2);
            }
        }
    }

    public static abstract class onExtraCallback implements Runnable, Comparable<onExtraCallback>, setDeployments, setIndicatorHeight {
        private volatile Object _heap;
        private int onExtraCallback = -1;
        public long onWarmupCompleted;

        public onExtraCallback(long j) {
            this.onWarmupCompleted = j;
        }

        @Override // o.setIndicatorHeight
        public setIndicatorX<?> onExtraCallback() {
            Object obj = this._heap;
            if (obj instanceof setIndicatorX) {
                return (setIndicatorX) obj;
            }
            return null;
        }

        @Override // o.setIndicatorHeight
        public void onNavigationEvent(@Nullable setIndicatorX<?> setindicatorx) {
            if (this._heap == CheckRequestBodyModelGroupType.onWarmupCompleted) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = setindicatorx;
        }

        @Override // o.setIndicatorHeight
        public int IAuthTabCallback() {
            return this.onExtraCallback;
        }

        @Override // o.setIndicatorHeight
        public void onExtraCallbackWithResult(int i) {
            this.onExtraCallback = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull onExtraCallback onextracallback) {
            long j = this.onWarmupCompleted - onextracallback.onWarmupCompleted;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean onWarmupCompleted(long j) {
            return j - this.onWarmupCompleted >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.onWarmupCompleted + ']';
        }

        public final int onNavigationEvent(long j, @NotNull onNavigationEvent onnavigationevent, @NotNull CheckRequestBodyModelGroup checkRequestBodyModelGroup) {
            synchronized (this) {
                if (this._heap == CheckRequestBodyModelGroupType.onWarmupCompleted) {
                    return 2;
                }
                synchronized (onnavigationevent) {
                    onExtraCallback onextracallbackOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                    if (checkRequestBodyModelGroup.writeTypedObject()) {
                        return 1;
                    }
                    if (onextracallbackOnExtraCallbackWithResult == null) {
                        onnavigationevent.onNavigationEvent = j;
                    } else {
                        long j2 = onextracallbackOnExtraCallbackWithResult.onWarmupCompleted;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - onnavigationevent.onNavigationEvent > 0) {
                            onnavigationevent.onNavigationEvent = j;
                        }
                    }
                    long j3 = this.onWarmupCompleted;
                    long j4 = onnavigationevent.onNavigationEvent;
                    if (j3 - j4 < 0) {
                        this.onWarmupCompleted = j4;
                    }
                    onnavigationevent.onExtraCallback((onNavigationEvent) this);
                    return 0;
                }
            }
        }

        @Override // o.setDeployments
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == CheckRequestBodyModelGroupType.onWarmupCompleted) {
                    return;
                }
                onNavigationEvent onnavigationevent = obj instanceof onNavigationEvent ? (onNavigationEvent) obj : null;
                if (onnavigationevent != null) {
                    onnavigationevent.onNavigationEvent((onNavigationEvent) this);
                }
                this._heap = CheckRequestBodyModelGroupType.onWarmupCompleted;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    final class IAuthTabCallback extends onExtraCallback {
        private final maybeRemoveAttachStateListener<Unit> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public IAuthTabCallback(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
            super(j);
            this.onExtraCallback = mayberemoveattachstatelistener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onExtraCallback.onNavigationEvent(CheckRequestBodyModelGroup.this, Unit.INSTANCE);
        }

        @Override // o.CheckRequestBodyModelGroup.onExtraCallback
        public String toString() {
            return super.toString() + this.onExtraCallback;
        }
    }

    static final class onWarmupCompleted extends onExtraCallback {
        private final Runnable onNavigationEvent;

        public onWarmupCompleted(long j, @NotNull Runnable runnable) {
            super(j);
            this.onNavigationEvent = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onNavigationEvent.run();
        }

        @Override // o.CheckRequestBodyModelGroup.onExtraCallback
        public String toString() {
            return super.toString() + this.onNavigationEvent;
        }
    }

    public static final class onNavigationEvent extends setIndicatorX<onExtraCallback> {
        public long onNavigationEvent;

        public onNavigationEvent(long j) {
            this.onNavigationEvent = j;
        }
    }
}
