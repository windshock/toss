package im.toss.core.tracker;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RemoteProcessLogDrainCoordinator$drain$claimed$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends RemoteProcessLogIngressStore$ClaimedEnvelope>>, Object> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    int label;
    final /* synthetic */ RemoteProcessLogDrainCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessLogDrainCoordinator$drain$claimed$1(RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator, access13800<? super RemoteProcessLogDrainCoordinator$drain$claimed$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = remoteProcessLogDrainCoordinator;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteProcessLogDrainCoordinator$drain$claimed$1 remoteProcessLogDrainCoordinator$drain$claimed$1 = new RemoteProcessLogDrainCoordinator$drain$claimed$1(this.this$0, access13800Var);
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteProcessLogDrainCoordinator$drain$claimed$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super List<RemoteProcessLogIngressStore$ClaimedEnvelope>> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i5 = i3 + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        ResultKt.onNavigationEvent(obj);
        if (i6 == 0) {
            return RemoteProcessLogDrainCoordinator.onNavigationEvent(this.this$0).onNavigationEvent();
        }
        RemoteProcessLogDrainCoordinator.onNavigationEvent(this.this$0).onNavigationEvent();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
