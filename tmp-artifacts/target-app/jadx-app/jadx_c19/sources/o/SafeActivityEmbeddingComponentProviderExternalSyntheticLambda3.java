package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String value;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 REQUESTED = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3("REQUESTED", 0, "requested");
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 REJECTED = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3("REJECTED", 1, "rejected");
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 REJECTED_BY_PLAY_STORE = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3("REJECTED_BY_PLAY_STORE", 2, "rejected_by_playstore");

    private static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] $values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr = {REQUESTED, REJECTED, REJECTED_BY_PLAY_STORE};
        int i6 = i3 + 87;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr;
    }

    public static EnumEntries<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3> getEntries() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3> enumEntries = $ENTRIES;
        int i6 = i3 + 61;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return enumEntries;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3 safeActivityEmbeddingComponentProviderExternalSyntheticLambda3 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3) Enum.valueOf(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3.class, str);
        int i5 = onExtraCallbackWithResult + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr;
    }

    private SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3(String str, int i2, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i5 = i4 + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda3[] safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr$values = $values();
        $VALUES = safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda3Arr$values);
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }
}
