package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addAllOpenFds {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ addAllOpenFds[] $VALUES;
    public static final addAllOpenFds INVARIANT = new addAllOpenFds("INVARIANT", 0);
    public static final addAllOpenFds IN = new addAllOpenFds("IN", 1);
    public static final addAllOpenFds OUT = new addAllOpenFds("OUT", 2);

    private static final /* synthetic */ addAllOpenFds[] $values() {
        return new addAllOpenFds[]{INVARIANT, IN, OUT};
    }

    public static EnumEntries<addAllOpenFds> getEntries() {
        return $ENTRIES;
    }

    public static addAllOpenFds valueOf(String str) {
        return (addAllOpenFds) Enum.valueOf(addAllOpenFds.class, str);
    }

    public static addAllOpenFds[] values() {
        return (addAllOpenFds[]) $VALUES.clone();
    }

    private addAllOpenFds(String str, int i) {
    }

    static {
        addAllOpenFds[] addallopenfdsArr$values = $values();
        $VALUES = addallopenfdsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(addallopenfdsArr$values);
    }
}
