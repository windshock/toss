package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 implements loadNextAdForAdToken {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 IBAN = new r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8("IBAN", 0, "IBAN");
    public static final r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 IP = new r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8("IP", 1, "IP");
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String label;

    private static final /* synthetic */ r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr = {IBAN, IP};
        int i5 = i3 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr;
    }

    public static EnumEntries<r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8> enumEntries = $ENTRIES;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8 r8lambdalfzppkxfgqyk48bckkl0qutjcf8 = (r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8) Enum.valueOf(r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8.class, str);
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdalfzppkxfgqyk48bckkl0qutjcf8;
    }

    public static r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr = (r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[]) $VALUES.clone();
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr;
    }

    private r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8(String str, int i, String str2) {
        this.label = str2;
    }

    @Override // o.loadNextAdForAdToken
    public String getLabel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.label;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        r8lambdaLfzPPKXfgQyk48bCkKl0QUtJcF8[] r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr$values = $values();
        $VALUES = r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdalfzppkxfgqyk48bckkl0qutjcf8Arr$values);
        int i = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
