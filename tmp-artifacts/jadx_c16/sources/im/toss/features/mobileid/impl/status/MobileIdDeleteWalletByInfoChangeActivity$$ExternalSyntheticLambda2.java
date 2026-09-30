package im.toss.features.mobileid.impl.status;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDeleteWalletByInfoChangeActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdDeleteWalletByInfoChangeActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MobileIdDeleteWalletByInfoChangeActivity$$ExternalSyntheticLambda2(MobileIdDeleteWalletByInfoChangeActivity mobileIdDeleteWalletByInfoChangeActivity, int i) {
        this.f$0 = mobileIdDeleteWalletByInfoChangeActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdDeleteWalletByInfoChangeActivity mobileIdDeleteWalletByInfoChangeActivity = this.f$0;
        if (i3 != 0) {
            return MobileIdDeleteWalletByInfoChangeActivity.onNavigationEvent(mobileIdDeleteWalletByInfoChangeActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        MobileIdDeleteWalletByInfoChangeActivity.onNavigationEvent(mobileIdDeleteWalletByInfoChangeActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
