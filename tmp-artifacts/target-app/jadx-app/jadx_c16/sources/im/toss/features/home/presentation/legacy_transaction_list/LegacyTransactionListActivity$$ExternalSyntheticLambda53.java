package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.alertWithArgs;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda53 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), -1214002343, alertWithArgs.onExtraCallbackWithResult(), 1214002356, objArr, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
