package o;

import im.toss.feature.credit.ui.main.consulting.CreditConsultingHistoryDetailFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class packageDownloaderOpt implements setSize<CreditConsultingHistoryDetailFragment> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static void IAuthTabCallback(CreditConsultingHistoryDetailFragment creditConsultingHistoryDetailFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingHistoryDetailFragment.tossRouter = sessionTrackerb;
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
