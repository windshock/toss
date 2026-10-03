package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class r8lambdahyx9jcINTsok0QhKqPwRDX7N9k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final r8lambdahyx9jcINTsok0QhKqPwRDX7N9k TRANSFER = new r8lambdahyx9jcINTsok0QhKqPwRDX7N9k("TRANSFER", 0);
    public static final r8lambdahyx9jcINTsok0QhKqPwRDX7N9k PERIODIC_TRANSFER = new r8lambdahyx9jcINTsok0QhKqPwRDX7N9k("PERIODIC_TRANSFER", 1);

    private static final /* synthetic */ r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k = TRANSFER;
        if (i3 == 0) {
            return new r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[]{r8lambdahyx9jcintsok0qhkqpwrdx7n9k, PERIODIC_TRANSFER};
        }
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k2 = PERIODIC_TRANSFER;
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr = new r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[3];
        r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr[1] = r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
        r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr[1] = r8lambdahyx9jcintsok0qhkqpwrdx7n9k2;
        return r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr;
    }

    public static EnumEntries<r8lambdahyx9jcINTsok0QhKqPwRDX7N9k> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<r8lambdahyx9jcINTsok0QhKqPwRDX7N9k> enumEntries = $ENTRIES;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdahyx9jcINTsok0QhKqPwRDX7N9k valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k = (r8lambdahyx9jcINTsok0QhKqPwRDX7N9k) Enum.valueOf(r8lambdahyx9jcINTsok0QhKqPwRDX7N9k.class, str);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return r8lambdahyx9jcintsok0qhkqpwrdx7n9k;
    }

    public static r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr = (r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambdahyx9jcINTsok0QhKqPwRDX7N9k(String str, int i) {
    }

    static {
        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k[] r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr$values = $values();
        $VALUES = r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdahyx9jcintsok0qhkqpwrdx7n9kArr$values);
        int i = onExtraCallbackWithResult + 23;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
