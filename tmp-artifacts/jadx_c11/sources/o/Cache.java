package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Cache {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Cache[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final Cache LEFT = new Cache("LEFT", 0);
    public static final Cache RIGHT = new Cache("RIGHT", 1);
    public static final Cache UP = new Cache("UP", 2);
    public static final Cache DOWN = new Cache("DOWN", 3);

    private static final /* synthetic */ Cache[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new Cache[]{LEFT, RIGHT, UP, DOWN};
        }
        Cache cache = LEFT;
        Cache cache2 = RIGHT;
        Cache cache3 = UP;
        Cache cache4 = DOWN;
        Cache[] cacheArr = new Cache[4];
        cacheArr[0] = cache;
        cacheArr[1] = cache2;
        cacheArr[4] = cache3;
        cacheArr[2] = cache4;
        return cacheArr;
    }

    public static EnumEntries<Cache> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<Cache> enumEntries = $ENTRIES;
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return enumEntries;
    }

    public static Cache valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Cache cache = (Cache) Enum.valueOf(Cache.class, str);
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return cache;
    }

    public static Cache[] values() {
        Cache[] cacheArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            cacheArr = (Cache[]) $VALUES.clone();
            int i3 = 63 / 0;
        } else {
            cacheArr = (Cache[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cacheArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Cache(String str, int i) {
    }

    static {
        Cache[] cacheArr$values = $values();
        $VALUES = cacheArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cacheArr$values);
        int i = onExtraCallback + 95;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
