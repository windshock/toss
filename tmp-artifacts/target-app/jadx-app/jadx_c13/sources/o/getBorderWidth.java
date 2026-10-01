package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class getBorderWidth {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation onExtraCallback;
        final /* synthetic */ Function2 onExtraCallbackWithResult;

        /* renamed from: o.getBorderWidth$IAuthTabCallback$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements setRipple {
            final /* synthetic */ Function2 onExtraCallbackWithResult;
            final /* synthetic */ setRipple onWarmupCompleted;

            /* renamed from: o.getBorderWidth$IAuthTabCallback$2$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass2.this.emit(null, this);
                }
            }

            public AnonymousClass2(setRipple setripple, Function2 function2) {
                this.onWarmupCompleted = setripple;
                this.onExtraCallbackWithResult = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L24;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, access13800<? super Unit> access13800Var) {
                AnonymousClass4 anonymousClass4;
                Object obj;
                setRipple setripple;
                if (access13800Var instanceof AnonymousClass4) {
                    anonymousClass4 = (AnonymousClass4) access13800Var;
                    int i = anonymousClass4.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        anonymousClass4.label = i - 2147483648;
                    } else {
                        anonymousClass4 = new AnonymousClass4(access13800Var);
                    }
                }
                Object obj2 = anonymousClass4.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = anonymousClass4.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple2 = this.onWarmupCompleted;
                    Function2 function2 = this.onExtraCallbackWithResult;
                    anonymousClass4.L$0 = t;
                    anonymousClass4.L$1 = setripple2;
                    anonymousClass4.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(t, anonymousClass4);
                    InlineMarker.mark(7);
                    if (objInvoke != objOnExtraCallback) {
                        obj = t;
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
                setRipple setripple3 = (setRipple) anonymousClass4.L$1;
                obj = anonymousClass4.L$0;
                ResultKt.onNavigationEvent(obj2);
                setripple = setripple3;
                anonymousClass4.L$0 = null;
                anonymousClass4.L$1 = null;
                anonymousClass4.label = 2;
            }
        }

        public IAuthTabCallback(IAnimation iAnimation, Function2 function2) {
            this.onExtraCallback = iAnimation;
            this.onExtraCallbackWithResult = function2;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onExtraCallback.collect(new AnonymousClass2(setripple, this.onExtraCallbackWithResult), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation onExtraCallbackWithResult;

        /* renamed from: o.getBorderWidth$onWarmupCompleted$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements setRipple {
            final /* synthetic */ setRipple onExtraCallbackWithResult;

            /* renamed from: o.getBorderWidth$onWarmupCompleted$5$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass5.this.emit(null, this);
                }
            }

            public AnonymousClass5(setRipple setripple) {
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, access13800<? super Unit> access13800Var) {
                AnonymousClass4 anonymousClass4;
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
                    setRipple setripple = this.onExtraCallbackWithResult;
                    if (t != null) {
                        anonymousClass4.label = 1;
                        if (setripple.emit(t, anonymousClass4) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
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

        public onWarmupCompleted(IAnimation iAnimation) {
            this.onExtraCallbackWithResult = iAnimation;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objCollect = this.onExtraCallbackWithResult.collect(new AnonymousClass5(setripple), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    static final class asBinder<T> implements setRipple {
        final /* synthetic */ Ref.IntRef IAuthTabCallback;
        final /* synthetic */ setRipple<IndexedValue<? extends T>> onExtraCallback;

        static final class onWarmupCompleted extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ asBinder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onWarmupCompleted(asBinder<? super T> asbinder, access13800<? super onWarmupCompleted> access13800Var) {
                super(access13800Var);
                this.this$0 = asbinder;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        asBinder(setRipple<? super IndexedValue<? extends T>> setripple, Ref.IntRef intRef) {
            this.onExtraCallback = setripple;
            this.IAuthTabCallback = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
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
                setRipple<IndexedValue<? extends T>> setripple = this.onExtraCallback;
                Ref.IntRef intRef = this.IAuthTabCallback;
                int i3 = intRef.element;
                intRef.element = i3 + 1;
                if (i3 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                IndexedValue<? extends T> indexedValue = new IndexedValue<>(i3, t);
                onwarmupcompleted.label = 1;
                if (setripple.emit(indexedValue, onwarmupcompleted) == objOnExtraCallback) {
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

    public static final <T, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, R r, @NotNull getBacktraceNote<? super R, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return ycxycx.onNavigationEvent(iAnimation, r, getbacktracenote);
    }

    static final class onExtraCallbackWithResult<T> implements setRipple {
        final /* synthetic */ setRipple<R> IAuthTabCallback;
        final /* synthetic */ Ref.ObjectRef<R> onExtraCallbackWithResult;
        final /* synthetic */ getBacktraceNote<R, T, access13800<? super R>, Object> onNavigationEvent;

        static final class onWarmupCompleted extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallbackWithResult<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onWarmupCompleted(onExtraCallbackWithResult<? super T> onextracallbackwithresult, access13800<? super onWarmupCompleted> access13800Var) {
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
        onExtraCallbackWithResult(Ref.ObjectRef<R> objectRef, getBacktraceNote<? super R, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote, setRipple<? super R> setripple) {
            this.onExtraCallbackWithResult = objectRef;
            this.onNavigationEvent = getbacktracenote;
            this.IAuthTabCallback = setripple;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            onWarmupCompleted onwarmupcompleted;
            onExtraCallbackWithResult<T> onextracallbackwithresult;
            Ref.ObjectRef objectRef;
            if (access13800Var instanceof onWarmupCompleted) {
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i = onwarmupcompleted.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
                }
            }
            T t2 = (T) onwarmupcompleted.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onwarmupcompleted.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(t2);
                Ref.ObjectRef objectRef2 = this.onExtraCallbackWithResult;
                getBacktraceNote<R, T, access13800<? super R>, Object> getbacktracenote = this.onNavigationEvent;
                T t3 = objectRef2.element;
                onwarmupcompleted.L$0 = this;
                onwarmupcompleted.L$1 = objectRef2;
                onwarmupcompleted.label = 1;
                Object objInvoke = getbacktracenote.invoke(t3, t, onwarmupcompleted);
                if (objInvoke != objOnExtraCallback) {
                    onextracallbackwithresult = this;
                    t2 = (T) objInvoke;
                    objectRef = objectRef2;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(t2);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) onwarmupcompleted.L$1;
            onextracallbackwithresult = (onExtraCallbackWithResult) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(t2);
            objectRef.element = t2;
            setRipple<R> setripple = onextracallbackwithresult.IAuthTabCallback;
            T t4 = onextracallbackwithresult.onExtraCallbackWithResult.element;
            onwarmupcompleted.L$0 = null;
            onwarmupcompleted.L$1 = null;
            onwarmupcompleted.label = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onExtraCallback<R> implements IAnimation<R> {
        final /* synthetic */ Object IAuthTabCallback;
        final /* synthetic */ IAnimation onExtraCallbackWithResult;
        final /* synthetic */ getBacktraceNote onWarmupCompleted;

        /* renamed from: o.getBorderWidth$onExtraCallback$4, reason: invalid class name */
        public static final class AnonymousClass4 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass4(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onExtraCallback.this.collect(null, this);
            }
        }

        public onExtraCallback(Object obj, IAnimation iAnimation, getBacktraceNote getbacktracenote) {
            this.IAuthTabCallback = obj;
            this.onExtraCallbackWithResult = iAnimation;
            this.onWarmupCompleted = getbacktracenote;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
        
            if (r8.collect(r5, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            AnonymousClass4 anonymousClass4;
            onExtraCallback<R> onextracallback;
            setRipple<? super R> setripple2;
            Ref.ObjectRef objectRef;
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
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                ?? r2 = this.IAuthTabCallback;
                objectRef2.element = r2;
                anonymousClass4.L$0 = this;
                anonymousClass4.L$1 = setripple;
                anonymousClass4.L$2 = objectRef2;
                anonymousClass4.label = 1;
                if (setripple.emit(r2, anonymousClass4) != objOnExtraCallback) {
                    onextracallback = this;
                    setripple2 = setripple;
                    objectRef = objectRef2;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) anonymousClass4.L$2;
            setripple2 = (setRipple) anonymousClass4.L$1;
            onextracallback = (onExtraCallback) anonymousClass4.L$0;
            ResultKt.onNavigationEvent(obj);
            IAnimation iAnimation = onextracallback.onExtraCallbackWithResult;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(objectRef, onextracallback.onWarmupCompleted, setripple2);
            anonymousClass4.L$0 = null;
            anonymousClass4.L$1 = null;
            anonymousClass4.L$2 = null;
            anonymousClass4.label = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements IAnimation<IndexedValue<? extends T>> {
        final /* synthetic */ IAnimation onExtraCallbackWithResult;

        public onNavigationEvent(IAnimation iAnimation) {
            this.onExtraCallbackWithResult = iAnimation;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super IndexedValue<? extends T>> setripple, access13800<? super Unit> access13800Var) {
            Object objCollect = this.onExtraCallbackWithResult.collect(new asBinder(setripple, new Ref.IntRef()), access13800Var);
            return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation) {
        return new onWarmupCompleted(iAnimation);
    }

    public static final <T> IAnimation<IndexedValue<T>> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation) {
        return new onNavigationEvent(iAnimation);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new IAuthTabCallback(iAnimation, function2);
    }

    public static final <T, R> IAnimation<R> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, R r, @NotNull getBacktraceNote<? super R, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return new onExtraCallback(r, iAnimation, getbacktracenote);
    }
}
