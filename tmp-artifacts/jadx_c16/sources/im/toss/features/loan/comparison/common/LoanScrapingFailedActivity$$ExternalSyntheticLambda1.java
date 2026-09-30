package im.toss.features.loan.comparison.common;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanScrapingFailedActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;
    public final /* synthetic */ LoanScrapingFailedActivity f$1;

    public /* synthetic */ LoanScrapingFailedActivity$$ExternalSyntheticLambda1(getTypedExportedConstants gettypedexportedconstants, LoanScrapingFailedActivity loanScrapingFailedActivity) {
        this.f$0 = gettypedexportedconstants;
        this.f$1 = loanScrapingFailedActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanScrapingFailedActivity.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
