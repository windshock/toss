package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setEventMap<T, R> extends setLineSpacing<T, R> {
    private final getBacktraceNote<setRipple<? super R>, T, access13800<? super Unit>, Object> onExtraCallback;

    public /* synthetic */ setEventMap(getBacktraceNote getbacktracenote, IAnimation iAnimation, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(getbacktracenote, iAnimation, (i2 & 4) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setEventMap(@NotNull getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Unit>, ? extends Object> getbacktracenote, @NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(iAnimation, coroutineContext, i, closeableUtils);
        this.onExtraCallback = getbacktracenote;
    }

    @Override // o.sz
    protected sz<R> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new setEventMap(this.onExtraCallback, this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ setRipple<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ setEventMap<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(setEventMap<T, R> seteventmap, setRipple<? super R> setripple, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = seteventmap;
            this.$collector = setripple;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$collector, access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                setEventMap<T, R> seteventmap = this.this$0;
                IAnimation<S> iAnimation = seteventmap.onWarmupCompleted;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(objectRef, findresandmsg, seteventmap, this.$collector);
                this.label = 1;
                if (iAnimation.collect(anonymousClass3, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.setEventMap$onExtraCallback$3, reason: invalid class name */
        static final class AnonymousClass3<T> implements setRipple {
            final /* synthetic */ setEventMap<T, R> IAuthTabCallback;
            final /* synthetic */ Ref.ObjectRef<getPackageType> onExtraCallback;
            final /* synthetic */ setRipple<R> onExtraCallbackWithResult;
            final /* synthetic */ findResAndMsg onWarmupCompleted;

            /* renamed from: o.setEventMap$onExtraCallback$3$onExtraCallback, reason: collision with other inner class name */
            static final class C0041onExtraCallback extends ContinuationImpl {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ AnonymousClass3<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0041onExtraCallback(AnonymousClass3<? super T> anonymousClass3, access13800<? super C0041onExtraCallback> access13800Var) {
                    super(access13800Var);
                    this.this$0 = anonymousClass3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Ref.ObjectRef<getPackageType> objectRef, findResAndMsg findresandmsg, setEventMap<T, R> seteventmap, setRipple<? super R> setripple) {
                this.onExtraCallback = objectRef;
                this.onWarmupCompleted = findresandmsg;
                this.IAuthTabCallback = seteventmap;
                this.onExtraCallbackWithResult = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, access13800<? super Unit> access13800Var) {
                C0041onExtraCallback c0041onExtraCallback;
                AnonymousClass3<T> anonymousClass3;
                if (access13800Var instanceof C0041onExtraCallback) {
                    c0041onExtraCallback = (C0041onExtraCallback) access13800Var;
                    int i = c0041onExtraCallback.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0041onExtraCallback.label = i - 2147483648;
                    } else {
                        c0041onExtraCallback = new C0041onExtraCallback(this, access13800Var);
                    }
                }
                Object obj = c0041onExtraCallback.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = c0041onExtraCallback.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getPackageType getpackagetype = this.onExtraCallback.element;
                    if (getpackagetype != null) {
                        getpackagetype.onNavigationEvent(new syafby());
                        c0041onExtraCallback.L$0 = this;
                        c0041onExtraCallback.L$1 = t;
                        c0041onExtraCallback.L$2 = getpackagetype;
                        c0041onExtraCallback.label = 1;
                        if (getpackagetype.onNavigationEvent(c0041onExtraCallback) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                    anonymousClass3 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) c0041onExtraCallback.L$1;
                    anonymousClass3 = (AnonymousClass3) c0041onExtraCallback.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                anonymousClass3.onExtraCallback.element = (T) onLoadStarted.onExtraCallback(anonymousClass3.onWarmupCompleted, null, setRandomHost.UNDISPATCHED, new C00403(anonymousClass3.IAuthTabCallback, anonymousClass3.onExtraCallbackWithResult, t, null), 1, null);
                return Unit.INSTANCE;
            }

            /* renamed from: o.setEventMap$onExtraCallback$3$3, reason: invalid class name and collision with other inner class name */
            static final class C00403 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                final /* synthetic */ setRipple<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ setEventMap<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00403(setEventMap<T, R> seteventmap, setRipple<? super R> setripple, T t, access13800<? super C00403> access13800Var) {
                    super(2, access13800Var);
                    this.this$0 = seteventmap;
                    this.$collector = setripple;
                    this.$value = t;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    return ((C00403) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new C00403(this.this$0, this.$collector, this.$value, access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        getBacktraceNote getbacktracenote = ((setEventMap) this.this$0).onExtraCallback;
                        setRipple<R> setripple = this.$collector;
                        T t = this.$value;
                        this.label = 1;
                        if (getbacktracenote.invoke(setripple, t, this) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @Override // o.setLineSpacing
    protected Object onExtraCallback(@NotNull setRipple<? super R> setripple, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onExtraCallback(this, setripple, null), access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }
}
