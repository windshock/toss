package im.toss.tds.compose.component.compound.agreement.v4.row;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14000;
import o.findResAndMsg;
import o.putFloatArray;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RightPreset$Arrow$2$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ float $maxFontScale;
    final /* synthetic */ putFloatArray $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RightPreset$Arrow$2$1(putFloatArray putfloatarray, float f, access13800<? super RightPreset$Arrow$2$1> access13800Var) {
        super(2, access13800Var);
        this.$state = putfloatarray;
        this.$maxFontScale = f;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RightPreset$Arrow$2$1 rightPreset$Arrow$2$1 = new RightPreset$Arrow$2$1(this.$state, this.$maxFontScale, access13800Var);
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rightPreset$Arrow$2$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        this.$state.IAuthTabCallback(access14000.onExtraCallbackWithResult(this.$maxFontScale));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
