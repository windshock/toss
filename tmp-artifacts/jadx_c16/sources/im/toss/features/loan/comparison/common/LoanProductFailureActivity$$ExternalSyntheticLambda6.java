package im.toss.features.loan.comparison.common;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanProductFailureActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanProductFailureActivity loanProductFailureActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return LoanProductFailureActivity.IAuthTabCallback(loanProductFailureActivity, dialogInterface);
        }
        LoanProductFailureActivity.IAuthTabCallback(loanProductFailureActivity, dialogInterface);
        throw null;
    }
}
