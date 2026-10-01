package o;

import im.toss.features.benefit.dto.Cards;
import im.toss.features.benefit.ui.KoreaBenefitTabViewModel;
import im.toss.features.benefit.ui.viewHolder.BenefitSlimCardItemDelegate$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.RotationVectorAbility1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemInfoBridgeExtensionRemoved1 extends isCallback<RotationVectorAbility1.IAuthTabCallback> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, RotationVectorAbility1.IAuthTabCallback iAuthTabCallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, iAuthTabCallback, onnavigationevent);
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, RotationVectorAbility1.IAuthTabCallback iAuthTabCallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, iAuthTabCallback, onnavigationevent);
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public /* bridge */ /* synthetic */ boolean onExtraCallbackWithResult(Object obj, List list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        SensorBridgeExtension3 sensorBridgeExtension3 = (SensorBridgeExtension3) obj;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(sensorBridgeExtension3, (List<SensorBridgeExtension3>) list, i);
        }
        onExtraCallbackWithResult(sensorBridgeExtension3, (List<SensorBridgeExtension3>) list, i);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemInfoBridgeExtensionRemoved1(@NotNull KoreaBenefitTabViewModel koreaBenefitTabViewModel, @NotNull Function1<? super RotationVectorAbility1.IAuthTabCallback, Unit> function1, @NotNull Function1<? super RotationVectorAbility1.IAuthTabCallback, Unit> function12) {
        super(koreaBenefitTabViewModel, (Function2) new BenefitSlimCardItemDelegate$.ExternalSyntheticLambda0(function1), (Function2) new BenefitSlimCardItemDelegate$.ExternalSyntheticLambda1(function12));
        Intrinsics.checkNotNullParameter(koreaBenefitTabViewModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
    }

    private static final Unit onWarmupCompleted(Function1 function1, RotationVectorAbility1.IAuthTabCallback iAuthTabCallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        function1.invoke(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, RotationVectorAbility1.IAuthTabCallback iAuthTabCallback, Cards.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        function1.invoke(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    protected boolean onExtraCallbackWithResult(@NotNull SensorBridgeExtension3 sensorBridgeExtension3, @NotNull List<SensorBridgeExtension3> list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sensorBridgeExtension3, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = sensorBridgeExtension3 instanceof RotationVectorAbility1.IAuthTabCallback;
        int i5 = IAuthTabCallback + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
