package j$.time.temporal;

import j$.time.Duration;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    boolean isDurationEstimated();

    Temporal o(Temporal temporal, long j);
}
