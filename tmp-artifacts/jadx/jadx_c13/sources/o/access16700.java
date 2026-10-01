package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16700 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ access16700[] $VALUES;
    public static final access16700 SKIP = new access16700("SKIP", 0);
    public static final access16700 TERMINATE = new access16700("TERMINATE", 1);

    private static final /* synthetic */ access16700[] $values() {
        return new access16700[]{SKIP, TERMINATE};
    }

    public static EnumEntries<access16700> getEntries() {
        return $ENTRIES;
    }

    public static access16700 valueOf(String str) {
        return (access16700) Enum.valueOf(access16700.class, str);
    }

    public static access16700[] values() {
        return (access16700[]) $VALUES.clone();
    }

    private access16700(String str, int i) {
    }

    static {
        access16700[] access16700VarArr$values = $values();
        $VALUES = access16700VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(access16700VarArr$values);
    }
}
