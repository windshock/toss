package im.toss.features.foreigner.home.ui.onboarding;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeWithdrawAgreementBridgeActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ ForeignerHomeWithdrawAgreementBridgeActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = ForeignerHomeWithdrawAgreementBridgeActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
