package im.toss.features.credit.ui.plus.home;

import im.toss.features.credit.data.response.Disclaimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Disclaimer f$0;
    public final /* synthetic */ CreditPlusHomeActivity f$1;

    public /* synthetic */ CreditPlusHomeActivity$$ExternalSyntheticLambda2(Disclaimer disclaimer, CreditPlusHomeActivity creditPlusHomeActivity) {
        this.f$0 = disclaimer;
        this.f$1 = creditPlusHomeActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = CreditPlusHomeActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 79 / 0;
        } else {
            unitIAuthTabCallback = CreditPlusHomeActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
