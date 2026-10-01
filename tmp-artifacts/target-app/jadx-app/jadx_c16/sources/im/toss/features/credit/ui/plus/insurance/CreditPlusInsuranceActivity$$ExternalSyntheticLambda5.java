package im.toss.features.credit.ui.plus.insurance;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusInsuranceActivity$$ExternalSyntheticLambda5 implements Runnable {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPlusInsuranceActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            CreditPlusInsuranceActivity.onExtraCallbackWithResult(this.f$0);
            throw null;
        }
        CreditPlusInsuranceActivity.onExtraCallbackWithResult(this.f$0);
        int i3 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
