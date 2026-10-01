package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.b0;
import j$.time.r;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class p extends a implements Serializable {
    public static final p d = new p();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.Chronology
    public final j x(int i) {
        if (i == 0) {
            return q.BCE;
        }
        if (i == 1) {
            return q.CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final String q() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate J(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate s(int i, int i2) {
        return LocalDate.T(i, i2);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate m(long j) {
        return LocalDate.ofEpochDay(j);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate D(TemporalAccessor temporalAccessor) {
        return LocalDate.C(temporalAccessor);
    }

    private p() {
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime G(TemporalAccessor temporalAccessor) {
        return LocalDateTime.w(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime r(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.w(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate F() {
        return LocalDate.C(LocalDate.S(Clock.c()));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean P(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.Chronology
    public final int z(j jVar, int i) {
        if (jVar instanceof q) {
            return jVar == q.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List v() {
        return j$.time.d.c(q.values());
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate L(Map map, b0 b0Var) {
        return (LocalDate) super.L(map, b0Var);
    }

    @Override // j$.time.chrono.a
    public final void O(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (b0Var != b0.LENIENT) {
                chronoField.Q(l.longValue());
            }
            a.o(map, ChronoField.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), r4)) + 1);
            a.o(map, ChronoField.YEAR, Math.floorDiv(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate R(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (b0Var != b0.LENIENT) {
                chronoField.Q(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    a.o(map, ChronoField.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    a.o(map, ChronoField.YEAR, Math.subtractExact(1L, l.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l2);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l3 = (Long) map.get(chronoField2);
            if (b0Var != b0.STRICT) {
                a.o(map, chronoField2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long jLongValue = l3.longValue();
                long jLongValue2 = l.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                a.o(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.Q(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate Q(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.b.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (b0Var == b0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.b.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.b.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (b0Var == b0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = r.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.w(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.Chronology
    public final n u(ChronoField chronoField) {
        return chronoField.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
