package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ok1<T> implements IAnimation<T> {
    public final Function2<Object, Object, Boolean> IAuthTabCallback;
    public final Function1<T, Object> onExtraCallback;
    private final IAnimation<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ok1(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.onNavigationEvent = iAnimation;
        this.onExtraCallback = function1;
        this.IAuthTabCallback = function2;
    }

    static final class IAuthTabCallback<T> implements setRipple {
        final /* synthetic */ Ref.ObjectRef<Object> IAuthTabCallback;
        final /* synthetic */ setRipple<T> onExtraCallback;
        final /* synthetic */ ok1<T> onWarmupCompleted;

        static final class onExtraCallback extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ IAuthTabCallback<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallback(IAuthTabCallback<? super T> iAuthTabCallback, access13800<? super onExtraCallback> access13800Var) {
                super(access13800Var);
                this.this$0 = iAuthTabCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(ok1<T> ok1Var, Ref.ObjectRef<Object> objectRef, setRipple<? super T> setripple) {
            this.onWarmupCompleted = ok1Var;
            this.IAuthTabCallback = objectRef;
            this.onExtraCallback = setripple;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            onExtraCallback onextracallback;
            if (access13800Var instanceof onExtraCallback) {
                onextracallback = (onExtraCallback) access13800Var;
                int i = onextracallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onextracallback.label = i - 2147483648;
                } else {
                    onextracallback = new onExtraCallback(this, access13800Var);
                }
            }
            Object obj = onextracallback.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = onextracallback.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                T t2 = (T) this.onWarmupCompleted.onExtraCallback.invoke(t);
                Object obj2 = this.IAuthTabCallback.element;
                if (obj2 == syazb.onNavigationEvent || !this.onWarmupCompleted.IAuthTabCallback.invoke(obj2, t2).booleanValue()) {
                    this.IAuthTabCallback.element = t2;
                    setRipple<T> setripple = this.onExtraCallback;
                    onextracallback.label = 1;
                    if (setripple.emit(t, onextracallback) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    return Unit.INSTANCE;
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

    @Override // o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) syazb.onNavigationEvent;
        Object objCollect = this.onNavigationEvent.collect(new IAuthTabCallback(this, objectRef, setripple), access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }
}
