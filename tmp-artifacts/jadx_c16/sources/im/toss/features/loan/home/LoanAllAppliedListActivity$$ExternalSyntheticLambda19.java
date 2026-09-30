package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda19 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AppliedLoan f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanAllAppliedListActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
