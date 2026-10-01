package o;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String reason;
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_ALREADY_TERMS_AGREED = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_ALREADY_TERMS_AGREED", 0, "ALREADY_TERMS_AGREED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_COMPLETED_MESSAGE = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_COMPLETED_MESSAGE", 1, "COMPLETED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_ALREADY_ARGUMENT_CONSENTED_MESSAGE = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_ALREADY_ARGUMENT_CONSENTED_MESSAGE", 2, "INVALID_AGREE");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_USERCANCELLED_MESSAGE = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_USERCANCELLED_MESSAGE", 3, "USER_CANCELLED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_USER_REJECTION = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_USER_REJECTION", 4, "USER_REJECTION");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_INVALID_CONSENT_TERMS = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_INVALID_CONSENT_TERMS", 5, "INVALID_CONSENT_TERMS");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_IS_NOT_LATEST_REVISION_CONSENT = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_IS_NOT_LATEST_REVISION_CONSENT", 6, "IS_NOT_LATEST_REVISION_CONSENT");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_UIPOLICY_MISMATCHED_MESSAGE = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_UIPOLICY_MISMATCHED_MESSAGE", 7, "UIPOLICY_MISMATCHED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_UNDEFINED_UI_POLICY_MESSAGE = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_UNDEFINED_UI_POLICY_MESSAGE", 8, "UNDEFINED_UI_POLICY");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_CERT_SIGN_FAILED = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_CERT_SIGN_FAILED", 9, "CERT_SIGN_FAILED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_UPDATE_STATES_OTHER_ERROR = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_UPDATE_STATES_OTHER_ERROR", 10, "UPDATE_STATES_OTHER_ERROR");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_YOUTH_CONSENT_FAILED = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_YOUTH_CONSENT_FAILED", 11, "YOUTH_CONSENT_FAILED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_YOUTH_PENDING = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_YOUTH_PENDING", 12, "YOUTH_PENDING");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_YOUTH_CONSENT_EXPIRED = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_YOUTH_CONSENT_EXPIRED", 13, "YOUTH_CONSENT_EXPIRED");
    public static final r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 RESULT_OTHER_ERROR = new r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0("RESULT_OTHER_ERROR", 14, "OTHER");

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.values().length];
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_ALREADY_TERMS_AGREED.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_COMPLETED_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_UIPOLICY_MISMATCHED_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_UNDEFINED_UI_POLICY_MESSAGE.ordinal()] = 4;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_ALREADY_ARGUMENT_CONSENTED_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_INVALID_CONSENT_TERMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_IS_NOT_LATEST_REVISION_CONSENT.ordinal()] = 8;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_CERT_SIGN_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_UPDATE_STATES_OTHER_ERROR.ordinal()] = 10;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_YOUTH_CONSENT_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            onExtraCallback = iArr;
            int i6 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static final /* synthetic */ r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr = {RESULT_ALREADY_TERMS_AGREED, RESULT_COMPLETED_MESSAGE, RESULT_ALREADY_ARGUMENT_CONSENTED_MESSAGE, RESULT_USERCANCELLED_MESSAGE, RESULT_USER_REJECTION, RESULT_INVALID_CONSENT_TERMS, RESULT_IS_NOT_LATEST_REVISION_CONSENT, RESULT_UIPOLICY_MISMATCHED_MESSAGE, RESULT_UNDEFINED_UI_POLICY_MESSAGE, RESULT_CERT_SIGN_FAILED, RESULT_UPDATE_STATES_OTHER_ERROR, RESULT_YOUTH_CONSENT_FAILED, RESULT_YOUTH_PENDING, RESULT_YOUTH_CONSENT_EXPIRED, RESULT_OTHER_ERROR};
        int i5 = i3 + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr;
    }

    public static EnumEntries<r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0> enumEntries = $ENTRIES;
        int i5 = i3 + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0 = (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0) Enum.valueOf(r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.class, str);
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdahekmogpxfnmskbbrjd3t2vn5d0;
    }

    public static r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr = $VALUES;
        if (i3 != 0) {
            return (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[]) r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr.clone();
        }
        throw null;
    }

    private r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0(String str, int i, String str2) {
        this.reason = str2;
    }

    public final String getReason() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.reason;
        int i4 = i3 + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0[] r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr$values = $values();
        $VALUES = r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdahekmogpxfnmskbbrjd3t2vn5d0Arr$values);
        int i = IAuthTabCallback + 7;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final boolean isSucceed() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0 ? (i = onExtraCallback.onExtraCallback[ordinal()]) != 1 : (i = onExtraCallback.onExtraCallback[ordinal()]) != 1) {
            if (i != 2) {
                return false;
            }
        }
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean isInitialError() {
        int i = 2 % 2;
        int i2 = onExtraCallback.onExtraCallback[ordinal()];
        if (i2 != 3) {
            int i3 = onExtraCallback + 123;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 4 : i2 != 5) {
                if (i2 != 5) {
                    return false;
                }
            }
        }
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean isTermsUpdateError() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        switch (onExtraCallback.onExtraCallback[ordinal()]) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                int i4 = onExtraCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
        }
    }
}
