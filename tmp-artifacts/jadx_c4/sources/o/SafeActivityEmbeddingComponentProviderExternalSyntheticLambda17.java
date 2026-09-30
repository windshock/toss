package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 PageLoadError = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17("PageLoadError", 0);
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 FetchMoreError = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17("FetchMoreError", 1);

    private static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = PageLoadError;
        if (i3 == 0) {
            return new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda17, FetchMoreError};
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda172 = FetchMoreError;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[3];
        safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr[1] = safeActivityEmbeddingComponentProviderExternalSyntheticLambda17;
        safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr[1] = safeActivityEmbeddingComponentProviderExternalSyntheticLambda172;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr;
    }

    public static EnumEntries<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17> enumEntries = $ENTRIES;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17) Enum.valueOf(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17.class, str);
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda17;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[]) $VALUES.clone();
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr;
        }
        throw null;
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17(String str, int i) {
    }

    static {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr$values = $values();
        $VALUES = safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda17Arr$values);
        int i = onWarmupCompleted + 103;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
