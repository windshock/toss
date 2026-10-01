package im.toss.features.loan.comparison.result;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonPreScreeningResultFragment$$ExternalSyntheticLambda24 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComparisonPreScreeningResultFragment f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonPreScreeningResultFragment loanComparisonPreScreeningResultFragment = this.f$0;
        if (i3 == 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) LoanComparisonPreScreeningResultFragment.onWarmupCompleted(new Object[]{loanComparisonPreScreeningResultFragment}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -7365753, 7365768);
        }
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }
}
