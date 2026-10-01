package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class xz {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xz[] $VALUES;
    public static final xz NONE = new xz("NONE", 0);
    public static final xz ZERO = new xz("ZERO", 1);
    public static final xz SPACE = new xz("SPACE", 2);

    private static final /* synthetic */ xz[] $values() {
        return new xz[]{NONE, ZERO, SPACE};
    }

    public static EnumEntries<xz> getEntries() {
        return $ENTRIES;
    }

    private xz(String str, int i) {
    }

    static {
        xz[] xzVarArr$values = $values();
        $VALUES = xzVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(xzVarArr$values);
    }

    public static xz valueOf(String str) {
        return (xz) Enum.valueOf(xz.class, str);
    }

    public static xz[] values() {
        return (xz[]) $VALUES.clone();
    }
}
