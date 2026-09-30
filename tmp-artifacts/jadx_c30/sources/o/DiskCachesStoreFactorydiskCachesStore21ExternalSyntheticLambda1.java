package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 COMMON = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1("COMMON", 0);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 HIGHLIGHTED = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1("HIGHLIGHTED", 1);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 EXPECTED = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1("EXPECTED", 2);
    public static final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 NO_HISTORY = new DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1("NO_HISTORY", 3);

    private static final /* synthetic */ DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr = {COMMON, HIGHLIGHTED, EXPECTED, NO_HISTORY};
        int i5 = i3 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr;
    }

    public static EnumEntries<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1> getEntries() {
        EnumEntries<DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1> enumEntries;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 71 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 = (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1) Enum.valueOf(DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1.class, str);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1;
        }
        throw null;
    }

    public static DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr = (DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1(String str, int i) {
    }

    static {
        DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1[] diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr$values = $values();
        $VALUES = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1Arr$values);
        int i = IAuthTabCallback + 45;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final boolean hasValue() {
        int i = 2 % 2;
        if (this != COMMON) {
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this != HIGHLIGHTED) {
                return false;
            }
        }
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
