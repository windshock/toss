package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class wwx2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wwx2[] $VALUES;
    public static final wwx2 NONE = new wwx2("NONE", 0);
    public static final wwx2 ALL_JSON_OBJECTS = new wwx2("ALL_JSON_OBJECTS", 1);
    public static final wwx2 POLYMORPHIC = new wwx2("POLYMORPHIC", 2);

    private static final /* synthetic */ wwx2[] $values() {
        return new wwx2[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    public static EnumEntries<wwx2> getEntries() {
        return $ENTRIES;
    }

    private wwx2(String str, int i) {
    }

    static {
        wwx2[] wwx2VarArr$values = $values();
        $VALUES = wwx2VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(wwx2VarArr$values);
    }

    public static wwx2 valueOf(String str) {
        return (wwx2) Enum.valueOf(wwx2.class, str);
    }

    public static wwx2[] values() {
        return (wwx2[]) $VALUES.clone();
    }
}
