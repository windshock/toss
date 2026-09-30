package im.toss.features.foreigner.home.ui.onboarding;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeWithdrawAgreementBridgeActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ForeignerHomeWithdrawAgreementBridgeActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = ForeignerHomeWithdrawAgreementBridgeActivity.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unitIAuthTabCallback;
    }
}
