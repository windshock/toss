package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access14400 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ access14400[] $VALUES;
    public static final access14400 COROUTINE_SUSPENDED = new access14400("COROUTINE_SUSPENDED", 0);
    public static final access14400 UNDECIDED = new access14400("UNDECIDED", 1);
    public static final access14400 RESUMED = new access14400("RESUMED", 2);

    private static final /* synthetic */ access14400[] $values() {
        return new access14400[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static EnumEntries<access14400> getEntries() {
        return $ENTRIES;
    }

    public static access14400 valueOf(String str) {
        return (access14400) Enum.valueOf(access14400.class, str);
    }

    public static access14400[] values() {
        return (access14400[]) $VALUES.clone();
    }

    private access14400(String str, int i) {
    }

    static {
        access14400[] access14400VarArr$values = $values();
        $VALUES = access14400VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(access14400VarArr$values);
    }
}
