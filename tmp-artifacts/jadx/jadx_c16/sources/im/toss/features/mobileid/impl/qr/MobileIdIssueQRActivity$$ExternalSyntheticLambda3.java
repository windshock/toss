package im.toss.features.mobileid.impl.qr;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdIssueQRActivity$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            MobileIdIssueQRActivity.onWarmupCompleted(this.f$0, obj);
            throw null;
        }
        MobileIdIssueQRActivity.onWarmupCompleted(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
