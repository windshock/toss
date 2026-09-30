package im.toss.tds.compose.foundation.anim.rally;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import o.isFireOS;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallyKt$awaitEnd$2$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ isFireOS<Object> $this;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RallyKt$awaitEnd$2$1(isFireOS<Object> isfireos, access13800<? super RallyKt$awaitEnd$2$1> access13800Var) {
        super(2, access13800Var);
        this.$this = isfireos;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RallyKt$awaitEnd$2$1 rallyKt$awaitEnd$2$1 = new RallyKt$awaitEnd$2$1(this.$this, access13800Var);
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return rallyKt$awaitEnd$2$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        this.$this.IAuthTabCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 65;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
