package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AppliedLoan f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
