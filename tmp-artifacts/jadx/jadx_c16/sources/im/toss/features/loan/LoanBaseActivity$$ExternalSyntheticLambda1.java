package im.toss.features.loan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanBaseActivity$$ExternalSyntheticLambda1 implements Runnable {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanBaseActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanBaseActivity.onExtraCallbackWithResult(this.f$0);
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
