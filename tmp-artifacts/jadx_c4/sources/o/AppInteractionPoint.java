package o;

import im.toss.feature.credit.ui.quiz.next.CreditQuizNextInfoActivity;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppInteractionPoint implements setSize<CreditQuizNextInfoActivity> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static void IAuthTabCallback(CreditQuizNextInfoActivity creditQuizNextInfoActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditQuizNextInfoActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
    }

    public static void onExtraCallbackWithResult(CreditQuizNextInfoActivity creditQuizNextInfoActivity, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        creditQuizNextInfoActivity.termsIntent = getdummyad;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(CreditQuizNextInfoActivity creditQuizNextInfoActivity, r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditQuizNextInfoActivity.agreedToAllRequiredTermsUseCase = r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }
}
