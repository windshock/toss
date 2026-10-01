package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGConfigNewJNI<T> extends RequestCoordinator<Unit> implements ycxExternalSyntheticLambda1 {
    private volatile boolean cancellationRequested;
    public final IAnimation<T> onExtraCallbackWithResult;
    public final ycxExternalSyntheticLambda0<? super T> onWarmupCompleted;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater onExtraCallback = AtomicLongFieldUpdater.newUpdater(jni_YGConfigNewJNI.class, "requested$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater IAuthTabCallback = AtomicReferenceFieldUpdater.newUpdater(jni_YGConfigNewJNI.class, Object.class, "producer$volatile");

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ jni_YGConfigNewJNI<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(jni_YGConfigNewJNI<T> jni_ygconfignewjni, access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
            this.this$0 = jni_ygconfignewjni;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.IAuthTabCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater ICustomTabsCallbackStub() {
        return IAuthTabCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater onUnminimized() {
        return onExtraCallback;
    }

    public static final class IAuthTabCallback implements access13800<Unit> {
        final /* synthetic */ jni_YGConfigNewJNI IAuthTabCallback;
        final /* synthetic */ CoroutineContext onExtraCallbackWithResult;

        public IAuthTabCallback(CoroutineContext coroutineContext, jni_YGConfigNewJNI jni_ygconfignewjni) {
            this.onExtraCallbackWithResult = coroutineContext;
            this.IAuthTabCallback = jni_ygconfignewjni;
        }

        @Override // o.access13800
        public CoroutineContext getContext() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.access13800
        public void resumeWith(Object obj) throws Throwable {
            setLoop.onNavigationEvent(new onExtraCallbackWithResult(this.IAuthTabCallback), this.IAuthTabCallback);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGConfigNewJNI(@NotNull IAnimation<? extends T> iAnimation, @NotNull ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, false, true);
        this.onExtraCallbackWithResult = iAnimation;
        this.onWarmupCompleted = ycxexternalsyntheticlambda0;
        this.producer$volatile = onPostMessage();
    }

    final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<access13800<? super Unit>, Object> {
        onExtraCallbackWithResult(Object obj) {
            super(1, obj, jni_YGConfigNewJNI.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Unit> access13800Var) {
            return ((jni_YGConfigNewJNI) this.receiver).IAuthTabCallback(access13800Var);
        }
    }

    private final access13800<Unit> onPostMessage() {
        return new IAuthTabCallback(getCoroutineContext(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        jni_YGConfigNewJNI<T> jni_ygconfignewjni;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(this, access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jni_ygconfignewjni = (jni_YGConfigNewJNI) onnavigationevent.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                try {
                    jni_ygconfignewjni.onWarmupCompleted.onExtraCallbackWithResult();
                } catch (Throwable th) {
                    inst.onNavigationEvent(jni_ygconfignewjni.getCoroutineContext(), th);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                if (jni_ygconfignewjni.cancellationRequested) {
                    try {
                        jni_ygconfignewjni.onWarmupCompleted.onWarmupCompleted((Throwable) th);
                    } catch (Throwable th3) {
                        setExecute.onNavigationEvent(th, th3);
                        inst.onNavigationEvent(jni_ygconfignewjni.getCoroutineContext(), th);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        ResultKt.onNavigationEvent(obj);
        try {
            onnavigationevent.L$0 = this;
            onnavigationevent.label = 1;
            if (onWarmupCompleted((access13800<? super Unit>) onnavigationevent) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            jni_ygconfignewjni = this;
            jni_ygconfignewjni.onWarmupCompleted.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            jni_ygconfignewjni = this;
            if (jni_ygconfignewjni.cancellationRequested || jni_ygconfignewjni.onExtraCallback() || th != jni_ygconfignewjni.asBinder()) {
                jni_ygconfignewjni.onWarmupCompleted.onWarmupCompleted((Throwable) th);
            }
            return Unit.INSTANCE;
        }
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        Object objCollect = this.onExtraCallbackWithResult.collect(new onWarmupCompleted(this), access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }

    static final class onWarmupCompleted<T> implements setRipple {
        final /* synthetic */ jni_YGConfigNewJNI<T> onExtraCallbackWithResult;

        onWarmupCompleted(jni_YGConfigNewJNI<T> jni_ygconfignewjni) {
            this.onExtraCallbackWithResult = jni_ygconfignewjni;
        }

        @Override // o.setRipple
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            this.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
            if (jni_YGConfigNewJNI.onUnminimized().decrementAndGet(this.onExtraCallbackWithResult) <= 0) {
                jni_YGConfigNewJNI<T> jni_ygconfignewjni = this.onExtraCallbackWithResult;
                setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
                setresourceinternal.onTransact();
                jni_YGConfigNewJNI.ICustomTabsCallbackStub().set(jni_ygconfignewjni, setresourceinternal);
                Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
                if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(access13800Var);
                }
                return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
            }
            getFullPackage.IAuthTabCallback(this.onExtraCallbackWithResult.getCoroutineContext());
            return Unit.INSTANCE;
        }
    }

    @Override // o.setFullPackage
    @Deprecated
    public /* synthetic */ void cancel() throws Throwable {
        this.cancellationRequested = true;
        onNavigationEvent((CancellationException) null);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        long j2;
        long j3;
        access13800 access13800Var;
        if (j > 0) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = onExtraCallback;
            do {
                j2 = atomicLongFieldUpdater.get(this);
                j3 = j2 + j;
                if (j3 <= 0) {
                    j3 = LongCompanionObject.MAX_VALUE;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
            if (j2 <= 0) {
                do {
                    access13800Var = (access13800) IAuthTabCallback.getAndSet(this, null);
                } while (access13800Var == null);
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
    }
}
