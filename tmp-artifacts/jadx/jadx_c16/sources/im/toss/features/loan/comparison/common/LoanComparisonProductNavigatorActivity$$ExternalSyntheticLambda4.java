package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductNavigatorActivity$$ExternalSyntheticLambda4 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            LoanComparisonProductNavigatorActivity.IAuthTabCallbackDefault(this.f$0, obj);
            obj2.hashCode();
            throw null;
        }
        LoanComparisonProductNavigatorActivity.IAuthTabCallbackDefault(this.f$0, obj);
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
