package com.skt.usp.tools.common;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class APIResultCode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final APIResultCode ERROR_COMPONENT_PERMISSION_FAIL;
    public static final APIResultCode ERROR_INVALID_COMPONENT_STATE;
    public static final APIResultCode ERROR_INVALID_PACKAGE;
    public static final APIResultCode ERROR_INVALID_PARAM;
    public static final APIResultCode ERROR_INVALID_STID;
    public static final APIResultCode ERROR_INVALID_UCPSERVICE_STATE;
    public static final APIResultCode ERROR_UNKNOWN;
    public static final APIResultCode ERROR_UNSUPPORTED_CARRIER_API_STATE;
    public static final APIResultCode ERROR_URMS_INTERACTION_FAIL;
    public static final APIResultCode ERROR_USP_INTERACTION_FAIL;
    private static int IAuthTabCallback = 0;
    public static final APIResultCode SUCCESS;
    public static final APIResultCode SUCCESS_NEED_REBOOT;
    private static int asBinder = 1;
    private static final /* synthetic */ APIResultCode[] c;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char onNavigationEvent;
    private static char[] onWarmupCompleted;
    private int a;
    private String b;

    private static /* synthetic */ APIResultCode[] a() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        APIResultCode[] aPIResultCodeArr = {SUCCESS, SUCCESS_NEED_REBOOT, ERROR_URMS_INTERACTION_FAIL, ERROR_USP_INTERACTION_FAIL, ERROR_COMPONENT_PERMISSION_FAIL, ERROR_UNSUPPORTED_CARRIER_API_STATE, ERROR_INVALID_COMPONENT_STATE, ERROR_INVALID_UCPSERVICE_STATE, ERROR_INVALID_PACKAGE, ERROR_INVALID_PARAM, ERROR_INVALID_STID, ERROR_UNKNOWN};
        int i5 = i2 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return aPIResultCodeArr;
        }
        throw null;
    }

    public static APIResultCode valueOf(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        APIResultCode aPIResultCode = (APIResultCode) Enum.valueOf(APIResultCode.class, str);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return aPIResultCode;
    }

    public static APIResultCode[] values() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        APIResultCode[] aPIResultCodeArr = (APIResultCode[]) c.clone();
        int i3 = asBinder + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return aPIResultCodeArr;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        d(new char[]{0, 2, 13813, 13813, 0, 3, 13797}, (byte) (28 - (ViewConfiguration.getPressedStateDuration() >> 16)), 7 - Drawable.resolveOpacity(0, 0), objArr);
        SUCCESS = new APIResultCode(((String) objArr[0]).intern(), 0, 0, "Success !!");
        SUCCESS_NEED_REBOOT = new APIResultCode("SUCCESS_NEED_REBOOT", 1, 80, "You need to request Efrefresh or restart your device !!");
        ERROR_URMS_INTERACTION_FAIL = new APIResultCode("ERROR_URMS_INTERACTION_FAIL", 2, -10, "Urms interaction fail !!");
        ERROR_USP_INTERACTION_FAIL = new APIResultCode("ERROR_USP_INTERACTION_FAIL", 3, -11, "USP interaction fail !!");
        ERROR_COMPONENT_PERMISSION_FAIL = new APIResultCode("ERROR_COMPONENT_PERMISSION_FAIL", 4, -20, "You do not have permission component !!");
        ERROR_UNSUPPORTED_CARRIER_API_STATE = new APIResultCode("ERROR_UNSUPPORTED_CARRIER_API_STATE", 5, -80, "Unsupported Ucp api state !!");
        ERROR_INVALID_COMPONENT_STATE = new APIResultCode("ERROR_INVALID_COMPONENT_STATE", 6, -100, "invalid component state !!");
        ERROR_INVALID_UCPSERVICE_STATE = new APIResultCode("ERROR_INVALID_UCPSERVICE_STATE", 7, -101, "invalid UcpService state !!");
        ERROR_INVALID_PACKAGE = new APIResultCode("ERROR_INVALID_PACKAGE", 8, -102, "invalid package name request !!");
        ERROR_INVALID_PARAM = new APIResultCode("ERROR_INVALID_PARAM", 9, -103, "invalid parameter !!");
        ERROR_INVALID_STID = new APIResultCode("ERROR_INVALID_STID", 10, -105, "invalid stId !!");
        ERROR_UNKNOWN = new APIResultCode("ERROR_UNKNOWN", 11, -999, "unknown error !!");
        c = a();
        int i = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private APIResultCode(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public int getCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            i = this.a;
            int i5 = 13 / 0;
        } else {
            i = this.a;
        }
        int i6 = i4 + 13;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setCode(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.a = i;
        int i6 = i4 + 19;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 8 / 0;
        }
    }

    public String getMessage() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.b;
        int i5 = i3 + 125;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMessage(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.b = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 79;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void d(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onWarmupCompleted;
        float f = 0.0f;
        if (cArr3 != null) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 19;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (-16777190) - Color.rgb(0, 0, 0), 23139 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 23138 - TextUtils.lastIndexOf("", '0'), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                f = 0.0f;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 26 - TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $10 + 119;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 24825), Color.green(0) + 74, ExpandableListView.getPackedPositionGroup(0L) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i9 = $11 + 37;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, 19489 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                    } else {
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        int i16 = $10 + 19;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{64998, 65014, 64992, 65008};
        onNavigationEvent = (char) 51243;
    }
}
