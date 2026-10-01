package im.toss.features.home.presentation.dst_investment_portfolio;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstInvestmentPortfolioActivity f$0;
    public final /* synthetic */ SwipeControlViewPager f$1;

    public /* synthetic */ HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda5(HomeDstInvestmentPortfolioActivity homeDstInvestmentPortfolioActivity, SwipeControlViewPager swipeControlViewPager) {
        this.f$0 = homeDstInvestmentPortfolioActivity;
        this.f$1 = swipeControlViewPager;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = HomeDstInvestmentPortfolioActivity.onNavigationEvent(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
