package im.toss.features.home.presentation.dst_investment_portfolio;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeDstInvestmentPortfolioActivity f$0;
    public final /* synthetic */ SwipeControlViewPager f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda3(HomeDstInvestmentPortfolioActivity homeDstInvestmentPortfolioActivity, SwipeControlViewPager swipeControlViewPager, int i) {
        this.f$0 = homeDstInvestmentPortfolioActivity;
        this.f$1 = swipeControlViewPager;
        this.f$2 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeDstInvestmentPortfolioActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unitIAuthTabCallback;
    }
}
