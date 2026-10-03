package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LDSSecurityObject {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LDSSecurityObject[] $VALUES;
    public static final LDSSecurityObject NEXT = new LDSSecurityObject("NEXT", 0);
    public static final LDSSecurityObject COMPLETE = new LDSSecurityObject("COMPLETE", 1);
    public static final LDSSecurityObject RESET = new LDSSecurityObject("RESET", 2);

    private static final /* synthetic */ LDSSecurityObject[] $values() {
        return new LDSSecurityObject[]{NEXT, COMPLETE, RESET};
    }

    public static EnumEntries<LDSSecurityObject> getEntries() {
        return $ENTRIES;
    }

    public static LDSSecurityObject valueOf(String str) {
        return (LDSSecurityObject) Enum.valueOf(LDSSecurityObject.class, str);
    }

    public static LDSSecurityObject[] values() {
        return (LDSSecurityObject[]) $VALUES.clone();
    }

    private LDSSecurityObject(String str, int i) {
    }

    static {
        LDSSecurityObject[] lDSSecurityObjectArr$values = $values();
        $VALUES = lDSSecurityObjectArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(lDSSecurityObjectArr$values);
    }
}
