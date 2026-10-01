package viva.republica.toss.guest.certify.guardian;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GuardianSimpleInfoFragment$onExtraCallbackWithResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GuardianSimpleInfoFragment$onExtraCallbackWithResult[] $VALUES;
    public static final GuardianSimpleInfoFragment$onExtraCallbackWithResult LOGIN = new GuardianSimpleInfoFragment$onExtraCallbackWithResult("LOGIN", 0);
    public static final GuardianSimpleInfoFragment$onExtraCallbackWithResult GUARDIAN_WHITE_LIST = new GuardianSimpleInfoFragment$onExtraCallbackWithResult("GUARDIAN_WHITE_LIST", 1);
    public static final GuardianSimpleInfoFragment$onExtraCallbackWithResult INVALID_PASSWORD_SIGN_IN = new GuardianSimpleInfoFragment$onExtraCallbackWithResult("INVALID_PASSWORD_SIGN_IN", 2);

    private static final /* synthetic */ GuardianSimpleInfoFragment$onExtraCallbackWithResult[] $values() {
        return new GuardianSimpleInfoFragment$onExtraCallbackWithResult[]{LOGIN, GUARDIAN_WHITE_LIST, INVALID_PASSWORD_SIGN_IN};
    }

    public static EnumEntries<GuardianSimpleInfoFragment$onExtraCallbackWithResult> getEntries() {
        return $ENTRIES;
    }

    public static GuardianSimpleInfoFragment$onExtraCallbackWithResult valueOf(String str) {
        return (GuardianSimpleInfoFragment$onExtraCallbackWithResult) Enum.valueOf(GuardianSimpleInfoFragment$onExtraCallbackWithResult.class, str);
    }

    public static GuardianSimpleInfoFragment$onExtraCallbackWithResult[] values() {
        return (GuardianSimpleInfoFragment$onExtraCallbackWithResult[]) $VALUES.clone();
    }

    private GuardianSimpleInfoFragment$onExtraCallbackWithResult(String str, int i) {
    }

    static {
        GuardianSimpleInfoFragment$onExtraCallbackWithResult[] guardianSimpleInfoFragment$onExtraCallbackWithResultArr$values = $values();
        $VALUES = guardianSimpleInfoFragment$onExtraCallbackWithResultArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(guardianSimpleInfoFragment$onExtraCallbackWithResultArr$values);
    }
}
