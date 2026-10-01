package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class proxyAuthenticator {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ proxyAuthenticator[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final proxyAuthenticator NONE = new proxyAuthenticator("NONE", 0);
    public static final proxyAuthenticator VIEWPORT = new proxyAuthenticator("VIEWPORT", 1);
    public static final proxyAuthenticator OUTSIDE = new proxyAuthenticator("OUTSIDE", 2);

    private static final /* synthetic */ proxyAuthenticator[] $values() {
        proxyAuthenticator[] proxyauthenticatorArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            proxyAuthenticator proxyauthenticator = NONE;
            proxyAuthenticator proxyauthenticator2 = VIEWPORT;
            proxyAuthenticator proxyauthenticator3 = OUTSIDE;
            proxyauthenticatorArr = new proxyAuthenticator[3];
            proxyauthenticatorArr[1] = proxyauthenticator;
            proxyauthenticatorArr[1] = proxyauthenticator2;
            proxyauthenticatorArr[5] = proxyauthenticator3;
        } else {
            proxyauthenticatorArr = new proxyAuthenticator[]{NONE, VIEWPORT, OUTSIDE};
        }
        int i4 = i2 + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return proxyauthenticatorArr;
    }

    public static EnumEntries<proxyAuthenticator> getEntries() {
        EnumEntries<proxyAuthenticator> enumEntries;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 86 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static proxyAuthenticator valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        proxyAuthenticator proxyauthenticator = (proxyAuthenticator) Enum.valueOf(proxyAuthenticator.class, str);
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return proxyauthenticator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static proxyAuthenticator[] values() {
        proxyAuthenticator[] proxyauthenticatorArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            proxyauthenticatorArr = (proxyAuthenticator[]) $VALUES.clone();
            int i3 = 18 / 0;
        } else {
            proxyauthenticatorArr = (proxyAuthenticator[]) $VALUES.clone();
        }
        int i4 = IAuthTabCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return proxyauthenticatorArr;
    }

    private proxyAuthenticator(String str, int i) {
    }

    static {
        proxyAuthenticator[] proxyauthenticatorArr$values = $values();
        $VALUES = proxyauthenticatorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(proxyauthenticatorArr$values);
        int i = onWarmupCompleted + 71;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
