package com.krc.pl_card.enums;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access8100;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResponseCode {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ ResponseCode[] $VALUES;

    @SerializedName("AC01")
    public static final ResponseCode APPCARD_NO_CARD;

    @SerializedName("AC02")
    public static final ResponseCode APPCARD_SYNC_FAIL;

    @SerializedName("CH07")
    public static final ResponseCode CHARGE_ACCOUNT_CANNOT_FIND;

    @SerializedName("CH06")
    public static final ResponseCode CHARGE_ACCOUNT_INSUFFICIENT;

    @SerializedName("CH11")
    public static final ResponseCode CHARGE_BALANCE_MIN_MAX_CODE;

    @SerializedName("CH09")
    public static final ResponseCode CHARGE_CANNOT_FIND_ORIGINAL_TRADE;

    @SerializedName("CH21")
    public static final ResponseCode CHARGE_CARDNUM_ERROR_CODE;

    @SerializedName("CH89")
    public static final ResponseCode CHARGE_CARD_CERTI_CODE;

    @SerializedName("CH17")
    public static final ResponseCode CHARGE_COMPLETE_CODE;

    @SerializedName("CH16")
    public static final ResponseCode CHARGE_CONFIRM_CODE;

    @SerializedName("CH14")
    public static final ResponseCode CHARGE_DEBIT_CODE;

    @SerializedName("CH18")
    public static final ResponseCode CHARGE_DUPLICATE_CODE;

    @SerializedName("CH15")
    public static final ResponseCode CHARGE_ERROR_CODE;

    @SerializedName("CH98")
    public static final ResponseCode CHARGE_EXCEPT_CARDNUM_CODE;

    @SerializedName("CH03")
    public static final ResponseCode CHARGE_INCORRECT_PARAMETER;

    @SerializedName("CH13")
    public static final ResponseCode CHARGE_INITEP_CODE;

    @SerializedName("CH05")
    public static final ResponseCode CHARGE_LSAM_INCORRECT_ORDER;

    @SerializedName("CH01")
    public static final ResponseCode CHARGE_LSAM_INSUFFICIENT;

    @SerializedName("CH04")
    public static final ResponseCode CHARGE_LSAM_IN_USE;

    @SerializedName("CH12")
    public static final ResponseCode CHARGE_NOT_0000_CODE;

    @SerializedName("CH02")
    public static final ResponseCode CHARGE_OVER_MAX;

    @SerializedName("CH99")
    public static final ResponseCode CHARGE_SYSTEM_ERROR_CODE;

    @SerializedName("CH10")
    public static final ResponseCode CHARGE_TRANSACTION_DATE_CODE;

    @SerializedName("CH08")
    public static final ResponseCode CHARGE_UNKNOWN_CODE;
    public static final a Companion;

    @SerializedName("ER05")
    public static final ResponseCode ERROR_CHARGE_CONFIRM_FAIL;

    @SerializedName("ER04")
    public static final ResponseCode ERROR_CHARGE_FAIL;

    @SerializedName("ER02")
    public static final ResponseCode ERROR_NOT_SUPPORT_CARD;

    @SerializedName("ER00")
    public static final ResponseCode ERROR_TAG_FAIL;

    @SerializedName("ER01")
    public static final ResponseCode ERROR_TAG_LOST;

    @SerializedName("ER03")
    public static final ResponseCode ERROR_UNRECOGNIZED_CARD;

    @SerializedName("FA01")
    public static final ResponseCode FATAL_DB;

    @SerializedName("FA07")
    public static final ResponseCode FATAL_FIREBASE_ADMIN;

    @SerializedName("FA02")
    public static final ResponseCode FATAL_HSM;

    @SerializedName("FA03")
    public static final ResponseCode FATAL_LSAM;

    @SerializedName("FA09")
    public static final ResponseCode FATAL_NFC;

    @SerializedName("FA04")
    public static final ResponseCode FATAL_NH;

    @SerializedName("FA08")
    public static final ResponseCode FATAL_PSAM;

    @SerializedName("FA00")
    public static final ResponseCode FATAL_SERVER_RESPONSE;

    @SerializedName("FA06")
    public static final ResponseCode FATAL_ZERO_PAY;

    @SerializedName("BC03")
    public static final ResponseCode FORBIDDEN_ACCESS_ERROR;
    private static int IAuthTabCallback = 1;

    @SerializedName("BC02")
    public static final ResponseCode NOT_FOUND_ERROR;

    @SerializedName("3333")
    public static final ResponseCode NO_MORE_SUPPORT;

    @SerializedName("0000")
    public static final ResponseCode OK;

    @SerializedName("PR01")
    public static final ResponseCode PURCHASE_INSUFFICIENT;

    @SerializedName("RF03")
    public static final ResponseCode REFUND_CANNOT_FIND_CHARGE_LOG;

    @SerializedName("RF05")
    public static final ResponseCode REFUND_CREDIT_PSAM;

    @SerializedName("RF04")
    public static final ResponseCode REFUND_INIT_PSAM;

    @SerializedName("RF01")
    public static final ResponseCode REFUND_INVALID_CHARGE_REG_DATE;

    @SerializedName("RF02")
    public static final ResponseCode REFUND_INVALID_CHARGE_REQ_UUID;

    @SerializedName("SE02")
    public static final ResponseCode SECURITY_UNAUTHORIZED;

    @SerializedName("SE01")
    public static final ResponseCode SECURITY_UNMATCHED_ACCOUNT;

    @SerializedName("SI02")
    public static final ResponseCode SIGN_FAIL_GENERATE;

    @SerializedName("SI01")
    public static final ResponseCode SIGN_NOT_MATCH;

    @SerializedName("4444")
    public static final ResponseCode TIMEOUT;

    @SerializedName("BC01")
    public static final ResponseCode UNAUTHORIZED_ACCESS_ERROR;

    @SerializedName("1111")
    public static final ResponseCode UNKNOWN_ERROR;

    @SerializedName("2222")
    public static final ResponseCode UNKNOWN_PROTOCOL;

    @SerializedName("VA01")
    public static final ResponseCode VALIDATION_ERROR;

    @SerializedName("VA03")
    public static final ResponseCode VALIDATION_PIN_MISMATCH;

    @SerializedName("VA02")
    public static final ResponseCode VALIDATION_SERVICE_CODE;
    private static int[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final Map<String, ResponseCode> valueMap;
    private final String code;
    private String message;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResponseCode onExtraCallbackWithResult(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ResponseCode responseCode = (ResponseCode) ResponseCode.access$getValueMap$cp().get(str);
            return responseCode == null ? ResponseCode.UNKNOWN_ERROR : responseCode;
        }
    }

    private static final /* synthetic */ ResponseCode[] $values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        ResponseCode[] responseCodeArr = {OK, UNKNOWN_ERROR, UNKNOWN_PROTOCOL, NO_MORE_SUPPORT, TIMEOUT, CHARGE_LSAM_INSUFFICIENT, CHARGE_OVER_MAX, CHARGE_INCORRECT_PARAMETER, CHARGE_LSAM_IN_USE, CHARGE_LSAM_INCORRECT_ORDER, CHARGE_ACCOUNT_INSUFFICIENT, CHARGE_ACCOUNT_CANNOT_FIND, CHARGE_UNKNOWN_CODE, CHARGE_CANNOT_FIND_ORIGINAL_TRADE, CHARGE_TRANSACTION_DATE_CODE, CHARGE_BALANCE_MIN_MAX_CODE, CHARGE_NOT_0000_CODE, CHARGE_INITEP_CODE, CHARGE_DEBIT_CODE, CHARGE_ERROR_CODE, CHARGE_CONFIRM_CODE, CHARGE_COMPLETE_CODE, CHARGE_DUPLICATE_CODE, CHARGE_CARDNUM_ERROR_CODE, CHARGE_CARD_CERTI_CODE, CHARGE_EXCEPT_CARDNUM_CODE, CHARGE_SYSTEM_ERROR_CODE, REFUND_INVALID_CHARGE_REG_DATE, REFUND_INVALID_CHARGE_REQ_UUID, REFUND_CANNOT_FIND_CHARGE_LOG, REFUND_INIT_PSAM, REFUND_CREDIT_PSAM, PURCHASE_INSUFFICIENT, SIGN_NOT_MATCH, SIGN_FAIL_GENERATE, FATAL_DB, FATAL_HSM, FATAL_LSAM, FATAL_NH, FATAL_ZERO_PAY, FATAL_FIREBASE_ADMIN, FATAL_PSAM, VALIDATION_ERROR, VALIDATION_SERVICE_CODE, VALIDATION_PIN_MISMATCH, SECURITY_UNMATCHED_ACCOUNT, SECURITY_UNAUTHORIZED, UNAUTHORIZED_ACCESS_ERROR, NOT_FOUND_ERROR, FORBIDDEN_ACCESS_ERROR, APPCARD_NO_CARD, APPCARD_SYNC_FAIL, FATAL_SERVER_RESPONSE, FATAL_NFC, ERROR_TAG_FAIL, ERROR_TAG_LOST, ERROR_NOT_SUPPORT_CARD, ERROR_UNRECOGNIZED_CARD, ERROR_CHARGE_FAIL, ERROR_CHARGE_CONFIRM_FAIL};
        int i6 = i4 + 107;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return responseCodeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        int i2 = 0;
        OK = new ResponseCode("OK", 0, "0000", "Success");
        Object[] objArr = new Object[1];
        a(new int[]{-955980548, -347928274, -1372776128, -59043840, 890983074, -1997390911, 1058372747, -1457123126}, KeyEvent.normalizeMetaState(0) + 13, objArr);
        UNKNOWN_ERROR = new ResponseCode(((String) objArr[0]).intern(), 1, "1111", "Unknown error");
        UNKNOWN_PROTOCOL = new ResponseCode("UNKNOWN_PROTOCOL", 2, "2222", "알 수 없는 전문");
        NO_MORE_SUPPORT = new ResponseCode("NO_MORE_SUPPORT", 3, "3333", "No more support.");
        TIMEOUT = new ResponseCode("TIMEOUT", 4, "4444", "Timeout.");
        CHARGE_LSAM_INSUFFICIENT = new ResponseCode("CHARGE_LSAM_INSUFFICIENT", 5, "CH01", "충전 오류 (LSAM 잔액 부족)");
        CHARGE_OVER_MAX = new ResponseCode("CHARGE_OVER_MAX", 6, "CH02", "최대 충전 금액 초과");
        CHARGE_INCORRECT_PARAMETER = new ResponseCode("CHARGE_INCORRECT_PARAMETER", 7, "CH03", "충전 금액이 적절하지 않음 (0원, 자릿수 등)");
        CHARGE_LSAM_IN_USE = new ResponseCode("CHARGE_LSAM_IN_USE", 8, "CH04", "All LSAMs are in use now.");
        CHARGE_LSAM_INCORRECT_ORDER = new ResponseCode("CHARGE_LSAM_INCORRECT_ORDER", 9, "CH05", "Charge API is called in incorrect order.");
        CHARGE_ACCOUNT_INSUFFICIENT = new ResponseCode("CHARGE_ACCOUNT_INSUFFICIENT", 10, "CH06", "충전 계좌 내 금액 불충분");
        CHARGE_ACCOUNT_CANNOT_FIND = new ResponseCode("CHARGE_ACCOUNT_CANNOT_FIND", 11, "CH07", "Cannot find charge account.");
        CHARGE_UNKNOWN_CODE = new ResponseCode("CHARGE_UNKNOWN_CODE", 12, "CH08", "Unknown charge code.");
        CHARGE_CANNOT_FIND_ORIGINAL_TRADE = new ResponseCode("CHARGE_CANNOT_FIND_ORIGINAL_TRADE", 13, "CH09", "Cannot find original trade.");
        CHARGE_TRANSACTION_DATE_CODE = new ResponseCode("CHARGE_TRANSACTION_DATE_CODE", 14, "CH10", "Charge transaction date error");
        CHARGE_BALANCE_MIN_MAX_CODE = new ResponseCode("CHARGE_BALANCE_MIN_MAX_CODE", 15, "CH11", "Charge Mlda MIN/MAX error");
        CHARGE_NOT_0000_CODE = new ResponseCode("CHARGE_NOT_0000_CODE", 16, "CH12", "Charge enqueue error(not 0000)");
        CHARGE_INITEP_CODE = new ResponseCode("CHARGE_INITEP_CODE", 17, "CH13", "Initialize Ep error");
        CHARGE_DEBIT_CODE = new ResponseCode("CHARGE_DEBIT_CODE", 18, "CH14", "Debit LSAM error");
        CHARGE_ERROR_CODE = new ResponseCode("CHARGE_ERROR_CODE", 19, "CH15", "Unknown Charge error");
        CHARGE_CONFIRM_CODE = new ResponseCode("CHARGE_CONFIRM_CODE", 20, "CH16", "Confirm LSAM error");
        CHARGE_COMPLETE_CODE = new ResponseCode("CHARGE_COMPLETE_CODE", 21, "CH17", "Complete Credit error");
        CHARGE_DUPLICATE_CODE = new ResponseCode("CHARGE_DUPLICATE_CODE", 22, "CH18", "Duplication Charge Request error");
        CHARGE_CARDNUM_ERROR_CODE = new ResponseCode("CHARGE_CARDNUM_ERROR_CODE", 23, "CH21", "Charge Card number error");
        CHARGE_CARD_CERTI_CODE = new ResponseCode("CHARGE_CARD_CERTI_CODE", 24, "CH89", "Charge Card Certification error");
        CHARGE_EXCEPT_CARDNUM_CODE = new ResponseCode("CHARGE_EXCEPT_CARDNUM_CODE", 25, "CH89", "Charge Exception Card number error");
        CHARGE_SYSTEM_ERROR_CODE = new ResponseCode("CHARGE_SYSTEM_ERROR_CODE", 26, "CH99", "Charge LSAM System error");
        REFUND_INVALID_CHARGE_REG_DATE = new ResponseCode("REFUND_INVALID_CHARGE_REG_DATE", 27, "RF01", "Cannot find original trade date.");
        REFUND_INVALID_CHARGE_REQ_UUID = new ResponseCode("REFUND_INVALID_CHARGE_REQ_UUID", 28, "RF02", "Cannot find original trade uuid.");
        REFUND_CANNOT_FIND_CHARGE_LOG = new ResponseCode("REFUND_CANNOT_FIND_CHARGE_LOG", 29, "RF03", "Cannot find charge log.");
        REFUND_INIT_PSAM = new ResponseCode("REFUND_INIT_PSAM", 30, "RF04", "Initialize Refund PSAM error.");
        REFUND_CREDIT_PSAM = new ResponseCode("REFUND_CREDIT_PSAM", 31, "RF05", "Credit Refund PSAM error.");
        PURCHASE_INSUFFICIENT = new ResponseCode("PURCHASE_INSUFFICIENT", 32, "PR01", "Balance is insufficient");
        SIGN_NOT_MATCH = new ResponseCode("SIGN_NOT_MATCH", 33, "SI01", "Not match SIGN");
        SIGN_FAIL_GENERATE = new ResponseCode("SIGN_FAIL_GENERATE", 34, "SI02", "Fail to generate SIGN");
        FATAL_DB = new ResponseCode("FATAL_DB", 35, "FA01", "On DB server error occurred");
        FATAL_HSM = new ResponseCode("FATAL_HSM", 36, "FA02", "On NSM< server error occurred");
        FATAL_LSAM = new ResponseCode("FATAL_LSAM", 37, "FA03", "On LSAM server error occurred");
        FATAL_NH = new ResponseCode("FATAL_NH", 38, "FA04", "On NH server error occurred");
        FATAL_ZERO_PAY = new ResponseCode("FATAL_ZERO_PAY", 39, "FA06", "On ZeroPay server error occurred");
        FATAL_FIREBASE_ADMIN = new ResponseCode("FATAL_FIREBASE_ADMIN", 40, "FA07", "On Firebase server error occurred");
        FATAL_PSAM = new ResponseCode("FATAL_PSAM", 41, "FA08", "On PSAM error occurred");
        VALIDATION_ERROR = new ResponseCode("VALIDATION_ERROR", 42, "VA01", "Validation error.");
        VALIDATION_SERVICE_CODE = new ResponseCode("VALIDATION_SERVICE_CODE", 43, "VA02", "ServiceCode invalid");
        VALIDATION_PIN_MISMATCH = new ResponseCode("VALIDATION_PIN_MISMATCH", 44, "VA03", "PIN number mismatch.");
        SECURITY_UNMATCHED_ACCOUNT = new ResponseCode("SECURITY_UNMATCHED_ACCOUNT", 45, "SE01", "Username or password is invalid");
        SECURITY_UNAUTHORIZED = new ResponseCode("SECURITY_UNAUTHORIZED", 46, "SE02", "Unauthorized.");
        UNAUTHORIZED_ACCESS_ERROR = new ResponseCode("UNAUTHORIZED_ACCESS_ERROR", 47, "BC01", "Unauthorized");
        NOT_FOUND_ERROR = new ResponseCode("NOT_FOUND_ERROR", 48, "BC02", "NOT FOUND");
        FORBIDDEN_ACCESS_ERROR = new ResponseCode("FORBIDDEN_ACCESS_ERROR", 49, "BC03", "FORBIDDEN ACCESS");
        APPCARD_NO_CARD = new ResponseCode("APPCARD_NO_CARD", 50, "AC01", "There is no app card data.");
        APPCARD_SYNC_FAIL = new ResponseCode("APPCARD_SYNC_FAIL", 51, "AC02", "Fail to sync with server.");
        FATAL_SERVER_RESPONSE = new ResponseCode("FATAL_SERVER_RESPONSE", 52, "FA00", "");
        FATAL_NFC = new ResponseCode("FATAL_NFC", 53, "FA09", "");
        ERROR_TAG_FAIL = new ResponseCode("ERROR_TAG_FAIL", 54, "ER00", "태그가 인식되지 않습니다.");
        ERROR_TAG_LOST = new ResponseCode("ERROR_TAG_LOST", 55, "ER01", "통신 중 카드가 분리되었습니다.");
        ERROR_NOT_SUPPORT_CARD = new ResponseCode("ERROR_NOT_SUPPORT_CARD", 56, "ER02", "지원하지 않은 카드입니다.");
        ERROR_UNRECOGNIZED_CARD = new ResponseCode("ERROR_UNRECOGNIZED_CARD", 57, "ER03", "카드가 인식되지 않습니다.");
        ERROR_CHARGE_FAIL = new ResponseCode("ERROR_CHARGE_FAIL", 58, "ER04", "충전에 실패했습니다.");
        ERROR_CHARGE_CONFIRM_FAIL = new ResponseCode("ERROR_CHARGE_CONFIRM_FAIL", 59, "ER05", "충전에 실패했습니다(ConfirmLSAM).");
        $VALUES = $values();
        Companion = new a(null);
        ResponseCode[] responseCodeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(responseCodeArrValues.length), 16));
        int length = responseCodeArrValues.length;
        int i3 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        while (i2 < length) {
            int i6 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            ResponseCode responseCode = responseCodeArrValues[i2];
            linkedHashMap.put(responseCode.code, responseCode);
            i2++;
            int i8 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        valueMap = linkedHashMap;
    }

    private ResponseCode(String str, int i2, String str2, String str3) {
        this.code = str2;
        this.message = str3;
    }

    public static final /* synthetic */ Map access$getValueMap$cp() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Map<String, ResponseCode> map = valueMap;
        int i6 = i3 + 79;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public static ResponseCode valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ResponseCode responseCode = (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        int i6 = onNavigationEvent + 47;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return responseCode;
    }

    public static ResponseCode[] values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        ResponseCode[] responseCodeArr = (ResponseCode[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return responseCodeArr;
    }

    public final String getCode() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.code;
        if (i4 == 0) {
            int i5 = 47 / 0;
        }
        return str;
    }

    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.message;
        }
        throw null;
    }

    public final void setMessage(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        int i5 = onNavigationEvent + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        int[] iArr2;
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i6 = -1469660336;
        int i7 = 16;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> i7), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8848 - (KeyEvent.getMaxKeyCode() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i6 = -1469660336;
                    i7 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallback;
        if (iArr6 != null) {
            int i10 = $11 + 85;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 0;
            }
            while (i4 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i8] = Integer.valueOf(iArr6[i4]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", i8), ExpandableListView.getPackedPositionGroup(0L) + 72, (ViewConfiguration.getTouchSlop() >> 8) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i4] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i4++;
                int i11 = $11 + 65;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i8 = 0;
            }
            i3 = i8;
            iArr6 = iArr2;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr6, i3, iArr5, i3, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i3] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i13 = $10 + 93;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < 16; i15++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Gravity.getAbsoluteGravity(0, 0)), 39 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 4033), 78 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new int[]{1483144157, -1260587237, -929678436, -248820216, 812853096, 380142473, -379517984, 1835818898, 770547210, 863980862, 1293298422, 353943072, -178878875, -1309337560, 429561556, 1203773699, -1701190580, 1250477930};
    }
}
