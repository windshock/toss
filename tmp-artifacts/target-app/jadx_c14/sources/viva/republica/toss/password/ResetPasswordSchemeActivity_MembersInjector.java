package viva.republica.toss.password;

import o.SessionTrackerb;
import o.isJacksonCreator;
import o.setSize;
import o.shortValue;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordSchemeActivity_MembersInjector implements setSize<ResetPasswordSchemeActivity> {
    public static void IAuthTabCallback(ResetPasswordSchemeActivity resetPasswordSchemeActivity, SessionTrackerb sessionTrackerb) {
        resetPasswordSchemeActivity.tossRouter = sessionTrackerb;
    }

    public static void onWarmupCompleted(ResetPasswordSchemeActivity resetPasswordSchemeActivity, shortValue shortvalue) {
        resetPasswordSchemeActivity.authenticator = shortvalue;
    }

    public static void IAuthTabCallback(ResetPasswordSchemeActivity resetPasswordSchemeActivity, isJacksonCreator isjacksoncreator) {
        resetPasswordSchemeActivity.authUiConfig = isjacksoncreator;
    }
}
