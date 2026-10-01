package im.toss.tds.compose.component.compound.agreement.v4.row;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.IAnimation;
import o.access13800;
import o.access14000;
import o.access14300;
import o.findResAndMsg;
import o.putFloatArray;
import o.setRipple;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RightPreset$Arrow$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    final /* synthetic */ putFloatArray $state;
    int label;
    final /* synthetic */ RightPreset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RightPreset$Arrow$1$1(RightPreset rightPreset, putFloatArray putfloatarray, access13800<? super RightPreset$Arrow$1$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = rightPreset;
        this.$state = putfloatarray;
    }

    public static /* synthetic */ boolean onNavigationEvent(putFloatArray putfloatarray) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(putfloatarray);
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RightPreset$Arrow$1$1 rightPreset$Arrow$1$1 = new RightPreset$Arrow$1$1(this.this$0, this.$state, access13800Var);
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return rightPreset$Arrow$1$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 68 / 0;
        } else {
            objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
        }
        int i4 = onExtraCallbackWithResult + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return objInvokeSuspend;
    }

    private static final boolean onWarmupCompleted(putFloatArray putfloatarray) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return putfloatarray.onNavigationEvent();
        }
        putfloatarray.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (RightPreset.onExtraCallback(this.this$0) != null) {
                final putFloatArray putfloatarray = this.$state;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset$Arrow$1$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 19;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Boolean boolValueOf = Boolean.valueOf(RightPreset$Arrow$1$1.onNavigationEvent(putfloatarray));
                        int i7 = IAuthTabCallback + 11;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 54 / 0;
                        }
                        return boolValueOf;
                    }
                }));
                final RightPreset rightPreset = this.this$0;
                setRipple setripple = new setRipple() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset$Arrow$1$1.2
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 39;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (i6 == 0) {
                            return onWarmupCompleted(zBooleanValue, access13800Var);
                        }
                        onWarmupCompleted(zBooleanValue, access13800Var);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object onWarmupCompleted(boolean z, access13800<? super Unit> access13800Var) {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 15;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        RightPreset.onExtraCallback(rightPreset).invoke(access14000.onNavigationEvent(z));
                        Unit unit = Unit.INSTANCE;
                        int i7 = onNavigationEvent + 77;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                };
                this.label = 1;
                if (iAnimationOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                int i5 = 31 / 0;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
        }
        return Unit.INSTANCE;
    }
}
