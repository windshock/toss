package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductApplySuccessActivity$$ExternalSyntheticLambda5 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanProductApplySuccessActivity.onWarmupCompleted(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        LoanProductApplySuccessActivity.onWarmupCompleted(this.f$0, obj);
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
