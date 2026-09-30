package o;

import im.toss.feature.credit.ui.main.consulting.CreditConsultingReservationDetailFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TinyHandlerThread implements setSize<CreditConsultingReservationDetailFragment> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void IAuthTabCallback(CreditConsultingReservationDetailFragment creditConsultingReservationDetailFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingReservationDetailFragment.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
