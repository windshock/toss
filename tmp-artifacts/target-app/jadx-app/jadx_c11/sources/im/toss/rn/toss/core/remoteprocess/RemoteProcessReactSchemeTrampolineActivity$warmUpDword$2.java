package im.toss.rn.toss.core.remoteprocess;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getPackageType;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ getPackageType $warmUpJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2(getPackageType getpackagetype, access13800<? super RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2> access13800Var) {
        super(2, access13800Var);
        this.$warmUpJob = getpackagetype;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2 remoteProcessReactSchemeTrampolineActivity$warmUpDword$2 = new RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2(this.$warmUpJob, access13800Var);
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return remoteProcessReactSchemeTrampolineActivity$warmUpDword$2;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i3 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i4 + 53;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetype = this.$warmUpJob;
            this.label = 1;
            if (getpackagetype.onNavigationEvent(this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
