package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CloseableUtils {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CloseableUtils[] $VALUES;
    public static final CloseableUtils SUSPEND = new CloseableUtils("SUSPEND", 0);
    public static final CloseableUtils DROP_OLDEST = new CloseableUtils("DROP_OLDEST", 1);
    public static final CloseableUtils DROP_LATEST = new CloseableUtils("DROP_LATEST", 2);

    private static final /* synthetic */ CloseableUtils[] $values() {
        return new CloseableUtils[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    public static EnumEntries<CloseableUtils> getEntries() {
        return $ENTRIES;
    }

    private CloseableUtils(String str, int i) {
    }

    static {
        CloseableUtils[] closeableUtilsArr$values = $values();
        $VALUES = closeableUtilsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(closeableUtilsArr$values);
    }

    public static CloseableUtils valueOf(String str) {
        return (CloseableUtils) Enum.valueOf(CloseableUtils.class, str);
    }

    public static CloseableUtils[] values() {
        return (CloseableUtils[]) $VALUES.clone();
    }
}
