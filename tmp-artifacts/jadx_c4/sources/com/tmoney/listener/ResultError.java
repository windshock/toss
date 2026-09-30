package com.tmoney.listener;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResultError {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ ResultError[] $VALUES;
    public static final ResultError DATA_ERROR;
    public static final ResultError ENABLE_ERROR;
    public static final ResultError EXCEPTION;
    private static int IAuthTabCallback = 1;
    public static final ResultError ISSUE_ERROR;
    public static final ResultError JOINED;
    public static final ResultError KT_UFIN_CLIENT_INSTALL;
    public static final ResultError KT_UFIN_CLIENT_UPDATE;
    public static final ResultError LGU_USIM_AGENT;
    public static final ResultError LOST_DISABLE;
    public static final ResultError NEED_1TH_ISSUE;
    public static final ResultError NEED_2TH_ISSUE;
    public static final ResultError NEED_ENABLE;
    public static final ResultError NEED_INIT;
    public static final ResultError NEED_JOIN;
    public static final ResultError NEED_READ_PHONE_STATE_PERMISSION;
    public static final ResultError NEED_REBOOT;
    public static final ResultError NEED_REFUND;
    public static final ResultError NEED_SET_PHONE_NUMBER;
    public static final ResultError NETWORK;
    public static final ResultError NOREGIST_CREDITCARD;
    public static final ResultError NOT_SUPPORT;
    public static final ResultError NOT_TARGET_USER;
    public static final ResultError NO_SEND_DATA;
    public static final ResultError OMA_AUTH_ERROR;
    public static final ResultError PARTNER_JOIN;
    public static final ResultError POSTPAID_LONGTIME_NOUSE_DISABLE;
    public static final ResultError SERVER_ERROR;
    public static final ResultError SKT_SEIO_INSTALL;
    public static final ResultError SKT_SEIO_UPDATE;
    public static final ResultError SUCCESS;
    public static final ResultError UNKNOWN_DEVICE_INFO;
    public static final ResultError UNREGIST_CREDITCARD;
    public static final ResultError USIM_ERROR;
    public static final ResultError USIM_WAITTING;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private static /* synthetic */ ResultError[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ResultError[] resultErrorArr = {SUCCESS, EXCEPTION, USIM_ERROR, OMA_AUTH_ERROR, USIM_WAITTING, ENABLE_ERROR, NEED_REBOOT, ISSUE_ERROR, KT_UFIN_CLIENT_UPDATE, KT_UFIN_CLIENT_INSTALL, NEED_1TH_ISSUE, NEED_2TH_ISSUE, NEED_ENABLE, LGU_USIM_AGENT, SKT_SEIO_INSTALL, SKT_SEIO_UPDATE, NOT_SUPPORT, JOINED, LOST_DISABLE, NEED_JOIN, NEED_READ_PHONE_STATE_PERMISSION, NEED_REFUND, NOREGIST_CREDITCARD, NOT_TARGET_USER, PARTNER_JOIN, POSTPAID_LONGTIME_NOUSE_DISABLE, UNKNOWN_DEVICE_INFO, UNREGIST_CREDITCARD, DATA_ERROR, SERVER_ERROR, NETWORK, NEED_INIT, NO_SEND_DATA, NEED_SET_PHONE_NUMBER};
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return resultErrorArr;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{0, 1, 13815, 13815, 3, 0, 13799}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29), 7 - Color.green(0), objArr);
        SUCCESS = new ResultError(((String) objArr[0]).intern(), 0);
        EXCEPTION = new ResultError("EXCEPTION", 1);
        USIM_ERROR = new ResultError("USIM_ERROR", 2);
        OMA_AUTH_ERROR = new ResultError("OMA_AUTH_ERROR", 3);
        USIM_WAITTING = new ResultError("USIM_WAITTING", 4);
        ENABLE_ERROR = new ResultError("ENABLE_ERROR", 5);
        NEED_REBOOT = new ResultError("NEED_REBOOT", 6);
        ISSUE_ERROR = new ResultError("ISSUE_ERROR", 7);
        KT_UFIN_CLIENT_UPDATE = new ResultError("KT_UFIN_CLIENT_UPDATE", 8);
        KT_UFIN_CLIENT_INSTALL = new ResultError("KT_UFIN_CLIENT_INSTALL", 9);
        NEED_1TH_ISSUE = new ResultError("NEED_1TH_ISSUE", 10);
        NEED_2TH_ISSUE = new ResultError("NEED_2TH_ISSUE", 11);
        NEED_ENABLE = new ResultError("NEED_ENABLE", 12);
        LGU_USIM_AGENT = new ResultError("LGU_USIM_AGENT", 13);
        SKT_SEIO_INSTALL = new ResultError("SKT_SEIO_INSTALL", 14);
        SKT_SEIO_UPDATE = new ResultError("SKT_SEIO_UPDATE", 15);
        NOT_SUPPORT = new ResultError("NOT_SUPPORT", 16);
        JOINED = new ResultError("JOINED", 17);
        LOST_DISABLE = new ResultError("LOST_DISABLE", 18);
        NEED_JOIN = new ResultError("NEED_JOIN", 19);
        NEED_READ_PHONE_STATE_PERMISSION = new ResultError("NEED_READ_PHONE_STATE_PERMISSION", 20);
        NEED_REFUND = new ResultError("NEED_REFUND", 21);
        NOREGIST_CREDITCARD = new ResultError("NOREGIST_CREDITCARD", 22);
        NOT_TARGET_USER = new ResultError("NOT_TARGET_USER", 23);
        PARTNER_JOIN = new ResultError("PARTNER_JOIN", 24);
        POSTPAID_LONGTIME_NOUSE_DISABLE = new ResultError("POSTPAID_LONGTIME_NOUSE_DISABLE", 25);
        UNKNOWN_DEVICE_INFO = new ResultError("UNKNOWN_DEVICE_INFO", 26);
        UNREGIST_CREDITCARD = new ResultError("UNREGIST_CREDITCARD", 27);
        DATA_ERROR = new ResultError("DATA_ERROR", 28);
        SERVER_ERROR = new ResultError("SERVER_ERROR", 29);
        NETWORK = new ResultError("NETWORK", 30);
        NEED_INIT = new ResultError("NEED_INIT", 31);
        NO_SEND_DATA = new ResultError("NO_SEND_DATA", 32);
        NEED_SET_PHONE_NUMBER = new ResultError("NEED_SET_PHONE_NUMBER", 33);
        $VALUES = $values();
        int i = onNavigationEvent + 91;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private ResultError(String str, int i) {
    }

    public static ResultError valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ResultError resultError = (ResultError) Enum.valueOf(ResultError.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return resultError;
        }
        obj.hashCode();
        throw null;
    }

    public static ResultError[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ResultError[] resultErrorArr = (ResultError[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return resultErrorArr;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - TextUtils.getOffsetBefore("", 0), 23139 - KeyEvent.keyCodeFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 26, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $11;
                int i9 = i8 + 101;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i3 = i - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i11 = i8 + 89;
                $10 = i11 % 128;
                i2 = 2;
                int i12 = i11 % 2;
            } else {
                i2 = 2;
                i3 = i;
            }
            if (i3 > 1) {
                int i13 = $11 + 103;
                $10 = i13 % 128;
                int i14 = i13 % i2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i15 = $11 + 49;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback >> b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        int i16 = $11 + 13;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 24824), 75 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                try {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 29 - MotionEvent.axisFromString(""), 19488 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i19 = $10 + 105;
                                    $11 = i19 % 128;
                                    int i20 = i19 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i21 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i22 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i21];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i22];
                                } else {
                                    int i23 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i24 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i23];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i24];
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i25 = 0; i25 < i; i25++) {
                cArr4[i25] = (char) (cArr4[i25] ^ 13722);
            }
            String str = new String(cArr4);
            int i26 = $10 + 115;
            $11 = i26 % 128;
            int i27 = i26 % 2;
            objArr[0] = str;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{64998, 64992, 65014, 65008};
        onExtraCallbackWithResult = (char) 51243;
    }
}
