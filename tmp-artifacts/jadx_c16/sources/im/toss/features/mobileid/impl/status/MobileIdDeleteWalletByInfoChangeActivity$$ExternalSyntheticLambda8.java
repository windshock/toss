package im.toss.features.mobileid.impl.status;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDeleteWalletByInfoChangeActivity$$ExternalSyntheticLambda8 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdDeleteWalletByInfoChangeActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = MobileIdDeleteWalletByInfoChangeActivity.onExtraCallbackWithResult(this.f$0, (u3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
