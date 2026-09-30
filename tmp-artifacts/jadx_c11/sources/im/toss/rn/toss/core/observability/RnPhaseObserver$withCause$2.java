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
final class RnPhaseObserver$withCause$2<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ Function1<access13800<? super T>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RnPhaseObserver$withCause$2(Function1<? super access13800<? super T>, ? extends Object> function1, access13800<? super RnPhaseObserver$withCause$2> access13800Var) {
        super(2, access13800Var);
        this.$block = function1;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RnPhaseObserver$withCause$2 rnPhaseObserver$withCause$2 = new RnPhaseObserver$withCause$2(this.$block, access13800Var);
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return rnPhaseObserver$withCause$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RnPhaseObserver$withCause$2 rnPhaseObserver$withCause$2Create = create(findresandmsg, access13800Var);
        if (i3 == 0) {
            rnPhaseObserver$withCause$2Create.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = rnPhaseObserver$withCause$2Create.invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        Function1<access13800<? super T>, Object> function1 = this.$block;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        if (objInvoke != objOnWarmupCompleted) {
            int i4 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvoke;
        }
        int i6 = onExtraCallbackWithResult + 115;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 81;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }
}
