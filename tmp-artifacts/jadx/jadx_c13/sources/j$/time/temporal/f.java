package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final n range() {
                return n.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.DAY_OF_YEAR) || !temporalAccessor.h(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.h(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return Chronology.n(temporalAccessor).equals(p.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final n w(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.j(f.QUARTER_OF_YEAR);
                if (j == 1) {
                    return p.d.P(temporalAccessor.j(ChronoField.YEAR)) ? n.f(1L, 91L) : n.f(1L, 90L);
                }
                if (j == 2) {
                    return n.f(1L, 91L);
                }
                if (j == 3 || j == 4) {
                    return n.f(1L, 92L);
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.g(ChronoField.DAY_OF_YEAR) - f.a[((temporalAccessor.g(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (p.d.P(temporalAccessor.j(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                long jI = I(temporal);
                range().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.a((j - jI) + temporal.j(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor C(Map map, a0 a0Var, b0 b0Var) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = chronoField.b.a(l.longValue(), chronoField);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.a;
                if (!Chronology.n(a0Var).equals(p.d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (b0Var == b0.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iA, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((temporalField.range().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (b0Var == b0.STRICT) {
                            w(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDatePlusMonths.plusDays(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final n range() {
                return n.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return Chronology.n(temporalAccessor).equals(p.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.j(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            public final n w(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: QuarterOfYear");
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                long jI = I(temporal);
                range().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return temporal.a(((j - jI) * 3) + temporal.j(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final n range() {
                return n.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return Chronology.n(temporalAccessor).equals(p.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final n w(TemporalAccessor temporalAccessor) {
                if (o(temporalAccessor)) {
                    return f.T(LocalDate.C(temporalAccessor));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: WeekOfWeekBasedYear");
                }
                return f.Q(LocalDate.C(temporalAccessor));
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(Math.subtractExact(j, I(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor C(Map map, a0 a0Var, b0 b0Var) {
                LocalDate localDateA;
                long j;
                LocalDate localDatePlusWeeks;
                long j2;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = temporalField.range().a(l.longValue(), temporalField);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.a;
                if (!Chronology.n(a0Var).equals(p.d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (b0Var == b0.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        localDatePlusWeeks = localDateOf.plusWeeks(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDatePlusWeeks = localDateOf.plusWeeks(Math.subtractExact(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        localDateA = localDateOf.plusWeeks(Math.subtractExact(jLongValue, j)).a(jLongValue2, chronoField);
                    }
                    localDateOf = localDatePlusWeeks;
                    j = 1;
                    jLongValue2 = j2 + 1;
                    localDateA = localDateOf.plusWeeks(Math.subtractExact(jLongValue, j)).a(jLongValue2, chronoField);
                } else {
                    int iA2 = chronoField.b.a(l2.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (b0Var == b0.STRICT) {
                            f.T(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateA = localDateOf.plusWeeks(jLongValue - 1).a(iA2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateA;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final n range() {
                return ChronoField.YEAR.b;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return Chronology.n(temporalAccessor).equals(p.d);
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (o(temporalAccessor)) {
                    return f.R(LocalDate.C(temporalAccessor));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final n w(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new m("Unsupported field: WeekBasedYear");
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final Temporal O(Temporal temporal, long j) {
                if (!o(temporal)) {
                    throw new m("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.b.a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateC = LocalDate.C(temporal);
                int iG = localDateC.g(ChronoField.DAY_OF_WEEK);
                int iQ = f.Q(localDateC);
                if (iQ == 53 && f.S(iA) == 52) {
                    iQ = 52;
                }
                return temporal.i(LocalDate.of(iA, 1, 4).plusDays(((iQ - 1) * 7) + (iG - r6.g(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static n T(LocalDate localDate) {
        return n.f(1L, S(R(localDate)));
    }

    public static int S(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.t()) ? 53 : 52;
        }
        return 53;
    }

    public static int Q(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int dayOfYear = localDate.getDayOfYear() - 1;
        int i = (3 - iOrdinal) + dayOfYear;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (dayOfYear >= i3) {
            int i4 = ((dayOfYear - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.t())) {
                return i4;
            }
            return 1;
        }
        if (localDate.getDayOfYear() != 180) {
            localDate = LocalDate.T(localDate.a, 180);
        }
        return (int) T(localDate.plusYears(-1L)).d;
    }

    public static int R(LocalDate localDate) {
        int year = localDate.getYear();
        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (localDate.t() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
