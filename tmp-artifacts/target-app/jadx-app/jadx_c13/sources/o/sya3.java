package o;

import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import o.getTileModeY;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya3 {

    static final class onExtraCallback<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onExtraCallback((IAnimation) null, (findResAndMsg) null, this);
        }
    }

    public static /* synthetic */ getTileModeX IAuthTabCallback(IAnimation iAnimation, findResAndMsg findresandmsg, getTileModeY gettilemodey, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return ycxycx.onExtraCallback(iAnimation, findresandmsg, gettilemodey, i);
    }

    public static final <T> getTileModeX<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull getTileModeY gettilemodey, int i) {
        setCornerRadius setcornerradiusOnExtraCallback = onExtraCallback(iAnimation, i);
        getBorderRadius getborderradiusOnExtraCallback = getShine.onExtraCallback(i, setcornerradiusOnExtraCallback.onWarmupCompleted, setcornerradiusOnExtraCallback.onNavigationEvent);
        return new ReadonlySharedFlow(getborderradiusOnExtraCallback, IAuthTabCallback(findresandmsg, setcornerradiusOnExtraCallback.onExtraCallback, (IAnimation<? extends djExternalSyntheticApiModelOutline0>) setcornerradiusOnExtraCallback.onExtraCallbackWithResult, (getBorderRadius<djExternalSyntheticApiModelOutline0>) getborderradiusOnExtraCallback, gettilemodey, getShine.onWarmupCompleted));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> setCornerRadius<T> onExtraCallback(IAnimation<? extends T> iAnimation, int i) {
        sz szVar;
        IAnimation<T> iAnimationOnWarmupCompleted;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, nLockFileSegment.a_.onExtraCallbackWithResult()) - i;
        if ((iAnimation instanceof sz) && (iAnimationOnWarmupCompleted = (szVar = (sz) iAnimation).onWarmupCompleted()) != null) {
            int i2 = szVar.onExtraCallbackWithResult;
            if (i2 != -3 && i2 != -2 && i2 != 0) {
                iCoerceAtLeast = i2;
            } else if (szVar.IAuthTabCallback == CloseableUtils.SUSPEND) {
                if (i2 == 0) {
                    iCoerceAtLeast = 0;
                }
            } else if (i == 0) {
                iCoerceAtLeast = 1;
            }
            return new setCornerRadius<>(iAnimationOnWarmupCompleted, iCoerceAtLeast, szVar.IAuthTabCallback, szVar.onNavigationEvent);
        }
        return new setCornerRadius<>(iAnimation, iCoerceAtLeast, CloseableUtils.SUSPEND, access13600.IAuthTabCallback);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ getBorderRadius<T> $shared;
        final /* synthetic */ getTileModeY $started;
        final /* synthetic */ IAnimation<T> $upstream;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(getTileModeY gettilemodey, IAnimation<? extends T> iAnimation, getBorderRadius<T> getborderradius, T t, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$started = gettilemodey;
            this.$upstream = iAnimation;
            this.$shared = getborderradius;
            this.$initialValue = t;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$started, this.$upstream, this.$shared, this.$initialValue, access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        
            if (r8.collect(r1, r7) != r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        
            if (o.ycxycx.onWarmupCompleted(r8, r1, r7) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeY gettilemodey = this.$started;
                getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
                if (gettilemodey == onwarmupcompleted.onNavigationEvent()) {
                    IAnimation<T> iAnimation = this.$upstream;
                    IAnimation iAnimation2 = this.$shared;
                    this.label = 1;
                } else {
                    if (this.$started == onwarmupcompleted.IAuthTabCallback()) {
                        setRubIn<Integer> setrubinOnExtraCallbackWithResult = this.$shared.onExtraCallbackWithResult();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                        this.label = 2;
                        if (ycxycx.onExtraCallbackWithResult(setrubinOnExtraCallbackWithResult, anonymousClass2, this) != objOnExtraCallback) {
                            IAnimation<T> iAnimation3 = this.$upstream;
                            IAnimation iAnimation4 = this.$shared;
                            this.label = 3;
                        }
                    } else {
                        IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(this.$started.onExtraCallbackWithResult(this.$shared.onExtraCallbackWithResult()));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$upstream, this.$shared, this.$initialValue, null);
                        this.label = 4;
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.onNavigationEvent(obj);
                        IAnimation<T> iAnimation32 = this.$upstream;
                        IAnimation iAnimation42 = this.$shared;
                        this.label = 3;
                    } else if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.sya3$onWarmupCompleted$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, access13800<? super Boolean>, Object> {
            /* synthetic */ int I$0;
            int label;

            AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(access13800Var);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Integer num, access13800<? super Boolean> access13800Var) {
                return onExtraCallback(num.intValue(), access13800Var);
            }

            public final Object onExtraCallback(int i, access13800<? super Boolean> access13800Var) {
                return ((AnonymousClass2) create(Integer.valueOf(i), access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return access14000.onNavigationEvent(this.I$0 > 0);
            }
        }

        /* renamed from: o.sya3$onWarmupCompleted$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<getStretch, access13800<? super Unit>, Object> {
            final /* synthetic */ T $initialValue;
            final /* synthetic */ getBorderRadius<T> $shared;
            final /* synthetic */ IAnimation<T> $upstream;
            /* synthetic */ Object L$0;
            int label;

            /* renamed from: o.sya3$onWarmupCompleted$3$onNavigationEvent */
            public final /* synthetic */ class onNavigationEvent {
                public static final /* synthetic */ int[] onNavigationEvent;

                static {
                    int[] iArr = new int[getStretch.values().length];
                    try {
                        iArr[getStretch.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[getStretch.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[getStretch.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    onNavigationEvent = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(IAnimation<? extends T> iAnimation, getBorderRadius<T> getborderradius, T t, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$upstream = iAnimation;
                this.$shared = getborderradius;
                this.$initialValue = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$upstream, this.$shared, this.$initialValue, access13800Var);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(getStretch getstretch, access13800<? super Unit> access13800Var) {
                return ((AnonymousClass3) create(getstretch, access13800Var)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i2 = onNavigationEvent.onNavigationEvent[((getStretch) this.L$0).ordinal()];
                    if (i2 == 1) {
                        IAnimation<T> iAnimation = this.$upstream;
                        IAnimation iAnimation2 = this.$shared;
                        this.label = 1;
                        if (iAnimation.collect(iAnimation2, this) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T t = this.$initialValue;
                        if (t == getShine.onWarmupCompleted) {
                            this.$shared.onNavigationEvent();
                        } else {
                            this.$shared.onNavigationEvent(t);
                        }
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

    private static final <T> getPackageType IAuthTabCallback(findResAndMsg findresandmsg, CoroutineContext coroutineContext, IAnimation<? extends T> iAnimation, getBorderRadius<T> getborderradius, getTileModeY gettilemodey, T t) {
        return maybeUpdateAnimatable.onWarmupCompleted(findresandmsg, coroutineContext, Intrinsics.areEqual(gettilemodey, getTileModeY.Companion.onNavigationEvent()) ? setRandomHost.DEFAULT : setRandomHost.UNDISPATCHED, new onWarmupCompleted(gettilemodey, iAnimation, getborderradius, t, null));
    }

    public static final <T> setRubIn<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull getTileModeY gettilemodey, T t) {
        setCornerRadius setcornerradiusOnExtraCallback = onExtraCallback(iAnimation, 1);
        getCornerRadius getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(t);
        return new ReadonlyStateFlow(getcornerradiusOnNavigationEvent, IAuthTabCallback(findresandmsg, setcornerradiusOnExtraCallback.onExtraCallback, setcornerradiusOnExtraCallback.onExtraCallbackWithResult, getcornerradiusOnNavigationEvent, gettilemodey, t));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull access13800<? super setRubIn<? extends T>> access13800Var) {
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
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            setCornerRadius setcornerradiusOnExtraCallback = onExtraCallback(iAnimation, 1);
            pauseMyRequest pausemyrequestIAuthTabCallback = getResRootDir.IAuthTabCallback((getPackageType) findresandmsg.getCoroutineContext().get(getPackageType.onNavigationEvent));
            onExtraCallbackWithResult(findresandmsg, setcornerradiusOnExtraCallback.onExtraCallback, setcornerradiusOnExtraCallback.onExtraCallbackWithResult, pausemyrequestIAuthTabCallback);
            onextracallback.label = 1;
            objIAuthTabCallback = pausemyrequestIAuthTabCallback.IAuthTabCallback((access13800) onextracallback);
            if (objIAuthTabCallback == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        Object objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
        ResultKt.onNavigationEvent(objOnNavigationEvent);
        return objOnNavigationEvent;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ pauseMyRequest<Result<setRubIn<T>>> $result;
        final /* synthetic */ IAnimation<T> $upstream;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(IAnimation<? extends T> iAnimation, pauseMyRequest<Result<setRubIn<T>>> pausemyrequest, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$upstream = iAnimation;
            this.$result = pausemyrequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$upstream, this.$result, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    IAnimation<T> iAnimation = this.$upstream;
                    final pauseMyRequest<Result<setRubIn<T>>> pausemyrequest = this.$result;
                    setRipple setripple = new setRipple() { // from class: o.sya3.IAuthTabCallback.2
                        /* JADX WARN: Type inference failed for: r4v1, types: [T, o.getCornerRadius, o.setRubIn] */
                        @Override // o.setRipple
                        public final Object emit(T t, access13800<? super Unit> access13800Var) {
                            Ref.ObjectRef<getCornerRadius<T>> objectRef3 = objectRef2;
                            getCornerRadius<T> getcornerradius = objectRef3.element;
                            if (getcornerradius != null) {
                                getcornerradius.onWarmupCompleted(t);
                            } else {
                                findResAndMsg findresandmsg2 = findresandmsg;
                                pauseMyRequest<Result<setRubIn<T>>> pausemyrequest2 = pausemyrequest;
                                ?? r4 = (T) setShine.onNavigationEvent(t);
                                Result.Companion companion = Result.Companion;
                                pausemyrequest2.IAuthTabCallback((pauseMyRequest<Result<setRubIn<T>>>) Result.IAuthTabCallback(Result.m31constructorimpl(new ReadonlyStateFlow(r4, getFullPackage.onExtraCallback(findresandmsg2.getCoroutineContext())))));
                                objectRef3.element = r4;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = objectRef2;
                    this.label = 1;
                    if (iAnimation.collect(setripple, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                if (objectRef.element == 0) {
                    pauseMyRequest<Result<setRubIn<T>>> pausemyrequest2 = this.$result;
                    Result.Companion companion = Result.Companion;
                    pausemyrequest2.IAuthTabCallback((pauseMyRequest<Result<setRubIn<T>>>) Result.IAuthTabCallback(Result.m31constructorimpl(ResultKt.createFailure(new NoSuchElementException("Flow is empty")))));
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$result.onExtraCallback(th);
                throw th;
            }
        }
    }

    private static final <T> void onExtraCallbackWithResult(findResAndMsg findresandmsg, CoroutineContext coroutineContext, IAnimation<? extends T> iAnimation, pauseMyRequest<Result<setRubIn<T>>> pausemyrequest) {
        onLoadStarted.onExtraCallback(findresandmsg, coroutineContext, null, new IAuthTabCallback(iAnimation, pausemyrequest, null), 2, null);
    }

    public static final <T> getTileModeX<T> onNavigationEvent(@NotNull getBorderRadius<T> getborderradius) {
        return new ReadonlySharedFlow(getborderradius, null);
    }

    public static final <T> setRubIn<T> onExtraCallbackWithResult(@NotNull getCornerRadius<T> getcornerradius) {
        return new ReadonlyStateFlow(getcornerradius, null);
    }

    public static final <T> getTileModeX<T> onExtraCallbackWithResult(@NotNull getTileModeX<? extends T> gettilemodex, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new getColorFilter(gettilemodex, function2);
    }
}
