package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanProductFailureActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanProductFailureActivity.onExtraCallback(this.f$0, (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0) obj);
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
