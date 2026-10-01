package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.devtool.action.quickaction.ComposableSingletons$QuickActionBottomSheetScreenKt$;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class trySetupEngineProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final trySetupEngineProxy onNavigationEvent;
    private static long onWarmupCompleted;

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            function2 = IAuthTabCallback;
            int i4 = 33 / 0;
        } else {
            function2 = IAuthTabCallback;
        }
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 57;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onWarmupCompleted);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $10 + 79;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    static {
        onNavigationEvent();
        onNavigationEvent = new trySetupEngineProxy();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1273319619, false, new ComposableSingletons$QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda0());
        int i = asInterface + 7;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 3) == 2), i & 1)) {
            int i3 = onExtraCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{14801, 14776, 32819, 19463, 38394, 3430, 18005, 9002, 2266, 45513, 24479, 53268, 23421, 25411, 28406, 33266, 44434, 11501, 47432, 48972, 64544, 56717, 52172, 27815, 53066, 36644, 6770, 7643, 4604, 47327, 21651, 52061, 24588, 27249, 26592, 63739, 45726, 6928, 46598, 46653, 34106, 50359, 49340, 26549, 54346, 63015, 4866, 5322, 9976, 42993, 8813, 49772, 26886, 20834, 31997, 62362, 48042, 516, 36687, 41326, 35576, 13219, 55737, 24245, 56678, 64883, 59415, 4038, 12280, 44785, 15206, 15708, 32282, 24462, 30168, 60053, 16564, 2357, 33832, 38947, 37848, 15030, 54967, 18753, 57971, 58443, 57629, 1760, 13486, 38398, 12338, 13318, 1832, 18075, 17106, 58770, 22092, 28790, 40293, 37728, 39046, 8589, 45019, 16399, 60204, 54060, 65213, 29091, 15831, 40122, 2369, 12040, 3122, 19852, 23485, 56495, 24398, 32571, 27179, 36240, 41381, 10370, 42157, 47999, 61440, 55925, 63483, 26839, 49838, 35590, 1629, 9757, 5439, 46236, 20647, 55210, 25665, 26197, 25345, 34025, 46833, 6083, 45669, 45682, 63790, 49505, 52438, 25479, 52132, 61952, 7958, 4389, 6865, 41968, 10735, 52765, 27967, 27935}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1273319619, i, -1, ((String) objArr[0]).intern());
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{57459, 57402, 20757, 40200, 46648, 11942, 8787, 18296, 5731, 55601, 47890, 3168, 33435, 32279, 58226}, 1 - TextUtils.indexOf("", ""), objArr2);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr2[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 5;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    static void onNavigationEvent() {
        onWarmupCompleted = 7808706837478946645L;
    }
}
