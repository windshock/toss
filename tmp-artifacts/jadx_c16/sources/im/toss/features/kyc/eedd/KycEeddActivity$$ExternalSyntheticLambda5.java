package im.toss.features.kyc.eedd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ KycEeddActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            KycEeddActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = KycEeddActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj3.hashCode();
        throw null;
    }
}
