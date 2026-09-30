package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getNameByOperatorName;
import o.stopDeviceShakeListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ stopDeviceShakeListener f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = getNameByOperatorName.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
