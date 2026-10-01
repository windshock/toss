package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda3(MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity, String str, String str2) {
        this.f$0 = mobileIdCommonDeleteWalletErrorActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 24 / 0;
        } else {
            unitOnExtraCallback = MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
