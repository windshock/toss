package o;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleGetJustifyContentJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jni_YGNodeStyleGetJustifyContentJNI {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private final getBacktraceNote<Throwable, Unit, CoroutineContext, Unit> asInterface;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final int onTransact;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeStyleGetJustifyContentJNI.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater IAuthTabCallback = AtomicLongFieldUpdater.newUpdater(jni_YGNodeStyleGetJustifyContentJNI.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeStyleGetJustifyContentJNI.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater onExtraCallbackWithResult = AtomicLongFieldUpdater.newUpdater(jni_YGNodeStyleGetJustifyContentJNI.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(jni_YGNodeStyleGetJustifyContentJNI.class, "_availablePermits$volatile");

    public jni_YGNodeStyleGetJustifyContentJNI(int i, int i2) {
        this.onTransact = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni = new jni_YGNodeStyleGetFlexWrapJNI(0L, null, 2);
        this.head$volatile = jni_ygnodestylegetflexwrapjni;
        this.tail$volatile = jni_ygnodestylegetflexwrapjni;
        this._availablePermits$volatile = i - i2;
        this.asInterface = new getBacktraceNote() { // from class: kotlinx.coroutines.sync.SemaphoreAndMutexImpl$$ExternalSyntheticLambda0
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return jni_YGNodeStyleGetJustifyContentJNI.onWarmupCompleted(this.f$0, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    public final int IAuthTabCallback() {
        return Math.max(onExtraCallback.get(this), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(jni_YGNodeStyleGetJustifyContentJNI jni_ygnodestylegetjustifycontentjni, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        jni_ygnodestylegetjustifycontentjni.onExtraCallback();
        return Unit.INSTANCE;
    }

    public final boolean onWarmupCompleted() {
        while (true) {
            int i = onExtraCallback.get(this);
            if (i > this.onTransact) {
                onExtraCallbackWithResult();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (onExtraCallback.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        if (onNavigationEvent() > 0) {
            return Unit.INSTANCE;
        }
        Object objOnNavigationEvent = onNavigationEvent(access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }

    private final int onNavigationEvent() {
        int andDecrement;
        do {
            andDecrement = onExtraCallback.getAndDecrement(this);
        } while (andDecrement > this.onTransact);
        return andDecrement;
    }

    public final void onExtraCallback() {
        do {
            int andIncrement = onExtraCallback.getAndIncrement(this);
            if (andIncrement >= this.onTransact) {
                onExtraCallbackWithResult();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.onTransact).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!access100());
    }

    private final void onExtraCallbackWithResult() {
        int i;
        do {
            i = onExtraCallback.get(this);
            if (i <= this.onTransact) {
                return;
            }
        } while (!onExtraCallback.compareAndSet(this, i, this.onTransact));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onNavigationEvent(syncDoGet syncdoget) {
        Object objOnWarmupCompleted;
        jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni = (jni_YGNodeStyleGetFlexWrapJNI) onWarmupCompleted.get(this);
        long andIncrement = onExtraCallbackWithResult.getAndIncrement(this);
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.onExtraCallbackWithResult;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onWarmupCompleted;
        long j = andIncrement / jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback;
        loop0: while (true) {
            objOnWarmupCompleted = getLargestMainSize.onWarmupCompleted(jni_ygnodestylegetflexwrapjni, j, iAuthTabCallback);
            if (djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
                break;
            }
            ycx5 ycx5VarOnNavigationEvent = djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
            while (true) {
                ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdater.get(this);
                if (ycx5Var.onExtraCallback >= ycx5VarOnNavigationEvent.onExtraCallback) {
                    break loop0;
                }
                if (ycx5VarOnNavigationEvent.IAuthTabCallback_Parcel()) {
                    if (RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, ycx5Var, ycx5VarOnNavigationEvent)) {
                        if (ycx5Var.IAuthTabCallbackDefault()) {
                            ycx5Var.IAuthTabCallbackStub();
                        }
                    } else if (ycx5VarOnNavigationEvent.IAuthTabCallbackDefault()) {
                        ycx5VarOnNavigationEvent.IAuthTabCallbackStub();
                    }
                }
            }
        }
        jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni2 = (jni_YGNodeStyleGetFlexWrapJNI) djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
        int i = (int) (andIncrement % jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback);
        if (!Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(jni_ygnodestylegetflexwrapjni2.onExtraCallback(), i, (Object) null, syncdoget)) {
            if (!Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(jni_ygnodestylegetflexwrapjni2.onExtraCallback(), i, jni_YGNodeStyleGetFlexShrinkJNI.onNavigationEvent, jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallbackStub)) {
                return false;
            }
            if (syncdoget instanceof maybeRemoveAttachStateListener) {
                Intrinsics.checkNotNull(syncdoget, "");
                ((maybeRemoveAttachStateListener) syncdoget).IAuthTabCallback((maybeRemoveAttachStateListener) Unit.INSTANCE, (getBacktraceNote<? super Throwable, ? super maybeRemoveAttachStateListener, ? super CoroutineContext, Unit>) this.asInterface);
            } else if (syncdoget instanceof jni_YGNodeStyleGetBorderJNI) {
                ((jni_YGNodeStyleGetBorderJNI) syncdoget).onExtraCallback(Unit.INSTANCE);
            } else {
                throw new IllegalStateException(("unexpected: " + syncdoget).toString());
            }
            return true;
        }
        syncdoget.IAuthTabCallback(jni_ygnodestylegetflexwrapjni2, i);
        return true;
    }

    final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function2<Long, jni_YGNodeStyleGetFlexWrapJNI, jni_YGNodeStyleGetFlexWrapJNI> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2, jni_YGNodeStyleGetFlexShrinkJNI.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ jni_YGNodeStyleGetFlexWrapJNI invoke(Long l, jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni) {
            return onExtraCallbackWithResult(l.longValue(), jni_ygnodestylegetflexwrapjni);
        }

        public final jni_YGNodeStyleGetFlexWrapJNI onExtraCallbackWithResult(long j, jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni) {
            return jni_YGNodeStyleGetFlexShrinkJNI.onNavigationEvent(j, jni_ygnodestylegetflexwrapjni);
        }
    }

    private final boolean access100() {
        Object objOnWarmupCompleted;
        jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni = (jni_YGNodeStyleGetFlexWrapJNI) onNavigationEvent.get(this);
        long andIncrement = IAuthTabCallback.getAndIncrement(this);
        long j = andIncrement / jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback;
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onExtraCallback;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = onNavigationEvent;
        loop0: while (true) {
            objOnWarmupCompleted = getLargestMainSize.onWarmupCompleted(jni_ygnodestylegetflexwrapjni, j, onextracallbackwithresult);
            if (djExternalSyntheticApiModelOutline1.onWarmupCompleted(objOnWarmupCompleted)) {
                break;
            }
            ycx5 ycx5VarOnNavigationEvent = djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
            while (true) {
                ycx5 ycx5Var = (ycx5) atomicReferenceFieldUpdater.get(this);
                if (ycx5Var.onExtraCallback >= ycx5VarOnNavigationEvent.onExtraCallback) {
                    break loop0;
                }
                if (ycx5VarOnNavigationEvent.IAuthTabCallback_Parcel()) {
                    if (RequestBuilder.onWarmupCompleted(atomicReferenceFieldUpdater, this, ycx5Var, ycx5VarOnNavigationEvent)) {
                        if (ycx5Var.IAuthTabCallbackDefault()) {
                            ycx5Var.IAuthTabCallbackStub();
                        }
                    } else if (ycx5VarOnNavigationEvent.IAuthTabCallbackDefault()) {
                        ycx5VarOnNavigationEvent.IAuthTabCallbackStub();
                    }
                }
            }
        }
        jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni2 = (jni_YGNodeStyleGetFlexWrapJNI) djExternalSyntheticApiModelOutline1.onNavigationEvent(objOnWarmupCompleted);
        jni_ygnodestylegetflexwrapjni2.onWarmupCompleted();
        if (jni_ygnodestylegetflexwrapjni2.onExtraCallback > j) {
            return false;
        }
        int i = (int) (andIncrement % jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallback);
        Object andSet = jni_ygnodestylegetflexwrapjni2.onExtraCallback().getAndSet(i, jni_YGNodeStyleGetFlexShrinkJNI.onNavigationEvent);
        if (andSet == null) {
            int i2 = jni_YGNodeStyleGetFlexShrinkJNI.onWarmupCompleted;
            for (int i3 = 0; i3 < i2; i3++) {
                if (jni_ygnodestylegetflexwrapjni2.onExtraCallback().get(i) == jni_YGNodeStyleGetFlexShrinkJNI.IAuthTabCallbackStub) {
                    return true;
                }
            }
            return !Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(jni_ygnodestylegetflexwrapjni2.onExtraCallback(), i, jni_YGNodeStyleGetFlexShrinkJNI.onNavigationEvent, jni_YGNodeStyleGetFlexShrinkJNI.onExtraCallback);
        }
        if (andSet == jni_YGNodeStyleGetFlexShrinkJNI.onExtraCallbackWithResult) {
            return false;
        }
        return onExtraCallbackWithResult(andSet);
    }

    final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function2<Long, jni_YGNodeStyleGetFlexWrapJNI, jni_YGNodeStyleGetFlexWrapJNI> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(2, jni_YGNodeStyleGetFlexShrinkJNI.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ jni_YGNodeStyleGetFlexWrapJNI invoke(Long l, jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni) {
            return onWarmupCompleted(l.longValue(), jni_ygnodestylegetflexwrapjni);
        }

        public final jni_YGNodeStyleGetFlexWrapJNI onWarmupCompleted(long j, jni_YGNodeStyleGetFlexWrapJNI jni_ygnodestylegetflexwrapjni) {
            return jni_YGNodeStyleGetFlexShrinkJNI.onNavigationEvent(j, jni_ygnodestylegetflexwrapjni);
        }
    }

    private final boolean onExtraCallbackWithResult(Object obj) {
        if (obj instanceof maybeRemoveAttachStateListener) {
            Intrinsics.checkNotNull(obj, "");
            maybeRemoveAttachStateListener mayberemoveattachstatelistener = (maybeRemoveAttachStateListener) obj;
            Object objOnWarmupCompleted = mayberemoveattachstatelistener.onWarmupCompleted(Unit.INSTANCE, null, this.asInterface);
            if (objOnWarmupCompleted == null) {
                return false;
            }
            mayberemoveattachstatelistener.onExtraCallback(objOnWarmupCompleted);
            return true;
        }
        if (obj instanceof jni_YGNodeStyleGetBorderJNI) {
            return ((jni_YGNodeStyleGetBorderJNI) obj).onExtraCallbackWithResult(this, Unit.INSTANCE);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(access13800Var));
        try {
            if (!onNavigationEvent((syncDoGet) setresourceinternalOnWarmupCompleted)) {
                onExtraCallbackWithResult((maybeRemoveAttachStateListener<? super Unit>) setresourceinternalOnWarmupCompleted);
            }
            Object objIAuthTabCallbackDefault = setresourceinternalOnWarmupCompleted.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
        } catch (Throwable th) {
            setresourceinternalOnWarmupCompleted.IAuthTabCallbackStub();
            throw th;
        }
    }

    protected final void onExtraCallbackWithResult(@NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        while (onNavigationEvent() <= 0) {
            Intrinsics.checkNotNull(mayberemoveattachstatelistener, "");
            if (onNavigationEvent((syncDoGet) mayberemoveattachstatelistener)) {
                return;
            }
        }
        mayberemoveattachstatelistener.IAuthTabCallback((maybeRemoveAttachStateListener<? super Unit>) Unit.INSTANCE, this.asInterface);
    }
}
