package o;

import viva.republica.toss.send.dutch.TransferDutchAmountActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class stopSamplingProfiler implements setSize<TransferDutchAmountActivity> {
    public static void IAuthTabCallback(TransferDutchAmountActivity transferDutchAmountActivity, DomainConfigProxy domainConfigProxy) {
        transferDutchAmountActivity.homeChangeHelper = domainConfigProxy;
    }

    public static void onNavigationEvent(TransferDutchAmountActivity transferDutchAmountActivity, SessionTrackerb sessionTrackerb) {
        transferDutchAmountActivity.tossRouter = sessionTrackerb;
    }
}
