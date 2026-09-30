package im.toss.features.mobileid.impl.qr;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdIssueQRActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ MobileIdIssueQRActivity f$1;

    public /* synthetic */ MobileIdIssueQRActivity$$ExternalSyntheticLambda2(Function0 function0, MobileIdIssueQRActivity mobileIdIssueQRActivity) {
        this.f$0 = function0;
        this.f$1 = mobileIdIssueQRActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MobileIdIssueQRActivity.IAuthTabCallback(this.f$0, this.f$1, (Boolean) obj);
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return unitIAuthTabCallback;
    }
}
