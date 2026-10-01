package im.toss.rn.toss.core.remoteprocess;

import android.content.Context;
import im.toss.base.BaseActivity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.RedBoxContentViewOpenStackFrameTask;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteProcessReactSchemeTrampolineActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, access13800<? super RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = remoteProcessReactSchemeTrampolineActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1 remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1 = new RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1(this.this$0, access13800Var);
        remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1.L$0 = obj;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i4 = onNavigationEvent + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1 remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1Create = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1Create.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = remoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1Create.invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        BaseActivity baseActivity = this.this$0;
        try {
            Result.Companion companion = Result.Companion;
            RedBoxContentViewOpenStackFrameTask.onExtraCallbackWithResult onextracallbackwithresult = RedBoxContentViewOpenStackFrameTask.Companion;
            Context applicationContext = baseActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            onextracallbackwithresult.onWarmupCompleted(applicationContext);
            Result.constructor-impl(Unit.INSTANCE);
            int i3 = IAuthTabCallback + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
