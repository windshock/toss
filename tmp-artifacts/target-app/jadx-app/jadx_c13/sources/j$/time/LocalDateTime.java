package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
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
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    public static LocalDateTime now(ZoneId zoneId) {
        a aVarB = Clock.b(zoneId);
        Objects.requireNonNull(aVarB, "clock");
        Instant instant = aVarB.instant();
        return C(instant.getEpochSecond(), instant.getNano(), aVarB.a.getRules().getOffset(instant));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime B(ZoneId zoneId) {
        return ZonedDateTime.C(this, zoneId, null);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6) {
        LocalTime localTime;
        LocalDate localDateOf = LocalDate.of(i, i2, i3);
        LocalTime localTime2 = LocalTime.MIN;
        ChronoField.HOUR_OF_DAY.Q(i4);
        if ((i5 | i6) == 0) {
            localTime = LocalTime.e[i4];
        } else {
            ChronoField.MINUTE_OF_HOUR.Q(i5);
            ChronoField.SECOND_OF_MINUTE.Q(i6);
            localTime = new LocalTime(i4, i5, i6, 0);
        }
        return new LocalDateTime(localDateOf, localTime);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return C(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    public static LocalDateTime C(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.Q(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.getTotalSeconds(), 86400)), LocalTime.ofNanoOfDay((((int) Math.floorMod(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).toLocalDateTime();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.C(temporalAccessor), LocalTime.w(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new f(2));
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public final LocalDateTime V(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.o(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.R();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.b.k(temporalField) : this.a.k(temporalField);
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.b.g(temporalField) : this.a.g(temporalField);
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.b.j(temporalField) : this.a.j(temporalField);
        }
        return temporalField.I(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalDate toLocalDate() {
        return this.a;
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

    public int getDayOfYear() {
        return this.a.getDayOfYear();
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.getDayOfWeek();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.b;
    }

    public int getHour() {
        return this.b.getHour();
    }

    public int getMinute() {
        return this.b.getMinute();
    }

    public int getSecond() {
        return this.b.getSecond();
    }

    public int getNano() {
        return this.b.getNano();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return V((LocalDate) temporalAdjuster, this.b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return V(this.a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return (LocalDateTime) temporalAdjuster;
        }
        return (LocalDateTime) temporalAdjuster.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).R()) {
                return V(this.a, this.b.a(j, temporalField));
            }
            return V(this.a.a(j, temporalField), this.b);
        }
        return (LocalDateTime) temporalField.O(this, j);
    }

    public LocalDateTime withSecond(int i) {
        LocalTime localTimeO = this.b;
        if (localTimeO.c != i) {
            ChronoField.SECOND_OF_MINUTE.Q(i);
            localTimeO = LocalTime.o(localTimeO.a, localTimeO.b, i, localTimeO.d);
        }
        return V(this.a, localTimeO);
    }

    public LocalDateTime withNano(int i) {
        return V(this.a, this.b.X(i));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return R(j);
                case 2:
                    return O(j / 86400000000L).R((j % 86400000000L) * 1000);
                case 3:
                    return O(j / 86400000).R((j % 86400000) * 1000000);
                case 4:
                    return S(j);
                case 5:
                    return plusMinutes(j);
                case 6:
                    return Q(j);
                case 7:
                    return O(j / 256).Q((j % 256) * 12);
                default:
                    return V(this.a.b(j, temporalUnit), this.b);
            }
        }
        return (LocalDateTime) temporalUnit.o(this, j);
    }

    public final LocalDateTime O(long j) {
        return V(this.a.plusDays(j), this.b);
    }

    public final LocalDateTime Q(long j) {
        return T(this.a, j, 0L, 0L, 0L, 1);
    }

    public LocalDateTime plusMinutes(long j) {
        return T(this.a, 0L, j, 0L, 0L, 1);
    }

    public final LocalDateTime S(long j) {
        return T(this.a, 0L, 0L, j, 0L, 1);
    }

    public final LocalDateTime R(long j) {
        return T(this.a, 0L, 0L, 0L, j, 1);
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public LocalDateTime minusMinutes(long j) {
        return T(this.a, 0L, j, 0L, 0L, -1);
    }

    public final LocalDateTime T(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return V(localDate, this.b);
        }
        long j5 = j4 / 86400000000000L;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long j9 = i;
        long nanoOfDay = this.b.toNanoOfDay();
        long j10 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j9) + nanoOfDay;
        long jFloorDiv = Math.floorDiv(j10, 86400000000000L);
        long jFloorMod = Math.floorMod(j10, 86400000000000L);
        return V(localDate.plusDays(jFloorDiv + ((j8 + j7 + j6 + j5) * j9)), jFloorMod == nanoOfDay ? this.b : LocalTime.ofNanoOfDay(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.f) {
            return this.a;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        LocalDateTime localDateTimeW = w(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeW);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeW.a;
            if (localDatePlusDays.isAfter(this.a) && localDateTimeW.b.compareTo(this.b) < 0) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.a) && localDateTimeW.b.compareTo(this.b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.a.until(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate = this.a;
        LocalDate localDate2 = localDateTimeW.a;
        localDate.getClass();
        long epochDay = localDate2.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return this.b.until(localDateTimeW.b, temporalUnit);
        }
        long nanoOfDay = localDateTimeW.b.toNanoOfDay() - this.b.toNanoOfDay();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j = nanoOfDay + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j = nanoOfDay - 86400000000000L;
        }
        switch (i.a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400);
                j /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return o((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    public final int o(LocalDateTime localDateTime) {
        int iO = this.a.o(localDateTime.toLocalDate());
        return iO == 0 ? this.b.compareTo(localDateTime.toLocalTime()) : iO;
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return o((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() > chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return o((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = chronoLocalDateTime.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() < chronoLocalDateTime.toLocalTime().toNanoOfDay());
    }

    public boolean isEqual(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? o((LocalDateTime) chronoLocalDateTime) == 0 : toLocalTime().toNanoOfDay() == chronoLocalDateTime.toLocalTime().toNanoOfDay() && toLocalDate().toEpochDay() == chronoLocalDateTime.toLocalDate().toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
