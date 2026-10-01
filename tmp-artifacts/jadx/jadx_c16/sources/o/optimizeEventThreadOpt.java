package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.feature.credit.ui.history.R;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.h5ScreenShotObserverOnChangeOpt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class optimizeEventThreadOpt {
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int onNavigationEvent = -1776194565;
    private static char onExtraCallbackWithResult = 42329;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        byte[] bArr = $$a;
        int i2 = s * 2;
        int i3 = 4 - (b2 * 3);
        int i4 = b + 109;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i3];
            i++;
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    public static final onUnavailable IAuthTabCallback(@NotNull networkInfoOpt networkinfoopt) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(networkinfoopt, "");
        if (IAuthTabCallback.IAuthTabCallback[networkinfoopt.ordinal()] != 1) {
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
        String strOnExtraCallbackWithResult = aFj1rSDK.onExtraCallbackWithResult(R.string.credit_ui_history_score_down_banner_title);
        String strOnExtraCallbackWithResult2 = aFj1rSDK.onExtraCallbackWithResult(R.string.credit_ui_history_score_down_banner_description);
        String strOnExtraCallbackWithResult3 = h5ScreenShotObserverOnChangeOpt.onExtraCallbackWithResult(h5ScreenShotObserverOnChangeOpt.extraCallback.onExtraCallbackWithResult, false, "credit_history_detail", false, (Map) null, 13, (Object) null);
        connectWifiV29 connectwifiv29 = connectWifiV29.IMAGE;
        Object[] objArr = new Object[1];
        a((char) (MotionEvent.axisFromString("") + 1), ViewConfiguration.getTapTimeout() >> 16, new char[]{12124, 42686, 4989, 1441, 10358, 56700, 37809, 39870, 16937, 42285, 56898, 8874, 1952, 23466, 46412, 23347, 57102, 47110, 'e', 32796, 7904, 56871, 50400, 26738, 11416, 11546, 34119, 3587, 2672, 39744, 58931, 16480, 6906, 15255, 56175, 45510, 43422, 31055, 37877, 16670, 4092, 58353, 17084, 34927, 17466, 63324, 41939, 43210, 20045, 32262, 6295, 37582, 53068, 'L', 17017, 20561, 32194, 33608, 62928, 60250, 192, 4567}, new char[]{0, 0, 0, 0}, new char[]{27960, 54419, 11713, 1535}, objArr);
        onUnavailable onunavailable = new onUnavailable(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, (String) null, (String) null, false, (CipherSuiteCompanion) null, strOnExtraCallbackWithResult3, ((String) objArr[0]).intern(), (CipherSuiteCompanion) null, connectwifiv29, (String) null, (Map) null, (Boolean) null, false, false, (CipherSuiteCompanion) null, "credit_plus", (String) null, (Function0) null, 458044, (DefaultConstructorMarker) null);
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
        return onunavailable;
    }

    public static final String IAuthTabCallback(@NotNull onAvailable onavailable, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String strIAuthTabCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onavailable, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-644071476, i, -1, "im.toss.feature.credit.ui.history.list.scoreChangeTitle (ScoreChangeType.kt:33)");
            int i3 = onWarmupCompleted + 53;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        networkInfoOpt networkinfooptIAuthTabCallback = IAuthTabCallback(onavailable);
        int i5 = networkinfooptIAuthTabCallback != null ? IAuthTabCallback.IAuthTabCallback[networkinfooptIAuthTabCallback.ordinal()] : -1;
        if (i5 == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-477391143);
            strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_ui_history_score_change_title_down, new Object[]{Integer.valueOf(onavailable.access100())}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (i5 != 2) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-477388266);
            strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_ui_history_score_change_title, new Object[]{onavailable.onExtraCallback()}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-477394473);
            strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_ui_history_score_change_title_up, new Object[]{Integer.valueOf(onavailable.access100())}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = IAuthTabCallback + 83;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i8 = onWarmupCompleted + 95;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final networkInfoOpt IAuthTabCallback(@NotNull onAvailable onavailable) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onavailable, "");
        String strAsInterface = onavailable.asInterface();
        if (strAsInterface != null) {
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = strAsInterface.hashCode();
            if (iHashCode != 2715) {
                int i4 = onWarmupCompleted + 41;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                if (iHashCode != 2104482) {
                    if (iHashCode == 2402104 && !(!strAsInterface.equals("NONE"))) {
                        return networkInfoOpt.SAME;
                    }
                } else if (strAsInterface.equals("DOWN")) {
                    networkInfoOpt networkinfoopt = networkInfoOpt.DOWN;
                    int i6 = onWarmupCompleted + 121;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return networkinfoopt;
                    }
                    throw null;
                }
            } else if (strAsInterface.equals("UP")) {
                return networkInfoOpt.UP;
            }
        }
        return null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 42 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 44 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getEdgeSlop() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), 50 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22939 - (ViewConfiguration.getTapTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 29 - ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 61;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
