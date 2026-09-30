package j$.time.temporal;

import j$.time.DayOfWeek;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TemporalAdjusters {
    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new k(dayOfWeek.getValue(), 1);
    }
}
