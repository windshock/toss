package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductNavigatorActivity$$ExternalSyntheticLambda6 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductNavigatorActivity.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }
}
