package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1iSDK implements ALCFaceSDK2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final ALCFaceSDKExternalSyntheticLambda5 IAuthTabCallback;
    private static final ALCFaceSDKExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static int asBinder;
    private static final ALCFaceSDKExternalSyntheticLambda5 asInterface;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final AFe1iSDK onExtraCallbackWithResult;
    private static final ALCFaceSDKExternalSyntheticLambda5 onNavigationEvent;
    private static final Map<String, Object> onTransact;
    public static final int onWarmupCompleted;

    static {
        asInterface();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl(AFe1iSDK.class, "disclaimerInvestLink", "getDisclaimerInvestLink()Ljava/lang/String;", 0), new PropertyReference1Impl(AFe1iSDK.class, "disclaimerPrivacyPolicyLink", "getDisclaimerPrivacyPolicyLink()Ljava/lang/String;", 0), new PropertyReference1Impl(AFe1iSDK.class, "disclaimerUserRightsAndNoticesLink", "getDisclaimerUserRightsAndNoticesLink()Ljava/lang/String;", 0), new PropertyReference1Impl(AFe1iSDK.class, "disclaimerCreditInformationLink", "getDisclaimerCreditInformationLink()Ljava/lang/String;", 0)};
        AFe1iSDK aFe1iSDK = new AFe1iSDK();
        onExtraCallbackWithResult = aFe1iSDK;
        onTransact = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a(new char[]{45824, 53183, 19034, 50929, 16791, 56445, 22677, 56114, 22035, 53948, 27972, 59417, 25826, 59227, 25581, 65174, 31019, 62930, 28784, 62215, 4017, 35396, 1310, 33251, 7235, 39148, 7051, 38518, 4824, 44410, 10244, 42172, 10091, 41486, 16099, 47426, 13803, 45193, 13102, 20440, 51838, 17671, 49573, 23590, 57096, 23462, 54865, 21222, 60820, 26682, 58583, 26492, 57873, 32421, 63783, 29700, 61614, 29525, 36835, 2698, 34088, 400}, View.getDefaultSize(0, 0) + 31907, objArr);
        IAuthTabCallback = aFe1iSDK.IAuthTabCallback("android.disclaimer.link.invest", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new char[]{45824, 217, 54422, 43095, 31759, 12683, 34265, 22820, 11555, 58090, 46760, 2671, 56954, 37405, 26561, 15248, 36683, 17172, 4316, 58497, 47209, 3122, 49650, 38389, 26995, 15674, 61703, 18048, 6791, 61014, 41488, 30663, 52141, 40803, 21302, 8436, 62707, 18533, 7219, 53273, 42445, 31126, 52501, 33088, 22237, 10925, 65075, 45681, 1953}, 46021 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr2);
        IAuthTabCallbackDefault = aFe1iSDK.IAuthTabCallback("android.disclaimer.link.privacyPolicy", ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{45824, 20611, 29730, 6597, 15719, 49481, 59133, 35358, 45043, 45968, 22316, 29901, 6194, 15375, 49589, 58698, 35563, 44686, 45608, 22483, 31585, 7952, 15542, 49167, 58851, 35200, 44323, 45698, 22127, 31236, 8100, 9053, 49389, 58489, 34818, 44454, 45339, 22247, 31383, 7715, 9181, 51052, 60241, 35042, 44117, 45567, 21959, 31084, 7819}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58270, objArr3);
        asInterface = aFe1iSDK.IAuthTabCallback("android.disclaimer.link.userRightsAndNotices", ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a(new char[]{45824, 46749, 47134, 41883, 42271, 43223, 37441, 38336, 40707, 33422, 33808, 36755, 61770, 62609, 65033, 57748, 60171, 61072, 53268, 56205, 56601, 49294, 51722, 52689, 14099, 15006, 15391, 10204, 10519, 11418, 5656, 6531, 813, 1703, 2110, 29624, 30051, 30905, 25131, 26045, 28461, 21170, 21613, 24572, 16685, 17569, 20091, 45556, 47977}, (ViewConfiguration.getScrollBarSize() >> 8) + 1409, objArr4);
        onNavigationEvent = aFe1iSDK.IAuthTabCallback("android.disclaimer.link.creditInformation", ((String) objArr4[0]).intern());
        onWarmupCompleted = 8;
        int i = IAuthTabCallback_Parcel + 99;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    private AFe1iSDK() {
    }

    public /* bridge */ <T> ALCFaceSDKExternalSyntheticLambda5<T> IAuthTabCallback(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDKExternalSyntheticLambda5<T> aLCFaceSDKExternalSyntheticLambda5IAuthTabCallback = super.IAuthTabCallback(str, t);
        int i4 = IAuthTabCallbackStubProxy + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceSDKExternalSyntheticLambda5IAuthTabCallback;
    }

    public Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 111;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = onTransact;
        int i5 = i2 + 7;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        return (String) IAuthTabCallback.onWarmupCompleted(this, i2 % 2 == 0 ? onExtraCallback[1] : onExtraCallback[0]);
    }

    public final String onExtraCallbackWithResult() {
        ALCFaceSDKExternalSyntheticLambda5 aLCFaceSDKExternalSyntheticLambda5;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            aLCFaceSDKExternalSyntheticLambda5 = IAuthTabCallbackDefault;
            addallcommandline = onExtraCallback[0];
        } else {
            aLCFaceSDKExternalSyntheticLambda5 = IAuthTabCallbackDefault;
            addallcommandline = onExtraCallback[1];
        }
        String str = (String) aLCFaceSDKExternalSyntheticLambda5.onWarmupCompleted(this, addallcommandline);
        int i3 = IAuthTabCallbackStubProxy + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        ALCFaceSDKExternalSyntheticLambda5 aLCFaceSDKExternalSyntheticLambda5;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGB_YVYU;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            aLCFaceSDKExternalSyntheticLambda5 = asInterface;
            addallcommandline = onExtraCallback[3];
        } else {
            aLCFaceSDKExternalSyntheticLambda5 = asInterface;
            addallcommandline = onExtraCallback[2];
        }
        String str = (String) aLCFaceSDKExternalSyntheticLambda5.onWarmupCompleted(this, addallcommandline);
        int i3 = IAuthTabCallbackStubProxy + 73;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) onNavigationEvent.onWarmupCompleted(this, onExtraCallback[3]);
        int i4 = IAuthTabCallbackStubProxy + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 31;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 59, 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 58 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), 6383 - Color.alpha(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void asInterface() {
        IAuthTabCallbackStub = -4342816093651454369L;
    }
}
