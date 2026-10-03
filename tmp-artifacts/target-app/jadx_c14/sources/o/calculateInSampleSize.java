package o;

import dagger.Lazy;
import im.toss.features.useronboarding.common.dev.OnboardingDevToolActionManager;
import viva.republica.toss.guest.LoginBaseActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class calculateInSampleSize implements setSize<LoginBaseActivity> {
    public static void onNavigationEvent(LoginBaseActivity loginBaseActivity, setAdUnitIds setadunitids) {
        loginBaseActivity.loginStatus = setadunitids;
    }

    public static void IAuthTabCallback(LoginBaseActivity loginBaseActivity, AppLovinError appLovinError) {
        loginBaseActivity.applicationProcessManager = appLovinError;
    }

    public static void onExtraCallback(LoginBaseActivity loginBaseActivity, Lazy<OnboardingDevToolActionManager> lazy) {
        loginBaseActivity.onboardingDevToolActionManager = lazy;
    }

    public static void onNavigationEvent(LoginBaseActivity loginBaseActivity, calcThumbnailOptions calcthumbnailoptions) {
        loginBaseActivity.userOnboardingLogManager = calcthumbnailoptions;
    }
}
