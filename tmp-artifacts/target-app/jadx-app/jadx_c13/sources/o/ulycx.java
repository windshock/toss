package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class ulycx {

    static final class onNavigationEvent<T, C extends Collection<? super T>> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onWarmupCompleted((IAnimation) null, (Collection) null, this);
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(IAnimation iAnimation, List list, access13800 access13800Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return ycxycx.onExtraCallbackWithResult(iAnimation, list, access13800Var);
    }

    public static final <T> Object onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull List<T> list, @NotNull access13800<? super List<? extends T>> access13800Var) {
        return ycxycx.onWarmupCompleted((IAnimation) iAnimation, list, (access13800<? super List<T>>) access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends Collection<? super T>> Object onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull C c, @NotNull access13800<? super C> access13800Var) {
        onNavigationEvent onnavigationevent;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            return collection;
        }
        ResultKt.onNavigationEvent(obj);
        setRipple<? super Object> onwarmupcompleted = new onWarmupCompleted<>(c);
        onnavigationevent.L$0 = c;
        onnavigationevent.label = 1;
        return iAnimation.collect(onwarmupcompleted, onnavigationevent) == objOnExtraCallback ? objOnExtraCallback : c;
    }

    static final class onWarmupCompleted<T> implements setRipple {

        /* JADX INFO: Incorrect field signature: TC; */
        final /* synthetic */ Collection IAuthTabCallback;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        onWarmupCompleted(Collection collection) {
            this.IAuthTabCallback = collection;
        }

        @Override // o.setRipple
        public final Object emit(T t, access13800<? super Unit> access13800Var) {
            this.IAuthTabCallback.add(t);
            return Unit.INSTANCE;
        }
    }
}
