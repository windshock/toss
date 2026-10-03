package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class replaceFilename {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ replaceFilename[] $VALUES;
    public static final replaceFilename REACHED = new replaceFilename("REACHED", 0);
    public static final replaceFilename WARNING = new replaceFilename("WARNING", 1);
    public static final replaceFilename GUIDE = new replaceFilename("GUIDE", 2);
    public static final replaceFilename NONE = new replaceFilename("NONE", 3);

    private static final /* synthetic */ replaceFilename[] $values() {
        return new replaceFilename[]{REACHED, WARNING, GUIDE, NONE};
    }

    public static EnumEntries<replaceFilename> getEntries() {
        return $ENTRIES;
    }

    public static replaceFilename valueOf(String str) {
        return (replaceFilename) Enum.valueOf(replaceFilename.class, str);
    }

    public static replaceFilename[] values() {
        return (replaceFilename[]) $VALUES.clone();
    }

    private replaceFilename(String str, int i) {
    }

    static {
        replaceFilename[] replacefilenameArr$values = $values();
        $VALUES = replacefilenameArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(replacefilenameArr$values);
    }
}
