package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;
import j$.time.temporal.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        return S(Clock.c());
    }

    public static LocalDate now(ZoneId zoneId) {
        return S(Clock.b(zoneId));
    }

    public static LocalDate S(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        Instant instant = aVar.instant();
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(Math.floorDiv(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), 86400));
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.Q(i);
        ChronoField.MONTH_OF_YEAR.Q(i2);
        ChronoField.DAY_OF_MONTH.Q(i3);
        return w(i, i2, i3);
    }

    public static LocalDate T(int i, int i2) {
        long j = i;
        ChronoField.YEAR.Q(j);
        ChronoField.DAY_OF_YEAR.Q(i2);
        boolean zP = p.d.P(j);
        if (i2 == 366 && !zP) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month monthOf = Month.of(((i2 - 1) / 31) + 1);
        if (i2 > (monthOf.w(zP) + monthOf.o(zP)) - 1) {
            monthOf = Month.a[((((int) 1) + 12) + monthOf.ordinal()) % 12];
        }
        return new LocalDate(i, monthOf.getValue(), (i2 - monthOf.o(zP)) + 1);
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.Q(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / Imgproc.COLOR_RGBA2YUV_YVYU;
        int i3 = ((i2 * 306) + 5) / 10;
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.b.a(j5 + j2 + (i2 / 10), chronoField), ((i2 + 2) % 12) + 1, (i - i3) + 1);
    }

    public static LocalDate C(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(l.f);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new f(1));
    }

    public static LocalDate w(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (p.d.P(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.of(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate V(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, p.d.P((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.w(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new m(b.a("Unsupported field: ", temporalField));
        }
        int i = h.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.n.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.n.f(1L, N());
        }
        if (i != 3) {
            return i != 4 ? chronoField.b : getYear() <= 0 ? j$.time.temporal.n.f(1L, 1000000000L) : j$.time.temporal.n.f(1L, 999999999L);
        }
        return j$.time.temporal.n.f(1L, (getMonth() != Month.FEBRUARY || t()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return I(temporalField);
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return O();
            }
            return I(temporalField);
        }
        return temporalField.I(this);
    }

    public final int I(TemporalField temporalField) {
        switch (h.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new m("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new m("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new m(b.a("Unsupported field: ", temporalField));
        }
    }

    public final long O() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return p.d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j H() {
        return getYear() >= 1 ? j$.time.chrono.q.CE : j$.time.chrono.q.BCE;
    }

    public int getYear() {
        return this.a;
    }

    public int getMonthValue() {
        return this.b;
    }

    public Month getMonth() {
        return Month.of(this.b);
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public int getDayOfYear() {
        return (getMonth().o(t()) + this.c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean t() {
        return p.d.P(this.a);
    }

    public int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : t() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int N() {
        return t() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: with, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalDate i(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        switch (h.a[chronoField.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (getDayOfYear() != i2) {
                    return T(this.a, i2);
                }
                return this;
            case 3:
                return plusWeeks(j - j(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return X((int) j);
            case 5:
                return plusDays(j - getDayOfWeek().getValue());
            case 6:
                return plusDays(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return plusWeeks(j - j(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    ChronoField.MONTH_OF_YEAR.Q(i3);
                    return V(this.a, i3, this.c);
                }
                return this;
            case 11:
                return plusMonths(j - O());
            case 12:
                return X((int) j);
            case 13:
                if (j(ChronoField.ERA) != j) {
                    return X(1 - this.a);
                }
                return this;
            default:
                throw new m(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate X(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.Q(i);
        return V(i, this.b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(TemporalAmount temporalAmount) {
        if (temporalAmount != null) {
            Period period = (Period) temporalAmount;
            return plusMonths((period.a * 12) + period.b).plusDays(period.getDays());
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDate) ((Period) temporalAmount).o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.o(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(Math.multiplyExact(j, 10));
            case 6:
                return plusYears(Math.multiplyExact(j, 100));
            case 7:
                return plusYears(Math.multiplyExact(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j), chronoField);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public LocalDate plusYears(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return V(chronoField.b.a(this.a + j, chronoField), this.b, this.c);
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return V(chronoField.b.a(Math.floorDiv(j2, j3), chronoField), ((int) Math.floorMod(j2, j3)) + 1, this.c);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(Math.multiplyExact(j, 7));
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jLengthOfMonth));
                }
                ChronoField.YEAR.Q(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public LocalDate minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(LongCompanionObject.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(LongCompanionObject.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        return temporalQuery == l.f ? this : super.d(temporalQuery);
    }

    @Override // j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateC = C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateC);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateC.toEpochDay() - toEpochDay();
            case 2:
                return (localDateC.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return R(localDateC);
            case 4:
                return R(localDateC) / 12;
            case 5:
                return R(localDateC) / 120;
            case 6:
                return R(localDateC) / 1200;
            case 7:
                return R(localDateC) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateC.j(chronoField) - j(chronoField);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public final long R(LocalDate localDate) {
        long jO = O();
        return (((localDate.O() * 32) + localDate.getDayOfMonth()) - ((jO * 32) + getDayOfMonth())) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime E(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    public LocalDateTime atTime(int i, int i2) {
        return E(LocalTime.I(i, i2));
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.MIDNIGHT);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeE = E(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objD = zoneId.getRules().d(localDateTimeE);
            j$.time.zone.b bVar = objD instanceof j$.time.zone.b ? (j$.time.zone.b) objD : null;
            if (bVar != null && bVar.o()) {
                localDateTimeE = bVar.b.S(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds());
            }
        }
        return ZonedDateTime.C(localDateTimeE, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 -= t() ? 1L : 2L;
        }
        return j4 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return o((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    public final int o(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? o((LocalDate) chronoLocalDate) > 0 : toEpochDay() > chronoLocalDate.toEpochDay();
    }

    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? o((LocalDate) chronoLocalDate) < 0 : toEpochDay() < chronoLocalDate.toEpochDay();
    }

    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? o((LocalDate) chronoLocalDate) == 0 : toEpochDay() == chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && o((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
