package im.toss.features.benefit.ui.data;

import kotlin.jvm.functions.Function1;
import o.RotationVectorAbility;
import o.SensorBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitMissionSectionItem$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ RotationVectorAbility f$0;

    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            boolValueOf = Boolean.valueOf(RotationVectorAbility.onNavigationEvent(this.f$0, (SensorBridgeExtension3) obj));
            int i3 = 5 / 0;
        } else {
            boolValueOf = Boolean.valueOf(RotationVectorAbility.onNavigationEvent(this.f$0, (SensorBridgeExtension3) obj));
        }
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
