package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class addAllRegisters {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ addAllRegisters[] $VALUES;
    public static final addAllRegisters SKIP_SUBTREE = new addAllRegisters("SKIP_SUBTREE", 0);
    public static final addAllRegisters TERMINATE = new addAllRegisters("TERMINATE", 1);

    private static final /* synthetic */ addAllRegisters[] $values() {
        return new addAllRegisters[]{SKIP_SUBTREE, TERMINATE};
    }

    public static EnumEntries<addAllRegisters> getEntries() {
        return $ENTRIES;
    }

    public static addAllRegisters valueOf(String str) {
        return (addAllRegisters) Enum.valueOf(addAllRegisters.class, str);
    }

    public static addAllRegisters[] values() {
        return (addAllRegisters[]) $VALUES.clone();
    }

    private addAllRegisters(String str, int i) {
    }

    static {
        addAllRegisters[] addallregistersArr$values = $values();
        $VALUES = addallregistersArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(addallregistersArr$values);
    }
}
