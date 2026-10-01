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
final class RnPhaseObserver$withHostSetup$3<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ Function1<access13800<? super T>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RnPhaseObserver$withHostSetup$3(Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super RnPhaseObserver$withHostSetup$3> access13800Var) {
        super(2, access13800Var);
        this.$block = function1;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RnPhaseObserver$withHostSetup$3 rnPhaseObserver$withHostSetup$3 = new RnPhaseObserver$withHostSetup$3(this.$block, access13800Var);
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return rnPhaseObserver$withHostSetup$3;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super T> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        int i3 = onNavigationEvent + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return objOnWarmupCompleted;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access14300.onWarmupCompleted();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            Function1<access13800<? super T>, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == objOnWarmupCompleted ? objOnWarmupCompleted : objInvoke;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ResultKt.onNavigationEvent(obj);
        return obj;
    }
}
