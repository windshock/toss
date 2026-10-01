package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import o.jni_YGNodeStyleGetBorderJNI;
import o.jni_YGNodeStyleGetFlexJNI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class jni_YGNodeStyleGetFlexJNI extends jni_YGNodeStyleGetJustifyContentJNI implements jni_YGNodeStyleGetFlexBasisJNI {
    private static final /* synthetic */ AtomicReferenceFieldUpdater onWarmupCompleted = AtomicReferenceFieldUpdater.newUpdater(jni_YGNodeStyleGetFlexJNI.class, Object.class, "owner$volatile");
    private final getBacktraceNote<jni_YGNodeStyleGetBorderJNI<?>, Object, Object, getBacktraceNote<Throwable, Object, CoroutineContext, Unit>> onNavigationEvent;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater onTransact() {
        return onWarmupCompleted;
    }

    @Override // o.jni_YGNodeStyleGetFlexBasisJNI
    public Object IAuthTabCallback(@Nullable Object obj, @NotNull access13800<? super Unit> access13800Var) {
        return onNavigationEvent(this, obj, access13800Var);
    }

    public jni_YGNodeStyleGetFlexJNI(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback;
        this.onNavigationEvent = new getBacktraceNote() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda1
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return jni_YGNodeStyleGetFlexJNI.onNavigationEvent(this.f$0, (jni_YGNodeStyleGetBorderJNI) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        jni_ygnodestylegetflexjni.onWarmupCompleted(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getBacktraceNote onNavigationEvent(final jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni, jni_YGNodeStyleGetBorderJNI jni_ygnodestylegetborderjni, final Object obj, Object obj2) {
        return new getBacktraceNote() { // from class: kotlinx.coroutines.sync.MutexImpl$$ExternalSyntheticLambda0
            @Override // o.getBacktraceNote
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return jni_YGNodeStyleGetFlexJNI.IAuthTabCallback(this.f$0, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    @Override // o.jni_YGNodeStyleGetFlexBasisJNI
    public boolean onExtraCallbackWithResult() {
        return IAuthTabCallback() == 0;
    }

    private final int onExtraCallback(Object obj) {
        while (onExtraCallbackWithResult()) {
            Object obj2 = onWarmupCompleted.get(this);
            if (obj2 != jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object onNavigationEvent(jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni, Object obj, access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult;
        return (!jni_ygnodestylegetflexjni.IAuthTabCallback(obj) && (objOnExtraCallbackWithResult = jni_ygnodestylegetflexjni.onExtraCallbackWithResult(obj, access13800Var)) == access14100.onExtraCallback()) ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    @Override // o.jni_YGNodeStyleGetFlexBasisJNI
    public boolean IAuthTabCallback(@Nullable Object obj) {
        int iOnNavigationEvent = onNavigationEvent(obj);
        if (iOnNavigationEvent == 0) {
            return true;
        }
        if (iOnNavigationEvent == 1) {
            return false;
        }
        if (iOnNavigationEvent == 2) {
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        throw new IllegalStateException("unexpected");
    }

    private final int onNavigationEvent(Object obj) {
        while (!onWarmupCompleted()) {
            if (obj == null) {
                return 1;
            }
            int iOnExtraCallback = onExtraCallback(obj);
            if (iOnExtraCallback == 1) {
                return 2;
            }
            if (iOnExtraCallback == 2) {
                return 1;
            }
        }
        onWarmupCompleted.set(this, obj);
        return 0;
    }

    @Override // o.jni_YGNodeStyleGetFlexBasisJNI
    public void onWarmupCompleted(@Nullable Object obj) {
        while (onExtraCallbackWithResult()) {
            Object obj2 = onWarmupCompleted.get(this);
            if (obj2 != jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback) {
                if (obj2 == obj || obj == null) {
                    if (RequestBuilder.onWarmupCompleted(onWarmupCompleted, this, obj2, jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback)) {
                        onExtraCallback();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final class onWarmupCompleted implements maybeRemoveAttachStateListener<Unit>, syncDoGet {
        public final setResourceInternal<Unit> onExtraCallbackWithResult;
        public final Object onNavigationEvent;

        @Override // o.maybeRemoveAttachStateListener
        public void IAuthTabCallback(@NotNull Function1<? super Throwable, Unit> function1) {
            this.onExtraCallbackWithResult.IAuthTabCallback(function1);
        }

        @Override // o.syncDoGet
        public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
            this.onExtraCallbackWithResult.IAuthTabCallback(ycx5Var, i);
        }

        @Override // o.maybeRemoveAttachStateListener
        public boolean IAuthTabCallback() {
            return this.onExtraCallbackWithResult.IAuthTabCallback();
        }

        @Override // o.access13800
        public CoroutineContext getContext() {
            return this.onExtraCallbackWithResult.getContext();
        }

        @Override // o.maybeRemoveAttachStateListener
        public void onExtraCallback(@NotNull Object obj) {
            this.onExtraCallbackWithResult.onExtraCallback(obj);
        }

        @Override // o.maybeRemoveAttachStateListener
        @Deprecated
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void IAuthTabCallback(@NotNull Unit unit, @Nullable Function1<? super Throwable, Unit> function1) {
            this.onExtraCallbackWithResult.IAuthTabCallback((setResourceInternal<Unit>) unit, function1);
        }

        @Override // o.maybeRemoveAttachStateListener
        public boolean onExtraCallback(@Nullable Throwable th) {
            return this.onExtraCallbackWithResult.onExtraCallback(th);
        }

        @Override // o.maybeRemoveAttachStateListener
        public Object onNavigationEvent(@NotNull Throwable th) {
            return this.onExtraCallbackWithResult.onNavigationEvent(th);
        }

        @Override // o.maybeRemoveAttachStateListener
        public boolean onNavigationEvent() {
            return this.onExtraCallbackWithResult.onNavigationEvent();
        }

        @Override // o.maybeRemoveAttachStateListener
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull GeckoHubImp geckoHubImp, @NotNull Unit unit) {
            this.onExtraCallbackWithResult.onNavigationEvent(geckoHubImp, unit);
        }

        @Override // o.maybeRemoveAttachStateListener
        public boolean onWarmupCompleted() {
            return this.onExtraCallbackWithResult.onWarmupCompleted();
        }

        @Override // o.access13800
        public void resumeWith(@NotNull Object obj) {
            this.onExtraCallbackWithResult.resumeWith(obj);
        }

        @Override // o.maybeRemoveAttachStateListener
        public /* synthetic */ void IAuthTabCallback(Object obj, getBacktraceNote getbacktracenote) {
            onNavigationEvent((onWarmupCompleted) obj, (getBacktraceNote<? super Throwable, ? super onWarmupCompleted, ? super CoroutineContext, Unit>) getbacktracenote);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(@NotNull setResourceInternal<? super Unit> setresourceinternal, @Nullable Object obj) {
            this.onExtraCallbackWithResult = setresourceinternal;
            this.onNavigationEvent = obj;
        }

        @Override // o.maybeRemoveAttachStateListener
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public <R extends Unit> Object onWarmupCompleted(@NotNull R r, @Nullable Object obj, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
            final jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni = jni_YGNodeStyleGetFlexJNI.this;
            Object objOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(r, obj, new getBacktraceNote() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda0
                @Override // o.getBacktraceNote
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return jni_YGNodeStyleGetFlexJNI.onWarmupCompleted.onNavigationEvent(jni_ygnodestylegetflexjni, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                }
            });
            if (objOnWarmupCompleted != null) {
                jni_YGNodeStyleGetFlexJNI.onTransact().set(jni_YGNodeStyleGetFlexJNI.this, this.onNavigationEvent);
            }
            return objOnWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni, onWarmupCompleted onwarmupcompleted, Throwable th, Unit unit, CoroutineContext coroutineContext) {
            jni_YGNodeStyleGetFlexJNI.onTransact().set(jni_ygnodestylegetflexjni, onwarmupcompleted.onNavigationEvent);
            jni_ygnodestylegetflexjni.onWarmupCompleted(onwarmupcompleted.onNavigationEvent);
            return Unit.INSTANCE;
        }

        public <R extends Unit> void onNavigationEvent(@NotNull R r, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote) {
            jni_YGNodeStyleGetFlexJNI.onTransact().set(jni_YGNodeStyleGetFlexJNI.this, this.onNavigationEvent);
            setResourceInternal<Unit> setresourceinternal = this.onExtraCallbackWithResult;
            final jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni = jni_YGNodeStyleGetFlexJNI.this;
            setresourceinternal.IAuthTabCallback((setResourceInternal<Unit>) r, new Function1() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return jni_YGNodeStyleGetFlexJNI.onWarmupCompleted.IAuthTabCallback(jni_ygnodestylegetflexjni, this, (Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(jni_YGNodeStyleGetFlexJNI jni_ygnodestylegetflexjni, onWarmupCompleted onwarmupcompleted, Throwable th) {
            jni_ygnodestylegetflexjni.onWarmupCompleted(onwarmupcompleted.onNavigationEvent);
            return Unit.INSTANCE;
        }
    }

    public String toString() {
        return "Mutex@" + getResCount.onExtraCallbackWithResult(this) + "[isLocked=" + onExtraCallbackWithResult() + ",owner=" + onWarmupCompleted.get(this) + ']';
    }

    private final Object onExtraCallbackWithResult(Object obj, access13800<? super Unit> access13800Var) {
        setResourceInternal setresourceinternalOnWarmupCompleted = maybeAddAttachStateListener.onWarmupCompleted(access14200.onExtraCallbackWithResult(access13800Var));
        try {
            onExtraCallbackWithResult((maybeRemoveAttachStateListener<? super Unit>) new onWarmupCompleted(setresourceinternalOnWarmupCompleted, obj));
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
}
