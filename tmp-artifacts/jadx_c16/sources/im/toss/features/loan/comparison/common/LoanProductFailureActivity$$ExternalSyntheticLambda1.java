package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanProductFailureActivity f$0;
    public final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 f$1;

    public /* synthetic */ LoanProductFailureActivity$$ExternalSyntheticLambda1(LoanProductFailureActivity loanProductFailureActivity, DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0) {
        this.f$0 = loanProductFailureActivity;
        this.f$1 = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanProductFailureActivity loanProductFailureActivity = this.f$0;
        if (i3 == 0) {
            return LoanProductFailureActivity.onExtraCallbackWithResult(loanProductFailureActivity, this.f$1, (SetDetectableSize) obj);
        }
        LoanProductFailureActivity.onExtraCallbackWithResult(loanProductFailureActivity, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
