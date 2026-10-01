package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CacheEntry {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CacheEntry[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final int weight;
    public static final CacheEntry Light = new CacheEntry("Light", 0, 300);
    public static final CacheEntry Regular = new CacheEntry("Regular", 1, 400);
    public static final CacheEntry Medium = new CacheEntry("Medium", 2, 500);
    public static final CacheEntry SemiBold = new CacheEntry("SemiBold", 3, 600);
    public static final CacheEntry Bold = new CacheEntry("Bold", 4, 700);
    public static final CacheEntry ExtraBold = new CacheEntry("ExtraBold", 5, 800);
    public static final CacheEntry Heavy = new CacheEntry("Heavy", 6, 900);
    public static final CacheEntry Black = new CacheEntry("Black", 7, 950);

    private static final /* synthetic */ CacheEntry[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        CacheEntry[] cacheEntryArr = {Light, Regular, Medium, SemiBold, Bold, ExtraBold, Heavy, Black};
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return cacheEntryArr;
    }

    public static EnumEntries<CacheEntry> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<CacheEntry> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static CacheEntry valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CacheEntry cacheEntry = (CacheEntry) Enum.valueOf(CacheEntry.class, str);
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cacheEntry;
        }
        throw null;
    }

    public static CacheEntry[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CacheEntry[] cacheEntryArr = $VALUES;
        if (i3 == 0) {
            return (CacheEntry[]) cacheEntryArr.clone();
        }
        throw null;
    }

    private CacheEntry(String str, int i, int i2) {
        this.weight = i2;
    }

    public final int getWeight() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.weight;
        }
        throw null;
    }

    static {
        CacheEntry[] cacheEntryArr$values = $values();
        $VALUES = cacheEntryArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cacheEntryArr$values);
        Companion = new IAuthTabCallback(null);
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final CacheEntry IAuthTabCallback(int i) throws IllegalArgumentException {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CacheEntry cacheEntry = varyHeaders.IAuthTabCallback().get(Integer.valueOf(i));
            if (cacheEntry != null) {
                int i5 = onNavigationEvent + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return cacheEntry;
            }
            throw new IllegalArgumentException("Unknown weight: " + i);
        }

        public final CacheEntry onExtraCallback(int i) {
            int i2 = 2 % 2;
            CacheEntry cacheEntry = varyHeaders.onExtraCallbackWithResult().get(Integer.valueOf(i));
            if (cacheEntry == null) {
                int i3 = onNavigationEvent + 93;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    cacheEntry = CacheEntry.Regular;
                    int i4 = 98 / 0;
                } else {
                    cacheEntry = CacheEntry.Regular;
                }
            }
            int i5 = onWarmupCompleted + 93;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return cacheEntry;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
