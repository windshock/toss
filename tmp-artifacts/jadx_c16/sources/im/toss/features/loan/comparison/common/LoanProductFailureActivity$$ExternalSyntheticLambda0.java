package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
import o.RotationOptionsCompanion;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanProductFailureActivity f$0;
    public final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 f$1;
    public final /* synthetic */ RotationOptionsCompanion f$2;

    public /* synthetic */ LoanProductFailureActivity$$ExternalSyntheticLambda0(LoanProductFailureActivity loanProductFailureActivity, DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0, RotationOptionsCompanion rotationOptionsCompanion) {
        this.f$0 = loanProductFailureActivity;
        this.f$1 = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda0;
        this.f$2 = rotationOptionsCompanion;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            LoanProductFailureActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = LoanProductFailureActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
