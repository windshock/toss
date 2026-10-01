package im.toss.features.credit.ui.legacy.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CreditDetailActivity$$ExternalSyntheticLambda2(int i, int i2) {
        this.f$0 = i;
        this.f$1 = i2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        if (i3 != 0) {
            return CreditDetailActivity.IAuthTabCallback(i4, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitIAuthTabCallback = CreditDetailActivity.IAuthTabCallback(i4, this.f$1, (SetDetectableSize) obj);
        int i5 = 26 / 0;
        return unitIAuthTabCallback;
    }
}
