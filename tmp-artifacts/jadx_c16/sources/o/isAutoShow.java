package o;

import im.toss.features.alltab.feature.total_service.feature.total_service.TotalServiceFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isAutoShow implements setSize<TotalServiceFragment> {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static void onExtraCallbackWithResult(TotalServiceFragment totalServiceFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        totalServiceFragment.router = sessionTrackerb;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
