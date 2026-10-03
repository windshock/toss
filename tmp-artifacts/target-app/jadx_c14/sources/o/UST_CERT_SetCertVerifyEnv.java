package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_SetCertVerifyEnv {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UST_CERT_SetCertVerifyEnv[] $VALUES;
    public static final UST_CERT_SetCertVerifyEnv INVALID = new UST_CERT_SetCertVerifyEnv("INVALID", 0);
    public static final UST_CERT_SetCertVerifyEnv LEAVED = new UST_CERT_SetCertVerifyEnv("LEAVED", 1);
    public static final UST_CERT_SetCertVerifyEnv LOGIN_OTHER_DEVICE = new UST_CERT_SetCertVerifyEnv("LOGIN_OTHER_DEVICE", 2);
    public static final UST_CERT_SetCertVerifyEnv BLOCKED_BY_WRONG_PASSWORD_ATTEMPT = new UST_CERT_SetCertVerifyEnv("BLOCKED_BY_WRONG_PASSWORD_ATTEMPT", 3);
    public static final UST_CERT_SetCertVerifyEnv BLOCKED_BY_WRONG_BANK_PASSWORD_ATTEMPT = new UST_CERT_SetCertVerifyEnv("BLOCKED_BY_WRONG_BANK_PASSWORD_ATTEMPT", 4);
    public static final UST_CERT_SetCertVerifyEnv BLOCKED = new UST_CERT_SetCertVerifyEnv("BLOCKED", 5);
    public static final UST_CERT_SetCertVerifyEnv PAUSED = new UST_CERT_SetCertVerifyEnv("PAUSED", 6);
    public static final UST_CERT_SetCertVerifyEnv DORMANT = new UST_CERT_SetCertVerifyEnv("DORMANT", 7);
    public static final UST_CERT_SetCertVerifyEnv DEAD_ACCOUNT = new UST_CERT_SetCertVerifyEnv("DEAD_ACCOUNT", 8);
    public static final UST_CERT_SetCertVerifyEnv INVALID_ANDROID_ID = new UST_CERT_SetCertVerifyEnv("INVALID_ANDROID_ID", 9);
    public static final UST_CERT_SetCertVerifyEnv INVALID_MIUI_VIRTUAL_IDENTITY_DISABLED_ANDROID_ID = new UST_CERT_SetCertVerifyEnv("INVALID_MIUI_VIRTUAL_IDENTITY_DISABLED_ANDROID_ID", 10);

    private static final /* synthetic */ UST_CERT_SetCertVerifyEnv[] $values() {
        return new UST_CERT_SetCertVerifyEnv[]{INVALID, LEAVED, LOGIN_OTHER_DEVICE, BLOCKED_BY_WRONG_PASSWORD_ATTEMPT, BLOCKED_BY_WRONG_BANK_PASSWORD_ATTEMPT, BLOCKED, PAUSED, DORMANT, DEAD_ACCOUNT, INVALID_ANDROID_ID, INVALID_MIUI_VIRTUAL_IDENTITY_DISABLED_ANDROID_ID};
    }

    public static EnumEntries<UST_CERT_SetCertVerifyEnv> getEntries() {
        return $ENTRIES;
    }

    public static UST_CERT_SetCertVerifyEnv valueOf(String str) {
        return (UST_CERT_SetCertVerifyEnv) Enum.valueOf(UST_CERT_SetCertVerifyEnv.class, str);
    }

    public static UST_CERT_SetCertVerifyEnv[] values() {
        return (UST_CERT_SetCertVerifyEnv[]) $VALUES.clone();
    }

    private UST_CERT_SetCertVerifyEnv(String str, int i) {
    }

    static {
        UST_CERT_SetCertVerifyEnv[] uST_CERT_SetCertVerifyEnvArr$values = $values();
        $VALUES = uST_CERT_SetCertVerifyEnvArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(uST_CERT_SetCertVerifyEnvArr$values);
    }
}
