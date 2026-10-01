package im.toss.features.benefit.test;

import android.widget.CompoundButton;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda7 implements CompoundButton.OnCheckedChangeListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            BenefitTestActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{compoundButton, Boolean.valueOf(z)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -587024021, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 587024021, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i3 = 35 / 0;
        } else {
            BenefitTestActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{compoundButton, Boolean.valueOf(z)}, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -587024021, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 587024021, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
