package im.toss.features.benefit.ui.data;

import com.google.firebase.messaging.FcmBroadcastProcessor$;
import kotlin.jvm.functions.Function1;
import o.SensorBridgeExtension3;
import o.ShakeMonitorBridgeExtension;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PointBackItem$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ShakeMonitorBridgeExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SensorBridgeExtension3) obj};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        Boolean boolValueOf = Boolean.valueOf(((Boolean) ShakeMonitorBridgeExtension.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, -1470516743, iOnExtraCallback2, 1470516744, iOnExtraCallback)).booleanValue());
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }
}
