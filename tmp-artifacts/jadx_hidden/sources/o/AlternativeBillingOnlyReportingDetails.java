package o;

import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordActivity;

/* loaded from: classes.dex */
public final class AlternativeBillingOnlyReportingDetails implements setSize<GlobalOnboardingResetPasswordActivity> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AlternativeBillingOnlyReportingDetails.class);

    public static void IAuthTabCallback(GlobalOnboardingResetPasswordActivity globalOnboardingResetPasswordActivity, GriverPhotoSelectActivity8 griverPhotoSelectActivity8) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 22) & 1;
        globalOnboardingResetPasswordActivity.unifiedSessionProvider = griverPhotoSelectActivity8;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
