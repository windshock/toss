package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.jni_YGNodeStyleGetFlexBasisJNI;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGConfigSetLoggerJNI<T> extends RequestCoordinator<Unit> implements ok<T>, ycxExternalSyntheticLambda1 {
    private static final /* synthetic */ AtomicLongFieldUpdater onExtraCallbackWithResult = AtomicLongFieldUpdater.newUpdater(jni_YGConfigSetLoggerJNI.class, "_nRequested$volatile");
    private final ycxExternalSyntheticLambda0<T> IAuthTabCallback;
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;
    private final jni_YGNodeStyleGetFlexBasisJNI onExtraCallback;
    private final Function2<Throwable, CoroutineContext, Unit> onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ jni_YGConfigSetLoggerJNI<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(jni_YGConfigSetLoggerJNI<? super T> jni_ygconfigsetloggerjni, access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
            this.this$0 = jni_ygconfigsetloggerjni;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return this.this$0.onExtraCallback((jni_YGConfigSetLoggerJNI<T>) null, (access13800<? super Unit>) this);
        }
    }

    public lt<T> onActivityLayout() {
        return this;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Function1 function1) {
        onWarmupCompleted((Function1<? super Throwable, Unit>) function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGConfigSetLoggerJNI(@NotNull CoroutineContext coroutineContext, @NotNull ycxExternalSyntheticLambda0<T> ycxexternalsyntheticlambda0, @NotNull Function2<? super Throwable, ? super CoroutineContext, Unit> function2) {
        super(coroutineContext, false, true);
        this.IAuthTabCallback = ycxexternalsyntheticlambda0;
        this.onWarmupCompleted = function2;
        this.onExtraCallback = jni_YGNodeStyleGetFlexGrowJNI.onNavigationEvent(true);
    }

    public boolean IAuthTabCallback() {
        return !onExtraCallback();
    }

    public boolean onExtraCallback(@Nullable Throwable th) {
        return onWarmupCompleted(th);
    }

    public Void onWarmupCompleted(@NotNull Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    public Object IAuthTabCallback(T t) {
        if (!jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.onExtraCallback, (Object) null, 1, (Object) null)) {
            return lud.Companion.onExtraCallbackWithResult();
        }
        Throwable thIAuthTabCallbackDefault = IAuthTabCallbackDefault(t);
        if (thIAuthTabCallbackDefault == null) {
            return lud.Companion.onNavigationEvent(Unit.INSTANCE);
        }
        return lud.Companion.onExtraCallback(thIAuthTabCallbackDefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(T t, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        jni_YGConfigSetLoggerJNI<T> jni_ygconfigsetloggerjni;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                onwarmupcompleted.label = i + PKIFailureInfo.systemUnavail;
            } else {
                onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni = this.onExtraCallback;
            onwarmupcompleted.L$0 = this;
            onwarmupcompleted.L$1 = t;
            onwarmupcompleted.label = 1;
            if (jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(jni_ygnodestylegetflexbasisjni, (Object) null, onwarmupcompleted, 1, (Object) null) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            jni_ygconfigsetloggerjni = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t = (T) onwarmupcompleted.L$1;
            jni_ygconfigsetloggerjni = (jni_YGConfigSetLoggerJNI) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Throwable thIAuthTabCallbackDefault = jni_ygconfigsetloggerjni.IAuthTabCallbackDefault(t);
        if (thIAuthTabCallbackDefault != null) {
            throw thIAuthTabCallbackDefault;
        }
        return Unit.INSTANCE;
    }

    private final Throwable IAuthTabCallbackDefault(T t) {
        if (t == null) {
            onPostMessage();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!onExtraCallback()) {
            onPostMessage();
            return asBinder();
        }
        try {
            this.IAuthTabCallback.onWarmupCompleted(t);
            while (true) {
                long j = onExtraCallbackWithResult.get(this);
                if (j < 0 || j == Long.MAX_VALUE) {
                    break;
                }
                long j2 = j - 1;
                if (onExtraCallbackWithResult.compareAndSet(this, j, j2)) {
                    if (j2 == 0) {
                        return null;
                    }
                }
            }
            onPostMessage();
            return null;
        } catch (Throwable th) {
            this.cancelled = true;
            boolean zOnExtraCallback = onExtraCallback(th);
            onPostMessage();
            if (zOnExtraCallback) {
                return th;
            }
            this.onWarmupCompleted.invoke(th, getContext());
            return asBinder();
        }
    }

    private final void onPostMessage() {
        jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onExtraCallback(this.onExtraCallback, (Object) null, 1, (Object) null);
        if (IAuthTabCallbackStubProxy() && jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.onExtraCallback, (Object) null, 1, (Object) null)) {
            IAuthTabCallback(cn_(), co_());
        }
    }

    private final void IAuthTabCallback(Throwable th, boolean z) {
        try {
            if (onExtraCallbackWithResult.get(this) != -2) {
                onExtraCallbackWithResult.set(this, -2L);
                if (this.cancelled) {
                    if (th != null && !z) {
                        this.onWarmupCompleted.invoke(th, getContext());
                    }
                } else if (th == null) {
                    try {
                        this.IAuthTabCallback.onExtraCallbackWithResult();
                    } catch (Throwable th2) {
                        inst.onNavigationEvent(getContext(), th2);
                    }
                } else {
                    try {
                        this.IAuthTabCallback.onWarmupCompleted(th);
                    } catch (Throwable th3) {
                        if (th3 != th) {
                            setRead.onWarmupCompleted(th, th3);
                        }
                        inst.onNavigationEvent(getContext(), th);
                    }
                }
            }
        } finally {
            jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onExtraCallback(this.onExtraCallback, (Object) null, 1, (Object) null);
        }
    }

    public void request(long j) {
        long j2;
        long j3;
        if (j <= 0) {
            onWarmupCompleted(new IllegalArgumentException("non-positive subscription request " + j));
            return;
        }
        do {
            j2 = onExtraCallbackWithResult.get(this);
            if (j2 < 0) {
                return;
            }
            long j4 = j2 + j;
            j3 = (j4 < 0 || j == Long.MAX_VALUE) ? Long.MAX_VALUE : j4;
            if (j2 == j3) {
                return;
            }
        } while (!onExtraCallbackWithResult.compareAndSet(this, j2, j3));
        if (j2 == 0) {
            onPostMessage();
        }
    }

    private final void onWarmupCompleted(Throwable th, boolean z) {
        long j;
        do {
            j = onExtraCallbackWithResult.get(this);
            if (j == -2) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("Check failed.");
            }
        } while (!onExtraCallbackWithResult.compareAndSet(this, j, -1L));
        if (j == 0) {
            IAuthTabCallback(th, z);
        } else if (jni_YGNodeStyleGetFlexBasisJNI.onExtraCallback.onNavigationEvent(this.onExtraCallback, (Object) null, 1, (Object) null)) {
            IAuthTabCallback(th, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(@NotNull Unit unit) {
        onWarmupCompleted(null, false);
    }

    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        onWarmupCompleted(th, z);
    }

    public void cancel() {
        this.cancelled = true;
        super/*o.setFullPackage*/.onNavigationEvent((CancellationException) null);
    }
}
