package im.toss.core.tracker;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RemoteProcessLogDrainCoordinator$drain$1 extends ContinuationImpl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteProcessLogDrainCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessLogDrainCoordinator$drain$1(RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator, access13800<? super RemoteProcessLogDrainCoordinator$drain$1> access13800Var) {
        super(access13800Var);
        this.this$0 = remoteProcessLogDrainCoordinator;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RemoteProcessLogDrainCoordinator remoteProcessLogDrainCoordinator = this.this$0;
        if (i3 == 0) {
            return remoteProcessLogDrainCoordinator.onExtraCallbackWithResult(this);
        }
        remoteProcessLogDrainCoordinator.onExtraCallbackWithResult(this);
        throw null;
    }
}
