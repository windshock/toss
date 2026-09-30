package im.toss.features.home.legacy.view.transaction.manual;

import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda35 implements deserializeDecimalCollection {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ManualTransactionAddActivity.onExtraCallback(this.f$0);
            obj.hashCode();
            throw null;
        }
        ManualTransactionAddActivity.onExtraCallback(this.f$0);
        int i3 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
