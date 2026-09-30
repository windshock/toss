package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.getNameByOperatorName;
import o.stopDeviceMotionListening;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda48 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback(this.f$0, (AppMsgReceiver2) obj, (stopDeviceMotionListening) obj2);
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
