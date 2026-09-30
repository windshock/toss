package o;

import im.toss.feature.credit.ui.main.consulting.CreditConsultingConfirmFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class trackWatchDogHandlerThreadOpt implements setSize<CreditConsultingConfirmFragment> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static void onNavigationEvent(CreditConsultingConfirmFragment creditConsultingConfirmFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingConfirmFragment.tossRouter = sessionTrackerb;
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(CreditConsultingConfirmFragment creditConsultingConfirmFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingConfirmFragment.standardTermsV2Intent = getdummyad;
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
