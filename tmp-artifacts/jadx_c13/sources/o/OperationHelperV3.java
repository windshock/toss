package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class OperationHelperV3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OperationHelperV3[] $VALUES;
    public static final OperationHelperV3 DONE = new OperationHelperV3("DONE", 0);
    public static final OperationHelperV3 FETCHING = new OperationHelperV3("FETCHING", 1);
    public static final OperationHelperV3 EMPTY = new OperationHelperV3("EMPTY", 2);

    private static final /* synthetic */ OperationHelperV3[] $values() {
        return new OperationHelperV3[]{DONE, FETCHING, EMPTY};
    }

    public static EnumEntries<OperationHelperV3> getEntries() {
        return $ENTRIES;
    }

    public static OperationHelperV3 valueOf(String str) {
        return (OperationHelperV3) Enum.valueOf(OperationHelperV3.class, str);
    }

    public static OperationHelperV3[] values() {
        return (OperationHelperV3[]) $VALUES.clone();
    }

    private OperationHelperV3(String str, int i) {
    }

    static {
        OperationHelperV3[] operationHelperV3Arr$values = $values();
        $VALUES = operationHelperV3Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(operationHelperV3Arr$values);
    }

    public final boolean isFetching() {
        return this == FETCHING;
    }

    public final boolean isEmpty() {
        return this == EMPTY;
    }
}
