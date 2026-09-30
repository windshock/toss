package im.toss.features.loan.comparison.common.details;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda65 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda65(getTypedExportedConstants gettypedexportedconstants, LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, String str) {
        this.f$0 = gettypedexportedconstants;
        this.f$1 = loanComparisonProductDetailActivity;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) LoanComparisonProductDetailActivity.onNavigationEvent(new Object[]{this.f$0, this.f$1, this.f$2, (View) obj}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 874262422, -874262396, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
