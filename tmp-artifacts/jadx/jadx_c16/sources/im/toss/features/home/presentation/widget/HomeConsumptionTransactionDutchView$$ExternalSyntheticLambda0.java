package im.toss.features.home.presentation.widget;

import kotlin.jvm.functions.Function1;
import o.AppLovinSdkSettings;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionTransactionDutchView$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeConsumptionTransactionDutchView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnNavigationEvent = HomeConsumptionTransactionDutchView.onNavigationEvent(this.f$0, ((Boolean) obj).booleanValue());
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettingsOnNavigationEvent;
    }
}
