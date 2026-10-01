package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzao {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Status zza(String str, @Nullable String str2) {
        int i2;
        switch (str) {
            case "USER_CANCELLED":
                i2 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i2 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i2 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i2 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i2 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i2 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i2 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i2 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i2 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i2 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i2 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i2 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i2 = 17030;
                break;
            case "MISSING_EMAIL":
                i2 = 17034;
                break;
            case "INVALID_CODE":
                i2 = 17044;
                break;
            case "TOKEN_EXPIRED":
                i2 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i2 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i2 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i2 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i2 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i2 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i2 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i2 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i2 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i2 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i2 = 17084;
                break;
            case "MISSING_PASSWORD":
                i2 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i2 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i2 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i2 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i2 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i2 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i2 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i2 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i2 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i2 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i2 = 17056;
                break;
            case "WEAK_PASSWORD":
                i2 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i2 = 17089;
                break;
            case "INVALID_SENDER":
                i2 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i2 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i2 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i2 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i2 = 17095;
                break;
            case "EMAIL_EXISTS":
                i2 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i2 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i2 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i2 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i2 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i2 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i2 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i2 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i2 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i2 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i2 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i2 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i2 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i2 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i2 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i2 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i2 = 17000;
                break;
            case "INVALID_PASSWORD":
                i2 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i2 = 17202;
                break;
            case "SESSION_EXPIRED":
                i2 = 17051;
                break;
            case "MISSING_CODE":
                i2 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i2 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i2 = 17201;
                break;
            case "USER_DISABLED":
                i2 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i2 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i2 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i2 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i2 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i2 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i2 = 17073;
                break;
            default:
                i2 = 17499;
                break;
        }
        if (i2 != 17499) {
            return new Status(i2, str2);
        }
        if (str2 == null) {
            return new Status(i2, str);
        }
        return new Status(i2, str + ":" + str2);
    }

    public static Status zza(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        if (listAsList.size() > 1) {
            return zza((String) listAsList.get(0), (String) listAsList.get(1));
        }
        return zza((String) listAsList.get(0), null);
    }
}
