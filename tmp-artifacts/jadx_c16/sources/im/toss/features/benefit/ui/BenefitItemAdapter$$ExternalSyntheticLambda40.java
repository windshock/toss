package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.getNameByOperatorName;
import o.startDeviceShakeListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda40 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = getNameByOperatorName.onExtraCallbackWithResult(this.f$0, (AppMsgReceiver2) obj, (startDeviceShakeListener) obj2);
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
