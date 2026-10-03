package o;

import im.toss.state.spec.SessionState;
import viva.republica.toss.guest.CreatePasswordActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDecodedBlockSize implements setSize<CreatePasswordActivity> {
    public static void onNavigationEvent(CreatePasswordActivity createPasswordActivity, setCommonNetworkProxy setcommonnetworkproxy) {
        createPasswordActivity.loginTokenStore = setcommonnetworkproxy;
    }

    public static void onExtraCallback(CreatePasswordActivity createPasswordActivity, notifyVerticalEdgeReached notifyverticaledgereached) {
        createPasswordActivity.guestLoginManager = notifyverticaledgereached;
    }

    public static void onExtraCallback(CreatePasswordActivity createPasswordActivity, setFinalY setfinaly) {
        createPasswordActivity.tossploreManager = setfinaly;
    }

    public static void onNavigationEvent(CreatePasswordActivity createPasswordActivity, getBillingPeriod getbillingperiod) {
        createPasswordActivity.regionManager = getbillingperiod;
    }

    public static void onWarmupCompleted(CreatePasswordActivity createPasswordActivity, SessionTrackerb sessionTrackerb) {
        createPasswordActivity.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity, isHttp ishttp) {
        createPasswordActivity.visitorOnboardingIntentProvider = ishttp;
    }

    public static void onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity, getDummyAd getdummyad) {
        createPasswordActivity.standardTermsV2Intent = getdummyad;
    }

    public static void onExtraCallbackWithResult(CreatePasswordActivity createPasswordActivity, getNightColor getnightcolor) {
        createPasswordActivity.profileRepository = getnightcolor;
    }

    public static void onExtraCallback(CreatePasswordActivity createPasswordActivity, SessionState sessionState) {
        createPasswordActivity.sessionState = sessionState;
    }

    public static void IAuthTabCallback(CreatePasswordActivity createPasswordActivity, ACAuthRequest aCAuthRequest) {
        createPasswordActivity.euOnboardingBiometricCheckDialog = aCAuthRequest;
    }

    public static void onNavigationEvent(CreatePasswordActivity createPasswordActivity, zzad zzadVar) {
        createPasswordActivity.environments = zzadVar;
    }
}
