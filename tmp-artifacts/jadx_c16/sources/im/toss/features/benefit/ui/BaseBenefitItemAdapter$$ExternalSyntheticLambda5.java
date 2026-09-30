package im.toss.features.benefit.ui;

import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.SensorBridgeExtension5;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i2 % 128;
        AppMsgReceiver2 appMsgReceiver2 = (AppMsgReceiver2) obj;
        SensorBridgeExtension5 sensorBridgeExtension5 = (SensorBridgeExtension5) obj2;
        if (i2 % 2 != 0) {
            return getNameByImsi.onNavigationEvent(appMsgReceiver2, sensorBridgeExtension5);
        }
        getNameByImsi.onNavigationEvent(appMsgReceiver2, sensorBridgeExtension5);
        throw null;
    }
}
