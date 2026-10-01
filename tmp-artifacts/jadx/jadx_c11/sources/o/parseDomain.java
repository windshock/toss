package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class parseDomain {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ parseDomain[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final parseDomain READ = new parseDomain("READ", 0);
    public static final parseDomain DRAW = new parseDomain("DRAW", 1);
    public static final parseDomain BOTH = new parseDomain("BOTH", 2);

    private static final /* synthetic */ parseDomain[] $values() {
        parseDomain[] parsedomainArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            parseDomain parsedomain = READ;
            parseDomain parsedomain2 = DRAW;
            parseDomain parsedomain3 = BOTH;
            parsedomainArr = new parseDomain[2];
            parsedomainArr[0] = parsedomain;
            parsedomainArr[0] = parsedomain2;
            parsedomainArr[3] = parsedomain3;
        } else {
            parsedomainArr = new parseDomain[]{READ, DRAW, BOTH};
        }
        int i4 = i3 + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return parsedomainArr;
    }

    public static EnumEntries<parseDomain> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<parseDomain> enumEntries = $ENTRIES;
        int i5 = i2 + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static parseDomain valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        parseDomain parsedomain = (parseDomain) Enum.valueOf(parseDomain.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return parsedomain;
    }

    public static parseDomain[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        parseDomain[] parsedomainArr = (parseDomain[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return parsedomainArr;
        }
        throw null;
    }

    private parseDomain(String str, int i) {
    }

    static {
        parseDomain[] parsedomainArr$values = $values();
        $VALUES = parsedomainArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(parsedomainArr$values);
        int i = onNavigationEvent + 119;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }
}
