package viva.republica.toss.guest.certify.guardian;

import o.jniLoadScriptFromBytes;
import o.setStoreFilePath;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GuardianSimpleInfoFragment$onExtraCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;
    public static final /* synthetic */ int[] onNavigationEvent;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[setStoreFilePath.values().length];
        try {
            iArr[setStoreFilePath.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setStoreFilePath.PHONE_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setStoreFilePath.CONFIRM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IAuthTabCallback = iArr;
        int[] iArr2 = new int[jniLoadScriptFromBytes.values().length];
        try {
            iArr2[jniLoadScriptFromBytes.HOUSEHOLD_REGISTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jniLoadScriptFromBytes.CERTIFICATE_OF_FAMILY_RELATIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[jniLoadScriptFromBytes.SIGN_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[jniLoadScriptFromBytes.INVALID_PASSWORD_SIGN_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[jniLoadScriptFromBytes.RECEIPT_OF_CERTIFICATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        onWarmupCompleted = iArr2;
        int[] iArr3 = new int[GuardianSimpleInfoFragment$onExtraCallbackWithResult.values().length];
        try {
            iArr3[GuardianSimpleInfoFragment$onExtraCallbackWithResult.LOGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[GuardianSimpleInfoFragment$onExtraCallbackWithResult.GUARDIAN_WHITE_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[GuardianSimpleInfoFragment$onExtraCallbackWithResult.INVALID_PASSWORD_SIGN_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        onNavigationEvent = iArr3;
    }
}
