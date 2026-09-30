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
import j$.time.temporal.m;
import j$.time.temporal.n;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime A(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(long j, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j, TemporalUnit temporalUnit);

    ZoneOffset getOffset();

    ZoneId getZone();

    ChronoZonedDateTime l(ZoneId zoneId);

    ChronoLocalDateTime toLocalDateTime();

    @Override // j$.time.temporal.TemporalAccessor
    default n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return toLocalDateTime().k(temporalField);
            }
            return ((ChronoField) temporalField).b;
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = g.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new m("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime().g(temporalField);
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = g.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime().j(temporalField);
        }
        return temporalField.I(this);
    }

    default ChronoLocalDate toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    default LocalTime toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    default Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime i(TemporalAdjuster temporalAdjuster) {
        return i.o(getChronology(), temporalAdjuster.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime c(long j, TemporalUnit temporalUnit) {
        return i.o(getChronology(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.e || temporalQuery == l.a) {
            return getZone();
        }
        if (temporalQuery == l.d) {
            return getOffset();
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

    default Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().getNano());
    }

    default long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - getOffset().getTotalSeconds();
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        return (iCompare == 0 && (iCompare = toLocalTime().getNano() - chronoZonedDateTime.toLocalTime().getNano()) == 0 && (iCompare = toLocalDateTime().compareTo(chronoZonedDateTime.toLocalDateTime())) == 0 && (iCompare = getZone().getId().compareTo(chronoZonedDateTime.getZone().getId())) == 0) ? getChronology().compareTo(chronoZonedDateTime.getChronology()) : iCompare;
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() < chronoZonedDateTime.toLocalTime().getNano();
        }
        return true;
    }

    default boolean isAfter(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() > chronoZonedDateTime.toLocalTime().getNano();
        }
        return true;
    }

    default boolean isEqual(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return toEpochSecond() == chronoZonedDateTime.toEpochSecond() && toLocalTime().getNano() == chronoZonedDateTime.toLocalTime().getNano();
    }
}
