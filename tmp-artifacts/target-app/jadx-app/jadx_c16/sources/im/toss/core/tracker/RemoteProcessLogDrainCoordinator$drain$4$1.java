package im.toss.core.tracker;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RemoteProcessLogDrainCoordinator$drain$4$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ RemoteProcessLogIngressStore$ClaimedEnvelope $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessLogDrainCoordinator$drain$4$1(RemoteProcessLogIngressStore$ClaimedEnvelope remoteProcessLogIngressStore$ClaimedEnvelope, access13800<? super RemoteProcessLogDrainCoordinator$drain$4$1> access13800Var) {
        super(2, access13800Var);
        this.$item = remoteProcessLogIngressStore$ClaimedEnvelope;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteProcessLogDrainCoordinator$drain$4$1 remoteProcessLogDrainCoordinator$drain$4$1 = new RemoteProcessLogDrainCoordinator$drain$4$1(this.$item, access13800Var);
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteProcessLogDrainCoordinator$drain$4$1;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = i3 + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        ResultKt.onNavigationEvent(obj);
        if (i5 != 0) {
            this.$item.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        this.$item.IAuthTabCallback();
        Unit unit2 = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit2;
        }
        throw null;
    }
}
