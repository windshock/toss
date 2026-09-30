package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductApplySuccessActivity$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanProductApplySuccessActivity.onTransact(this.f$0, obj);
            int i3 = 19 / 0;
        } else {
            LoanProductApplySuccessActivity.onTransact(this.f$0, obj);
        }
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
