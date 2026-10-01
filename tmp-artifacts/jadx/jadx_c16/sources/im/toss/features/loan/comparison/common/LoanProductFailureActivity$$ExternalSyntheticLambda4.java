package im.toss.features.loan.comparison.common;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 f$0;
    public final /* synthetic */ LoanProductFailureActivity f$1;

    public /* synthetic */ LoanProductFailureActivity$$ExternalSyntheticLambda4(DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0, LoanProductFailureActivity loanProductFailureActivity) {
        this.f$0 = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
        this.f$1 = loanProductFailureActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 = this.f$0;
        if (i3 == 0) {
            return LoanProductFailureActivity.onNavigationEvent(diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0, this.f$1, (View) obj);
        }
        Unit unitOnNavigationEvent = LoanProductFailureActivity.onNavigationEvent(diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0, this.f$1, (View) obj);
        int i4 = 99 / 0;
        return unitOnNavigationEvent;
    }
}
