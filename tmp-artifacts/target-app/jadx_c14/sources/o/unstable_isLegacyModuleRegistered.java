package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class unstable_isLegacyModuleRegistered {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ unstable_isLegacyModuleRegistered[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final unstable_isLegacyModuleRegistered REGULAR = new unstable_isLegacyModuleRegistered("REGULAR", 0);
    public static final unstable_isLegacyModuleRegistered MEDIUM = new unstable_isLegacyModuleRegistered("MEDIUM", 1);
    public static final unstable_isLegacyModuleRegistered BOLD = new unstable_isLegacyModuleRegistered("BOLD", 2);

    private static final /* synthetic */ unstable_isLegacyModuleRegistered[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered = REGULAR;
        if (i3 == 0) {
            return new unstable_isLegacyModuleRegistered[]{unstable_islegacymoduleregistered, MEDIUM, BOLD};
        }
        unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered2 = MEDIUM;
        unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered3 = BOLD;
        unstable_isLegacyModuleRegistered[] unstable_islegacymoduleregisteredArr = new unstable_isLegacyModuleRegistered[3];
        unstable_islegacymoduleregisteredArr[1] = unstable_islegacymoduleregistered;
        unstable_islegacymoduleregisteredArr[1] = unstable_islegacymoduleregistered2;
        unstable_islegacymoduleregisteredArr[4] = unstable_islegacymoduleregistered3;
        return unstable_islegacymoduleregisteredArr;
    }

    public static EnumEntries<unstable_isLegacyModuleRegistered> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<unstable_isLegacyModuleRegistered> enumEntries = $ENTRIES;
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static unstable_isLegacyModuleRegistered valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered = (unstable_isLegacyModuleRegistered) Enum.valueOf(unstable_isLegacyModuleRegistered.class, str);
        int i4 = onExtraCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unstable_islegacymoduleregistered;
        }
        throw null;
    }

    public static unstable_isLegacyModuleRegistered[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        unstable_isLegacyModuleRegistered[] unstable_islegacymoduleregisteredArr = (unstable_isLegacyModuleRegistered[]) $VALUES.clone();
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unstable_islegacymoduleregisteredArr;
    }

    private unstable_isLegacyModuleRegistered(String str, int i) {
    }

    static {
        unstable_isLegacyModuleRegistered[] unstable_islegacymoduleregisteredArr$values = $values();
        $VALUES = unstable_islegacymoduleregisteredArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(unstable_islegacymoduleregisteredArr$values);
        int i = onWarmupCompleted + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }
}
