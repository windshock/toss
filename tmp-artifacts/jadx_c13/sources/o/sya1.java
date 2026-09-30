package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya1 {

    static final class onWarmupCompleted<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return sya1.onNavigationEvent(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements IAnimation<T> {
        final /* synthetic */ getBacktraceNote onExtraCallbackWithResult;
        final /* synthetic */ IAnimation onWarmupCompleted;

        /* renamed from: o.sya1$IAuthTabCallback$5, reason: invalid class name */
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
                return IAuthTabCallback.this.collect(null, this);
            }
        }

        public IAuthTabCallback(IAnimation iAnimation, getBacktraceNote getbacktracenote) {
            this.onWarmupCompleted = iAnimation;
            this.onExtraCallbackWithResult = getbacktracenote;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) throws Throwable {
            AnonymousClass5 anonymousClass5;
            IAuthTabCallback<T> iAuthTabCallback;
            setStretch setstretch;
            getBacktraceNote getbacktracenote;
            djzb djzbVar;
            Throwable th;
            djzb djzbVar2;
            Object objInvoke;
            if (access13800Var instanceof AnonymousClass5) {
                anonymousClass5 = (AnonymousClass5) access13800Var;
                int i = anonymousClass5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass5.label = i - 2147483648;
                } else {
                    anonymousClass5 = new AnonymousClass5(access13800Var);
                }
            }
            Object obj = anonymousClass5.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass5.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                try {
                    IAnimation iAnimation = this.onWarmupCompleted;
                    anonymousClass5.L$0 = this;
                    anonymousClass5.L$1 = setripple;
                    anonymousClass5.label = 1;
                    if (iAnimation.collect(setripple, anonymousClass5) != objOnExtraCallback) {
                        iAuthTabCallback = this;
                        djzbVar = new djzb(setripple, anonymousClass5.getContext());
                        getBacktraceNote getbacktracenote2 = iAuthTabCallback.onExtraCallbackWithResult;
                        anonymousClass5.L$0 = djzbVar;
                        anonymousClass5.L$1 = null;
                        anonymousClass5.label = 3;
                        InlineMarker.mark(6);
                        objInvoke = getbacktracenote2.invoke(djzbVar, null, anonymousClass5);
                        InlineMarker.mark(7);
                        if (objInvoke != objOnExtraCallback) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    iAuthTabCallback = this;
                    setstretch = new setStretch(th);
                    getbacktracenote = iAuthTabCallback.onExtraCallbackWithResult;
                    anonymousClass5.L$0 = th;
                    anonymousClass5.L$1 = null;
                    anonymousClass5.label = 2;
                    if (sya1.onNavigationEvent(setstretch, getbacktracenote, th, anonymousClass5) != objOnExtraCallback) {
                    }
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    Throwable th3 = (Throwable) anonymousClass5.L$0;
                    ResultKt.onNavigationEvent(obj);
                    throw th3;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                djzbVar2 = (djzb) anonymousClass5.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    djzbVar2.releaseIntercepted();
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    djzbVar2.releaseIntercepted();
                    throw th;
                }
            }
            setripple = (setRipple) anonymousClass5.L$1;
            iAuthTabCallback = (IAuthTabCallback) anonymousClass5.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                djzbVar = new djzb(setripple, anonymousClass5.getContext());
            } catch (Throwable th5) {
                th = th5;
                setstretch = new setStretch(th);
                getbacktracenote = iAuthTabCallback.onExtraCallbackWithResult;
                anonymousClass5.L$0 = th;
                anonymousClass5.L$1 = null;
                anonymousClass5.label = 2;
                if (sya1.onNavigationEvent(setstretch, getbacktracenote, th, anonymousClass5) != objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                throw th;
            }
            try {
                getBacktraceNote getbacktracenote22 = iAuthTabCallback.onExtraCallbackWithResult;
                anonymousClass5.L$0 = djzbVar;
                anonymousClass5.L$1 = null;
                anonymousClass5.label = 3;
                InlineMarker.mark(6);
                objInvoke = getbacktracenote22.invoke(djzbVar, null, anonymousClass5);
                InlineMarker.mark(7);
                if (objInvoke != objOnExtraCallback) {
                    djzbVar2 = djzbVar;
                    djzbVar2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
                return objOnExtraCallback;
            } catch (Throwable th6) {
                th = th6;
                djzbVar2 = djzbVar;
                djzbVar2.releaseIntercepted();
                throw th;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements IAnimation<T> {
        final /* synthetic */ Function2 onExtraCallback;
        final /* synthetic */ IAnimation onWarmupCompleted;

        /* renamed from: o.sya1$onNavigationEvent$3, reason: invalid class name */
        public static final class AnonymousClass3 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass3(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onNavigationEvent.this.collect(null, this);
            }
        }

        public onNavigationEvent(Function2 function2, IAnimation iAnimation) {
            this.onExtraCallback = function2;
            this.onWarmupCompleted = iAnimation;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) throws Throwable {
            AnonymousClass3 anonymousClass3;
            Throwable th;
            djzb djzbVar;
            onNavigationEvent<T> onnavigationevent;
            setRipple<? super T> setripple2;
            if (access13800Var instanceof AnonymousClass3) {
                anonymousClass3 = (AnonymousClass3) access13800Var;
                int i = anonymousClass3.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass3.label = i - 2147483648;
                } else {
                    anonymousClass3 = new AnonymousClass3(access13800Var);
                }
            }
            Object obj = anonymousClass3.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass3.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                djzb djzbVar2 = new djzb(setripple, anonymousClass3.getContext());
                try {
                    Function2 function2 = this.onExtraCallback;
                    anonymousClass3.L$0 = this;
                    anonymousClass3.L$1 = setripple;
                    anonymousClass3.L$2 = djzbVar2;
                    anonymousClass3.label = 1;
                    InlineMarker.mark(6);
                    Object objInvoke = function2.invoke(djzbVar2, anonymousClass3);
                    InlineMarker.mark(7);
                    if (objInvoke != objOnExtraCallback) {
                        onnavigationevent = this;
                        setripple2 = setripple;
                        djzbVar = djzbVar2;
                        djzbVar.releaseIntercepted();
                        IAnimation iAnimation = onnavigationevent.onWarmupCompleted;
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 2;
                    }
                    return objOnExtraCallback;
                } catch (Throwable th2) {
                    th = th2;
                    djzbVar = djzbVar2;
                    djzbVar.releaseIntercepted();
                    throw th;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            djzbVar = (djzb) anonymousClass3.L$2;
            setripple2 = (setRipple) anonymousClass3.L$1;
            onnavigationevent = (onNavigationEvent) anonymousClass3.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                djzbVar.releaseIntercepted();
                IAnimation iAnimation2 = onnavigationevent.onWarmupCompleted;
                anonymousClass3.L$0 = null;
                anonymousClass3.L$1 = null;
                anonymousClass3.L$2 = null;
                anonymousClass3.label = 2;
            } catch (Throwable th3) {
                th = th3;
                djzbVar.releaseIntercepted();
                throw th;
            }
        }
    }

    public static final void onWarmupCompleted(@NotNull setRipple<?> setripple) {
        if (setripple instanceof setStretch) {
            throw ((setStretch) setripple).IAuthTabCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onNavigationEvent(setRipple<? super T> setripple, getBacktraceNote<? super setRipple<? super T>, ? super Throwable, ? super access13800<? super Unit>, ? extends Object> getbacktracenote, Throwable th, access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                onwarmupcompleted.L$0 = th;
                onwarmupcompleted.label = 1;
                if (getbacktracenote.invoke(setripple, th, onwarmupcompleted) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) onwarmupcompleted.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                setExecute.onNavigationEvent(th2, th);
            }
            throw th2;
        }
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new onNavigationEvent(function2, iAnimation);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super T>, ? super Throwable, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return new IAuthTabCallback(iAnimation, getbacktracenote);
    }
}
