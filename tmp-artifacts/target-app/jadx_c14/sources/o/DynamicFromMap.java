package o;

import viva.republica.toss.password.PasswordSettingActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicFromMap implements setSize<PasswordSettingActivity> {
    public static void onNavigationEvent(PasswordSettingActivity passwordSettingActivity, SessionTrackerb sessionTrackerb) {
        passwordSettingActivity.tossRouter = sessionTrackerb;
    }

    public static void onNavigationEvent(PasswordSettingActivity passwordSettingActivity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        passwordSettingActivity.globalResetPasswordIntent = externalOfferInformationDialogListener;
    }

    public static void onWarmupCompleted(PasswordSettingActivity passwordSettingActivity, getBillingPeriod getbillingperiod) {
        passwordSettingActivity.regionManager = getbillingperiod;
    }

    public static void onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, r8lambda64NTrhb_S1HyOv1A8M7aEtzO0I r8lambda64ntrhb_s1hyov1a8m7aetzo0i) {
        passwordSettingActivity.passwordRepository = r8lambda64ntrhb_s1hyov1a8m7aetzo0i;
    }

    public static void onExtraCallback(PasswordSettingActivity passwordSettingActivity, ACAuthRequest aCAuthRequest) {
        passwordSettingActivity.euOnboardingBiometricCheckDialog = aCAuthRequest;
    }

    public static void onExtraCallback(PasswordSettingActivity passwordSettingActivity, zzad zzadVar) {
        passwordSettingActivity.environments = zzadVar;
    }

    public static void onExtraCallbackWithResult(PasswordSettingActivity passwordSettingActivity, DefaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1 defaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1) {
        passwordSettingActivity.tossBankJointCertBridge = defaultTurboModuleManagerDelegateBuilderExternalSyntheticLambda1;
    }
}
