package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda11 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity = this.f$0;
        u3 u3Var = (u3) obj;
        if (i3 == 0) {
            return MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(mobileIdCommonDeleteWalletErrorActivity, u3Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnExtraCallback = MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(mobileIdCommonDeleteWalletErrorActivity, u3Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 99 / 0;
        return unitOnExtraCallback;
    }
}
