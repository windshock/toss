package j$.time;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Clock {
    public abstract Instant instant();

    public static Clock systemUTC() {
        return a.b;
    }

    public static a c() {
        return new a(ZoneId.systemDefault());
    }

    public static a b(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            return a.b;
        }
        return new a(zoneId);
    }

    public long a() {
        return instant().toEpochMilli();
    }
}
