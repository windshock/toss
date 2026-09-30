package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AuthenticatorCompanionAuthenticatorNone {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AuthenticatorCompanionAuthenticatorNone[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final AuthenticatorCompanionAuthenticatorNone SLOW = new AuthenticatorCompanionAuthenticatorNone("SLOW", 0);
    public static final AuthenticatorCompanionAuthenticatorNone FAST = new AuthenticatorCompanionAuthenticatorNone("FAST", 1);

    private static final /* synthetic */ AuthenticatorCompanionAuthenticatorNone[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AuthenticatorCompanionAuthenticatorNone[] authenticatorCompanionAuthenticatorNoneArr = {SLOW, FAST};
        int i5 = i2 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return authenticatorCompanionAuthenticatorNoneArr;
    }

    public static EnumEntries<AuthenticatorCompanionAuthenticatorNone> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<AuthenticatorCompanionAuthenticatorNone> enumEntries = $ENTRIES;
        int i5 = i3 + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static AuthenticatorCompanionAuthenticatorNone valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = (AuthenticatorCompanionAuthenticatorNone) Enum.valueOf(AuthenticatorCompanionAuthenticatorNone.class, str);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return authenticatorCompanionAuthenticatorNone;
    }

    public static AuthenticatorCompanionAuthenticatorNone[] values() {
        AuthenticatorCompanionAuthenticatorNone[] authenticatorCompanionAuthenticatorNoneArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            authenticatorCompanionAuthenticatorNoneArr = (AuthenticatorCompanionAuthenticatorNone[]) $VALUES.clone();
            int i3 = 56 / 0;
        } else {
            authenticatorCompanionAuthenticatorNoneArr = (AuthenticatorCompanionAuthenticatorNone[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return authenticatorCompanionAuthenticatorNoneArr;
    }

    private AuthenticatorCompanionAuthenticatorNone(String str, int i) {
    }

    static {
        AuthenticatorCompanionAuthenticatorNone[] authenticatorCompanionAuthenticatorNoneArr$values = $values();
        $VALUES = authenticatorCompanionAuthenticatorNoneArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(authenticatorCompanionAuthenticatorNoneArr$values);
        int i = onExtraCallbackWithResult + 69;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }
}
