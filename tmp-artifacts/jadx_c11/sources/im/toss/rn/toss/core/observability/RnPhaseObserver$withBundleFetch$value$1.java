package im.toss.rn.toss.core.observability;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RnPhaseObserver$withBundleFetch$value$1<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ Function1<access13800<? super T>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RnPhaseObserver$withBundleFetch$value$1(Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super RnPhaseObserver$withBundleFetch$value$1> access13800Var) {
        super(2, access13800Var);
        this.$block = function1;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RnPhaseObserver$withBundleFetch$value$1 rnPhaseObserver$withBundleFetch$value$1Create = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            rnPhaseObserver$withBundleFetch$value$1Create.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = rnPhaseObserver$withBundleFetch$value$1Create.invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RnPhaseObserver$withBundleFetch$value$1 rnPhaseObserver$withBundleFetch$value$1 = new RnPhaseObserver$withBundleFetch$value$1(this.$block, access13800Var);
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rnPhaseObserver$withBundleFetch$value$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super T> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        Function1<access13800<? super T>, Object> function1 = this.$block;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        if (objInvoke == objOnWarmupCompleted) {
            return objOnWarmupCompleted;
        }
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return objInvoke;
    }
}
