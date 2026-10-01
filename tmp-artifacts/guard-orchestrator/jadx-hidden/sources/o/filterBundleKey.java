package o;

import android.graphics.Color;
import android.text.TextUtils;
import im.toss.devtool.runtime.ui.scheme.history.compose.ComposableSingletons$SchemeHistoryScreenKt$;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.s3;

/* loaded from: classes.dex */
public final class filterBundleKey {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final filterBundleKey IAuthTabCallback;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

    public static /* synthetic */ Unit onWarmupCompleted(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        int i6 = onExtraCallback + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return getbacktracenote;
    }

    static {
        onExtraCallback();
        IAuthTabCallback = new filterBundleKey();
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(32472354, false, new ComposableSingletons$SchemeHistoryScreenKt$.ExternalSyntheticLambda0());
        int i = onTransact + 83;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxRewardedInterstitialAdapterListener, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallback + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(maxRewardedInterstitialAdapterListener)) {
                int i6 = onExtraCallback + 27;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i8 = onNavigationEvent + 45;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(new char[]{16442, 41917, 34683, 60078, 52784, 12719, 5426, 30952, 23599, 49069, 41787, 34438, 59928, 52635, 12565, 5328, 30737, 23445, 48907, 41630, 34310, 59777, 52596, 12472, 5230, 30705, 23347, 48881, 41572, 34284, 59756, 52451, 12374, 5022, 30557, 23251, 48716, 41416, 34126, 59604, 52306, 12166, 4942, 30525, 23226, 48676, 41398, 34093, 59558, 52334, 12166, 4901, 30370, 23100, 48542, 41221, 33946, 59418, 52113, 12039, 4788, 30221, 22919, 48393, 41215, 33909, 59361, 52085, 12017, 4719, 30117, 22869, 48360, 41056, 33768, 59231, 51922, 11900, 4560, 30029, 22743, 48207, 40919, 33619, 59132, 51791, 11811, 4531, 30014, 22710, 48150, 40886, 33641, 59048, 51752, 11683, 4369, 29844, 22548, 48094, 40780, 33486, 58965, 51665, 11609, 4315, 29784, 22438, 47929, 40616, 33400, 58864, 51564, 11502, 4220, 29671, 22368, 47865, 40514, 33160, 58651, 51344, 11374, 4033, 29519, 22209, 47684, 40395, 33179, 58681, 51366, 11310, 4016, 29486, 22200, 47637, 40360, 33082, 58536, 51223, 11161, 3930, 29330, 22026, 47577, 40277, 32988, 58435}, Color.alpha(0) + 58243, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(32472354, i, -1, ((String) objArr[0]).intern());
            }
            Object[] objArr2 = new Object[1];
            a(new char[]{33527, 10738, 12889, 48356, 26275, 3226, 44929}, 47381 - TextUtils.getTrimmedLength(""), objArr2);
            maxRewardedInterstitialAdapterListener.onExtraCallback(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 3;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 25;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = -911794125165968028L;
    }
}
