package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.zone.ZoneRules;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public static ZonedDateTime now() {
        a aVarC = Clock.c();
        return ofInstant(aVarC.instant(), aVarC.a);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVarB = Clock.b(zoneId);
        Objects.requireNonNull(aVarB, "clock");
        return ofInstant(aVarB.instant(), aVarB.a);
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        return C(LocalDateTime.of(i, i2, i3, i4, i5, i6, i7), zoneId, null);
    }

    public static ZonedDateTime C(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listE = rules.e(localDateTime);
        if (listE.size() == 1) {
            zoneOffset = (ZoneOffset) listE.get(0);
        } else if (listE.size() != 0) {
            if (zoneOffset == null || !listE.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listE.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objD = rules.d(localDateTime);
            j$.time.zone.b bVar = objD instanceof j$.time.zone.b ? (j$.time.zone.b) objD : null;
            localDateTime = localDateTime.S(Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds());
            zoneOffset = bVar.d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return o(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime o(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.C(j, i, offset), zoneId, offset);
    }

    public static ZonedDateTime w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdO = ZoneId.o(temporalAccessor);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (!temporalAccessor.h(chronoField)) {
                return C(LocalDateTime.of(LocalDate.C(temporalAccessor), LocalTime.w(temporalAccessor)), zoneIdO, null);
            }
            return o(temporalAccessor.j(chronoField), temporalAccessor.g(ChronoField.NANO_OF_SECOND), zoneIdO);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new f(7));
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public final ZonedDateTime O(LocalDateTime localDateTime) {
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().e(localDateTime).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        return o(localDateTime.toEpochSecond(zoneOffset), localDateTime.getNano(), zoneId);
    }

    public final ZonedDateTime Q(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.getRules().e(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).b;
            }
            return this.a.k(temporalField);
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = u.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new m("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.g(temporalField);
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = u.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(temporalField);
        }
        return temporalField.I(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime A(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : C(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime l(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : o(this.a.toEpochSecond(this.b), this.a.getNano(), zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalDate toLocalDate() {
        return this.a.toLocalDate();
    }

    public int getYear() {
        return this.a.getYear();
    }

    public int getMonthValue() {
        return this.a.getMonthValue();
    }

    public Month getMonth() {
        return this.a.getMonth();
    }

    public int getDayOfMonth() {
        return this.a.getDayOfMonth();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    public int getHour() {
        return this.a.getHour();
    }

    public int getMinute() {
        return this.a.getMinute();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return C(LocalDateTime.of((LocalDate) temporalAdjuster, this.a.toLocalTime()), this.c, this.b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return C(LocalDateTime.of(this.a.toLocalDate(), (LocalTime) temporalAdjuster), this.c, this.b);
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return C((LocalDateTime) temporalAdjuster, this.c, this.b);
        }
        if (temporalAdjuster instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) temporalAdjuster;
            return C(offsetDateTime.toLocalDateTime(), this.c, offsetDateTime.b);
        }
        if (temporalAdjuster instanceof Instant) {
            Instant instant = (Instant) temporalAdjuster;
            return o(instant.getEpochSecond(), instant.getNano(), this.c);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            return Q((ZoneOffset) temporalAdjuster);
        }
        return (ZonedDateTime) temporalAdjuster.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = u.a[chronoField.ordinal()];
            if (i == 1) {
                return o(j, this.a.getNano(), this.c);
            }
            if (i != 2) {
                return C(this.a.a(j, temporalField), this.c, this.b);
            }
            return Q(ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
        }
        return (ZonedDateTime) temporalField.O(this, j);
    }

    public ZonedDateTime withYear(int i) {
        LocalDateTime localDateTime = this.a;
        return C(localDateTime.V(localDateTime.a.X(i), localDateTime.b), this.c, this.b);
    }

    public ZonedDateTime withMonth(int i) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDateV = localDateTime.a;
        if (localDateV.b != i) {
            ChronoField.MONTH_OF_YEAR.Q(i);
            localDateV = LocalDate.V(localDateV.a, i, localDateV.c);
        }
        return C(localDateTime.V(localDateV, localDateTime.b), this.c, this.b);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDateOf = localDateTime.a;
        if (localDateOf.c != i) {
            localDateOf = LocalDate.of(localDateOf.a, localDateOf.b, i);
        }
        return C(localDateTime.V(localDateOf, localDateTime.b), this.c, this.b);
    }

    public ZonedDateTime withHour(int i) {
        LocalDateTime localDateTime = this.a;
        return C(localDateTime.V(localDateTime.a, localDateTime.b.W(i)), this.c, this.b);
    }

    public ZonedDateTime withMinute(int i) {
        LocalDateTime localDateTime = this.a;
        LocalTime localTimeO = localDateTime.b;
        if (localTimeO.b != i) {
            ChronoField.MINUTE_OF_HOUR.Q(i);
            localTimeO = LocalTime.o(localTimeO.a, i, localTimeO.c, localTimeO.d);
        }
        return C(localDateTime.V(localDateTime.a, localTimeO), this.c, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return C(this.a.b(j, temporalUnit), this.c, this.b);
            }
            return O(this.a.b(j, temporalUnit));
        }
        return (ZonedDateTime) temporalUnit.o(this, j);
    }

    public ZonedDateTime plusMonths(long j) {
        LocalDateTime localDateTime = this.a;
        return C(localDateTime.V(localDateTime.a.plusMonths(j), localDateTime.b), this.c, this.b);
    }

    public ZonedDateTime plusDays(long j) {
        return C(this.a.O(j), this.c, this.b);
    }

    public ZonedDateTime plusHours(long j) {
        return O(this.a.Q(j));
    }

    public ZonedDateTime plusMinutes(long j) {
        return O(this.a.plusMinutes(j));
    }

    public ZonedDateTime plusSeconds(long j) {
        return O(this.a.S(j));
    }

    public ZonedDateTime plusNanos(long j) {
        return O(this.a.R(j));
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoZonedDateTime c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public ZonedDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(LongCompanionObject.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public ZonedDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(LongCompanionObject.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public ZonedDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(LongCompanionObject.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.f) {
            return toLocalDate();
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeW = w(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeL = zonedDateTimeW.l(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.a.until(zonedDateTimeL.a, temporalUnit);
            }
            return new OffsetDateTime(this.a, this.b).until(new OffsetDateTime(zonedDateTimeL.a, zonedDateTimeL.b), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTimeW);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c);
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new p((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
