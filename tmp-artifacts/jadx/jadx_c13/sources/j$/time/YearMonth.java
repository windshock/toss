package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
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
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class YearMonth implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable {
    public static final DateTimeFormatter c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    public static YearMonth now() {
        LocalDate localDateS = LocalDate.S(Clock.c());
        return of(localDateS.getYear(), localDateS.getMonth());
    }

    public static YearMonth of(int i, Month month) {
        Objects.requireNonNull(month, "month");
        return of(i, month.getValue());
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.Q(i);
        ChronoField.MONTH_OF_YEAR.Q(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof YearMonth) {
            return (YearMonth) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            if (!p.d.equals(Chronology.n(temporalAccessor))) {
                temporalAccessor = LocalDate.C(temporalAccessor);
            }
            return of(temporalAccessor.g(ChronoField.YEAR), temporalAccessor.g(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static YearMonth parse(CharSequence charSequence) {
        return parse(charSequence, c);
    }

    public static YearMonth parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, new f(6));
    }

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final YearMonth I(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.n.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i2 = s.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return o();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new m(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    public final long o() {
        return ((this.a * 12) + this.b) - 1;
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

    public int lengthOfMonth() {
        return getMonth().w(p.d.P(this.a));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (YearMonth) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final YearMonth a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i = s.a[chronoField.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            ChronoField.MONTH_OF_YEAR.Q(i2);
            return I(this.a, i2);
        }
        if (i == 2) {
            return plusMonths(j - o());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            ChronoField.YEAR.Q(i3);
            return I(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            ChronoField.YEAR.Q(i4);
            return I(i4, this.b);
        }
        if (i != 5) {
            throw new m(b.a("Unsupported field: ", temporalField));
        }
        if (j(ChronoField.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        ChronoField.YEAR.Q(i5);
        return I(i5, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final YearMonth b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (YearMonth) temporalUnit.o(this, j);
        }
        switch (s.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusMonths(j);
            case 2:
                return C(j);
            case 3:
                return C(Math.multiplyExact(j, 10));
            case 4:
                return C(Math.multiplyExact(j, 100));
            case 5:
                return C(Math.multiplyExact(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j), chronoField);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public final YearMonth C(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return I(chronoField.b.a(this.a + j, chronoField), this.b);
    }

    public YearMonth plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return I(chronoField.b.a(Math.floorDiv(j2, j3), chronoField), ((int) Math.floorMod(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public YearMonth minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(LongCompanionObject.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.b) {
            return p.d;
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.MONTHS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        if (!Chronology.n(temporal).equals(p.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(o(), ChronoField.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        YearMonth yearMonthFrom = from(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jO = yearMonthFrom.o() - o();
            switch (s.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jO;
                case 2:
                    return jO / 12;
                case 3:
                    return jO / 120;
                case 4:
                    return jO / 1200;
                case 5:
                    return jO / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.ERA;
                    return yearMonthFrom.j(chronoField) - j(chronoField);
                default:
                    throw new m("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, yearMonthFrom);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public LocalDate atDay(int i) {
        return LocalDate.of(this.a, this.b, i);
    }

    public LocalDate atEndOfMonth() {
        return LocalDate.of(this.a, this.b, lengthOfMonth());
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.a - yearMonth.a;
        return i == 0 ? this.b - yearMonth.b : i;
    }

    public boolean isAfter(YearMonth yearMonth) {
        return compareTo(yearMonth) > 0;
    }

    public boolean isBefore(YearMonth yearMonth) {
        return compareTo(yearMonth) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.a == yearMonth.a && this.b == yearMonth.b;
    }

    public int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
