package im.toss.features.home.ui.dst.view.investment.portfolio.select.account;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentSelectAccountBottomSheetActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeDstInvestmentSelectAccountBottomSheetActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitIAuthTabCallback = HomeDstInvestmentSelectAccountBottomSheetActivity.IAuthTabCallback(this.f$0, (View) obj);
            int i3 = 34 / 0;
        } else {
            unitIAuthTabCallback = HomeDstInvestmentSelectAccountBottomSheetActivity.IAuthTabCallback(this.f$0, (View) obj);
        }
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
