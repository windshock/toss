package com.skt.usp.tools.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.skt.usp.telco.UCPUtility;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.utils.UCPLog;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class USPSubscriptionManager {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int NO_PERMISSION_GRANTED = -6;
    public static final int SET_SUBID_IS_EQUAL_DEFAULT_SUB_ID = 0;
    public static final int SET_SUBID_IS_NOT_ACTIVE = -1;
    public static final int SET_SUBID_IS_NOT_SKT_UICC = -2;
    public static final int SKT_UICC_NOT_EXIST = -5;
    public static final int UNSUPPORTED_OS_VERSION = -7;
    public static final int UNSUPPORTED_SEIOAGENT_VERSION = -3;
    public static final int UNSUPPORTED_SMARTCARDSVC_VERSION = -4;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private SubscriptionManager a;
    private TelephonyManager b;
    private Context c;
    private int d = -1;
    private static char[] IAuthTabCallback = {64992, 64965, 64976, 65008, 65010, 64982, 64909, 64980, 65014, 64996, 64918, 64970, 64967, 65006, 64986, 64915, 64971, 64999, 64994, 64998, 65023, 65000, 65017, 64977, 64995, 64988, 64997, 64961, 64905, 65018, 64966, 64989, 64981, 64960, 64983, 64963};
    private static char onNavigationEvent = 51247;

    public USPSubscriptionManager(Context context) {
        this.a = null;
        this.b = null;
        this.c = null;
        UCPLog.info(">> USPSubscriptionManager()");
        if (this.c == null) {
            this.c = context;
            this.a = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            this.b = (TelephonyManager) context.getSystemService("phone");
            int i = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public boolean setUcpSubscriptionIdInit() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        UCPLog.info(">> setUcpSubscriptionIdInit");
        UCPLog.debug("++ setUcpSubscriptionIdInit: [%s], defultSubId: [%s]", Integer.valueOf(UCPLibraryFeatures.getUcpSubscriptionId()), Integer.valueOf(getGetDefaultSubscriptionId()));
        int ucpSubscriptionId = UCPLibraryFeatures.getUcpSubscriptionId();
        if (UCPLibraryFeatures.isMultiUiccAvailableYn()) {
            UCPLog.info("++ check availableMultiUicc");
            if (ucpSubscriptionId < 0) {
                int i4 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (!e() && a() > 0) {
                    ucpSubscriptionId = b().getSubscriptionId();
                    UCPLog.debug("++ setUcpSubscriptionIdInit: [%s]", Integer.valueOf(ucpSubscriptionId));
                    UCPLibraryFeatures.setUcpSubscriptionId(ucpSubscriptionId);
                }
            }
        }
        if (this.d != UCPLibraryFeatures.getUcpSubscriptionId()) {
            UCPLog.debug("++ usingSubscriptionId not eqaul setSubId [%s],[%s]", Integer.valueOf(this.d), Integer.valueOf(ucpSubscriptionId));
            this.d = UCPLibraryFeatures.getUcpSubscriptionId();
            int i6 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        UCPLog.info("++ getSemSubscriptionIdInit: [%s], defultSubId: [%s]", Integer.valueOf(UCPLibraryFeatures.getUcpSubscriptionId()), Integer.valueOf(getGetDefaultSubscriptionId()));
        return z;
    }

    public int availableMultiUiccCd() {
        int i = 2 % 2;
        int ucpSubscriptionId = UCPLibraryFeatures.getUcpSubscriptionId();
        boolean zIsMultiUiccAvailableYn = UCPLibraryFeatures.isMultiUiccAvailableYn();
        UCPLog.debug(">>  availableMultiUiccCd subId: [%s], multiUiccYn;[%s]", Integer.valueOf(ucpSubscriptionId), Boolean.valueOf(zIsMultiUiccAvailableYn));
        if (zIsMultiUiccAvailableYn) {
            if (!h()) {
                int i2 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 == 0 ? 22 : -6;
            }
            if (!g()) {
                int i3 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return -5;
            }
            if (ucpSubscriptionId > 0) {
                if (!d()) {
                    return -7;
                }
                if (!c(ucpSubscriptionId)) {
                    int i5 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 11 / 0;
                    }
                    return -1;
                }
                if (!b(ucpSubscriptionId)) {
                    int i7 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i7 % 128;
                    return i7 % 2 == 0 ? 90 : -2;
                }
                if (UCPUtility.getApplicationVersionCode(this.c, "com.skp.seio") < 18) {
                    int i8 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i8 % 128;
                    return i8 % 2 != 0 ? 77 : -3;
                }
            }
        }
        return 0;
    }

    public boolean checkActiveCnt() {
        int i = 2 % 2;
        if (c() >= 2) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int getGetDefaultSubscriptionId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultSubscriptionId;
        }
        throw null;
    }

    private SubscriptionInfo a(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        SubscriptionInfo activeSubscriptionInfo = null;
        if (i < 0) {
            int i6 = i3 + 71;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                i = getGetDefaultSubscriptionId();
            } else {
                getGetDefaultSubscriptionId();
                throw null;
            }
        }
        UCPLog.debug(">> getSubscriptionInfo : _subids: [%s]", Integer.valueOf(i));
        try {
            activeSubscriptionInfo = this.a.getActiveSubscriptionInfo(i);
        } catch (Exception e) {
            String message = e.getMessage();
            Object[] objArr = new Object[1];
            i(new char[]{13851, 13851, '\r', '\t', 0, 17, 5, 3, '\r', 15, 2, 0, 6, 0, 21, '#', 3, 26, 17, ' ', '\r', 15, 31, 1, 25, '#', 31, 26, '\f', 3, 0, 3, '!', 24, 15, '\r', 6, '\t', 14, 4, 11, 5, '\r', 15, 31, 1, 27, 16, 22, '\t', 31, 15}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 119), 53 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            UCPLog.error(((String) objArr[0]).intern(), message);
        }
        UCPLog.debug("++ getSubscriptionInfo [%s]", activeSubscriptionInfo);
        return activeSubscriptionInfo;
    }

    private int a() {
        int i = 2 % 2;
        UCPLog.debug(">> getSktUiccCnt()");
        Iterator<SubscriptionInfo> it = f().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next() != null) {
                int i3 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 22 / 0;
                    if (!(!b(r4.getSubscriptionId()))) {
                        int i5 = onExtraCallbackWithResult + 69;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        i2++;
                    }
                } else if (!(!b(r4.getSubscriptionId()))) {
                    int i52 = onExtraCallbackWithResult + 69;
                    onWarmupCompleted = i52 % 128;
                    int i62 = i52 % 2;
                    i2++;
                }
            }
        }
        UCPLog.debug("++ getSktUiccCnt: [%s]", Integer.valueOf(i2));
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SubscriptionInfo b() {
        int subscriptionId;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.debug(">> getNotDefaultSktUiccSubscriptionInfo()");
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (SubscriptionInfo subscriptionInfo : f()) {
            if (subscriptionInfo != null) {
                int i6 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    subscriptionId = subscriptionInfo.getSubscriptionId();
                    int i7 = 31 / 0;
                    if (subscriptionId == getGetDefaultSubscriptionId()) {
                        continue;
                    } else if (!b(subscriptionId)) {
                        int i8 = onWarmupCompleted + 49;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            UCPLog.debug("++ getNotDefaultSktUiccSubscriptionInfo: [%s]", subscriptionInfo);
                            return subscriptionInfo;
                        }
                        Object[] objArr = new Object[4];
                        objArr[0] = "++ getNotDefaultSktUiccSubscriptionInfo: [%s]";
                        objArr[1] = subscriptionInfo;
                        UCPLog.debug(objArr);
                        return subscriptionInfo;
                    }
                } else {
                    subscriptionId = subscriptionInfo.getSubscriptionId();
                    if (subscriptionId == getGetDefaultSubscriptionId()) {
                        continue;
                    } else if (!b(subscriptionId)) {
                    }
                }
            }
        }
        return null;
    }

    private int c() throws Throwable {
        int activeSubscriptionInfoCount;
        int i = 2 % 2;
        try {
            activeSubscriptionInfoCount = this.a.getActiveSubscriptionInfoCount();
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            Object[] objArr = new Object[1];
            i(new char[]{13836, 13836, '\r', '\t', 0, 17, 5, 3, '\r', 15, 2, 0, 6, 0, 21, '#', 3, 26, 17, ' ', '\r', 15, 31, 1, 25, '#', 31, 26, 1, 27, 31, ' ', '\r', 16, 1, 0, 0, ' ', 26, 15, 17, 6, '\n', 14, 3, 0, 30, 17, '\r', 26, '\"', 25, 21, 27, '\t', '\"', 13871}, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 104), 56 - ImageFormat.getBitsPerPixel(0), objArr);
            UCPLog.error(((String) objArr[0]).intern(), localizedMessage);
            activeSubscriptionInfoCount = 0;
        }
        UCPLog.debug(">> getActiveSubscriptionInfoCount : " + activeSubscriptionInfoCount);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return activeSubscriptionInfoCount;
    }

    private boolean b(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i < 0) {
            i = getGetDefaultSubscriptionId();
        }
        UCPLog.debug(">> isSktUiccSubscriptionId: [%s]", Integer.valueOf(i));
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                int i4 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i4 % 128;
                try {
                    if (i4 % 2 == 0) {
                        a(i);
                        throw null;
                    }
                    SubscriptionInfo subscriptionInfoA = a(i);
                    if (subscriptionInfoA != null) {
                        int carrierId = subscriptionInfoA.getCarrierId();
                        int[] iArr = UCPApiConstants.SKT_CARRIER_ID;
                        UCPLog.debug("++ getCerrierId: [%s], : [%s]", Integer.valueOf(carrierId), iArr);
                        int length = iArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = onWarmupCompleted;
                            int i7 = i6 + 31;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            if (iArr[i5] == carrierId) {
                                int i9 = i6 + 97;
                                onExtraCallbackWithResult = i9 % 128;
                                if (i9 % 2 == 0) {
                                    break;
                                }
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        z = false;
                    }
                } catch (Exception e) {
                    e = e;
                    z = false;
                    UCPLog.error(">> isSktUiccSubscriptionId error: [%s]", e.getLocalizedMessage());
                    UCPLog.debug("++ isSktUiccSubscriptionId: [%s]", Boolean.valueOf(z));
                    int i10 = onWarmupCompleted + 63;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return z;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        UCPLog.debug("++ isSktUiccSubscriptionId: [%s]", Boolean.valueOf(z));
        int i102 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i102 % 128;
        int i112 = i102 % 2;
        return z;
    }

    private boolean d() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i4 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        UCPLog.debug("++ isMultiUiccOsVersionCode: [%s]", Boolean.valueOf(z));
        return z;
    }

    private boolean e() throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zB = b(getGetDefaultSubscriptionId());
            Object[] objArr = new Object[4];
            objArr[1] = ">> isDefaultSubscriptionIdSkt: [%s]";
            objArr[1] = Boolean.valueOf(zB);
            UCPLog.debug(objArr);
            return zB;
        }
        boolean zB2 = b(getGetDefaultSubscriptionId());
        UCPLog.debug(">> isDefaultSubscriptionIdSkt: [%s]", Boolean.valueOf(zB2));
        return zB2;
    }

    private boolean c(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        boolean zIsActiveSubscriptionId = true;
        try {
            if (i3 % 2 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    zIsActiveSubscriptionId = this.a.isActiveSubscriptionId(i);
                    int i4 = onExtraCallbackWithResult + 123;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    zIsActiveSubscriptionId = false;
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                zIsActiveSubscriptionId = this.a.isActiveSubscriptionId(i);
                int i42 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i42 % 128;
                int i52 = i42 % 2;
            }
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            Object[] objArr = new Object[1];
            i(new char[]{13803, 13803, 16, 15, '\"', 3, 0, 14, '\r', 2, 0, 1, '#', 18, ' ', 3, 26, 15, 30, 17, '\r', 26, '#', 25, '!', 16, 1, 0, 0, ' ', 26, 15, 17, 6, '\n', 14, 3, 0, 30, 17, '\r', 26, '\"', 25, 21, 27, '\t', '\"', 13838}, (byte) (71 - Color.red(0)), 48 - TextUtils.lastIndexOf("", '0', 0), objArr);
            UCPLog.error(((String) objArr[0]).intern(), localizedMessage);
        }
        UCPLog.debug(">> isActiveSubscriptionId: [%s]", Boolean.valueOf(zIsActiveSubscriptionId));
        int i6 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return zIsActiveSubscriptionId;
        }
        throw null;
    }

    private List<SubscriptionInfo> f() throws Throwable {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        try {
            activeSubscriptionInfoList = this.a.getActiveSubscriptionInfoList();
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            String localizedMessage = e.getLocalizedMessage();
            Object[] objArr = new Object[1];
            i(new char[]{13801, 13801, '\r', '\t', 0, 17, 5, 3, '\r', 15, 2, 0, 6, 0, 21, '#', 3, 26, 17, ' ', '\r', 15, 31, 1, 25, '#', 31, 26, 26, 20, 30, 15, '\f', 3, 0, 3, '!', 24, 15, '\r', 6, '\t', 14, 4, 11, 5, '\r', 15, 31, 1, 27, 16, 22, '\t', 31, 15}, (byte) (68 - Process.getGidForName("")), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57, objArr);
            UCPLog.error(((String) objArr[0]).intern(), localizedMessage);
            activeSubscriptionInfoList = null;
        }
        UCPLog.debug(">> getActiveSubscriptionInfoList: [%s]", activeSubscriptionInfoList);
        return activeSubscriptionInfoList;
    }

    private boolean g() {
        boolean z;
        int i = 2 % 2;
        UCPLog.debug(">> isSktUiccCntExist()");
        Iterator<SubscriptionInfo> it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SubscriptionInfo next = it.next();
            if (next != null && b(next.getSubscriptionId())) {
                z = true;
                break;
            }
        }
        UCPLog.debug("++ isSktUiccCntExist: [%s]", Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static void i(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        int i4 = -1310771303;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 33;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, (ViewConfiguration.getPressedStateDuration() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = -1310771303;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 125;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 26 - (KeyEvent.getMaxKeyCode() >> 16), 23139 - View.resolveSizeAndState(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i12 = $11 + 87;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                i2 = i + 12;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i13 = $10 + 97;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i14 = $11 + 5;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 24824), 75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8088 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getWindowTouchSlop() >> 8) + 30, 19488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private boolean h() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this.c.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        UCPLog.debug(">> checkPermissionReadPhoneState: [%s]", Boolean.valueOf(z));
        return z;
    }
}
