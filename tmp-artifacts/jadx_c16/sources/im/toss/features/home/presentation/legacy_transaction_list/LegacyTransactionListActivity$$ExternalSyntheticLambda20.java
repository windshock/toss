package im.toss.features.home.presentation.legacy_transaction_list;

import o.alertWithArgs;
import o.setRegionDecoderFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda20 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LegacyTransactionListActivity f$0;
    public final /* synthetic */ setRegionDecoderFactory f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda20(LegacyTransactionListActivity legacyTransactionListActivity, setRegionDecoderFactory setregiondecoderfactory, String str) {
        this.f$0 = legacyTransactionListActivity;
        this.f$1 = setregiondecoderfactory;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LegacyTransactionListActivity legacyTransactionListActivity = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {legacyTransactionListActivity, this.f$1, this.f$2};
            LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), -1200557279, alertWithArgs.onExtraCallbackWithResult(), 1200557286, objArr, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
            return;
        }
        Object[] objArr2 = {legacyTransactionListActivity, this.f$1, this.f$2};
        LegacyTransactionListActivity.onExtraCallbackWithResult(alertWithArgs.onExtraCallbackWithResult(), -1200557279, alertWithArgs.onExtraCallbackWithResult(), 1200557286, objArr2, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult());
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
