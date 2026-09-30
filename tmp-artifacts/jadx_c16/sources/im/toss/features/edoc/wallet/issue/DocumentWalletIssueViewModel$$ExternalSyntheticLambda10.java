package im.toss.features.edoc.wallet.issue;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import o.FileBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Pair[] pairArrOnWarmupCompleted = FileBridgeExtension3.onWarmupCompleted();
        int i4 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return pairArrOnWarmupCompleted;
    }
}
