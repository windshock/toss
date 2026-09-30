package im.toss.features.loan.comparison.automobile;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;
    public final /* synthetic */ RowScope f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda5(LoanAllRejectedAutomobileInputActivity loanAllRejectedAutomobileInputActivity, RowScope rowScope, String str, String str2, int i) {
        this.f$0 = loanAllRejectedAutomobileInputActivity;
        this.f$1 = rowScope;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanAllRejectedAutomobileInputActivity loanAllRejectedAutomobileInputActivity = this.f$0;
        RowScope rowScope = this.f$1;
        String str = this.f$2;
        String str2 = this.f$3;
        int i4 = this.f$4;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {loanAllRejectedAutomobileInputActivity, rowScope, str, str2, Integer.valueOf(i4), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) LoanAllRejectedAutomobileInputActivity.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr, 559157894, -559157888, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        int i5 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return unit;
    }
}
