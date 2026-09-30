package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import im.toss.core.tracker.marketing.impl.firebase.FirebaseMarketingChannelModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkLivenessResult implements captureStartValues<FirebaseAnalytics> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FirebaseAnalytics firebaseAnalyticsOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return firebaseAnalyticsOnExtraCallbackWithResult;
    }

    public FirebaseAnalytics onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback();
            obj.hashCode();
            throw null;
        }
        FirebaseAnalytics firebaseAnalyticsOnExtraCallback = onExtraCallback();
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return firebaseAnalyticsOnExtraCallback;
        }
        throw null;
    }

    public static FirebaseAnalytics onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FirebaseAnalytics firebaseAnalyticsOnNavigationEvent = FirebaseMarketingChannelModule.Companion.onNavigationEvent();
        if (i3 == 0) {
            return (FirebaseAnalytics) createAnimator.onNavigationEvent(firebaseAnalyticsOnNavigationEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
