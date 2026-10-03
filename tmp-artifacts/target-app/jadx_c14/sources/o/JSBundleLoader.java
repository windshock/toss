package o;

import viva.republica.toss.pedometer.PedometerIntroActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSBundleLoader implements setSize<PedometerIntroActivity> {
    public static void onExtraCallback(PedometerIntroActivity pedometerIntroActivity, SessionTrackerb sessionTrackerb) {
        pedometerIntroActivity.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallback(PedometerIntroActivity pedometerIntroActivity, setAdUnitIds setadunitids) {
        pedometerIntroActivity.loginStatus = setadunitids;
    }
}
