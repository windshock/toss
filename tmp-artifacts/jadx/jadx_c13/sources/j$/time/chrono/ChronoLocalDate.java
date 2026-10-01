package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.m;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    Chronology getChronology();

    int hashCode();

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    default ChronoLocalDateTime E(LocalTime localTime) {
        return new e(this, localTime);
    }

    default j H() {
        return getChronology().x(g(ChronoField.ERA));
    }

    default boolean t() {
        return getChronology().P(j(ChronoField.YEAR));
    }

    default int N() {
        return t() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate i(TemporalAdjuster temporalAdjuster) {
        return c.o(getChronology(), temporalAdjuster.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new m(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return c.o(getChronology(), temporalField.O(this, j));
    }

    default ChronoLocalDate K(TemporalAmount temporalAmount) {
        return c.o(getChronology(), temporalAmount.o(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new m("Unsupported unit: " + temporalUnit);
        }
        return c.o(getChronology(), temporalUnit.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return c.o(getChronology(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.a || temporalQuery == l.e || temporalQuery == l.d || temporalQuery == l.g) {
            return null;
        }
        if (temporalQuery == l.b) {
            return getChronology();
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal f(Temporal temporal) {
        return temporal.a(toEpochDay(), ChronoField.EPOCH_DAY);
    }

    default long toEpochDay() {
        return j(ChronoField.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) getChronology()).compareTo(chronoLocalDate.getChronology());
    }
}
