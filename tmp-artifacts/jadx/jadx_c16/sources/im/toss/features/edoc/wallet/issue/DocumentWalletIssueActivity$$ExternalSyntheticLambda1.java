package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ DocumentWalletIssueActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            DocumentWalletIssueActivity.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = DocumentWalletIssueActivity.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i3 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
