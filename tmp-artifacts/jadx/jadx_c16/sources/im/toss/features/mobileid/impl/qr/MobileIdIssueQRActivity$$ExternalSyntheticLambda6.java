package im.toss.features.mobileid.impl.qr;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdIssueQRActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdIssueQRActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdIssueQRActivity mobileIdIssueQRActivity = this.f$0;
        if (i3 != 0) {
            return MobileIdIssueQRActivity.onWarmupCompleted(mobileIdIssueQRActivity);
        }
        MobileIdIssueQRActivity.onWarmupCompleted(mobileIdIssueQRActivity);
        throw null;
    }
}
