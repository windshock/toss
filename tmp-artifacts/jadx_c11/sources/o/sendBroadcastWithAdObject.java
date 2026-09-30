package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sendBroadcastWithAdObject {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sendBroadcastWithAdObject[] $VALUES;
    public static final sendBroadcastWithAdObject ACCOUNT;
    public static final sendBroadcastWithAdObject ACCOUNT_INQUIRY;
    public static final sendBroadcastWithAdObject ACCOUNT_REGISTER;
    public static final sendBroadcastWithAdObject ACTIVITY;
    public static final sendBroadcastWithAdObject AUTH;
    public static final sendBroadcastWithAdObject AUTOMOBILE_INSURANCE;
    public static final sendBroadcastWithAdObject BANK;
    public static final sendBroadcastWithAdObject BANK_ACCOUNT;
    public static final sendBroadcastWithAdObject BANNER;
    public static final sendBroadcastWithAdObject CARD;
    public static final sendBroadcastWithAdObject CARD_BROKERAGE;
    public static final sendBroadcastWithAdObject CARD_INQUIRY;
    public static final sendBroadcastWithAdObject CARD_NOTIFICATION;
    public static final sendBroadcastWithAdObject CARD_REGISTER;
    public static final sendBroadcastWithAdObject CHEERINGWEEK;
    public static final sendBroadcastWithAdObject COMMON;
    public static final sendBroadcastWithAdObject CREDIT;
    public static final sendBroadcastWithAdObject CREDIT_CHANGE;
    public static final sendBroadcastWithAdObject CREDIT_DETAIL;
    public static final sendBroadcastWithAdObject DASHBOARD;
    public static final sendBroadcastWithAdObject ENROLL;
    public static final sendBroadcastWithAdObject ENROLLMENT_FUNNEL;
    public static final sendBroadcastWithAdObject FEED;
    public static final sendBroadcastWithAdObject FINDA;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final sendBroadcastWithAdObject LARGE_AMOUNT_REMITTANCE;
    public static final sendBroadcastWithAdObject LOAN_BROKERAGE;
    public static final sendBroadcastWithAdObject LOAN_COMPARISON;
    public static final sendBroadcastWithAdObject MAIN;
    public static final sendBroadcastWithAdObject MARKETING;
    public static final sendBroadcastWithAdObject ONBOARDING;
    public static final sendBroadcastWithAdObject ONBOARDING_2018;
    public static final sendBroadcastWithAdObject ONC;
    public static final sendBroadcastWithAdObject ONLINE_ACCOUNT;
    public static final sendBroadcastWithAdObject ONLINE_ACCOUNT_OPENING;
    public static final sendBroadcastWithAdObject PAYMENT;
    public static final sendBroadcastWithAdObject PAYMENT_PRIME;
    public static final sendBroadcastWithAdObject PEDOMETER;
    public static final sendBroadcastWithAdObject PERIODIC_TRANSFER;
    public static final sendBroadcastWithAdObject PLUS;
    public static final sendBroadcastWithAdObject PUSH;
    public static final sendBroadcastWithAdObject QRCODE;
    public static final sendBroadcastWithAdObject REFERRAL;
    public static final sendBroadcastWithAdObject REFUND;
    public static final sendBroadcastWithAdObject SECURITY;
    public static final sendBroadcastWithAdObject SERVICE;
    public static final sendBroadcastWithAdObject SERVICE_CATEGORY;
    public static final sendBroadcastWithAdObject TEST;
    public static final sendBroadcastWithAdObject TIMELINE;
    public static final sendBroadcastWithAdObject TOSS_CARD;
    public static final sendBroadcastWithAdObject TOSS_CERT;
    public static final sendBroadcastWithAdObject TOSS_MEMBER;
    public static final sendBroadcastWithAdObject TRANSACTION;
    public static final sendBroadcastWithAdObject TRANSFER;
    public static final sendBroadcastWithAdObject TRANSFER_AID;
    public static final sendBroadcastWithAdObject UTILITY;
    private static int onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private final String value;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2 = 115 - (b2 * 3);
        int i3 = 3 - (s * 2);
        int i4 = b * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2 = (-i2) + i6;
            i = i7;
            bArr2[i] = (byte) i2;
            i3++;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = i2;
            i2 = bArr[i3];
            i2 = (-i2) + i6;
            i = i7;
            bArr2[i] = (byte) i2;
            i3++;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i3++;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    private static final /* synthetic */ sendBroadcastWithAdObject[] $values() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        sendBroadcastWithAdObject[] sendbroadcastwithadobjectArr = {SECURITY, TOSS_MEMBER, TRANSFER, BANK, BANK_ACCOUNT, ACCOUNT_INQUIRY, AUTH, ACCOUNT, TRANSACTION, CREDIT, CREDIT_DETAIL, CREDIT_CHANGE, PAYMENT, SERVICE, FEED, TEST, QRCODE, REFUND, PUSH, UTILITY, PLUS, FINDA, MAIN, LOAN_BROKERAGE, LOAN_COMPARISON, COMMON, SERVICE_CATEGORY, REFERRAL, LARGE_AMOUNT_REMITTANCE, PERIODIC_TRANSFER, MARKETING, CARD, CARD_INQUIRY, CARD_BROKERAGE, ACTIVITY, BANNER, DASHBOARD, ACCOUNT_REGISTER, ONBOARDING, ONBOARDING_2018, TIMELINE, ONC, TOSS_CARD, ONLINE_ACCOUNT, ONLINE_ACCOUNT_OPENING, ENROLL, ENROLLMENT_FUNNEL, AUTOMOBILE_INSURANCE, PEDOMETER, CHEERINGWEEK, CARD_REGISTER, TRANSFER_AID, TOSS_CERT, CARD_NOTIFICATION, PAYMENT_PRIME};
        int i5 = i3 + 117;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return sendbroadcastwithadobjectArr;
    }

    public static EnumEntries<sendBroadcastWithAdObject> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<sendBroadcastWithAdObject> enumEntries = $ENTRIES;
        int i4 = i3 + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static sendBroadcastWithAdObject valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        sendBroadcastWithAdObject sendbroadcastwithadobject = (sendBroadcastWithAdObject) Enum.valueOf(sendBroadcastWithAdObject.class, str);
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return sendbroadcastwithadobject;
    }

    public static sendBroadcastWithAdObject[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        sendBroadcastWithAdObject[] sendbroadcastwithadobjectArr = (sendBroadcastWithAdObject[]) $VALUES.clone();
        int i4 = asInterface + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return sendbroadcastwithadobjectArr;
    }

    private sendBroadcastWithAdObject(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 43;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onExtraCallback();
        SECURITY = new sendBroadcastWithAdObject("SECURITY", 0, "security");
        TOSS_MEMBER = new sendBroadcastWithAdObject("TOSS_MEMBER", 1, "tossMember");
        TRANSFER = new sendBroadcastWithAdObject("TRANSFER", 2, "transfer");
        BANK = new sendBroadcastWithAdObject("BANK", 3, "bank");
        BANK_ACCOUNT = new sendBroadcastWithAdObject("BANK_ACCOUNT", 4, "bank_account");
        ACCOUNT_INQUIRY = new sendBroadcastWithAdObject("ACCOUNT_INQUIRY", 5, "accountInquiry");
        Object[] objArr = new Object[1];
        a((short) ExpandableListView.getPackedPositionType(0L), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-649182276) - KeyEvent.keyCodeFromString(""), 1481663601 + (Process.myTid() >> 22), (Process.myTid() >> 22) - 22, objArr);
        AUTH = new sendBroadcastWithAdObject(((String) objArr[0]).intern(), 6, "auth");
        ACCOUNT = new sendBroadcastWithAdObject("ACCOUNT", 7, "account");
        TRANSACTION = new sendBroadcastWithAdObject("TRANSACTION", 8, "transaction");
        CREDIT = new sendBroadcastWithAdObject("CREDIT", 9, "credit");
        CREDIT_DETAIL = new sendBroadcastWithAdObject("CREDIT_DETAIL", 10, "credit_detail");
        CREDIT_CHANGE = new sendBroadcastWithAdObject("CREDIT_CHANGE", 11, "credit_change");
        PAYMENT = new sendBroadcastWithAdObject("PAYMENT", 12, "payment");
        SERVICE = new sendBroadcastWithAdObject("SERVICE", 13, "service");
        FEED = new sendBroadcastWithAdObject("FEED", 14, "feed");
        Object[] objArr2 = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.red(0) - 649182273, 1481663620 + (ViewConfiguration.getJumpTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 22, objArr2);
        TEST = new sendBroadcastWithAdObject(((String) objArr2[0]).intern(), 15, "test");
        QRCODE = new sendBroadcastWithAdObject("QRCODE", 16, "qrcode");
        REFUND = new sendBroadcastWithAdObject("REFUND", 17, "refund");
        Object[] objArr3 = new Object[1];
        a((short) TextUtils.indexOf("", "", 0), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-649182270) - TextUtils.indexOf("", "", 0), 1481663648 - (KeyEvent.getMaxKeyCode() >> 16), View.getDefaultSize(0, 0) - 22, objArr3);
        PUSH = new sendBroadcastWithAdObject("PUSH", 18, ((String) objArr3[0]).intern());
        UTILITY = new sendBroadcastWithAdObject("UTILITY", 19, "utility");
        PLUS = new sendBroadcastWithAdObject("PLUS", 20, "plus");
        FINDA = new sendBroadcastWithAdObject("FINDA", 21, "finda");
        Object[] objArr4 = new Object[1];
        a((short) ExpandableListView.getPackedPositionType(0L), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) - 649182266, 1481663646 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-23) - TextUtils.lastIndexOf("", '0', 0), objArr4);
        MAIN = new sendBroadcastWithAdObject("MAIN", 22, ((String) objArr4[0]).intern());
        LOAN_BROKERAGE = new sendBroadcastWithAdObject("LOAN_BROKERAGE", 23, "loan_brokerage");
        LOAN_COMPARISON = new sendBroadcastWithAdObject("LOAN_COMPARISON", 24, "loan_comparison_examine");
        COMMON = new sendBroadcastWithAdObject("COMMON", 25, "common");
        SERVICE_CATEGORY = new sendBroadcastWithAdObject("SERVICE_CATEGORY", 26, "service_category");
        REFERRAL = new sendBroadcastWithAdObject("REFERRAL", 27, "referral");
        LARGE_AMOUNT_REMITTANCE = new sendBroadcastWithAdObject("LARGE_AMOUNT_REMITTANCE", 28, "inAppMkt");
        PERIODIC_TRANSFER = new sendBroadcastWithAdObject("PERIODIC_TRANSFER", 29, "periodic_transfer");
        MARKETING = new sendBroadcastWithAdObject("MARKETING", 30, "marketing");
        CARD = new sendBroadcastWithAdObject("CARD", 31, "card");
        CARD_INQUIRY = new sendBroadcastWithAdObject("CARD_INQUIRY", 32, "card_inquiry");
        CARD_BROKERAGE = new sendBroadcastWithAdObject("CARD_BROKERAGE", 33, "card_brokerage");
        ACTIVITY = new sendBroadcastWithAdObject("ACTIVITY", 34, "activity");
        BANNER = new sendBroadcastWithAdObject("BANNER", 35, "banner");
        DASHBOARD = new sendBroadcastWithAdObject("DASHBOARD", 36, "dashboard");
        ACCOUNT_REGISTER = new sendBroadcastWithAdObject("ACCOUNT_REGISTER", 37, "account_register");
        ONBOARDING = new sendBroadcastWithAdObject("ONBOARDING", 38, "onboarding");
        ONBOARDING_2018 = new sendBroadcastWithAdObject("ONBOARDING_2018", 39, "onboarding_2018");
        TIMELINE = new sendBroadcastWithAdObject("TIMELINE", 40, "timeline");
        ONC = new sendBroadcastWithAdObject("ONC", 41, "onc");
        TOSS_CARD = new sendBroadcastWithAdObject("TOSS_CARD", 42, "toss_card");
        ONLINE_ACCOUNT = new sendBroadcastWithAdObject("ONLINE_ACCOUNT", 43, "online_account");
        ONLINE_ACCOUNT_OPENING = new sendBroadcastWithAdObject("ONLINE_ACCOUNT_OPENING", 44, "online_opening");
        ENROLL = new sendBroadcastWithAdObject("ENROLL", 45, "enroll");
        ENROLLMENT_FUNNEL = new sendBroadcastWithAdObject("ENROLLMENT_FUNNEL", 46, "enrollment_funnel");
        AUTOMOBILE_INSURANCE = new sendBroadcastWithAdObject("AUTOMOBILE_INSURANCE", 47, "automobile_insurance");
        PEDOMETER = new sendBroadcastWithAdObject("PEDOMETER", 48, "pedometer");
        CHEERINGWEEK = new sendBroadcastWithAdObject("CHEERINGWEEK", 49, "weekday_aid");
        CARD_REGISTER = new sendBroadcastWithAdObject("CARD_REGISTER", 50, "card_register");
        TRANSFER_AID = new sendBroadcastWithAdObject("TRANSFER_AID", 51, "transfer_aid");
        TOSS_CERT = new sendBroadcastWithAdObject("TOSS_CERT", 52, "cert");
        CARD_NOTIFICATION = new sendBroadcastWithAdObject("CARD_NOTIFICATION", 53, "card_notice");
        PAYMENT_PRIME = new sendBroadcastWithAdObject("PAYMENT_PRIME", 54, "payment_prime");
        sendBroadcastWithAdObject[] sendbroadcastwithadobjectArr$values = $values();
        $VALUES = sendbroadcastwithadobjectArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(sendbroadcastwithadobjectArr$values);
        int i = onTransact + 81;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[PHI: r4
      0x008a: PHI (r4v8 byte[] A[IMMUTABLE_TYPE]) = (r4v7 byte[]), (r4v21 byte[]) binds: [B:21:0x0088, B:18:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        byte[] bArr;
        long j;
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43425), 42 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 1) {
                j = -4629411779493505016L;
            } else {
                int i7 = $11 + 93;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    bArr = onWarmupCompleted;
                    int i8 = 95 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $11 + 93;
                            $10 = i10 % 128;
                            int i11 = i10 % i4;
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Drawable.resolveOpacity(0, 0)), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2167 - TextUtils.getTrimmedLength(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            i4 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        int i12 = $11 + 37;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString("")), 42 - Color.alpha(0), 22439 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onWarmupCompleted;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 86, View.getDefaultSize(0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i15 = $10 + 21;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 5 % 3;
                    }
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i17 = $10 + 109;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallback() {
        onExtraCallback = -2097781684;
        onNavigationEvent = -1538795502;
        IAuthTabCallback = 65553368;
        onWarmupCompleted = new byte[]{-4, -9, 28, 9, 6, -7, -3, -10, 13, 13, 0, -4, 8, 8, 8, 8};
    }
}
