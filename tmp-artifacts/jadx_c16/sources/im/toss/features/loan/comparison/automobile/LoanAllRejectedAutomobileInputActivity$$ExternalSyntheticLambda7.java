package im.toss.features.loan.comparison.automobile;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (String) obj};
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (String) obj};
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) LoanAllRejectedAutomobileInputActivity.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr2, 1899872501, -1899872500, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent());
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
