package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya2 {

    static final class onExtraCallback<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return sya2.IAuthTabCallback(null, null, null, this);
        }
    }

    static final class onWarmupCompleted<T> implements setRipple {
        final /* synthetic */ int IAuthTabCallback;
        final /* synthetic */ Ref.IntRef onNavigationEvent;
        final /* synthetic */ setRipple<T> onWarmupCompleted;

        static final class onExtraCallbackWithResult extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onWarmupCompleted<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallbackWithResult(onWarmupCompleted<? super T> onwarmupcompleted, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(access13800Var);
                this.this$0 = onwarmupcompleted;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Ref.IntRef intRef, int i, setRipple<? super T> setripple) {
            this.onNavigationEvent = intRef;
            this.IAuthTabCallback = i;
            this.onWarmupCompleted = setripple;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult;
            if (access13800Var instanceof onExtraCallbackWithResult) {
                onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
                int i = onextracallbackwithresult.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallbackwithresult.label = i - 2147483648;
                } else {
                    onextracallbackwithresult = new onExtraCallbackWithResult(this, access13800Var);
                }
            }
            Object obj = onextracallbackwithresult.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onextracallbackwithresult.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Ref.IntRef intRef = this.onNavigationEvent;
                int i3 = intRef.element;
                if (i3 < this.IAuthTabCallback) {
                    intRef.element = i3 + 1;
                    return Unit.INSTANCE;
                }
                setRipple<T> setripple = this.onWarmupCompleted;
                onextracallbackwithresult.label = 1;
                if (setripple.emit(t, onextracallbackwithresult) == objOnExtraCallback) {
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

    static final class onExtraCallbackWithResult<T> implements setRipple {
        final /* synthetic */ Function2<T, access13800<? super Boolean>, Object> onExtraCallback;
        final /* synthetic */ setRipple<T> onExtraCallbackWithResult;
        final /* synthetic */ Ref.BooleanRef onNavigationEvent;

        static final class onExtraCallback extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallbackWithResult<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallback(onExtraCallbackWithResult<? super T> onextracallbackwithresult, access13800<? super onExtraCallback> access13800Var) {
                super(access13800Var);
                this.this$0 = onextracallbackwithresult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Ref.BooleanRef booleanRef, setRipple<? super T> setripple, Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2) {
            this.onNavigationEvent = booleanRef;
            this.onExtraCallbackWithResult = setripple;
            this.onExtraCallback = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            onExtraCallback onextracallback;
            onExtraCallbackWithResult<T> onextracallbackwithresult;
            if (access13800Var instanceof onExtraCallback) {
                onextracallback = (onExtraCallback) access13800Var;
                int i = onextracallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(this, access13800Var);
                }
            }
            Object objInvoke = onextracallback.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onextracallback.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objInvoke);
                if (this.onNavigationEvent.element) {
                    setRipple<T> setripple = this.onExtraCallbackWithResult;
                    onextracallback.label = 1;
                } else {
                    Function2<T, access13800<? super Boolean>, Object> function2 = this.onExtraCallback;
                    onextracallback.L$0 = this;
                    onextracallback.L$1 = t;
                    onextracallback.label = 2;
                    objInvoke = function2.invoke(t, onextracallback);
                    if (objInvoke != objOnExtraCallback) {
                        onextracallbackwithresult = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                        }
                    }
                }
                return objOnExtraCallback;
            }
            if (i2 == 1) {
                ResultKt.onNavigationEvent(objInvoke);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objInvoke);
                return Unit.INSTANCE;
            }
            t = (T) onextracallback.L$1;
            onextracallbackwithresult = (onExtraCallbackWithResult) onextracallback.L$0;
            ResultKt.onNavigationEvent(objInvoke);
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            onextracallbackwithresult.onNavigationEvent.element = true;
            setRipple<T> setripple2 = onextracallbackwithresult.onExtraCallbackWithResult;
            onextracallback.L$0 = null;
            onextracallback.L$1 = null;
            onextracallback.label = 3;
        }
    }

    static final class IAuthTabCallbackDefault<T> implements setRipple {
        final /* synthetic */ Object IAuthTabCallback;
        final /* synthetic */ setRipple<T> onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ Ref.IntRef onWarmupCompleted;

        static final class onNavigationEvent extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ IAuthTabCallbackDefault<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(IAuthTabCallbackDefault<? super T> iAuthTabCallbackDefault, access13800<? super onNavigationEvent> access13800Var) {
                super(access13800Var);
                this.this$0 = iAuthTabCallbackDefault;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackDefault(Ref.IntRef intRef, int i, setRipple<? super T> setripple, Object obj) {
            this.onWarmupCompleted = intRef;
            this.onExtraCallbackWithResult = i;
            this.onExtraCallback = setripple;
            this.IAuthTabCallback = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) != r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        
            if (o.sya2.IAuthTabCallback(r7, r6, r2, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            onNavigationEvent onnavigationevent;
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
                if (i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            Ref.IntRef intRef = this.onWarmupCompleted;
            int i3 = intRef.element + 1;
            intRef.element = i3;
            if (i3 < this.onExtraCallbackWithResult) {
                setRipple<T> setripple = this.onExtraCallback;
                onnavigationevent.label = 1;
            } else {
                setRipple<T> setripple2 = this.onExtraCallback;
                Object obj2 = this.IAuthTabCallback;
                onnavigationevent.label = 2;
            }
            return objOnExtraCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object IAuthTabCallback(setRipple<? super T> setripple, T t, Object obj, access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj2 = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj2);
            onextracallback.L$0 = obj;
            onextracallback.label = 1;
            if (setripple.emit(t, onextracallback) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = onextracallback.L$0;
            ResultKt.onNavigationEvent(obj2);
        }
        throw new zb1(obj);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements IAnimation<T> {
        final /* synthetic */ int onExtraCallback;
        final /* synthetic */ IAnimation onWarmupCompleted;

        public IAuthTabCallback(IAnimation iAnimation, int i) {
            this.onWarmupCompleted = iAnimation;
            this.onExtraCallback = i;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            Object objCollect = this.onWarmupCompleted.collect(new onWarmupCompleted(new Ref.IntRef(), this.onExtraCallback, setripple), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asBinder<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ int onExtraCallbackWithResult;

        /* renamed from: o.sya2$asBinder$5, reason: invalid class name */
        public static final class AnonymousClass5 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass5(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return asBinder.this.collect(null, this);
            }
        }

        public asBinder(IAnimation iAnimation, int i) {
            this.IAuthTabCallback = iAnimation;
            this.onExtraCallbackWithResult = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            AnonymousClass5 anonymousClass5;
            zb1 e;
            Object obj;
            if (access13800Var instanceof AnonymousClass5) {
                anonymousClass5 = (AnonymousClass5) access13800Var;
                int i = anonymousClass5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass5.label = i - 2147483648;
                } else {
                    anonymousClass5 = new AnonymousClass5(access13800Var);
                }
            }
            Object obj2 = anonymousClass5.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass5.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj2);
                Object obj3 = new Object();
                Ref.IntRef intRef = new Ref.IntRef();
                try {
                    IAnimation iAnimation = this.IAuthTabCallback;
                    IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(intRef, this.onExtraCallbackWithResult, setripple, obj3);
                    anonymousClass5.L$0 = obj3;
                    anonymousClass5.label = 1;
                    if (iAnimation.collect(iAuthTabCallbackDefault, anonymousClass5) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } catch (zb1 e2) {
                    e = e2;
                    obj = obj3;
                    syasya.onNavigationEvent(e, obj);
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = anonymousClass5.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                } catch (zb1 e3) {
                    e = e3;
                    syasya.onNavigationEvent(e, obj);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asInterface<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ Function2 onNavigationEvent;

        /* renamed from: o.sya2$asInterface$4, reason: invalid class name */
        public static final class AnonymousClass4 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass4(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return asInterface.this.collect(null, this);
            }
        }

        public asInterface(IAnimation iAnimation, Function2 function2) {
            this.IAuthTabCallback = iAnimation;
            this.onNavigationEvent = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            AnonymousClass4 anonymousClass4;
            zb1 e;
            onTransact ontransact;
            if (access13800Var instanceof AnonymousClass4) {
                anonymousClass4 = (AnonymousClass4) access13800Var;
                int i = anonymousClass4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass4.label = i - 2147483648;
                } else {
                    anonymousClass4 = new AnonymousClass4(access13800Var);
                }
            }
            Object obj = anonymousClass4.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass4.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimation = this.IAuthTabCallback;
                onTransact ontransact2 = new onTransact(this.onNavigationEvent, setripple);
                try {
                    anonymousClass4.L$0 = ontransact2;
                    anonymousClass4.label = 1;
                    if (iAnimation.collect(ontransact2, anonymousClass4) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } catch (zb1 e2) {
                    e = e2;
                    ontransact = ontransact2;
                    syasya.onNavigationEvent(e, ontransact);
                    getFullPackage.IAuthTabCallback(anonymousClass4.getContext());
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ontransact = (onTransact) anonymousClass4.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (zb1 e3) {
                    e = e3;
                    syasya.onNavigationEvent(e, ontransact);
                    getFullPackage.IAuthTabCallback(anonymousClass4.getContext());
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation onExtraCallback;
        final /* synthetic */ Function2 onWarmupCompleted;

        public onNavigationEvent(IAnimation iAnimation, Function2 function2) {
            this.onExtraCallback = iAnimation;
            this.onWarmupCompleted = function2;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            Object objCollect = this.onExtraCallback.collect(new onExtraCallbackWithResult(new Ref.BooleanRef(), setripple, this.onWarmupCompleted), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class IAuthTabCallbackStub<R> extends SuspendLambda implements Function2<setRipple<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation<T> $this_transformWhile;
        final /* synthetic */ getBacktraceNote<setRipple<? super R>, T, access13800<? super Boolean>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(IAnimation<? extends T> iAnimation, getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Boolean>, ? extends Object> getbacktracenote, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$this_transformWhile = iAnimation;
            this.$transform = getbacktracenote;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$this_transformWhile, this.$transform, access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            return iAuthTabCallbackStub;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackStub) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            onExtraCallback onextracallback;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                IAnimation<T> iAnimation = this.$this_transformWhile;
                onExtraCallback onextracallback2 = new onExtraCallback(this.$transform, setripple);
                try {
                    this.L$0 = onextracallback2;
                    this.label = 1;
                    if (iAnimation.collect(onextracallback2, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } catch (zb1 e) {
                    e = e;
                    onextracallback = onextracallback2;
                    syasya.onNavigationEvent(e, onextracallback);
                    getFullPackage.IAuthTabCallback(getContext());
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onextracallback = (onExtraCallback) this.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (zb1 e2) {
                    e = e2;
                    syasya.onNavigationEvent(e, onextracallback);
                    getFullPackage.IAuthTabCallback(getContext());
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class onExtraCallback<T> implements setRipple<T> {
            final /* synthetic */ getBacktraceNote onNavigationEvent;
            final /* synthetic */ setRipple onWarmupCompleted;

            /* renamed from: o.sya2$IAuthTabCallbackStub$onExtraCallback$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return onExtraCallback.this.emit(null, this);
                }
            }

            public onExtraCallback(getBacktraceNote getbacktracenote, setRipple setripple) {
                this.onNavigationEvent = getbacktracenote;
                this.onWarmupCompleted = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object emit(T t, access13800<? super Unit> access13800Var) {
                AnonymousClass3 anonymousClass3;
                onExtraCallback<T> onextracallback;
                if (access13800Var instanceof AnonymousClass3) {
                    anonymousClass3 = (AnonymousClass3) access13800Var;
                    int i = anonymousClass3.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        anonymousClass3.label = i - 2147483648;
                    } else {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    }
                }
                Object objInvoke = anonymousClass3.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = anonymousClass3.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(objInvoke);
                    getBacktraceNote getbacktracenote = this.onNavigationEvent;
                    setRipple setripple = this.onWarmupCompleted;
                    anonymousClass3.L$0 = this;
                    anonymousClass3.label = 1;
                    InlineMarker.mark(6);
                    objInvoke = getbacktracenote.invoke(setripple, t, anonymousClass3);
                    InlineMarker.mark(7);
                    if (objInvoke == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    onextracallback = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    onextracallback = (onExtraCallback) anonymousClass3.L$0;
                    ResultKt.onNavigationEvent(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    throw new zb1(onextracallback);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final <T, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Boolean>, ? extends Object> getbacktracenote) {
        return ycxycx.onExtraCallbackWithResult(new IAuthTabCallbackStub(iAnimation, getbacktracenote, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onTransact<T> implements setRipple<T> {
        final /* synthetic */ setRipple onNavigationEvent;
        final /* synthetic */ Function2 onWarmupCompleted;

        /* renamed from: o.sya2$onTransact$5, reason: invalid class name */
        public static final class AnonymousClass5 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass5(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onTransact.this.emit(null, this);
            }
        }

        public onTransact(Function2 function2, setRipple setripple) {
            this.onWarmupCompleted = function2;
            this.onNavigationEvent = setripple;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t, access13800<? super Unit> access13800Var) {
            AnonymousClass5 anonymousClass5;
            Object obj;
            T t2;
            onTransact<T> ontransact;
            if (access13800Var instanceof AnonymousClass5) {
                anonymousClass5 = (AnonymousClass5) access13800Var;
                int i = anonymousClass5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass5.label = i - 2147483648;
                } else {
                    anonymousClass5 = new AnonymousClass5(access13800Var);
                }
            }
            Object obj2 = anonymousClass5.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass5.label;
            boolean z = true;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj2);
                Function2 function2 = this.onWarmupCompleted;
                anonymousClass5.L$0 = this;
                anonymousClass5.L$1 = t;
                anonymousClass5.label = 1;
                InlineMarker.mark(6);
                Object objInvoke = function2.invoke(t, anonymousClass5);
                InlineMarker.mark(7);
                if (objInvoke != objOnExtraCallback) {
                    obj = objInvoke;
                    t2 = t;
                    ontransact = this;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ontransact = (onTransact) anonymousClass5.L$0;
                ResultKt.onNavigationEvent(obj2);
                if (z) {
                    throw new zb1(ontransact);
                }
                return Unit.INSTANCE;
            }
            Object obj3 = anonymousClass5.L$1;
            onTransact<T> ontransact2 = (onTransact) anonymousClass5.L$0;
            ResultKt.onNavigationEvent(obj2);
            t2 = obj3;
            ontransact = ontransact2;
            obj = obj2;
            if (((Boolean) obj).booleanValue()) {
                setRipple setripple = ontransact.onNavigationEvent;
                anonymousClass5.L$0 = ontransact;
                anonymousClass5.L$1 = null;
                anonymousClass5.label = 2;
            } else {
                z = false;
            }
            if (z) {
            }
        }
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
        }
        return new IAuthTabCallback(iAnimation, i);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2) {
        return new onNavigationEvent(iAnimation, function2);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
        }
        return new asBinder(iAnimation, i);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2) {
        return new asInterface(iAnimation, function2);
    }
}
