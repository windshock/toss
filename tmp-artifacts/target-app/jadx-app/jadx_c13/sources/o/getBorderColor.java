package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class getBorderColor {

    static final class IAuthTabCallbackDefault implements Function0 {
        public static final IAuthTabCallbackDefault onExtraCallbackWithResult = new IAuthTabCallbackDefault();

        IAuthTabCallbackDefault() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class onExtraCallback<R> extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
        final /* synthetic */ getBacktraceNote<T1, T2, access13800<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(getBacktraceNote<? super T1, ? super T2, ? super access13800<? super R>, ? extends Object> getbacktracenote, access13800<? super onExtraCallback> access13800Var) {
            super(3, access13800Var);
            this.$transform = getbacktracenote;
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.$transform, access13800Var);
            onextracallback.L$0 = setripple;
            onextracallback.L$1 = objArr;
            return onextracallback.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L17;
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
                setripple = (setRipple) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                getBacktraceNote<T1, T2, access13800<? super R>, Object> getbacktracenote = this.$transform;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.L$0 = setripple;
                this.label = 1;
                obj = getbacktracenote.invoke(obj2, obj3, this);
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
            setripple = (setRipple) this.L$0;
            ResultKt.onNavigationEvent(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public static final <T1, T2, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull getBacktraceNote<? super T1, ? super T2, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return ycxycx.onNavigationEvent((IAnimation) iAnimation, (IAnimation) iAnimation2, (getBacktraceNote) getbacktracenote);
    }

    public static final <T1, T2, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull setTaggedAddrCtrl<? super setRipple<? super R>, ? super T1, ? super T2, ? super access13800<? super Unit>, ? extends Object> settaggedaddrctrl) {
        return ycxycx.onExtraCallbackWithResult(new asInterface(new IAnimation[]{iAnimation, iAnimation2}, null, settaggedaddrctrl));
    }

    public static final <T1, T2, R> IAnimation<R> onExtraCallback(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull setTaggedAddrCtrl<? super setRipple<? super R>, ? super T1, ? super T2, ? super access13800<? super Unit>, ? extends Object> settaggedaddrctrl) {
        return ycxycx.onExtraCallbackWithResult(new asBinder(new IAnimation[]{iAnimation, iAnimation2}, null, settaggedaddrctrl));
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class IAuthTabCallback<R> implements IAnimation<R> {
        final /* synthetic */ setUnreadableElfFiles IAuthTabCallback;
        final /* synthetic */ IAnimation[] onExtraCallback;

        public IAuthTabCallback(IAnimation[] iAnimationArr, setUnreadableElfFiles setunreadableelffiles) {
            this.onExtraCallback = iAnimationArr;
            this.IAuthTabCallback = setunreadableelffiles;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objOnWarmupCompleted = syadj.onWarmupCompleted(setripple, this.onExtraCallback, getBorderColor.onExtraCallback(), new AnonymousClass3(null, this.IAuthTabCallback), access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }

        /* renamed from: o.getBorderColor$IAuthTabCallback$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setUnreadableElfFiles $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(access13800 access13800Var, setUnreadableElfFiles setunreadableelffiles) {
                super(3, access13800Var);
                this.$transform$inlined = setunreadableelffiles;
            }

            @Override // o.getBacktraceNote
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var, this.$transform$inlined);
                anonymousClass3.L$0 = setripple;
                anonymousClass3.L$1 = objArr;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
            
                if (r1.emit(r11, r10) == r0) goto L17;
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
                    setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setUnreadableElfFiles setunreadableelffiles = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.L$0 = setripple;
                    this.label = 1;
                    InlineMarker.mark(6);
                    obj = setunreadableelffiles.invoke(obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
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
                setripple = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
                this.L$0 = null;
                this.label = 2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onExtraCallbackWithResult<R> implements IAnimation<R> {
        final /* synthetic */ setPacEnabledKeys IAuthTabCallback;
        final /* synthetic */ IAnimation[] onNavigationEvent;

        public onExtraCallbackWithResult(IAnimation[] iAnimationArr, setPacEnabledKeys setpacenabledkeys) {
            this.onNavigationEvent = iAnimationArr;
            this.IAuthTabCallback = setpacenabledkeys;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objOnWarmupCompleted = syadj.onWarmupCompleted(setripple, this.onNavigationEvent, getBorderColor.onExtraCallback(), new AnonymousClass3(null, this.IAuthTabCallback), access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }

        /* renamed from: o.getBorderColor$onExtraCallbackWithResult$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setPacEnabledKeys $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(access13800 access13800Var, setPacEnabledKeys setpacenabledkeys) {
                super(3, access13800Var);
                this.$transform$inlined = setpacenabledkeys;
            }

            @Override // o.getBacktraceNote
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var, this.$transform$inlined);
                anonymousClass3.L$0 = setripple;
                anonymousClass3.L$1 = objArr;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r1.emit(r12, r11) == r0) goto L17;
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
                    setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setPacEnabledKeys setpacenabledkeys = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.L$0 = setripple;
                    this.label = 1;
                    InlineMarker.mark(6);
                    obj = setpacenabledkeys.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
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
                setripple = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
                this.L$0 = null;
                this.label = 2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onNavigationEvent<R> implements IAnimation<R> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ getBacktraceNote onExtraCallbackWithResult;
        final /* synthetic */ IAnimation onNavigationEvent;

        public onNavigationEvent(IAnimation iAnimation, IAnimation iAnimation2, getBacktraceNote getbacktracenote) {
            this.IAuthTabCallback = iAnimation;
            this.onNavigationEvent = iAnimation2;
            this.onExtraCallbackWithResult = getbacktracenote;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            Object objOnWarmupCompleted = syadj.onWarmupCompleted(setripple, new IAnimation[]{this.IAuthTabCallback, this.onNavigationEvent}, getBorderColor.onExtraCallback(), new onExtraCallback(this.onExtraCallbackWithResult, null), access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onWarmupCompleted<R> implements IAnimation<R> {
        final /* synthetic */ setTaggedAddrCtrl onExtraCallback;
        final /* synthetic */ IAnimation[] onNavigationEvent;

        public onWarmupCompleted(IAnimation[] iAnimationArr, setTaggedAddrCtrl settaggedaddrctrl) {
            this.onNavigationEvent = iAnimationArr;
            this.onExtraCallback = settaggedaddrctrl;
        }

        @Override // o.IAnimation
        public Object collect(setRipple setripple, access13800 access13800Var) {
            Object objOnWarmupCompleted = syadj.onWarmupCompleted(setripple, this.onNavigationEvent, getBorderColor.onExtraCallback(), new AnonymousClass3(null, this.onExtraCallback), access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }

        /* renamed from: o.getBorderColor$onWarmupCompleted$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setTaggedAddrCtrl $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(access13800 access13800Var, setTaggedAddrCtrl settaggedaddrctrl) {
                super(3, access13800Var);
                this.$transform$inlined = settaggedaddrctrl;
            }

            @Override // o.getBacktraceNote
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var, this.$transform$inlined);
                anonymousClass3.L$0 = setripple;
                anonymousClass3.L$1 = objArr;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
            
                if (r1.emit(r8, r7) == r0) goto L17;
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
                    setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setTaggedAddrCtrl settaggedaddrctrl = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.L$0 = setripple;
                    this.label = 1;
                    InlineMarker.mark(6);
                    obj = settaggedaddrctrl.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
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
                setripple = (setRipple) this.L$0;
                ResultKt.onNavigationEvent(obj);
                this.L$0 = null;
                this.label = 2;
            }
        }
    }

    public static final <T1, T2, T3, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull setTaggedAddrCtrl<? super T1, ? super T2, ? super T3, ? super access13800<? super R>, ? extends Object> settaggedaddrctrl) {
        return new onWarmupCompleted(new IAnimation[]{iAnimation, iAnimation2, iAnimation3}, settaggedaddrctrl);
    }

    public static final <T1, T2, T3, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull setUnreadableElfFiles<? super setRipple<? super R>, ? super T1, ? super T2, ? super T3, ? super access13800<? super Unit>, ? extends Object> setunreadableelffiles) {
        return ycxycx.onExtraCallbackWithResult(new onTransact(new IAnimation[]{iAnimation, iAnimation2, iAnimation3}, null, setunreadableelffiles));
    }

    public static final <T1, T2, T3, T4, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull setUnreadableElfFiles<? super T1, ? super T2, ? super T3, ? super T4, ? super access13800<? super R>, ? extends Object> setunreadableelffiles) {
        return new IAuthTabCallback(new IAnimation[]{iAnimation, iAnimation2, iAnimation3, iAnimation4}, setunreadableelffiles);
    }

    public static final <T1, T2, T3, T4, T5, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull IAnimation<? extends T5> iAnimation5, @NotNull setPacEnabledKeys<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super access13800<? super R>, ? extends Object> setpacenabledkeys) {
        return new onExtraCallbackWithResult(new IAnimation[]{iAnimation, iAnimation2, iAnimation3, iAnimation4, iAnimation5}, setpacenabledkeys);
    }

    public static final <T1, T2, T3, T4, T5, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull IAnimation<? extends T5> iAnimation5, @NotNull getBacktraceNoteList<? super setRipple<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super access13800<? super Unit>, ? extends Object> getbacktracenotelist) {
        return ycxycx.onExtraCallbackWithResult(new IAuthTabCallbackStub(new IAnimation[]{iAnimation, iAnimation2, iAnimation3, iAnimation4, iAnimation5}, null, getbacktracenotelist));
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class IAuthTabCallbackStub<R> extends SuspendLambda implements Function2<setRipple<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation[] $flows;
        final /* synthetic */ getBacktraceNoteList $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(IAnimation[] iAnimationArr, access13800 access13800Var, getBacktraceNoteList getbacktracenotelist) {
            super(2, access13800Var);
            this.$flows = iAnimationArr;
            this.$transform$inlined = getbacktracenotelist;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$flows, access13800Var, this.$transform$inlined);
            iAuthTabCallbackStub.L$0 = obj;
            return iAuthTabCallbackStub;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackStub) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.getBorderColor$IAuthTabCallbackStub$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ getBacktraceNoteList $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(access13800 access13800Var, getBacktraceNoteList getbacktracenotelist) {
                super(3, access13800Var);
                this.$transform$inlined = getbacktracenotelist;
            }

            @Override // o.getBacktraceNote
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(access13800Var, this.$transform$inlined);
                anonymousClass4.L$0 = setripple;
                anonymousClass4.L$1 = objArr;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRipple setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    getBacktraceNoteList getbacktracenotelist = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = getbacktracenotelist.invoke(setripple, obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (objInvoke == objOnExtraCallback) {
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
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                IAnimation[] iAnimationArr = this.$flows;
                Function0 function0OnExtraCallback = getBorderColor.onExtraCallback();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(null, this.$transform$inlined);
                this.label = 1;
                if (syadj.onWarmupCompleted(setripple, iAnimationArr, function0OnExtraCallback, anonymousClass4, this) == objOnExtraCallback) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class asBinder<R> extends SuspendLambda implements Function2<setRipple<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation[] $flows;
        final /* synthetic */ setTaggedAddrCtrl $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(IAnimation[] iAnimationArr, access13800 access13800Var, setTaggedAddrCtrl settaggedaddrctrl) {
            super(2, access13800Var);
            this.$flows = iAnimationArr;
            this.$transform$inlined = settaggedaddrctrl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            asBinder asbinder = new asBinder(this.$flows, access13800Var, this.$transform$inlined);
            asbinder.L$0 = obj;
            return asbinder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            return ((asBinder) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.getBorderColor$asBinder$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setTaggedAddrCtrl $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(access13800 access13800Var, setTaggedAddrCtrl settaggedaddrctrl) {
                super(3, access13800Var);
                this.$transform$inlined = settaggedaddrctrl;
            }

            @Override // o.getBacktraceNote
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(access13800Var, this.$transform$inlined);
                anonymousClass2.L$0 = setripple;
                anonymousClass2.L$1 = objArr;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRipple setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setTaggedAddrCtrl settaggedaddrctrl = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = settaggedaddrctrl.invoke(setripple, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (objInvoke == objOnExtraCallback) {
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
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                IAnimation[] iAnimationArr = this.$flows;
                Function0 function0OnExtraCallback = getBorderColor.onExtraCallback();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, this.$transform$inlined);
                this.label = 1;
                if (syadj.onWarmupCompleted(setripple, iAnimationArr, function0OnExtraCallback, anonymousClass2, this) == objOnExtraCallback) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class asInterface<R> extends SuspendLambda implements Function2<setRipple<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation[] $flows;
        final /* synthetic */ setTaggedAddrCtrl $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(IAnimation[] iAnimationArr, access13800 access13800Var, setTaggedAddrCtrl settaggedaddrctrl) {
            super(2, access13800Var);
            this.$flows = iAnimationArr;
            this.$transform$inlined = settaggedaddrctrl;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            return ((asInterface) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            asInterface asinterface = new asInterface(this.$flows, access13800Var, this.$transform$inlined);
            asinterface.L$0 = obj;
            return asinterface;
        }

        /* renamed from: o.getBorderColor$asInterface$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setTaggedAddrCtrl $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(access13800 access13800Var, setTaggedAddrCtrl settaggedaddrctrl) {
                super(3, access13800Var);
                this.$transform$inlined = settaggedaddrctrl;
            }

            @Override // o.getBacktraceNote
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(access13800Var, this.$transform$inlined);
                anonymousClass1.L$0 = setripple;
                anonymousClass1.L$1 = objArr;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRipple setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setTaggedAddrCtrl settaggedaddrctrl = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = settaggedaddrctrl.invoke(setripple, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (objInvoke == objOnExtraCallback) {
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
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                IAnimation[] iAnimationArr = this.$flows;
                Function0 function0OnExtraCallback = getBorderColor.onExtraCallback();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
                this.label = 1;
                if (syadj.onWarmupCompleted(setripple, iAnimationArr, function0OnExtraCallback, anonymousClass1, this) == objOnExtraCallback) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onTransact<R> extends SuspendLambda implements Function2<setRipple<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ IAnimation[] $flows;
        final /* synthetic */ setUnreadableElfFiles $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(IAnimation[] iAnimationArr, access13800 access13800Var, setUnreadableElfFiles setunreadableelffiles) {
            super(2, access13800Var);
            this.$flows = iAnimationArr;
            this.$transform$inlined = setunreadableelffiles;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onTransact ontransact = new onTransact(this.$flows, access13800Var, this.$transform$inlined);
            ontransact.L$0 = obj;
            return ontransact;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            return ((onTransact) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: o.getBorderColor$onTransact$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements getBacktraceNote<setRipple<? super R>, Object[], access13800<? super Unit>, Object> {
            final /* synthetic */ setUnreadableElfFiles $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(access13800 access13800Var, setUnreadableElfFiles setunreadableelffiles) {
                super(3, access13800Var);
                this.$transform$inlined = setunreadableelffiles;
            }

            @Override // o.getBacktraceNote
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(setRipple<? super R> setripple, Object[] objArr, access13800<? super Unit> access13800Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(access13800Var, this.$transform$inlined);
                anonymousClass2.L$0 = setripple;
                anonymousClass2.L$1 = objArr;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRipple setripple = (setRipple) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    setUnreadableElfFiles setunreadableelffiles = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = setunreadableelffiles.invoke(setripple, obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (objInvoke == objOnExtraCallback) {
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
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple setripple = (setRipple) this.L$0;
                IAnimation[] iAnimationArr = this.$flows;
                Function0 function0OnExtraCallback = getBorderColor.onExtraCallback();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, this.$transform$inlined);
                this.label = 1;
                if (syadj.onWarmupCompleted(setripple, iAnimationArr, function0OnExtraCallback, anonymousClass2, this) == objOnExtraCallback) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function0<T[]> onExtraCallback() {
        return IAuthTabCallbackDefault.onExtraCallbackWithResult;
    }

    public static final <T1, T2, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull getBacktraceNote<? super T1, ? super T2, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return new onNavigationEvent(iAnimation, iAnimation2, getbacktracenote);
    }
}
