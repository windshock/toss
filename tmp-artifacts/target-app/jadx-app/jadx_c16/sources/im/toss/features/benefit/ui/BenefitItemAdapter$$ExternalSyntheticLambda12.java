package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.ShakeMonitorBridgeExtension$onExtraCallback;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ ShakeMonitorBridgeExtension$onExtraCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            getNameByOperatorName.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = getNameByOperatorName.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 113;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
