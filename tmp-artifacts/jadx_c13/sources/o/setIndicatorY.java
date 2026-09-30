package o;

import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setIndicatorY {
    public static final <T> Object onNavigationEvent(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, @NotNull access13800<? super T> access13800Var) {
        return IAuthTabCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_YGConfigFreeJNI.FIRST, null, access13800Var, 2, null);
    }

    public static final <T> Object onWarmupCompleted(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, @NotNull access13800<? super T> access13800Var) {
        return IAuthTabCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_YGConfigFreeJNI.FIRST_OR_DEFAULT, null, access13800Var, 2, null);
    }

    public static final <T> Object onExtraCallbackWithResult(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, @NotNull access13800<? super T> access13800Var) {
        return IAuthTabCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_YGConfigFreeJNI.SINGLE, null, access13800Var, 2, null);
    }

    static /* synthetic */ Object IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_YGConfigFreeJNI jni_ygconfigfreejni, Object obj, access13800 access13800Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return onNavigationEvent(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_ygconfigfreejni, obj, access13800Var);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements ycxExternalSyntheticLambda0<T> {
        private boolean IAuthTabCallback;
        private ycxExternalSyntheticLambda1 IAuthTabCallbackDefault;
        private T asBinder;
        final /* synthetic */ jni_YGConfigFreeJNI onExtraCallback;
        final /* synthetic */ T onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        final /* synthetic */ maybeRemoveAttachStateListener<T> onWarmupCompleted;

        /* renamed from: o.setIndicatorY$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public final /* synthetic */ class C0042onNavigationEvent {
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[jni_YGConfigFreeJNI.values().length];
                try {
                    iArr[jni_YGConfigFreeJNI.FIRST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[jni_YGConfigFreeJNI.FIRST_OR_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[jni_YGConfigFreeJNI.LAST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[jni_YGConfigFreeJNI.SINGLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[jni_YGConfigFreeJNI.SINGLE_OR_DEFAULT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                onWarmupCompleted = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener, jni_YGConfigFreeJNI jni_ygconfigfreejni, T t) {
            this.onWarmupCompleted = mayberemoveattachstatelistener;
            this.onExtraCallback = jni_ygconfigfreejni;
            this.onExtraCallbackWithResult = t;
        }

        static final class onExtraCallbackWithResult implements Function0<Unit> {
            final /* synthetic */ ycxExternalSyntheticLambda1 IAuthTabCallback;

            onExtraCallbackWithResult(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
                this.IAuthTabCallback = ycxexternalsyntheticlambda1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                onWarmupCompleted();
                return Unit.INSTANCE;
            }

            public final void onWarmupCompleted() {
                this.IAuthTabCallback.cancel();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            if (this.IAuthTabCallbackDefault != null) {
                onExtraCallback(new onExtraCallbackWithResult(ycxexternalsyntheticlambda1));
                return;
            }
            this.IAuthTabCallbackDefault = ycxexternalsyntheticlambda1;
            this.onWarmupCompleted.IAuthTabCallback(new IAuthTabCallback(ycxexternalsyntheticlambda1));
            onExtraCallback(new IAuthTabCallbackStub(ycxexternalsyntheticlambda1, this.onExtraCallback));
        }

        static final class IAuthTabCallback implements Function1<Throwable, Unit> {
            final /* synthetic */ ycxExternalSyntheticLambda1 onNavigationEvent;

            IAuthTabCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
                this.onNavigationEvent = ycxexternalsyntheticlambda1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Throwable th) {
                onWarmupCompleted(th);
                return Unit.INSTANCE;
            }

            public final void onWarmupCompleted(Throwable th) {
                onNavigationEvent onnavigationevent = onNavigationEvent.this;
                final ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.onNavigationEvent;
                onnavigationevent.onExtraCallback(new Function0<Unit>() { // from class: o.setIndicatorY.onNavigationEvent.IAuthTabCallback.1
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        IAuthTabCallback();
                        return Unit.INSTANCE;
                    }

                    public final void IAuthTabCallback() {
                        ycxexternalsyntheticlambda1.cancel();
                    }
                });
            }
        }

        static final class IAuthTabCallbackStub implements Function0<Unit> {
            final /* synthetic */ ycxExternalSyntheticLambda1 onExtraCallbackWithResult;
            final /* synthetic */ jni_YGConfigFreeJNI onNavigationEvent;

            IAuthTabCallbackStub(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1, jni_YGConfigFreeJNI jni_ygconfigfreejni) {
                this.onExtraCallbackWithResult = ycxexternalsyntheticlambda1;
                this.onNavigationEvent = jni_ygconfigfreejni;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                onNavigationEvent();
                return Unit.INSTANCE;
            }

            public final void onNavigationEvent() {
                ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.onExtraCallbackWithResult;
                jni_YGConfigFreeJNI jni_ygconfigfreejni = this.onNavigationEvent;
                ycxexternalsyntheticlambda1.request((jni_ygconfigfreejni == jni_YGConfigFreeJNI.FIRST || jni_ygconfigfreejni == jni_YGConfigFreeJNI.FIRST_OR_DEFAULT) ? 1L : LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.IAuthTabCallbackDefault;
            maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = this.onWarmupCompleted;
            if (ycxexternalsyntheticlambda1 == null) {
                inst.onNavigationEvent(mayberemoveattachstatelistener.getContext(), new IllegalStateException("'onNext' was called before 'onSubscribe'"));
                return;
            }
            if (this.IAuthTabCallback) {
                setIndicatorY.onNavigationEvent(mayberemoveattachstatelistener.getContext(), "onNext");
                return;
            }
            int i = C0042onNavigationEvent.onWarmupCompleted[this.onExtraCallback.ordinal()];
            if (i == 1 || i == 2) {
                if (this.onNavigationEvent) {
                    setIndicatorY.IAuthTabCallback(this.onWarmupCompleted.getContext(), this.onExtraCallback);
                    return;
                }
                this.onNavigationEvent = true;
                onExtraCallback(new onExtraCallback(ycxexternalsyntheticlambda1));
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener2 = this.onWarmupCompleted;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(t));
                return;
            }
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            jni_YGConfigFreeJNI jni_ygconfigfreejni = this.onExtraCallback;
            if ((jni_ygconfigfreejni == jni_YGConfigFreeJNI.SINGLE || jni_ygconfigfreejni == jni_YGConfigFreeJNI.SINGLE_OR_DEFAULT) && this.onNavigationEvent) {
                onExtraCallback(new onWarmupCompleted(ycxexternalsyntheticlambda1));
                if (this.onWarmupCompleted.onNavigationEvent()) {
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener3 = this.onWarmupCompleted;
                    Result.Companion companion2 = Result.Companion;
                    mayberemoveattachstatelistener3.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + this.onExtraCallback))));
                    return;
                }
                return;
            }
            this.asBinder = t;
            this.onNavigationEvent = true;
        }

        static final class onExtraCallback implements Function0<Unit> {
            final /* synthetic */ ycxExternalSyntheticLambda1 onExtraCallback;

            onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
                this.onExtraCallback = ycxexternalsyntheticlambda1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                onNavigationEvent();
                return Unit.INSTANCE;
            }

            public final void onNavigationEvent() {
                this.onExtraCallback.cancel();
            }
        }

        static final class onWarmupCompleted implements Function0<Unit> {
            final /* synthetic */ ycxExternalSyntheticLambda1 onWarmupCompleted;

            onWarmupCompleted(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
                this.onWarmupCompleted = ycxexternalsyntheticlambda1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                IAuthTabCallback();
                return Unit.INSTANCE;
            }

            public final void IAuthTabCallback() {
                this.onWarmupCompleted.cancel();
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (onWarmupCompleted("onComplete")) {
                if (this.onNavigationEvent) {
                    jni_YGConfigFreeJNI jni_ygconfigfreejni = this.onExtraCallback;
                    if (jni_ygconfigfreejni == jni_YGConfigFreeJNI.FIRST_OR_DEFAULT || jni_ygconfigfreejni == jni_YGConfigFreeJNI.FIRST || !this.onWarmupCompleted.onNavigationEvent()) {
                        return;
                    }
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = this.onWarmupCompleted;
                    Result.Companion companion = Result.Companion;
                    mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(this.asBinder));
                    return;
                }
                jni_YGConfigFreeJNI jni_ygconfigfreejni2 = this.onExtraCallback;
                if (jni_ygconfigfreejni2 == jni_YGConfigFreeJNI.FIRST_OR_DEFAULT || jni_ygconfigfreejni2 == jni_YGConfigFreeJNI.SINGLE_OR_DEFAULT) {
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener2 = this.onWarmupCompleted;
                    Result.Companion companion2 = Result.Companion;
                    mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(this.onExtraCallbackWithResult));
                } else if (this.onWarmupCompleted.onNavigationEvent()) {
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener3 = this.onWarmupCompleted;
                    Result.Companion companion3 = Result.Companion;
                    mayberemoveattachstatelistener3.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + this.onExtraCallback))));
                }
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (onWarmupCompleted("onError")) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = this.onWarmupCompleted;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
            }
        }

        private final boolean onWarmupCompleted(String str) {
            if (this.IAuthTabCallback) {
                setIndicatorY.onNavigationEvent(this.onWarmupCompleted.getContext(), str);
                return false;
            }
            this.IAuthTabCallback = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onExtraCallback(Function0<Unit> function0) {
            synchronized (this) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(CoroutineContext coroutineContext, String str) {
        inst.onNavigationEvent(coroutineContext, new IllegalStateException('\'' + str + "' was called after the publisher already signalled being in a terminal state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(CoroutineContext coroutineContext, jni_YGConfigFreeJNI jni_ygconfigfreejni) {
        inst.onNavigationEvent(coroutineContext, new IllegalStateException("Only a single value was requested in '" + jni_ygconfigfreejni + "', but the publisher provided more"));
    }

    private static final <T> Object onNavigationEvent(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, jni_YGConfigFreeJNI jni_ygconfigfreejni, T t, access13800<? super T> access13800Var) {
        setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        ReactiveFlowKt.onExtraCallbackWithResult(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, setresourceinternal.getContext()).subscribe(new onNavigationEvent(setresourceinternal, jni_ygconfigfreejni, t));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }
}
