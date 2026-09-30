package o;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeSetAlwaysFormsContainingBlockJNI {
    private final AtomicReferenceArray<jni_YGNodeIsDirtyJNI> IAuthTabCallback = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeSetAlwaysFormsContainingBlockJNI.class, Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(jni_YGNodeSetAlwaysFormsContainingBlockJNI.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onWarmupCompleted = AtomicIntegerFieldUpdater.newUpdater(jni_YGNodeSetAlwaysFormsContainingBlockJNI.class, "consumerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallbackWithResult = AtomicIntegerFieldUpdater.newUpdater(jni_YGNodeSetAlwaysFormsContainingBlockJNI.class, "blockingTasksInBuffer$volatile");

    private final int onExtraCallbackWithResult() {
        return onExtraCallback.get(this) - onWarmupCompleted.get(this);
    }

    public final int onNavigationEvent() {
        return onNavigationEvent.get(this) != null ? onExtraCallbackWithResult() + 1 : onExtraCallbackWithResult();
    }

    public final jni_YGNodeIsDirtyJNI onWarmupCompleted() {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni = (jni_YGNodeIsDirtyJNI) onNavigationEvent.getAndSet(this, null);
        return jni_ygnodeisdirtyjni == null ? asBinder() : jni_ygnodeisdirtyjni;
    }

    public final jni_YGNodeIsDirtyJNI onExtraCallback(@NotNull jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni, boolean z) {
        if (z) {
            return onNavigationEvent(jni_ygnodeisdirtyjni);
        }
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni2 = (jni_YGNodeIsDirtyJNI) onNavigationEvent.getAndSet(this, jni_ygnodeisdirtyjni);
        if (jni_ygnodeisdirtyjni2 == null) {
            return null;
        }
        return onNavigationEvent(jni_ygnodeisdirtyjni2);
    }

    private final jni_YGNodeIsDirtyJNI onNavigationEvent(jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni) {
        if (onExtraCallbackWithResult() == 127) {
            return jni_ygnodeisdirtyjni;
        }
        if (jni_ygnodeisdirtyjni.onTransact) {
            onExtraCallbackWithResult.incrementAndGet(this);
        }
        int i = onExtraCallback.get(this) & 127;
        while (this.IAuthTabCallback.get(i) != null) {
            Thread.yield();
        }
        this.IAuthTabCallback.lazySet(i, jni_ygnodeisdirtyjni);
        onExtraCallback.incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long onWarmupCompleted(int i, @NotNull Ref.ObjectRef<jni_YGNodeIsDirtyJNI> objectRef) {
        T tOnExtraCallbackWithResult;
        if (i == 3) {
            tOnExtraCallbackWithResult = asBinder();
        } else {
            tOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        }
        if (tOnExtraCallbackWithResult != 0) {
            objectRef.element = tOnExtraCallbackWithResult;
            return -1L;
        }
        return onExtraCallback(i, objectRef);
    }

    private final jni_YGNodeIsDirtyJNI onExtraCallbackWithResult(int i) {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallback;
        int i2 = onWarmupCompleted.get(this);
        int i3 = onExtraCallback.get(this);
        boolean z = i == 1;
        while (true) {
            jni_ygnodeisdirtyjniIAuthTabCallback = null;
            if (i2 == i3) {
                break;
            }
            if (!z || onExtraCallbackWithResult.get(this) != 0) {
                jni_ygnodeisdirtyjniIAuthTabCallback = IAuthTabCallback(i2, z);
                if (jni_ygnodeisdirtyjniIAuthTabCallback != null) {
                    break;
                }
                i2++;
            } else {
                return null;
            }
        }
        return jni_ygnodeisdirtyjniIAuthTabCallback;
    }

    public final jni_YGNodeIsDirtyJNI IAuthTabCallback() {
        return onExtraCallbackWithResult(true);
    }

    private final jni_YGNodeIsDirtyJNI onExtraCallbackWithResult(boolean z) {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni;
        do {
            jni_ygnodeisdirtyjni = (jni_YGNodeIsDirtyJNI) onNavigationEvent.get(this);
            if (jni_ygnodeisdirtyjni == null || jni_ygnodeisdirtyjni.onTransact != z) {
                int i = onWarmupCompleted.get(this);
                int i2 = onExtraCallback.get(this);
                while (i != i2) {
                    if (z && onExtraCallbackWithResult.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniIAuthTabCallback = IAuthTabCallback(i2, z);
                    if (jni_ygnodeisdirtyjniIAuthTabCallback != null) {
                        return jni_ygnodeisdirtyjniIAuthTabCallback;
                    }
                }
                return null;
            }
        } while (!RequestBuilder.onWarmupCompleted(onNavigationEvent, this, jni_ygnodeisdirtyjni, (Object) null));
        return jni_ygnodeisdirtyjni;
    }

    private final jni_YGNodeIsDirtyJNI IAuthTabCallback(int i, boolean z) {
        int i2 = i & 127;
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni = this.IAuthTabCallback.get(i2);
        if (jni_ygnodeisdirtyjni == null || jni_ygnodeisdirtyjni.onTransact != z || !Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(this.IAuthTabCallback, i2, jni_ygnodeisdirtyjni, (Object) null)) {
            return null;
        }
        if (z) {
            onExtraCallbackWithResult.decrementAndGet(this);
        }
        return jni_ygnodeisdirtyjni;
    }

    public final void onWarmupCompleted(@NotNull jni_YGNodeCalculateLayoutJNI jni_ygnodecalculatelayoutjni) {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni = (jni_YGNodeIsDirtyJNI) onNavigationEvent.getAndSet(this, null);
        if (jni_ygnodeisdirtyjni != null) {
            jni_ygnodecalculatelayoutjni.onNavigationEvent(jni_ygnodeisdirtyjni);
        }
        while (onExtraCallback(jni_ygnodecalculatelayoutjni)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, o.jni_YGNodeIsDirtyJNI] */
    private final long onExtraCallback(int i, Ref.ObjectRef<jni_YGNodeIsDirtyJNI> objectRef) {
        ?? r0;
        do {
            r0 = (jni_YGNodeIsDirtyJNI) onNavigationEvent.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.onTransact ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long jIAuthTabCallback = jni_YGNodeRemoveAllChildrenJNI.onTransact.IAuthTabCallback() - r0.asInterface;
            long j = jni_YGNodeRemoveAllChildrenJNI.onNavigationEvent;
            if (jIAuthTabCallback < j) {
                return j - jIAuthTabCallback;
            }
        } while (!RequestBuilder.onWarmupCompleted(onNavigationEvent, this, (Object) r0, (Object) null));
        objectRef.element = r0;
        return -1L;
    }

    private final boolean onExtraCallback(jni_YGNodeCalculateLayoutJNI jni_ygnodecalculatelayoutjni) {
        jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjniAsBinder = asBinder();
        if (jni_ygnodeisdirtyjniAsBinder == null) {
            return false;
        }
        jni_ygnodecalculatelayoutjni.onNavigationEvent(jni_ygnodeisdirtyjniAsBinder);
        return true;
    }

    private final jni_YGNodeIsDirtyJNI asBinder() {
        jni_YGNodeIsDirtyJNI andSet;
        while (true) {
            int i = onWarmupCompleted.get(this);
            if (i - onExtraCallback.get(this) == 0) {
                return null;
            }
            if (onWarmupCompleted.compareAndSet(this, i, i + 1) && (andSet = this.IAuthTabCallback.getAndSet(i & 127, null)) != null) {
                onExtraCallbackWithResult(andSet);
                return andSet;
            }
        }
    }

    private final void onExtraCallbackWithResult(jni_YGNodeIsDirtyJNI jni_ygnodeisdirtyjni) {
        if (jni_ygnodeisdirtyjni == null || !jni_ygnodeisdirtyjni.onTransact) {
            return;
        }
        onExtraCallbackWithResult.decrementAndGet(this);
    }
}
