package im.toss.features.kyc.edd.idcard;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycIdCardSubmitActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ KycIdCardSubmitActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ KycIdCardSubmitActivity$$ExternalSyntheticLambda2(KycIdCardSubmitActivity kycIdCardSubmitActivity, String str) {
        this.f$0 = kycIdCardSubmitActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KycIdCardSubmitActivity kycIdCardSubmitActivity = this.f$0;
        if (i3 == 0) {
            return KycIdCardSubmitActivity.onExtraCallbackWithResult(kycIdCardSubmitActivity, this.f$1, (SetDetectableSize) obj);
        }
        KycIdCardSubmitActivity.onExtraCallbackWithResult(kycIdCardSubmitActivity, this.f$1, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
