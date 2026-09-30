package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class a0 implements TemporalAccessor {
    public ZoneId b;
    public Chronology c;
    public boolean d;
    public b0 e;
    public ChronoLocalDate f;
    public LocalTime g;
    public final Map a = new HashMap();
    public Period h = Period.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (((HashMap) this.a).containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.h(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.o(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) ((HashMap) this.a).get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return this.f.j(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.h(temporalField)) {
            return this.g.j(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.m(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.a) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.l.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.l.f) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.C(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.g) {
            return this.g;
        }
        if (temporalQuery == j$.time.temporal.l.d) {
            Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.l.e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.l.c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final void v(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) ((HashMap) this.a).put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l2 + " differs from " + chronoField + " " + l + " while resolving  " + temporalField);
    }

    public final void n() {
        if (((HashMap) this.a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                o(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                o(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    public final void o(ZoneId zoneId) {
        Map map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        u(this.c.M(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(chronoField)).longValue()), zoneId).toLocalDate());
        v(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().toSecondOfDay()));
    }

    public final void u(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.c.equals(chronoLocalDate.getChronology())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = chronoLocalDate;
        }
    }

    public final void r() {
        Map map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.a).remove(chronoField)).longValue();
            b0 b0Var = this.e;
            if (b0Var == b0.STRICT || (b0Var == b0.SMART && jLongValue != 0)) {
                chronoField.Q(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            v(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.a).remove(chronoField3)).longValue();
            b0 b0Var2 = this.e;
            if (b0Var2 == b0.STRICT || (b0Var2 == b0.SMART && jLongValue2 != 0)) {
                chronoField3.Q(jLongValue2);
            }
            v(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.a).remove(chronoField5)).longValue();
                if (this.e == b0.LENIENT) {
                    v(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.Q(jLongValue3);
                    chronoField5.Q(jLongValue3);
                    v(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.a).remove(chronoField6)).longValue();
            if (this.e != b0.LENIENT) {
                chronoField6.Q(jLongValue5);
            }
            v(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            v(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            v(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            v(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.a).remove(chronoField7)).longValue();
            if (this.e != b0.LENIENT) {
                chronoField7.Q(jLongValue6);
            }
            v(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            v(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.a).remove(chronoField8)).longValue();
            if (this.e != b0.LENIENT) {
                chronoField8.Q(jLongValue7);
            }
            v(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            v(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.a).remove(chronoField9)).longValue();
            if (this.e != b0.LENIENT) {
                chronoField9.Q(jLongValue8);
            }
            v(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            v(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            v(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.a).remove(chronoField10)).longValue();
            if (this.e != b0.LENIENT) {
                chronoField10.Q(jLongValue9);
            }
            v(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            v(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.a).get(chronoField11)).longValue();
            b0 b0Var3 = this.e;
            b0 b0Var4 = b0.LENIENT;
            if (b0Var3 != b0Var4) {
                chronoField11.Q(jLongValue10);
            }
            Map map11 = this.a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.a).remove(chronoField12)).longValue();
                if (this.e != b0Var4) {
                    chronoField12.Q(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                v(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.a).remove(chronoField13)).longValue();
                if (this.e != b0Var4) {
                    chronoField13.Q(jLongValue12);
                }
                v(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.a).containsKey(chronoField11)) {
                    q(((Long) ((HashMap) this.a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void q(long j, long j2, long j3, long j4) {
        if (this.e == b0.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            s(LocalTime.ofNanoOfDay(Math.floorMod(jAddExact, 86400000000000L)), Period.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.b.a(j2, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.b.a(j4, chronoField2);
        if (this.e == b0.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            s(LocalTime.MIDNIGHT, Period.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.b.a(j, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        s(LocalTime.of(iA3, iA, chronoField4.b.a(j3, chronoField4), iA2), Period.d);
    }

    public final void s(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.g + " " + localTime);
            }
            Period period2 = this.h;
            period2.getClass();
            Period period3 = Period.d;
            if (period2 != period3 && period != period3 && !this.h.equals(period)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.h + " " + period);
            }
            this.h = period;
            return;
        }
        this.g = localTime;
        this.h = period;
    }

    public final void m(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.h(temporalField)) {
                try {
                    long j = temporalAccessor.j(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (j != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + j + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
