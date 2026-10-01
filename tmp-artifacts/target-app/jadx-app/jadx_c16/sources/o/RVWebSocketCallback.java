package o;

import im.toss.features.loan.web.LoanApplicationAccountChooserActivity;
import im.toss.state.spec.SessionState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVWebSocketCallback implements setSize<LoanApplicationAccountChooserActivity> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static void IAuthTabCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, shouldAutoplay shouldautoplay) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.verifyApi = shouldautoplay;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallbackWithResult(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, SessionState sessionState) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.sessionState = sessionState;
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.termsIntent = getdummyad;
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }
}
