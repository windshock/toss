package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isBound {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isBound[] $VALUES;
    public static final isBound NONE = new isBound("NONE", 0);
    public static final isBound BOX_NONE = new isBound("BOX_NONE", 1);
    public static final isBound BOX_ONLY = new isBound("BOX_ONLY", 2);
    public static final isBound AUTO = new isBound("AUTO", 3);

    private static final /* synthetic */ isBound[] $values() {
        return new isBound[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    public static EnumEntries<isBound> getEntries() {
        return $ENTRIES;
    }

    public static isBound valueOf(String str) {
        return (isBound) Enum.valueOf(isBound.class, str);
    }

    public static isBound[] values() {
        return (isBound[]) $VALUES.clone();
    }

    private isBound(String str, int i) {
    }

    static {
        isBound[] isboundArr$values = $values();
        $VALUES = isboundArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isboundArr$values);
    }
}
