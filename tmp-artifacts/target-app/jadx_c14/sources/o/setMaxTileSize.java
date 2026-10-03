package o;

import viva.republica.toss.home.account.credit.CreditLoanAccountActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setMaxTileSize implements setSize<CreditLoanAccountActivity> {
    public static void onExtraCallback(CreditLoanAccountActivity creditLoanAccountActivity, setMaxScale setmaxscale) {
        creditLoanAccountActivity.loanBrokerageFragmentNavigation = setmaxscale;
    }

    public static void onExtraCallback(CreditLoanAccountActivity creditLoanAccountActivity, SessionTrackerb sessionTrackerb) {
        creditLoanAccountActivity.tossRouter = sessionTrackerb;
    }
}
