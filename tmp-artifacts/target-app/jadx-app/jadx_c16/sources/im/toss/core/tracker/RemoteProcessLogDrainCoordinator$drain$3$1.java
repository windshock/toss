package im.toss.core.tracker;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RemoteProcessLogDrainCoordinator$drain$3$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    final /* synthetic */ RemoteProcessLogIngressStore$ClaimedEnvelope $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessLogDrainCoordinator$drain$3$1(RemoteProcessLogIngressStore$ClaimedEnvelope remoteProcessLogIngressStore$ClaimedEnvelope, access13800<? super RemoteProcessLogDrainCoordinator$drain$3$1> access13800Var) {
        super(2, access13800Var);
        this.$item = remoteProcessLogIngressStore$ClaimedEnvelope;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteProcessLogDrainCoordinator$drain$3$1 remoteProcessLogDrainCoordinator$drain$3$1 = new RemoteProcessLogDrainCoordinator$drain$3$1(this.$item, access13800Var);
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteProcessLogDrainCoordinator$drain$3$1;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessLogDrainCoordinator$drain$3$1 remoteProcessLogDrainCoordinator$drain$3$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return remoteProcessLogDrainCoordinator$drain$3$1Create.invokeSuspend(unit);
        }
        remoteProcessLogDrainCoordinator$drain$3$1Create.invokeSuspend(unit);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        this.$item.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
