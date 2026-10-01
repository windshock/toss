package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.enableRotationVector;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda52 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(this.f$0, (AppMsgReceiver2) obj, (enableRotationVector) obj2);
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
