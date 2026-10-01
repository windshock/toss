package kotlin;

import kotlin.enums.EnumEntries;
import o.access15300;
import ua.naiksoftware.stomp.dto.StompCommand;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RequiresOptIn$Level {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RequiresOptIn$Level[] $VALUES;
    public static final RequiresOptIn$Level WARNING = new RequiresOptIn$Level("WARNING", 0);
    public static final RequiresOptIn$Level ERROR = new RequiresOptIn$Level(StompCommand.ERROR, 1);

    private static final /* synthetic */ RequiresOptIn$Level[] $values() {
        return new RequiresOptIn$Level[]{WARNING, ERROR};
    }

    public static EnumEntries<RequiresOptIn$Level> getEntries() {
        return $ENTRIES;
    }

    public static RequiresOptIn$Level valueOf(String str) {
        return (RequiresOptIn$Level) Enum.valueOf(RequiresOptIn$Level.class, str);
    }

    public static RequiresOptIn$Level[] values() {
        return (RequiresOptIn$Level[]) $VALUES.clone();
    }

    private RequiresOptIn$Level(String str, int i) {
    }

    static {
        RequiresOptIn$Level[] requiresOptIn$LevelArr$values = $values();
        $VALUES = requiresOptIn$LevelArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(requiresOptIn$LevelArr$values);
    }
}
