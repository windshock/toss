package im.toss.features.loan.refinancing.funnel.common;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.Ripple_androidKt;
import o.SpannedDataExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelActivity$$ExternalSyntheticLambda7 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ LoanRefinancingFunnelActivity f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 f$3;
    public final /* synthetic */ Ripple_androidKt f$4;

    public /* synthetic */ LoanRefinancingFunnelActivity$$ExternalSyntheticLambda7(List list, LoanRefinancingFunnelActivity loanRefinancingFunnelActivity, boolean z, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7, Ripple_androidKt ripple_androidKt) {
        this.f$0 = list;
        this.f$1 = loanRefinancingFunnelActivity;
        this.f$2 = z;
        this.f$3 = exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
        this.f$4 = ripple_androidKt;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        LoanRefinancingFunnelActivity loanRefinancingFunnelActivity = this.f$1;
        boolean z = this.f$2;
        Object[] objArr = {list, loanRefinancingFunnelActivity, Boolean.valueOf(z), this.f$3, this.f$4};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) LoanRefinancingFunnelActivity.onExtraCallback(-1187299254, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 1187299254, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, objArr);
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
