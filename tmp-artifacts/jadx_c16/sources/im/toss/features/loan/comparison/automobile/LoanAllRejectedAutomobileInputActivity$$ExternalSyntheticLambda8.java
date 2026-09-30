package im.toss.features.loan.comparison.automobile;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSwitchMinWidth;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda8 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) LoanAllRejectedAutomobileInputActivity.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), new Object[]{this.f$0, (getSwitchMinWidth) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 1854967977, -1854967973, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        int i3 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
