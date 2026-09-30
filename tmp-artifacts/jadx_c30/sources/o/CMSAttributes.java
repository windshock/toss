package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CMSAttributes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CMSAttributes[] $VALUES;
    public static final CMSAttributes INTEGRATED = new CMSAttributes("INTEGRATED", 0);
    public static final CMSAttributes FIND_ALL_CARDS = new CMSAttributes("FIND_ALL_CARDS", 1);
    public static final CMSAttributes SINGLE = new CMSAttributes("SINGLE", 2);
    public static final CMSAttributes ID_PW = new CMSAttributes("ID_PW", 3);

    private static final /* synthetic */ CMSAttributes[] $values() {
        return new CMSAttributes[]{INTEGRATED, FIND_ALL_CARDS, SINGLE, ID_PW};
    }

    public static EnumEntries<CMSAttributes> getEntries() {
        return $ENTRIES;
    }

    public static CMSAttributes valueOf(String str) {
        return (CMSAttributes) Enum.valueOf(CMSAttributes.class, str);
    }

    public static CMSAttributes[] values() {
        return (CMSAttributes[]) $VALUES.clone();
    }

    private CMSAttributes(String str, int i) {
    }

    static {
        CMSAttributes[] cMSAttributesArr$values = $values();
        $VALUES = cMSAttributesArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cMSAttributesArr$values);
    }
}
