package o;

import im.toss.features.faceverify.impl.ui.test.FacePayTestActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DebugConsoleExtension4 implements setSize<FacePayTestActivity> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static void onExtraCallback(FacePayTestActivity facePayTestActivity, appIsMiniService appisminiservice) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.initializeFaceRegisterUseCase = appisminiservice;
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(FacePayTestActivity facePayTestActivity, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(FacePayTestActivity facePayTestActivity, RVFilePathDecoder rVFilePathDecoder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        facePayTestActivity.faceScreen = rVFilePathDecoder;
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
