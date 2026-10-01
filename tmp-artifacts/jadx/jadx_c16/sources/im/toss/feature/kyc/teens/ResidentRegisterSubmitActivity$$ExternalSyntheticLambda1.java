package im.toss.feature.kyc.teens;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ResidentRegisterSubmitActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ResidentRegisterSubmitActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ResidentRegisterSubmitActivity residentRegisterSubmitActivity = this.f$0;
        if (i3 == 0) {
            return ResidentRegisterSubmitActivity.onNavigationEvent(residentRegisterSubmitActivity);
        }
        ResidentRegisterSubmitActivity.onNavigationEvent(residentRegisterSubmitActivity);
        throw null;
    }
}
