package o;

import im.toss.features.edoc.wallet.pkg.PackageResultActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FileBridgeExtension311 implements setSize<PackageResultActivity> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static void onExtraCallbackWithResult(PackageResultActivity packageResultActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        packageResultActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onExtraCallbackWithResult + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
