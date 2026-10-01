package o;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRevision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setRevision[] $VALUES;
    private final TimeUnit timeUnit;
    public static final setRevision NANOSECONDS = new setRevision("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final setRevision MICROSECONDS = new setRevision("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final setRevision MILLISECONDS = new setRevision("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final setRevision SECONDS = new setRevision("SECONDS", 3, TimeUnit.SECONDS);
    public static final setRevision MINUTES = new setRevision("MINUTES", 4, TimeUnit.MINUTES);
    public static final setRevision HOURS = new setRevision("HOURS", 5, TimeUnit.HOURS);
    public static final setRevision DAYS = new setRevision("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ setRevision[] $values() {
        return new setRevision[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static EnumEntries<setRevision> getEntries() {
        return $ENTRIES;
    }

    public static setRevision valueOf(String str) {
        return (setRevision) Enum.valueOf(setRevision.class, str);
    }

    public static setRevision[] values() {
        return (setRevision[]) $VALUES.clone();
    }

    private setRevision(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }

    static {
        setRevision[] setrevisionArr$values = $values();
        $VALUES = setrevisionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setrevisionArr$values);
    }
}
