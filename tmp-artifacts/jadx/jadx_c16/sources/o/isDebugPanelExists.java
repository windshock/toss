package o;

import im.toss.features.faceverify.impl.ui.test.FacePayBleTestActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isDebugPanelExists implements setSize<FacePayBleTestActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static void onExtraCallbackWithResult(FacePayBleTestActivity facePayBleTestActivity, RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        facePayBleTestActivity.tossBleScanner = rescheduleReceiver;
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
