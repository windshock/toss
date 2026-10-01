package im.toss.features.home.presentation.dst_investment_portfolio;

import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstInvestmentPortfolioActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstInvestmentPortfolioActivity homeDstInvestmentPortfolioActivity = this.f$0;
        Integer num = (Integer) obj;
        if (i3 == 0) {
            return HomeDstInvestmentPortfolioActivity.onExtraCallbackWithResult(homeDstInvestmentPortfolioActivity, num.intValue(), ((Integer) obj2).intValue());
        }
        HomeDstInvestmentPortfolioActivity.onExtraCallbackWithResult(homeDstInvestmentPortfolioActivity, num.intValue(), ((Integer) obj2).intValue());
        throw null;
    }
}
