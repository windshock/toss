package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowKt__DelayKt$;
import o.lud;
import o.ycx1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class ycx1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long onExtraCallback(long j, Object obj) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, final long j) {
        if (j >= 0) {
            return j == 0 ? iAnimation : onExtraCallback(iAnimation, new Function1() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(ycx1.onExtraCallback(j, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, Long> function1) {
        return onExtraCallback(iAnimation, function1);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycxycx.onExtraCallbackWithResult(iAnimation, formatMsgs.IAuthTabCallback(j));
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, setLogBuffers> function1) {
        return onExtraCallback((IAnimation) iAnimation, (Function1) new FlowKt__DelayKt$.ExternalSyntheticLambda0(function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onWarmupCompleted(Function1 function1, Object obj) {
        return formatMsgs.IAuthTabCallback(((setLogBuffers) function1.invoke(obj)).onExtraCallback());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class IAuthTabCallback<T> extends SuspendLambda implements getBacktraceNote<findResAndMsg, setRipple<? super T>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation<T> $this_debounceInternal;
        final /* synthetic */ Function1<T, Long> $timeoutMillisSelector;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function1<? super T, Long> function1, IAnimation<? extends T> iAnimation, access13800<? super IAuthTabCallback> access13800Var) {
            super(3, access13800Var);
            this.$timeoutMillisSelector = function1;
            this.$this_debounceInternal = iAnimation;
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$timeoutMillisSelector, this.$this_debounceInternal, access13800Var);
            iAuthTabCallback.L$0 = findresandmsg;
            iAuthTabCallback.L$1 = setripple;
            return iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        
            if (r7.emit(r15, r14) != r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
        
            if (r7.onExtraCallback((o.access13800) r14) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[PHI: r1 r5 r6 r7
          0x00aa: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:27:0x009f, B:15:0x006d, B:21:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r5v3 kotlin.jvm.internal.Ref$ObjectRef) = 
          (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
          (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
          (r5v6 kotlin.jvm.internal.Ref$ObjectRef)
         binds: [B:27:0x009f, B:15:0x006d, B:21:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
          (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
          (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
          (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
         binds: [B:27:0x009f, B:15:0x006d, B:21:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x00aa: PHI (r7v2 o.setRipple) = (r7v4 o.setRipple), (r7v5 o.setRipple), (r7v5 o.setRipple) binds: [B:27:0x009f, B:15:0x006d, B:21:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00df -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            setRipple setripple;
            ReceiveChannel receiveChannel;
            Ref.LongRef longRef;
            Ref.ObjectRef objectRef2;
            ReceiveChannel receiveChannel2;
            setRipple setripple2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                setRipple setripple3 = (setRipple) this.L$1;
                ReceiveChannel receiveChannelOnWarmupCompleted = jw.onWarmupCompleted(findresandmsg, null, 0, new onNavigationEvent(this.$this_debounceInternal, null), 3, null);
                objectRef = new Ref.ObjectRef();
                setripple = setripple3;
                receiveChannel = receiveChannelOnWarmupCompleted;
                if (objectRef.element != syazb.IAuthTabCallback) {
                }
            } else if (i == 1) {
                longRef = (Ref.LongRef) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                setripple = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objectRef.element = null;
                Ref.LongRef longRef2 = longRef;
                objectRef2 = objectRef;
                receiveChannel2 = receiveChannel;
                setripple2 = setripple;
                jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni = new jni_YGNodeStyleGetDirectionJNI(getContext());
                if (objectRef2.element != null) {
                }
                jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(receiveChannel2.asInterface(), (Function2) new onExtraCallback(objectRef2, setripple2, null));
                this.L$0 = setripple2;
                this.L$1 = receiveChannel2;
                this.L$2 = objectRef2;
                this.L$3 = null;
                this.label = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.L$2;
                receiveChannel2 = (ReceiveChannel) this.L$1;
                setripple2 = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
                setripple = setripple2;
                receiveChannel = receiveChannel2;
                objectRef = objectRef2;
                if (objectRef.element != syazb.IAuthTabCallback) {
                    longRef = new Ref.LongRef();
                    T t = objectRef.element;
                    if (t != null) {
                        Function1<T, Long> function1 = this.$timeoutMillisSelector;
                        djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = syazb.onNavigationEvent;
                        if (t == djexternalsyntheticapimodeloutline0) {
                            t = null;
                        }
                        long jLongValue = function1.invoke(t).longValue();
                        longRef.element = jLongValue;
                        if (jLongValue < 0) {
                            throw new IllegalArgumentException("Debounce timeout should not be negative");
                        }
                        if (jLongValue == 0) {
                            T t2 = objectRef.element;
                            if (t2 == djexternalsyntheticapimodeloutline0) {
                                t2 = null;
                            }
                            this.L$0 = setripple;
                            this.L$1 = receiveChannel;
                            this.L$2 = objectRef;
                            this.L$3 = longRef;
                            this.label = 1;
                        } else {
                            Ref.LongRef longRef22 = longRef;
                            objectRef2 = objectRef;
                            receiveChannel2 = receiveChannel;
                            setripple2 = setripple;
                            jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni2 = new jni_YGNodeStyleGetDirectionJNI(getContext());
                            if (objectRef2.element != null) {
                                jni_YGNodeResetJNI.onExtraCallback(jni_ygnodestylegetdirectionjni2, longRef22.element, new C0045IAuthTabCallback(setripple2, objectRef2, null));
                            }
                            jni_ygnodestylegetdirectionjni2.onExtraCallbackWithResult(receiveChannel2.asInterface(), (Function2) new onExtraCallback(objectRef2, setripple2, null));
                            this.L$0 = setripple2;
                            this.L$1 = receiveChannel2;
                            this.L$2 = objectRef2;
                            this.L$3 = null;
                            this.label = 2;
                        }
                        return objOnExtraCallback;
                    }
                    if (objectRef.element != syazb.IAuthTabCallback) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<ok<? super Object>, access13800<? super Unit>, Object> {
            final /* synthetic */ IAnimation<T> $this_debounceInternal;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(IAnimation<? extends T> iAnimation, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$this_debounceInternal = iAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_debounceInternal, access13800Var);
                onnavigationevent.L$0 = obj;
                return onnavigationevent;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ok<Object> okVar, access13800<? super Unit> access13800Var) {
                return ((onNavigationEvent) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: o.ycx1$IAuthTabCallback$onNavigationEvent$3, reason: invalid class name */
            static final class AnonymousClass3<T> implements setRipple {
                final /* synthetic */ ok<Object> onExtraCallbackWithResult;

                /* renamed from: o.ycx1$IAuthTabCallback$onNavigationEvent$3$onWarmupCompleted */
                static final class onWarmupCompleted extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ AnonymousClass3<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    onWarmupCompleted(AnonymousClass3<? super T> anonymousClass3, access13800<? super onWarmupCompleted> access13800Var) {
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

                AnonymousClass3(ok<Object> okVar) {
                    this.onExtraCallbackWithResult = okVar;
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
                        ok<Object> okVar = this.onExtraCallbackWithResult;
                        if (t == null) {
                            t = (T) syazb.onNavigationEvent;
                        }
                        onwarmupcompleted.label = 1;
                        if (okVar.onExtraCallback(t, onwarmupcompleted) == objOnExtraCallback) {
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ok okVar = (ok) this.L$0;
                    IAnimation<T> iAnimation = this.$this_debounceInternal;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(okVar);
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
        }

        /* renamed from: o.ycx1$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        static final class C0045IAuthTabCallback extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
            final /* synthetic */ setRipple<T> $downstream;
            final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0045IAuthTabCallback(setRipple<? super T> setripple, Ref.ObjectRef<Object> objectRef, access13800<? super C0045IAuthTabCallback> access13800Var) {
                super(1, access13800Var);
                this.$downstream = setripple;
                this.$lastValue = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new C0045IAuthTabCallback(this.$downstream, this.$lastValue, access13800Var);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<? super Unit> access13800Var) {
                return ((C0045IAuthTabCallback) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRipple<T> setripple = this.$downstream;
                    djExternalSyntheticApiModelOutline0 djexternalsyntheticapimodeloutline0 = syazb.onNavigationEvent;
                    T t = this.$lastValue.element;
                    if (t == djexternalsyntheticapimodeloutline0) {
                        t = null;
                    }
                    this.label = 1;
                    if (setripple.emit(t, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                this.$lastValue.element = null;
                return Unit.INSTANCE;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<lud<? extends Object>, access13800<? super Unit>, Object> {
            final /* synthetic */ setRipple<T> $downstream;
            final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallback(Ref.ObjectRef<Object> objectRef, setRipple<? super T> setripple, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$lastValue = objectRef;
                this.$downstream = setripple;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                onExtraCallback onextracallback = new onExtraCallback(this.$lastValue, this.$downstream, access13800Var);
                onextracallback.L$0 = obj;
                return onextracallback;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(lud<? extends Object> ludVar, access13800<? super Unit> access13800Var) {
                return onNavigationEvent(ludVar.onExtraCallback(), access13800Var);
            }

            public final Object onNavigationEvent(Object obj, access13800<? super Unit> access13800Var) {
                return ((onExtraCallback) create(lud.onExtraCallback(obj), access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    T t = (T) ((lud) this.L$0).onExtraCallback();
                    objectRef = this.$lastValue;
                    boolean z = t instanceof lud.onExtraCallback;
                    if (!z) {
                        objectRef.element = t;
                    }
                    setRipple<T> setripple = this.$downstream;
                    if (z) {
                        Throwable thOnWarmupCompleted = lud.onWarmupCompleted(t);
                        if (thOnWarmupCompleted != null) {
                            throw thOnWarmupCompleted;
                        }
                        Object obj2 = objectRef.element;
                        if (obj2 != null) {
                            if (obj2 == syazb.onNavigationEvent) {
                                obj2 = null;
                            }
                            this.L$0 = t;
                            this.L$1 = objectRef;
                            this.label = 1;
                            if (setripple.emit(obj2, this) == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                            objectRef2 = objectRef;
                        }
                        objectRef.element = (T) syazb.IAuthTabCallback;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objectRef = objectRef2;
                objectRef.element = (T) syazb.IAuthTabCallback;
                return Unit.INSTANCE;
            }
        }
    }

    private static final <T> IAnimation<T> onExtraCallback(IAnimation<? extends T> iAnimation, Function1<? super T, Long> function1) {
        return syaul.onWarmupCompleted(new IAuthTabCallback(function1, iAnimation, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onExtraCallbackWithResult<T> extends SuspendLambda implements getBacktraceNote<findResAndMsg, setRipple<? super T>, access13800<? super Unit>, Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ IAnimation<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(long j, IAnimation<? extends T> iAnimation, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(3, access13800Var);
            this.$periodMillis = j;
            this.$this_sample = iAnimation;
        }

        @Override // o.getBacktraceNote
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$periodMillis, this.$this_sample, access13800Var);
            onextracallbackwithresult.L$0 = findresandmsg;
            onextracallbackwithresult.L$1 = setripple;
            return onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<ok<? super Object>, access13800<? super Unit>, Object> {
            final /* synthetic */ IAnimation<T> $this_sample;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(IAnimation<? extends T> iAnimation, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$this_sample = iAnimation;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ok<Object> okVar, access13800<? super Unit> access13800Var) {
                return ((onNavigationEvent) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_sample, access13800Var);
                onnavigationevent.L$0 = obj;
                return onnavigationevent;
            }

            /* renamed from: o.ycx1$onExtraCallbackWithResult$onNavigationEvent$5, reason: invalid class name */
            static final class AnonymousClass5<T> implements setRipple {
                final /* synthetic */ ok<Object> onNavigationEvent;

                /* renamed from: o.ycx1$onExtraCallbackWithResult$onNavigationEvent$5$onExtraCallbackWithResult, reason: collision with other inner class name */
                static final class C0046onExtraCallbackWithResult extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ AnonymousClass5<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0046onExtraCallbackWithResult(AnonymousClass5<? super T> anonymousClass5, access13800<? super C0046onExtraCallbackWithResult> access13800Var) {
                        super(access13800Var);
                        this.this$0 = anonymousClass5;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                AnonymousClass5(ok<Object> okVar) {
                    this.onNavigationEvent = okVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // o.setRipple
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, access13800<? super Unit> access13800Var) {
                    C0046onExtraCallbackWithResult c0046onExtraCallbackWithResult;
                    if (access13800Var instanceof C0046onExtraCallbackWithResult) {
                        c0046onExtraCallbackWithResult = (C0046onExtraCallbackWithResult) access13800Var;
                        int i = c0046onExtraCallbackWithResult.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0046onExtraCallbackWithResult.label = i - 2147483648;
                        } else {
                            c0046onExtraCallbackWithResult = new C0046onExtraCallbackWithResult(this, access13800Var);
                        }
                    }
                    Object obj = c0046onExtraCallbackWithResult.result;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i2 = c0046onExtraCallbackWithResult.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        ok<Object> okVar = this.onNavigationEvent;
                        if (t == null) {
                            t = (T) syazb.onNavigationEvent;
                        }
                        c0046onExtraCallbackWithResult.label = 1;
                        if (okVar.onExtraCallback(t, c0046onExtraCallbackWithResult) == objOnExtraCallback) {
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    ok okVar = (ok) this.L$0;
                    IAnimation<T> iAnimation = this.$this_sample;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(okVar);
                    this.label = 1;
                    if (iAnimation.collect(anonymousClass5, this) == objOnExtraCallback) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReceiveChannel receiveChannelOnWarmupCompleted;
            Ref.ObjectRef objectRef;
            setRipple setripple;
            ReceiveChannel<Unit> receiveChannelOnExtraCallback;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                setRipple setripple2 = (setRipple) this.L$1;
                receiveChannelOnWarmupCompleted = jw.onWarmupCompleted(findresandmsg, null, -1, new onNavigationEvent(this.$this_sample, null), 1, null);
                objectRef = new Ref.ObjectRef();
                setripple = setripple2;
                receiveChannelOnExtraCallback = ycxycx.onExtraCallback(findresandmsg, this.$periodMillis);
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannelOnExtraCallback = (ReceiveChannel) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                receiveChannelOnWarmupCompleted = (ReceiveChannel) this.L$1;
                setripple = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            while (objectRef.element != syazb.IAuthTabCallback) {
                jni_YGNodeStyleGetDirectionJNI jni_ygnodestylegetdirectionjni = new jni_YGNodeStyleGetDirectionJNI(getContext());
                jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult(receiveChannelOnWarmupCompleted.asInterface(), (Function2) new onWarmupCompleted(objectRef, receiveChannelOnExtraCallback, null));
                jni_ygnodestylegetdirectionjni.onExtraCallbackWithResult((jni_YGNodeStyleGetAlignItemsJNI) receiveChannelOnExtraCallback.IAuthTabCallbackStub(), (Function2) new onExtraCallback(objectRef, setripple, null));
                this.L$0 = setripple;
                this.L$1 = receiveChannelOnWarmupCompleted;
                this.L$2 = objectRef;
                this.L$3 = receiveChannelOnExtraCallback;
                this.label = 1;
                if (jni_ygnodestylegetdirectionjni.onExtraCallback((access13800) this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            return Unit.INSTANCE;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<lud<? extends Object>, access13800<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
            final /* synthetic */ ReceiveChannel<Unit> $ticker;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(Ref.ObjectRef<Object> objectRef, ReceiveChannel<Unit> receiveChannel, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$lastValue = objectRef;
                this.$ticker = receiveChannel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$lastValue, this.$ticker, access13800Var);
                onwarmupcompleted.L$0 = obj;
                return onwarmupcompleted;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(lud<? extends Object> ludVar, access13800<? super Unit> access13800Var) {
                return onWarmupCompleted(ludVar.onExtraCallback(), access13800Var);
            }

            public final Object onWarmupCompleted(Object obj, access13800<? super Unit> access13800Var) {
                return ((onWarmupCompleted) create(lud.onExtraCallback(obj), access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                T t = (T) ((lud) this.L$0).onExtraCallback();
                Ref.ObjectRef<Object> objectRef = this.$lastValue;
                boolean z = t instanceof lud.onExtraCallback;
                if (!z) {
                    objectRef.element = t;
                }
                ReceiveChannel<Unit> receiveChannel = this.$ticker;
                if (z) {
                    Throwable thOnWarmupCompleted = lud.onWarmupCompleted(t);
                    if (thOnWarmupCompleted != null) {
                        throw thOnWarmupCompleted;
                    }
                    receiveChannel.onNavigationEvent(new syafby());
                    objectRef.element = (T) syazb.IAuthTabCallback;
                }
                return Unit.INSTANCE;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
            final /* synthetic */ setRipple<T> $downstream;
            final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallback(Ref.ObjectRef<Object> objectRef, setRipple<? super T> setripple, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$lastValue = objectRef;
                this.$downstream = setripple;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, access13800<? super Unit> access13800Var) {
                return ((onExtraCallback) create(unit, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(this.$lastValue, this.$downstream, access13800Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Ref.ObjectRef<Object> objectRef = this.$lastValue;
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        return Unit.INSTANCE;
                    }
                    objectRef.element = null;
                    setRipple<T> setripple = this.$downstream;
                    if (obj2 == syazb.onNavigationEvent) {
                        obj2 = null;
                    }
                    this.label = 1;
                    if (setripple.emit(obj2, this) == objOnExtraCallback) {
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

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Sample period should be positive");
        }
        return syaul.onWarmupCompleted(new onExtraCallbackWithResult(j, iAnimation, null));
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<ok<? super Unit>, access13800<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(long j, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$delayMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$delayMillis, access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ok<? super Unit> okVar, access13800<? super Unit> access13800Var) {
            return ((onWarmupCompleted) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r1
          0x004e: PHI (r1v4 o.ok) = (r1v3 o.ok), (r1v8 o.ok) binds: [B:16:0x004c, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:15:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ok okVar;
            long j;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ok okVar2 = (ok) this.L$0;
                long j2 = this.$delayMillis;
                this.L$0 = okVar2;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j2, this) != objOnExtraCallback) {
                    okVar = okVar2;
                }
                return objOnExtraCallback;
            }
            if (i != 1) {
                if (i == 2) {
                    okVar = (ok) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    j = this.$delayMillis;
                    this.L$0 = okVar;
                    this.label = 3;
                    if (formatMsgs.onWarmupCompleted(j, this) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            okVar = (ok) this.L$0;
            ResultKt.onNavigationEvent(obj);
            lt ltVarOnActivityLayout = okVar.onActivityLayout();
            Unit unit = Unit.INSTANCE;
            this.L$0 = okVar;
            this.label = 2;
            if (ltVarOnActivityLayout.onExtraCallback(unit, this) != objOnExtraCallback) {
                j = this.$delayMillis;
                this.L$0 = okVar;
                this.label = 3;
                if (formatMsgs.onWarmupCompleted(j, this) != objOnExtraCallback) {
                    lt ltVarOnActivityLayout2 = okVar.onActivityLayout();
                    Unit unit2 = Unit.INSTANCE;
                    this.L$0 = okVar;
                    this.label = 2;
                    if (ltVarOnActivityLayout2.onExtraCallback(unit2, this) != objOnExtraCallback) {
                    }
                }
            }
            return objOnExtraCallback;
        }
    }

    public static final ReceiveChannel<Unit> onExtraCallback(@NotNull findResAndMsg findresandmsg, long j) {
        return jw.onWarmupCompleted(findresandmsg, null, 0, new onWarmupCompleted(j, null), 1, null);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycxycx.onExtraCallback(iAnimation, formatMsgs.IAuthTabCallback(j));
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return IAuthTabCallbackStub(iAnimation, j);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onExtraCallback<T> extends SuspendLambda implements getBacktraceNote<findResAndMsg, setRipple<? super T>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation<T> $this_timeoutInternal;
        final /* synthetic */ long $timeout;
        long J$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(long j, IAnimation<? extends T> iAnimation, access13800<? super onExtraCallback> access13800Var) {
            super(3, access13800Var);
            this.$timeout = j;
            this.$this_timeoutInternal = iAnimation;
        }

        @Override // o.getBacktraceNote
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.$timeout, this.$this_timeoutInternal, access13800Var);
            onextracallback.L$0 = findresandmsg;
            onextracallback.L$1 = setripple;
            return onextracallback.invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r9.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.J$0
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
                java.lang.Object r6 = r9.L$0
                o.setRipple r6 = (o.setRipple) r6
                kotlin.ResultKt.onNavigationEvent(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.ResultKt.onNavigationEvent(r10)
                java.lang.Object r10 = r9.L$0
                o.findResAndMsg r10 = (o.findResAndMsg) r10
                java.lang.Object r1 = r9.L$1
                o.setRipple r1 = (o.setRipple) r1
                long r4 = r9.$timeout
                o.setLogBuffers$IAuthTabCallback r6 = o.setLogBuffers.Companion
                long r6 = r6.onWarmupCompleted()
                int r4 = o.setLogBuffers.onExtraCallbackWithResult(r4, r6)
                if (r4 <= 0) goto L82
                o.IAnimation<T> r4 = r9.$this_timeoutInternal
                r5 = 0
                r6 = 2
                o.IAnimation r4 = o.ycxycx.onExtraCallback(r4, r5, r3, r6, r3)
                kotlinx.coroutines.channels.ReceiveChannel r10 = o.ycxycx.onExtraCallbackWithResult(r4, r10)
                long r4 = r9.$timeout
                r6 = r1
                r1 = r10
            L4b:
                o.jni_YGNodeStyleGetDirectionJNI r10 = new o.jni_YGNodeStyleGetDirectionJNI
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                o.jni_YGNodeStyleGetAlignItemsJNI r7 = r1.asInterface()
                o.ycx1$onExtraCallback$onWarmupCompleted r8 = new o.ycx1$onExtraCallback$onWarmupCompleted
                r8.<init>(r6, r3)
                r10.onExtraCallbackWithResult(r7, r8)
                o.ycx1$onExtraCallback$IAuthTabCallback r7 = new o.ycx1$onExtraCallback$IAuthTabCallback
                r7.<init>(r4, r3)
                o.jni_YGNodeResetJNI.onWarmupCompleted(r10, r4, r7)
                r9.L$0 = r6
                r9.L$1 = r1
                r9.J$0 = r4
                r9.label = r2
                java.lang.Object r10 = r10.onExtraCallback(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L82:
                o.WebResourceResponseModel r10 = new o.WebResourceResponseModel
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ycx1.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<lud<? extends T>, access13800<? super Boolean>, Object> {
            final /* synthetic */ setRipple<T> $downStream;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onWarmupCompleted(setRipple<? super T> setripple, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$downStream = setripple;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$downStream, access13800Var);
                onwarmupcompleted.L$0 = obj;
                return onwarmupcompleted;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Object obj, access13800<? super Boolean> access13800Var) {
                return onExtraCallback(((lud) obj).onExtraCallback(), access13800Var);
            }

            public final Object onExtraCallback(Object obj, access13800<? super Boolean> access13800Var) {
                return ((onWarmupCompleted) create(lud.onExtraCallback(obj), access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnExtraCallback;
                Object obj2;
                Object objOnExtraCallback2 = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = ((lud) this.L$0).onExtraCallback();
                    setRipple<T> setripple = this.$downStream;
                    if (!(objOnExtraCallback instanceof lud.onExtraCallback)) {
                        this.L$0 = objOnExtraCallback;
                        this.label = 1;
                        if (setripple.emit(objOnExtraCallback, this) == objOnExtraCallback2) {
                            return objOnExtraCallback2;
                        }
                        obj2 = objOnExtraCallback;
                    }
                    if (objOnExtraCallback instanceof lud.onExtraCallbackWithResult) {
                        return access14000.onNavigationEvent(true);
                    }
                    Throwable thOnWarmupCompleted = lud.onWarmupCompleted(objOnExtraCallback);
                    if (thOnWarmupCompleted != null) {
                        throw thOnWarmupCompleted;
                    }
                    return access14000.onNavigationEvent(false);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj2;
                if (objOnExtraCallback instanceof lud.onExtraCallbackWithResult) {
                }
            }
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function1<access13800<?>, Object> {
            final /* synthetic */ long $timeout;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(long j, access13800<? super IAuthTabCallback> access13800Var) {
                super(1, access13800Var);
                this.$timeout = j;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(access13800<?> access13800Var) {
                return ((IAuthTabCallback) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(access13800<?> access13800Var) {
                return new IAuthTabCallback(this.$timeout, access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                throw new WebResourceResponseModel("Timed out waiting for " + ((Object) setLogBuffers.onPostMessage(this.$timeout)));
            }
        }
    }

    private static final <T> IAnimation<T> IAuthTabCallbackStub(IAnimation<? extends T> iAnimation, long j) {
        return syaul.onWarmupCompleted(new onExtraCallback(j, iAnimation, null));
    }
}
