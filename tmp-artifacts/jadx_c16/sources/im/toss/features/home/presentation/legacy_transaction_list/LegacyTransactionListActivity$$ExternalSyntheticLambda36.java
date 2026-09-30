package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function2;
import o.alertWithArgs;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda36 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            LegacyTransactionListActivity legacyTransactionListActivity = this.f$0;
            Integer numValueOf = Integer.valueOf(((Integer) obj).intValue());
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            Boolean.valueOf(((Boolean) LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), -78285304, iOnExtraCallbackWithResult, 78285326, new Object[]{legacyTransactionListActivity, numValueOf, (KeyEvent) obj2}, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2)).booleanValue());
            throw null;
        }
        LegacyTransactionListActivity legacyTransactionListActivity2 = this.f$0;
        Integer numValueOf2 = Integer.valueOf(((Integer) obj).intValue());
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
        Boolean boolValueOf = Boolean.valueOf(((Boolean) LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), -78285304, iOnExtraCallbackWithResult3, 78285326, new Object[]{legacyTransactionListActivity2, numValueOf2, (KeyEvent) obj2}, alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4)).booleanValue());
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return boolValueOf;
    }
}
