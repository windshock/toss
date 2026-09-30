package com.tmoney.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyConstants;
import com.tmoney.g.a;
import com.tmoney.g.c;
import com.tmoney.g.d;
import com.tmoney.preference.TmoneyData;
import java.lang.reflect.Method;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DeviceInfoHelper {
    public static boolean DYMANIC_AID = false;
    public static boolean SET_ESIM = false;
    private static final String TAG = "DeviceInfoHelper";
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static long IAuthTabCallback = 8543716484835641733L;
    private static int onExtraCallback = -1776194565;
    private static char onExtraCallbackWithResult = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = 4 - (s * 3);
        byte[] bArr = $$a;
        int i3 = 110 - b;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            i3 = i4;
            i = 0;
            i2++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                return new String(bArr2, 0);
            }
            i5 = bArr[i2];
            i++;
            i2++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public static String getAndroidOsVersion() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.VERSION.RELEASE;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getBrand() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.BRAND;
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static boolean getEsimYn() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            z = SET_ESIM;
            int i4 = 18 / 0;
        } else {
            z = SET_ESIM;
        }
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static String getLine1Number(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            String line1Number = getTelephonyManager(context).getLine1Number();
            if (line1Number != null) {
                int i4 = onWarmupCompleted + 115;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                if (line1Number.length() > 0) {
                    int i6 = onNavigationEvent + 119;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return line1Number;
                    }
                    throw null;
                }
            }
            return "01000000000";
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "01000000000";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getLine1NumberLocaleRemove(Context context) throws Throwable {
        String strReplaceAll;
        TmoneyData tmoneyData;
        StringBuilder sb;
        String str = "";
        int i = 2 % 2;
        try {
            strReplaceAll = PhoneNumberUtils.formatNumber(getLine1Number(context)).replaceAll("-", "");
            try {
            } catch (Exception e) {
                e = e;
                str = strReplaceAll;
                LogHelper.exception(TAG, e);
                strReplaceAll = str;
                if (!strReplaceAll.startsWith("01")) {
                }
                tmoneyData = TmoneyData.getInstance(context);
                if (!tmoneyData.isOrangeOrToss()) {
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (!strReplaceAll.startsWith("+")) {
            Object[] objArr = new Object[1];
            a((char) (MotionEvent.axisFromString("") + 57749), 869484354 - ImageFormat.getBitsPerPixel(0), new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr);
            if (strReplaceAll.startsWith(((String) objArr[0]).intern())) {
                Object[] objArr2 = new Object[1];
                a((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43117), Gravity.getAbsoluteGravity(0, 0) - 1888585467, new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr2);
                sb = new StringBuilder(((String) objArr2[0]).intern());
                sb.append(strReplaceAll);
            }
            if (!strReplaceAll.startsWith("01") && !TextUtils.isEmpty(strReplaceAll) && (!strReplaceAll.equals("01000000000"))) {
                return strReplaceAll;
            }
            tmoneyData = TmoneyData.getInstance(context);
            if (!tmoneyData.isOrangeOrToss()) {
                return strReplaceAll;
            }
            int i2 = onNavigationEvent + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String phoneNumber = tmoneyData.getPhoneNumber();
            if (i3 == 0) {
                TextUtils.isEmpty(phoneNumber);
                throw null;
            }
            if (TextUtils.isEmpty(phoneNumber) || phoneNumber.equals("01000000000")) {
                return strReplaceAll;
            }
            int i4 = onWarmupCompleted + 53;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return phoneNumber;
        }
        Object[] objArr3 = new Object[1];
        a((char) (Gravity.getAbsoluteGravity(0, 0) + 43117), TextUtils.getTrimmedLength("") - 1888585467, new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr3);
        sb = new StringBuilder(((String) objArr3[0]).intern());
        sb.append(strReplaceAll.substring(3, strReplaceAll.length()));
        strReplaceAll = sb.toString();
        if (!strReplaceAll.startsWith("01")) {
        }
        tmoneyData = TmoneyData.getInstance(context);
        if (!tmoneyData.isOrangeOrToss()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r4 = com.tmoney.utils.DeviceInfoHelper.onNavigationEvent + 13;
        com.tmoney.utils.DeviceInfoHelper.onWarmupCompleted = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return com.tmoney.utils.CryptoHelper.encode(getLine1NumberLocaleRemove(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 53;
        com.tmoney.utils.DeviceInfoHelper.onNavigationEvent = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r3 = getLine1NumberLocaleRemove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getLine1NumberLocaleRemove(Context context, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        try {
            if (i2 % 2 == 0) {
                int i4 = 89 / 0;
            }
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static String getModel() {
        int i = 2 % 2;
        if (TmoneyData.getInstance().isGamin()) {
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return c.getModelName();
        }
        if (!SET_ESIM) {
            return Build.MODEL;
        }
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return "SM-F936N";
    }

    public static String getNetworkOperator(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return getTelephonyManager(context).getNetworkOperator();
            }
            getTelephonyManager(context).getNetworkOperator();
            throw null;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static boolean getOffHostYn() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = DYMANIC_AID;
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static String getOtaIssuReqSno(Context context) throws Throwable {
        String string;
        int i = 2 % 2;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        try {
            String strReplaceAll = PhoneNumberUtils.formatNumber(getLine1Number(context)).replaceAll("-", "");
            string = strValueOf + strReplaceAll.substring(strReplaceAll.length() - 1);
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 3;
            }
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(strValueOf);
            Object[] objArr = new Object[1];
            a((char) (43116 - MotionEvent.axisFromString("")), (-1888585467) - View.resolveSizeAndState(0, 0, 0), new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr);
            sb.append(((String) objArr[0]).intern());
            string = sb.toString();
        }
        LogHelper.d(TAG, "issuReqSno " + string);
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0 A[Catch: Exception -> 0x0201, TRY_ENTER, TryCatch #1 {Exception -> 0x0201, blocks: (B:3:0x0007, B:6:0x002f, B:8:0x0035, B:13:0x0070, B:17:0x0079, B:23:0x00e0, B:25:0x00f7, B:29:0x0108, B:31:0x010e, B:40:0x0149, B:48:0x015f, B:37:0x0115), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149 A[Catch: Exception -> 0x0201, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0201, blocks: (B:3:0x0007, B:6:0x002f, B:8:0x0035, B:13:0x0070, B:17:0x0079, B:23:0x00e0, B:25:0x00f7, B:29:0x0108, B:31:0x010e, B:40:0x0149, B:48:0x015f, B:37:0x0115), top: B:61:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getOtaTelecom(Context context) throws Throwable {
        Object obj;
        int i = 2 % 2;
        try {
            String networkOperator = getNetworkOperator(context);
            LogHelper.d(TAG, "getOtaTelecom:" + networkOperator);
            if (networkOperator == null || networkOperator.length() != 5) {
                String simOperator = getSimOperator(context);
                LogHelper.d(TAG, "SimOperator:" + simOperator);
                if (simOperator != null && simOperator.length() == 5) {
                    int i2 = onWarmupCompleted + 47;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 25 / 0;
                        if (simOperator.equals("45005")) {
                            Object[] objArr = new Object[1];
                            a((char) (57747 - MotionEvent.axisFromString("")), 869484355 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr);
                            obj = objArr[0];
                        } else {
                            if (simOperator.equals("45008")) {
                                int i4 = onNavigationEvent + 97;
                                onWarmupCompleted = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return "3";
                                }
                                throw null;
                            }
                            if (simOperator.equals("45006")) {
                                int i5 = onWarmupCompleted + 21;
                                onNavigationEvent = i5 % 128;
                                if (i5 % 2 != 0) {
                                    Object[] objArr2 = new Object[1];
                                    a((char) (TextUtils.indexOf("", "") * 16833), (-944474387) << KeyEvent.keyCodeFromString(""), new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr2);
                                    obj = objArr2[0];
                                } else {
                                    Object[] objArr3 = new Object[1];
                                    a((char) (24155 - TextUtils.indexOf("", "")), (-944474387) - KeyEvent.keyCodeFromString(""), new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr3);
                                    obj = objArr3[0];
                                }
                            }
                        }
                    } else if (simOperator.equals("45005")) {
                    }
                }
                Object[] objArr4 = new Object[1];
                a((char) (43118 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-1888585467) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                int i6 = onNavigationEvent + 99;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return strIntern;
            }
            if (networkOperator.equals("45005")) {
                Object[] objArr5 = new Object[1];
                a((char) (57748 - View.combineMeasuredStates(0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 869484355, new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr5);
                obj = objArr5[0];
            } else {
                if (networkOperator.equals("45008")) {
                    return "3";
                }
                if (networkOperator.equals("45006")) {
                    int i8 = onNavigationEvent + 45;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
                    if (i9 == 0) {
                        Object[] objArr6 = new Object[1];
                        a((char) (19632 << (keyRepeatTimeout % 3)), (-944474388) % TextUtils.indexOf((CharSequence) "", 'Y', 0), new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr6);
                        obj = objArr6[0];
                    } else {
                        Object[] objArr7 = new Object[1];
                        a((char) ((keyRepeatTimeout >> 16) + 24155), (-944474388) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr7);
                        obj = objArr7[0];
                    }
                }
            }
            return ((String) obj).intern();
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static String getSDKVersion(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                String.valueOf(Build.VERSION.SDK_INT);
                throw null;
            }
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
            int i3 = onWarmupCompleted + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return strValueOf;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static String getSeName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (!SET_ESIM) {
            return "SIM1";
        }
        int i5 = i2 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return "SIM2";
    }

    public static String getSimOperator(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return getTelephonyManager(context).getSimOperator();
            }
            getTelephonyManager(context).getSimOperator();
            throw null;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static String getSimSerialNumber(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String simSerialNumber = getSimSerialNumber(context, false);
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return simSerialNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String getSimSerialNumber(Context context, boolean z) {
        StringBuilder sb;
        int i = 2 % 2;
        TmoneyData tmoneyData = TmoneyData.getInstance(context);
        if (tmoneyData.isBluetooth().booleanValue() || tmoneyData.isNotUseUsimPartner()) {
            return tmoneyData.getUiccPreference();
        }
        if (!z && tmoneyData.getServerType() == TmoneyConstants.TmoneyServerType.Alpha.ordinal()) {
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!TextUtils.isEmpty(tmoneyData.getUiccPreference())) {
                return tmoneyData.getUiccPreference();
            }
        }
        if (a.isGetTelecomUiccOS() || tmoneyData.isGamin()) {
            d dVar = d.getInstance();
            if (dVar != null) {
                return dVar.getICCID();
            }
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
        try {
            String simSerialNumber = getTelephonyManager(context).getSimSerialNumber();
            if (simSerialNumber != null) {
                int i6 = onWarmupCompleted + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (simSerialNumber.length() == 19) {
                    sb = new StringBuilder();
                } else if (simSerialNumber.length() > 20) {
                    sb = new StringBuilder();
                    simSerialNumber = simSerialNumber.substring(0, 19);
                }
                sb.append(simSerialNumber);
                sb.append("f");
                simSerialNumber = sb.toString();
            } else {
                simSerialNumber = "";
            }
            return simSerialNumber.equals("0000000000000050073f") ? "8982060000000050073f" : simSerialNumber;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static String getTelecom(Context context) throws Throwable {
        int i = 2 % 2;
        try {
            String simOperator = getSimOperator(context);
            LogHelper.d(TAG, "SimOperator:" + simOperator);
            if (simOperator != null) {
                int i2 = onWarmupCompleted + 103;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (simOperator.length() == 5) {
                    if (!(!simOperator.equals("45005"))) {
                        Object[] objArr = new Object[1];
                        a((char) (57748 - View.MeasureSpec.getSize(0)), 869484355 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr);
                        return ((String) objArr[0]).intern();
                    }
                    if (simOperator.equals("45008")) {
                        Object[] objArr2 = new Object[1];
                        a((char) (View.combineMeasuredStates(0, 0) + 24155), Color.red(0) - 944474387, new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr2);
                        return ((String) objArr2[0]).intern();
                    }
                    if (simOperator.equals("45006")) {
                        int i4 = onWarmupCompleted;
                        int i5 = i4 + 117;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 47;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            return "3";
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            String networkOperator = getNetworkOperator(context);
            LogHelper.d(TAG, "getTelecom:" + networkOperator);
            if (networkOperator != null && networkOperator.length() == 5) {
                if (networkOperator.equals("45005")) {
                    int i8 = onWarmupCompleted + 75;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr3 = new Object[1];
                    a((char) (57749 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 869484355, new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr3);
                    return ((String) objArr3[0]).intern();
                }
                if (networkOperator.equals("45008")) {
                    Object[] objArr4 = new Object[1];
                    a((char) ((Process.myTid() >> 22) + 24155), (-944474387) - (Process.myTid() >> 22), new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr4);
                    return ((String) objArr4[0]).intern();
                }
                if (!(!networkOperator.equals("45006"))) {
                    return "3";
                }
            }
            Object[] objArr5 = new Object[1];
            a((char) ((Process.myPid() >> 22) + 43117), (-1888585467) - Gravity.getAbsoluteGravity(0, 0), new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr5);
            return ((String) objArr5[0]).intern();
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return "";
        }
    }

    public static TelephonyManager getTelephonyManager(Context context) {
        TelephonyManager telephonyManager;
        int usimSubscriptionId;
        int i = 2 % 2;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            try {
                if (a.isGetTelecomUiccOS() && (usimSubscriptionId = getUsimSubscriptionId(context)) > 0) {
                    TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(usimSubscriptionId);
                    int i2 = onWarmupCompleted + 41;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 68 / 0;
                    }
                    return telephonyManagerCreateForSubscriptionId;
                }
                return telephonyManager;
            } catch (Exception unused) {
                int i4 = onWarmupCompleted + 55;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return telephonyManager;
            }
        } catch (Exception unused2) {
            telephonyManager = null;
        }
    }

    public static String getUiccTelecom(Context context) throws Throwable {
        Object obj;
        String simSerialNumber;
        String strSubstring;
        int i = 2 % 2;
        try {
            simSerialNumber = getSimSerialNumber(context, true);
            strSubstring = simSerialNumber.substring(4, 6);
            LogHelper.d(TAG, "UiccTelecom:" + strSubstring + ", SimSerial:" + simSerialNumber);
        } catch (Exception unused) {
        }
        if (strSubstring.length() == 2) {
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                strSubstring.equals("05");
                throw null;
            }
            if (strSubstring.equals("05")) {
                int i3 = onWarmupCompleted + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                a((char) (57747 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 869484356, new char[]{10400}, new char[]{25214, 51814, 27862, 6827}, new char[]{17382, 54087, 37939, 24545}, objArr);
                obj = objArr[0];
            } else {
                if (strSubstring.equals("30")) {
                    Object[] objArr2 = new Object[1];
                    a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24155), Color.red(0) - 944474387, new char[]{53308}, new char[]{25214, 51814, 27862, 6827}, new char[]{60720, 46198, 23495, 20062}, objArr2);
                    return ((String) objArr2[0]).intern();
                }
                if (!(!strSubstring.equals("06"))) {
                    int i5 = onNavigationEvent + 93;
                    int i6 = i5 % 128;
                    onWarmupCompleted = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 91;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return "3";
                }
                if (simSerialNumber.equals("0000000000000050073f")) {
                    int i10 = onNavigationEvent + 43;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return "3";
                    }
                    throw null;
                }
                Object[] objArr3 = new Object[1];
                a((char) (43117 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1888585468, new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr3);
                obj = objArr3[0];
            }
        } else {
            Object[] objArr32 = new Object[1];
            a((char) (43117 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1888585468, new char[]{34170}, new char[]{25214, 51814, 27862, 6827}, new char[]{1364, 28281, 28047, 33192}, objArr32);
            obj = objArr32[0];
        }
        return ((String) obj).intern();
    }

    public static int getUsimSubscriptionId(Context context) {
        StringBuilder sb;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            a.isGetTelecomUiccOS();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int subscriptionId = -1;
        if (!a.isGetTelecomUiccOS() || context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return -1;
        }
        for (SubscriptionInfo subscriptionInfo : ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList()) {
            LogHelper.d(TAG, "SubscriptionInfo>>info[" + subscriptionInfo + "]");
            if (!(!SET_ESIM)) {
                if (subscriptionInfo.isEmbedded()) {
                    subscriptionId = subscriptionInfo.getSubscriptionId();
                    break;
                }
            } else {
                if (!subscriptionInfo.isEmbedded()) {
                    subscriptionId = subscriptionInfo.getSubscriptionId();
                    break;
                }
            }
        }
        if (SET_ESIM) {
            sb = new StringBuilder("getEsimSubscriptionId>>");
            int i3 = onWarmupCompleted + 97;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 3;
            }
        } else {
            sb = new StringBuilder("getUsimSubscriptionId>>");
        }
        sb.append(subscriptionId);
        LogHelper.d(TAG, sb.toString());
        return subscriptionId;
    }

    public static boolean hasEmbeddedUsim(Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!a.isGetTelecomUiccOS()) {
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return false;
        }
        Iterator<SubscriptionInfo> it = ((SubscriptionManager) context.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList().iterator();
        while (it.hasNext()) {
            if (!(!it.next().isEmbedded())) {
                int i6 = onNavigationEvent + 93;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
        }
        return false;
    }

    public static void setEsimYn(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SET_ESIM = z;
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        int i6 = i2 + 61;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void setOffhostYn(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        DYMANIC_AID = z;
        int i5 = i3 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
        int i3 = $10 + 1;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iArgb = Color.argb(0, 0, 0, 0) + 43;
                    int i5 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1450;
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, iArgb, i5, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 49123);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 44;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 1494;
                    byte b3 = $$a[0];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, packedPositionType, deadChar, 1533236389, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23971), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, KeyEvent.getDeadChar(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 45848), 28 - MotionEvent.axisFromString(""), 12576 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 47;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
