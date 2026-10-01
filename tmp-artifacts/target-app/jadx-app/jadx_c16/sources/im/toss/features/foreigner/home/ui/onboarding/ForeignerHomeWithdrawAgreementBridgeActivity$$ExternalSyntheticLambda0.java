package im.toss.features.foreigner.home.ui.onboarding;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeWithdrawAgreementBridgeActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ForeignerHomeWithdrawAgreementBridgeActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ForeignerHomeWithdrawAgreementBridgeActivity foreignerHomeWithdrawAgreementBridgeActivity = this.f$0;
        if (i3 != 0) {
            return ForeignerHomeWithdrawAgreementBridgeActivity.onWarmupCompleted(foreignerHomeWithdrawAgreementBridgeActivity);
        }
        ForeignerHomeWithdrawAgreementBridgeActivity.onWarmupCompleted(foreignerHomeWithdrawAgreementBridgeActivity);
        throw null;
    }
}
