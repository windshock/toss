package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ EDocAuthActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ EDocAuthActivity$$ExternalSyntheticLambda11(EDocAuthActivity eDocAuthActivity, int i) {
        this.f$0 = eDocAuthActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EDocAuthActivity eDocAuthActivity = this.f$0;
        if (i3 != 0) {
            return EDocAuthActivity.IAuthTabCallback(eDocAuthActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitIAuthTabCallback = EDocAuthActivity.IAuthTabCallback(eDocAuthActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 33 / 0;
        return unitIAuthTabCallback;
    }
}
