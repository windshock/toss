package im.toss.features.loan.comparison.result;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProgressBarView$$ExternalSyntheticLambda0 implements Runnable {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanProgressBarView f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanProgressBarView.onExtraCallback(this.f$0);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
