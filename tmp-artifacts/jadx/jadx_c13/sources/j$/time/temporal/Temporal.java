package j$.time.temporal;

import j$.time.LocalDate;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j, TemporalField temporalField);

    Temporal b(long j, TemporalUnit temporalUnit);

    long until(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: e */
    default Temporal i(LocalDate localDate) {
        return localDate.f(this);
    }

    default Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }
}
