package o;

import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya12 {

    static final class IAuthTabCallbackDefault<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onNavigationEvent((IAnimation) null, this);
        }
    }

    static final class asBinder<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.IAuthTabCallback((IAnimation) null, (Function2) null, this);
        }
    }

    static final class onExtraCallback<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onExtraCallback((IAnimation) null, this);
        }
    }

    static final class onExtraCallbackWithResult<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onExtraCallbackWithResult((IAnimation) null, (Function2) null, this);
        }
    }

    static final class onTransact<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.IAuthTabCallback((IAnimation) null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i = iAuthTabCallbackDefault.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i - 2147483648;
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackDefault.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallbackDefault.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) syazb.onNavigationEvent;
            setRipple<? super Object> iAuthTabCallbackStub = new IAuthTabCallbackStub<>(objectRef2);
            iAuthTabCallbackDefault.L$0 = objectRef2;
            iAuthTabCallbackDefault.label = 1;
            if (iAnimation.collect(iAuthTabCallbackStub, iAuthTabCallbackDefault) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) iAuthTabCallbackDefault.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        T t = objectRef.element;
        if (t != syazb.onNavigationEvent) {
            return t;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    static final class IAuthTabCallbackStub<T> implements setRipple {
        final /* synthetic */ Ref.ObjectRef<Object> onExtraCallback;

        IAuthTabCallbackStub(Ref.ObjectRef<Object> objectRef) {
            this.onExtraCallback = objectRef;
        }

        @Override // o.setRipple
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            Ref.ObjectRef<Object> objectRef = this.onExtraCallback;
            if (objectRef.element != syazb.onNavigationEvent) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        onExtraCallback onextracallback;
        Ref.ObjectRef objectRef;
        zb1 e;
        setRipple<? super Object> setripple;
        T t;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) syazb.onNavigationEvent;
            setRipple<? super Object> onwarmupcompleted = new onWarmupCompleted<>(objectRef2);
            try {
                onextracallback.L$0 = objectRef2;
                onextracallback.L$1 = onwarmupcompleted;
                onextracallback.label = 1;
                if (iAnimation.collect(onwarmupcompleted, onextracallback) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                objectRef = objectRef2;
            } catch (zb1 e2) {
                objectRef = objectRef2;
                e = e2;
                setripple = onwarmupcompleted;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(onextracallback.getContext());
                t = objectRef.element;
                if (t != syazb.onNavigationEvent) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setripple = (onWarmupCompleted) onextracallback.L$1;
            objectRef = (Ref.ObjectRef) onextracallback.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (zb1 e3) {
                e = e3;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(onextracallback.getContext());
                t = objectRef.element;
                if (t != syazb.onNavigationEvent) {
                }
            }
        }
        t = objectRef.element;
        if (t != syazb.onNavigationEvent) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Ref.ObjectRef objectRef;
        zb1 e;
        setRipple<? super Object> setripple;
        T t;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) syazb.onNavigationEvent;
            setRipple<? super Object> iAuthTabCallback = new IAuthTabCallback<>(function2, objectRef2);
            try {
                onextracallbackwithresult.L$0 = objectRef2;
                onextracallbackwithresult.L$1 = iAuthTabCallback;
                onextracallbackwithresult.label = 1;
                if (iAnimation.collect(iAuthTabCallback, onextracallbackwithresult) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                objectRef = objectRef2;
            } catch (zb1 e2) {
                objectRef = objectRef2;
                e = e2;
                setripple = iAuthTabCallback;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(onextracallbackwithresult.getContext());
                t = objectRef.element;
                if (t != syazb.onNavigationEvent) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setripple = (IAuthTabCallback) onextracallbackwithresult.L$1;
            objectRef = (Ref.ObjectRef) onextracallbackwithresult.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (zb1 e3) {
                e = e3;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(onextracallbackwithresult.getContext());
                t = objectRef.element;
                if (t != syazb.onNavigationEvent) {
                }
            }
        }
        t = objectRef.element;
        if (t != syazb.onNavigationEvent) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        onTransact ontransact;
        Ref.ObjectRef objectRef;
        zb1 e;
        setRipple<? super Object> setripple;
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i = ontransact.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ontransact.label = i - 2147483648;
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        Object obj = ontransact.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = ontransact.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            setRipple<? super Object> onnavigationevent = new onNavigationEvent<>(objectRef2);
            try {
                ontransact.L$0 = objectRef2;
                ontransact.L$1 = onnavigationevent;
                ontransact.label = 1;
                if (iAnimation.collect(onnavigationevent, ontransact) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                objectRef = objectRef2;
            } catch (zb1 e2) {
                objectRef = objectRef2;
                e = e2;
                setripple = onnavigationevent;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(ontransact.getContext());
                return objectRef.element;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setripple = (onNavigationEvent) ontransact.L$1;
            objectRef = (Ref.ObjectRef) ontransact.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (zb1 e3) {
                e = e3;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(ontransact.getContext());
                return objectRef.element;
            }
        }
        return objectRef.element;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements setRipple<T> {
        final /* synthetic */ Function2 IAuthTabCallback;
        final /* synthetic */ Ref.ObjectRef onNavigationEvent;

        /* renamed from: o.sya12$IAuthTabCallback$3, reason: invalid class name */
        public static final class AnonymousClass3 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass3(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return IAuthTabCallback.this.emit(null, this);
            }
        }

        public IAuthTabCallback(Function2 function2, Ref.ObjectRef objectRef) {
            this.IAuthTabCallback = function2;
            this.onNavigationEvent = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t, access13800<? super Unit> access13800Var) {
            AnonymousClass3 anonymousClass3;
            IAuthTabCallback<T> iAuthTabCallback;
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
                Function2 function2 = this.IAuthTabCallback;
                anonymousClass3.L$0 = this;
                anonymousClass3.L$1 = t;
                anonymousClass3.label = 1;
                InlineMarker.mark(6);
                objInvoke = function2.invoke(t, anonymousClass3);
                InlineMarker.mark(7);
                if (objInvoke == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                iAuthTabCallback = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) anonymousClass3.L$1;
                iAuthTabCallback = (IAuthTabCallback) anonymousClass3.L$0;
                ResultKt.onNavigationEvent(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            iAuthTabCallback.onNavigationEvent.element = t;
            throw new zb1(iAuthTabCallback);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asInterface<T> implements setRipple<T> {
        final /* synthetic */ Function2 onExtraCallback;
        final /* synthetic */ Ref.ObjectRef onWarmupCompleted;

        /* renamed from: o.sya12$asInterface$3, reason: invalid class name */
        public static final class AnonymousClass3 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass3(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return asInterface.this.emit(null, this);
            }
        }

        public asInterface(Function2 function2, Ref.ObjectRef objectRef) {
            this.onExtraCallback = function2;
            this.onWarmupCompleted = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(T t, access13800<? super Unit> access13800Var) {
            AnonymousClass3 anonymousClass3;
            asInterface<T> asinterface;
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
                Function2 function2 = this.onExtraCallback;
                anonymousClass3.L$0 = this;
                anonymousClass3.L$1 = t;
                anonymousClass3.label = 1;
                InlineMarker.mark(6);
                objInvoke = function2.invoke(t, anonymousClass3);
                InlineMarker.mark(7);
                if (objInvoke == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                asinterface = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) anonymousClass3.L$1;
                asinterface = (asInterface) anonymousClass3.L$0;
                ResultKt.onNavigationEvent(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            asinterface.onWarmupCompleted.element = t;
            throw new zb1(asinterface);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements setRipple<T> {
        final /* synthetic */ Ref.ObjectRef onNavigationEvent;

        public onNavigationEvent(Ref.ObjectRef objectRef) {
            this.onNavigationEvent = objectRef;
        }

        @Override // o.setRipple
        public Object emit(T t, access13800<? super Unit> access13800Var) {
            this.onNavigationEvent.element = t;
            throw new zb1(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements setRipple<T> {
        final /* synthetic */ Ref.ObjectRef onWarmupCompleted;

        public onWarmupCompleted(Ref.ObjectRef objectRef) {
            this.onWarmupCompleted = objectRef;
        }

        @Override // o.setRipple
        public Object emit(T t, access13800<? super Unit> access13800Var) {
            this.onWarmupCompleted.element = t;
            throw new zb1(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        asBinder asbinder;
        Ref.ObjectRef objectRef;
        zb1 e;
        setRipple<? super Object> setripple;
        if (access13800Var instanceof asBinder) {
            asbinder = (asBinder) access13800Var;
            int i = asbinder.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asbinder.label = i - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object obj = asbinder.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = asbinder.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            setRipple<? super Object> asinterface = new asInterface<>(function2, objectRef2);
            try {
                asbinder.L$0 = objectRef2;
                asbinder.L$1 = asinterface;
                asbinder.label = 1;
                if (iAnimation.collect(asinterface, asbinder) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                objectRef = objectRef2;
            } catch (zb1 e2) {
                objectRef = objectRef2;
                e = e2;
                setripple = asinterface;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(asbinder.getContext());
                return objectRef.element;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setripple = (asInterface) asbinder.L$1;
            objectRef = (Ref.ObjectRef) asbinder.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (zb1 e3) {
                e = e3;
                syasya.onNavigationEvent(e, setripple);
                getFullPackage.IAuthTabCallback(asbinder.getContext());
                return objectRef.element;
            }
        }
        return objectRef.element;
    }
}
