package com.google.android.recaptcha;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RecaptchaErrorCode {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecaptchaErrorCode[] $VALUES;
    private static int[] IAuthTabCallback = null;
    public static final RecaptchaErrorCode INTERNAL_ERROR;
    public static final RecaptchaErrorCode INVALID_ACTION;
    public static final RecaptchaErrorCode INVALID_KEYTYPE;
    public static final RecaptchaErrorCode INVALID_PACKAGE_NAME;
    public static final RecaptchaErrorCode INVALID_SITEKEY;
    public static final RecaptchaErrorCode INVALID_TIMEOUT;
    public static final RecaptchaErrorCode NETWORK_ERROR;
    public static final RecaptchaErrorCode UNKNOWN_ERROR;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final int errorCode;
    private final String errorMessage;

    private static final /* synthetic */ RecaptchaErrorCode[] $values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        RecaptchaErrorCode[] recaptchaErrorCodeArr = {UNKNOWN_ERROR, NETWORK_ERROR, INVALID_SITEKEY, INVALID_KEYTYPE, INVALID_PACKAGE_NAME, INVALID_ACTION, INVALID_TIMEOUT, INTERNAL_ERROR};
        int i6 = i4 + 5;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return recaptchaErrorCodeArr;
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{-1601356077, 479927728, -122193132, -641240309, -133805578, 263570424, -923675714, -1192057990}, 13 - (Process.myPid() >> 22), objArr);
        UNKNOWN_ERROR = new RecaptchaErrorCode(((String) objArr[0]).intern(), 0, 0, "Unknown Error");
        NETWORK_ERROR = new RecaptchaErrorCode("NETWORK_ERROR", 1, 1, "Network Error");
        INVALID_SITEKEY = new RecaptchaErrorCode("INVALID_SITEKEY", 2, 2, "Site key invalid");
        INVALID_KEYTYPE = new RecaptchaErrorCode("INVALID_KEYTYPE", 3, 3, "Key type invalid");
        INVALID_PACKAGE_NAME = new RecaptchaErrorCode("INVALID_PACKAGE_NAME", 4, 4, "Package name not allowed");
        INVALID_ACTION = new RecaptchaErrorCode("INVALID_ACTION", 5, 5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information");
        INVALID_TIMEOUT = new RecaptchaErrorCode("INVALID_TIMEOUT", 6, 6, "Invalid timeout, minimum value is 5_000L milliseconds");
        INTERNAL_ERROR = new RecaptchaErrorCode("INTERNAL_ERROR", 7, 100, "Internal Error");
        RecaptchaErrorCode[] recaptchaErrorCodeArr$values = $values();
        $VALUES = recaptchaErrorCodeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(recaptchaErrorCodeArr$values);
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    private RecaptchaErrorCode(String str, int i2, int i3, String str2) {
        this.errorCode = i3;
        this.errorMessage = str2;
    }

    public static EnumEntries<RecaptchaErrorCode> getEntries() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<RecaptchaErrorCode> enumEntries = $ENTRIES;
        int i6 = i3 + 95;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static RecaptchaErrorCode valueOf(@NonNull String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RecaptchaErrorCode recaptchaErrorCode = (RecaptchaErrorCode) Enum.valueOf(RecaptchaErrorCode.class, str);
        int i5 = onNavigationEvent + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return recaptchaErrorCode;
    }

    public static RecaptchaErrorCode[] values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        RecaptchaErrorCode[] recaptchaErrorCodeArr = $VALUES;
        if (i4 != 0) {
            return (RecaptchaErrorCode[]) recaptchaErrorCodeArr.clone();
        }
        throw null;
    }

    public final int getErrorCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.errorCode;
        int i7 = i3 + 75;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.errorMessage;
        int i5 = i3 + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int length2;
        int[] iArr3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = IAuthTabCallback;
        int i7 = -1469660336;
        int i8 = 0;
        if (iArr4 != null) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i4 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i4 = 0;
            }
            while (i4 < length2) {
                int i10 = $11 + 121;
                $10 = i10 % 128;
                if (i10 % i5 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) + 72, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i4] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i4 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr4[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 72 - TextUtils.indexOf("", "", 0, 0), ImageFormat.getBitsPerPixel(0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i4] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5 = 2;
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback;
        if (iArr6 != null) {
            int i11 = $10 + 123;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                Object[] objArr4 = new Object[1];
                objArr4[i8] = Integer.valueOf(iArr6[i3]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 72 - Color.argb(i8, i8, i8, i8), ImageFormat.getBitsPerPixel(i8) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i3++;
                i7 = -1469660336;
                i8 = 0;
            }
            iArr6 = iArr2;
        }
        int i12 = i8;
        System.arraycopy(iArr6, i12, iArr5, i12, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 125;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Color.red(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, 10301 - (ViewConfiguration.getTouchSlop() >> 8), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 4034), TextUtils.getOffsetBefore("", 0) + 78, View.MeasureSpec.getSize(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new int[]{664585231, -459873344, 1324686514, -699911658, -893993739, -650439824, 302195352, 432016446, 1455847631, -1301122245, 771939015, 1813071241, -185480408, 51381142, 577701986, 1516786460, -736065499, -1165040193};
    }
}
