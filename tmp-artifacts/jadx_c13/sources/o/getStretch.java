package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getStretch {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getStretch[] $VALUES;
    public static final getStretch START = new getStretch("START", 0);
    public static final getStretch STOP = new getStretch("STOP", 1);
    public static final getStretch STOP_AND_RESET_REPLAY_CACHE = new getStretch("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ getStretch[] $values() {
        return new getStretch[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    public static EnumEntries<getStretch> getEntries() {
        return $ENTRIES;
    }

    private getStretch(String str, int i) {
    }

    static {
        getStretch[] getstretchArr$values = $values();
        $VALUES = getstretchArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getstretchArr$values);
    }

    public static getStretch valueOf(String str) {
        return (getStretch) Enum.valueOf(getStretch.class, str);
    }

    public static getStretch[] values() {
        return (getStretch[]) $VALUES.clone();
    }
}
