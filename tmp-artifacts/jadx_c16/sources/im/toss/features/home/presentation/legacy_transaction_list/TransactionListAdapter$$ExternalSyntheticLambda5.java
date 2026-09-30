package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.AppNode;
import o.regexpCheck;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        AppNode appNode = (AppNode) obj;
        if (i2 % 2 == 0) {
            return regexpCheck.onExtraCallbackWithResult(appNode);
        }
        regexpCheck.onExtraCallbackWithResult(appNode);
        throw null;
    }
}
