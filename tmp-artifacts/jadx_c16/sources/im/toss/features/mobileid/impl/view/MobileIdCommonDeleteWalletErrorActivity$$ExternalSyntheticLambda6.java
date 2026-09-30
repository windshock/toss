package im.toss.features.mobileid.impl.view;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$2;

    public /* synthetic */ MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda6(String str, String str2, MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = mobileIdCommonDeleteWalletErrorActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
