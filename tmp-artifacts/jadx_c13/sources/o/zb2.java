package o;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zb2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char[] onNavigationEvent = {32716};
    private static int onExtraCallback = -1184333892;
    private static boolean onWarmupCompleted = true;
    private static boolean onExtraCallbackWithResult = true;

    protected zb2() {
    }

    public static boolean onExtraCallback() {
        int i = 2 % 2;
        String str = Build.MODEL;
        if (!str.contains("sdk")) {
            int i2 = asBinder + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!str.contains("SDK")) {
                int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                asBinder = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String onExtraCallback(Context context) {
        int i = 2 % 2;
        String simSerialNumber = null;
        try {
            if (onExtraCallback()) {
                return "8982050611301699363F";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simSerialNumber = telephonyManager.getSimSerialNumber();
            if (LibraryFeatures.isMultiUiccAvailableYn()) {
                int i2 = IAuthTabCallback + 99;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 13 / 0;
                    if (LibraryFeatures.getSemSubscriptionId() > 0) {
                        int i4 = IAuthTabCallback + 119;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        simSerialNumber = telephonyManager.createForSubscriptionId(LibraryFeatures.getSemSubscriptionId()).getSimSerialNumber();
                    }
                } else if (LibraryFeatures.getSemSubscriptionId() > 0) {
                }
            }
            return simSerialNumber + "F";
        } catch (Exception unused) {
            return simSerialNumber;
        }
    }

    public static String onNavigationEvent(Context context) throws Throwable {
        TelephonyManager telephonyManager;
        String line1Number;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            line1Number = telephonyManager.getLine1Number();
        } catch (Exception unused) {
        }
        try {
            if (LibraryFeatures.isMultiUiccAvailableYn() && LibraryFeatures.getSemSubscriptionId() > 0) {
                int i4 = asBinder + 65;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 54 / 0;
                    line1Number = telephonyManager.createForSubscriptionId(LibraryFeatures.getSemSubscriptionId()).getLine1Number();
                } else {
                    line1Number = telephonyManager.createForSubscriptionId(LibraryFeatures.getSemSubscriptionId()).getLine1Number();
                }
            }
            if (line1Number == null || !line1Number.startsWith("+")) {
                return line1Number;
            }
            int i6 = asBinder + 33;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127}, 126 - ExpandableListView.getPackedPositionChild(0L), objArr);
            return line1Number.replace("+82", ((String) objArr[0]).intern());
        } catch (Exception unused2) {
            str = line1Number;
            return str;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onNavigationEvent;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = $11 + 105;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 77 - (Process.myPid() >> 22), Color.red(0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        char c = '0';
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 75 - Gravity.getAbsoluteGravity(0, 0), 16036 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (!onExtraCallbackWithResult) {
            if (!onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 62, AndroidCharacter.getMirror(c) + 12166, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                c = '0';
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] * iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 64 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 12262 - AndroidCharacter.getMirror('0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 93;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }
}
