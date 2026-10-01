package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MemoryCacheBuilderExternalSyntheticLambda1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MemoryCacheBuilderExternalSyntheticLambda1[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final MemoryCacheBuilderExternalSyntheticLambda1 DEFAULT = new MemoryCacheBuilderExternalSyntheticLambda1("DEFAULT", 0);
    public static final MemoryCacheBuilderExternalSyntheticLambda1 CORE = new MemoryCacheBuilderExternalSyntheticLambda1("CORE", 1);
    public static final MemoryCacheBuilderExternalSyntheticLambda1 PREFERENCE = new MemoryCacheBuilderExternalSyntheticLambda1("PREFERENCE", 2);
    public static final MemoryCacheBuilderExternalSyntheticLambda1 NONE = new MemoryCacheBuilderExternalSyntheticLambda1("NONE", 3);
    public static final MemoryCacheBuilderExternalSyntheticLambda1 PERSISTENT = new MemoryCacheBuilderExternalSyntheticLambda1("PERSISTENT", 4);

    private static final /* synthetic */ MemoryCacheBuilderExternalSyntheticLambda1[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        MemoryCacheBuilderExternalSyntheticLambda1[] memoryCacheBuilderExternalSyntheticLambda1Arr = {DEFAULT, CORE, PREFERENCE, NONE, PERSISTENT};
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return memoryCacheBuilderExternalSyntheticLambda1Arr;
    }

    public static EnumEntries<MemoryCacheBuilderExternalSyntheticLambda1> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<MemoryCacheBuilderExternalSyntheticLambda1> enumEntries = $ENTRIES;
        int i4 = i2 + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static MemoryCacheBuilderExternalSyntheticLambda1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1 = (MemoryCacheBuilderExternalSyntheticLambda1) Enum.valueOf(MemoryCacheBuilderExternalSyntheticLambda1.class, str);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return memoryCacheBuilderExternalSyntheticLambda1;
    }

    public static MemoryCacheBuilderExternalSyntheticLambda1[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MemoryCacheBuilderExternalSyntheticLambda1[] memoryCacheBuilderExternalSyntheticLambda1Arr = (MemoryCacheBuilderExternalSyntheticLambda1[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return memoryCacheBuilderExternalSyntheticLambda1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private MemoryCacheBuilderExternalSyntheticLambda1(String str, int i) {
    }

    static {
        MemoryCacheBuilderExternalSyntheticLambda1[] memoryCacheBuilderExternalSyntheticLambda1Arr$values = $values();
        $VALUES = memoryCacheBuilderExternalSyntheticLambda1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(memoryCacheBuilderExternalSyntheticLambda1Arr$values);
        int i = onExtraCallbackWithResult + 33;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }
}
