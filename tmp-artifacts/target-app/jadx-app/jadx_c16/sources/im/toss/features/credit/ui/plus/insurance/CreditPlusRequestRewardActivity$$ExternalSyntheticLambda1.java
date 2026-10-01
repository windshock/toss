package im.toss.features.credit.ui.plus.insurance;

import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusRequestRewardActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPlusFraudInsuranceResponse.ReportChannel.KakaoTalk f$0;
    public final /* synthetic */ CreditPlusRequestRewardActivity f$1;

    public /* synthetic */ CreditPlusRequestRewardActivity$$ExternalSyntheticLambda1(CreditPlusFraudInsuranceResponse.ReportChannel.KakaoTalk kakaoTalk, CreditPlusRequestRewardActivity creditPlusRequestRewardActivity) {
        this.f$0 = kakaoTalk;
        this.f$1 = creditPlusRequestRewardActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditPlusRequestRewardActivity.onNavigationEvent(this.f$0, this.f$1);
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
