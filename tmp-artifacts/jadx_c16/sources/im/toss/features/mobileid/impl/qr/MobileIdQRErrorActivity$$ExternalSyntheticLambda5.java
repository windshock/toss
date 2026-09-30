package im.toss.features.mobileid.impl.qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRErrorActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdQRErrorActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            MobileIdQRErrorActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = MobileIdQRErrorActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj3.hashCode();
        throw null;
    }
}
