package im.toss.features.home.presentation.dst_investment_portfolio;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ HomeDstInvestmentPortfolioActivity f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ HomeDstInvestmentPortfolioActivity$$ExternalSyntheticLambda0(int i, HomeDstInvestmentPortfolioActivity homeDstInvestmentPortfolioActivity, int i2) {
        this.f$0 = i;
        this.f$1 = homeDstInvestmentPortfolioActivity;
        this.f$2 = i2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstInvestmentPortfolioActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
