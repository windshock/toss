package im.toss.features.mobileid.impl.view;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda7 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda7(MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity, String str, String str2) {
        this.f$0 = mobileIdCommonDeleteWalletErrorActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity = this.f$0;
        if (i3 != 0) {
            return MobileIdCommonDeleteWalletErrorActivity.onExtraCallbackWithResult(mobileIdCommonDeleteWalletErrorActivity, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        MobileIdCommonDeleteWalletErrorActivity.onExtraCallbackWithResult(mobileIdCommonDeleteWalletErrorActivity, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
