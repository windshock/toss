package im.toss.features.loan.comparison.common.details;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda22 implements Runnable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductDetailActivity.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
