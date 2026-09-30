package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchasePreparationActivity$$ExternalSyntheticLambda7 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ InAppPurchasePreparationActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = InAppPurchasePreparationActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i5 = onExtraCallback + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
