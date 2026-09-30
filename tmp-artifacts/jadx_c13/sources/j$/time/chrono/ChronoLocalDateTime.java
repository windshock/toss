package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime B(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(long j, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j, TemporalUnit temporalUnit);

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ default int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    default Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime i(TemporalAdjuster temporalAdjuster) {
        return e.o(getChronology(), temporalAdjuster.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
        return e.o(getChronology(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.a || temporalQuery == l.e || temporalQuery == l.d) {
            return null;
        }
        if (temporalQuery == l.g) {
            return toLocalTime();
        }
        if (temporalQuery == l.b) {
            return getChronology();
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal f(Temporal temporal) {
        return temporal.a(toLocalDate().toEpochDay(), ChronoField.EPOCH_DAY).a(toLocalTime().toNanoOfDay(), ChronoField.NANO_OF_DAY);
    }

    default Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(toEpochSecond(zoneOffset), toLocalTime().getNano());
    }

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = toLocalDate().compareTo(chronoLocalDateTime.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? getChronology().compareTo(chronoLocalDateTime.getChronology()) : iCompareTo;
    }
}
