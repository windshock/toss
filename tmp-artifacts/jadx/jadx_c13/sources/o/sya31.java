package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya31 {
    private static final int onWarmupCompleted = djExternalSyntheticApiModelOutline2.onExtraCallback("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, IntCompanionObject.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onNavigationEvent<R> implements IAnimation<IAnimation<? extends R>> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ Function2 onNavigationEvent;

        /* renamed from: o.sya31$onNavigationEvent$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            final /* synthetic */ Function2 onExtraCallback;
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: o.sya31$onNavigationEvent$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ContinuationImpl {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass2(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(setRipple setripple, Function2 function2) {
                this.onExtraCallbackWithResult = setripple;
                this.onExtraCallback = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass2 anonymousClass2;
                setRipple setripple;
                if (access13800Var instanceof AnonymousClass2) {
                    anonymousClass2 = (AnonymousClass2) access13800Var;
                    int i = anonymousClass2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        anonymousClass2.label = i - 2147483648;
                    } else {
                        anonymousClass2 = new AnonymousClass2(access13800Var);
                    }
                }
                Object obj2 = anonymousClass2.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = anonymousClass2.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple2 = this.onExtraCallbackWithResult;
                    Function2 function2 = this.onExtraCallback;
                    anonymousClass2.L$0 = setripple2;
                    anonymousClass2.label = 1;
                    Object objInvoke = function2.invoke(obj, anonymousClass2);
                    if (objInvoke != objOnExtraCallback) {
                        obj2 = objInvoke;
                        setripple = setripple2;
                    }
                    return objOnExtraCallback;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                    return Unit.INSTANCE;
                }
                setRipple setripple3 = (setRipple) anonymousClass2.L$0;
                ResultKt.onNavigationEvent(obj2);
                setripple = setripple3;
                anonymousClass2.L$0 = null;
                anonymousClass2.label = 2;
            }
        }

        public onNavigationEvent(IAnimation iAnimation, Function2 function2) {
            this.IAuthTabCallback = iAnimation;
            this.onNavigationEvent = function2;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass1(setripple, this.onNavigationEvent), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    static final class onExtraCallback<T> implements setRipple {
        final /* synthetic */ setRipple<T> onExtraCallbackWithResult;

        static final class onWarmupCompleted extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallback<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onWarmupCompleted(onExtraCallback<? super T> onextracallback, access13800<? super onWarmupCompleted> access13800Var) {
                super(access13800Var);
                this.this$0 = onextracallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(setRipple<? super T> setripple) {
            this.onExtraCallbackWithResult = setripple;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(IAnimation<? extends T> iAnimation, access13800<? super Unit> access13800Var) {
            onWarmupCompleted onwarmupcompleted;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i = onwarmupcompleted.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
                }
            }
            Object obj = onwarmupcompleted.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onwarmupcompleted.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple<T> setripple = this.onExtraCallbackWithResult;
                onwarmupcompleted.label = 1;
                if (ycxycx.onNavigationEvent(setripple, iAnimation, onwarmupcompleted) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull Iterable<? extends IAnimation<? extends T>> iterable) {
        return new zbycx(iterable, null, 0, null, 14, null);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation onExtraCallback;

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.onExtraCallback = iAnimation;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            Object objCollect = this.onExtraCallback.collect(new onExtraCallback(setripple), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T>... iAnimationArr) {
        return ycxycx.onNavigationEvent(ArraysKt___ArraysKt.asIterable(iAnimationArr));
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends IAnimation<? extends T>> iAnimation, int i) {
        if (i > 0) {
            return i == 1 ? ycxycx.onWarmupCompleted(iAnimation) : new setMinTextSize(iAnimation, i, (CoroutineContext) null, 0, (CloseableUtils) null, 28, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    public static final <T, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return new setEventMap(getbacktracenote, iAnimation, null, 0, null, 28, null);
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    static final class IAuthTabCallback<R, T> extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, T, access13800<? super Unit>, Object> {
        final /* synthetic */ Function2<T, access13800<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function2<? super T, ? super access13800<? super R>, ? extends Object> function2, access13800<? super IAuthTabCallback> access13800Var) {
            super(3, access13800Var);
            this.$transform = function2;
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, T t, access13800<? super Unit> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$transform, access13800Var);
            iAuthTabCallback.L$0 = setripple;
            iAuthTabCallback.L$1 = t;
            return iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            setRipple setripple;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple2 = (setRipple) this.L$0;
                Object obj2 = this.L$1;
                Function2<T, access13800<? super R>, Object> function2 = this.$transform;
                this.L$0 = setripple2;
                this.label = 1;
                obj = function2.invoke(obj2, this);
                setripple = setripple2;
                if (obj != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            setRipple setripple3 = (setRipple) this.L$0;
            ResultKt.onNavigationEvent(obj);
            setripple = setripple3;
            this.L$0 = null;
            this.label = 2;
        }
    }

    public static final <T, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super R>, ? extends Object> function2) {
        return ycxycx.onNavigationEvent((IAnimation) iAnimation, (getBacktraceNote) new IAuthTabCallback(function2, null));
    }

    public static final <T, R> IAnimation<R> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super IAnimation<? extends R>>, ? extends Object> function2) {
        return ycxycx.onWarmupCompleted(new onNavigationEvent(iAnimation, function2));
    }

    public static final <T, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, int i, @NotNull Function2<? super T, ? super access13800<? super IAnimation<? extends R>>, ? extends Object> function2) {
        return ycxycx.onExtraCallback((IAnimation) new onWarmupCompleted(iAnimation, function2), i);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends IAnimation<? extends T>> iAnimation) {
        return new onExtraCallbackWithResult(iAnimation);
    }
}
