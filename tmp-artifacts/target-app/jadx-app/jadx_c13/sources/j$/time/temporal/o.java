package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class o implements TemporalField {
    public static final n f = n.f(1, 7);
    public static final n g = n.g(0, 4, 6);
    public static final n h = n.g(0, 52, 54);
    public static final n i = n.g(1, 52, 53);
    public final String a;
    public final WeekFields b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final n e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public final ChronoLocalDate e(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateJ = chronology.J(i2, 1, 1);
        int iH = h(1, b(chronoLocalDateJ));
        return chronoLocalDateJ.b(((Math.min(i3, a(iH, chronoLocalDateJ.N() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public o(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, n nVar) {
        this.a = str;
        this.b = weekFields;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = nVar;
    }

    @Override // j$.time.temporal.TemporalField
    public final long I(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == WeekFields.h) {
                    iC = d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iG = temporalAccessor.g(ChronoField.DAY_OF_YEAR);
                iC = a(h(iG, iB), iG);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iG2 = temporalAccessor.g(ChronoField.DAY_OF_MONTH);
            iC = a(h(iG2, iB2), iG2);
        }
        return iC;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.g(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iG2 = temporalAccessor.g(chronoField);
        int iH = h(iG2, iB);
        int iA = a(iH, iG2);
        return iA == 0 ? iG - 1 : iA >= a(iH, ((int) temporalAccessor.k(chronoField).d) + this.b.b) ? iG + 1 : iG;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int iG = temporalAccessor.g(chronoField);
        int iH = h(iG, iB);
        int iA2 = a(iH, iG);
        if (iA2 == 0) {
            return d(Chronology.n(temporalAccessor).D(temporalAccessor).c(iG, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.k(chronoField).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.b.b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal O(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.g(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.c);
        }
        WeekFields weekFields = this.b;
        return e(Chronology.n(temporal), (int) j, temporal.g(weekFields.e), temporal.g(weekFields.c));
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor C(Map map, a0 a0Var, b0 b0Var) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        Object obj;
        ChronoLocalDate chronoLocalDateB3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        n nVar = this.e;
        WeekFields weekFields = this.b;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((nVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.b.a(((Long) map.get(chronoField)).longValue(), chronoField) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyN = Chronology.n(a0Var);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            int iA = chronoField2.b.a(((Long) map.get(chronoField2)).longValue(), chronoField2);
            ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
            if (temporalUnit == chronoUnit2) {
                ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
                if (map.containsKey(chronoField3)) {
                    long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                    long j = intExact;
                    if (b0Var == b0.LENIENT) {
                        obj = chronoField2;
                        ChronoLocalDate chronoLocalDateB4 = chronologyN.J(iA, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                        int iB = b(chronoLocalDateB4);
                        int iG = chronoLocalDateB4.g(ChronoField.DAY_OF_MONTH);
                        chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(iG, iB), iG)), 7), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                    } else {
                        obj = chronoField2;
                        ChronoLocalDate chronoLocalDateJ = chronologyN.J(iA, chronoField3.b.a(jLongValue2, chronoField3), 1);
                        long jA = nVar.a(j, this);
                        int iB2 = b(chronoLocalDateJ);
                        int iG2 = chronoLocalDateJ.g(ChronoField.DAY_OF_MONTH);
                        ChronoLocalDate chronoLocalDateB5 = chronoLocalDateJ.b((((int) (jA - a(h(iG2, iB2), iG2))) * 7) + (iFloorMod - b(chronoLocalDateJ)), (TemporalUnit) ChronoUnit.DAYS);
                        if (b0Var == b0.STRICT && chronoLocalDateB5.j(chronoField3) != jLongValue2) {
                            throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                        }
                        chronoLocalDateB3 = chronoLocalDateB5;
                    }
                    map.remove(this);
                    map.remove(obj);
                    map.remove(chronoField3);
                    map.remove(chronoField);
                    return chronoLocalDateB3;
                }
            }
            if (temporalUnit == ChronoUnit.YEARS) {
                long j2 = intExact;
                ChronoLocalDate chronoLocalDateJ2 = chronologyN.J(iA, 1, 1);
                if (b0Var == b0.LENIENT) {
                    int iB3 = b(chronoLocalDateJ2);
                    int iG3 = chronoLocalDateJ2.g(ChronoField.DAY_OF_YEAR);
                    chronoLocalDateB2 = chronoLocalDateJ2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(iG3, iB3), iG3)), 7), iFloorMod - b(chronoLocalDateJ2)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    long jA2 = nVar.a(j2, this);
                    int iB4 = b(chronoLocalDateJ2);
                    int iG4 = chronoLocalDateJ2.g(ChronoField.DAY_OF_YEAR);
                    ChronoLocalDate chronoLocalDateB6 = chronoLocalDateJ2.b((((int) (jA2 - a(h(iG4, iB4), iG4))) * 7) + (iFloorMod - b(chronoLocalDateJ2)), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var == b0.STRICT && chronoLocalDateB6.j(chronoField2) != iA) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                    }
                    chronoLocalDateB2 = chronoLocalDateB6;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField);
                return chronoLocalDateB2;
            }
        } else if ((temporalUnit == WeekFields.h || temporalUnit == ChronoUnit.FOREVER) && map.containsKey(weekFields.f) && map.containsKey(weekFields.e)) {
            o oVar = weekFields.f;
            int iA2 = oVar.e.a(((Long) map.get(oVar)).longValue(), weekFields.f);
            if (b0Var == b0.LENIENT) {
                chronoLocalDateB = e(chronologyN, iA2, 1, iFloorMod).b(Math.subtractExact(((Long) map.get(weekFields.e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                o oVar2 = weekFields.e;
                ChronoLocalDate chronoLocalDateE = e(chronologyN, iA2, oVar2.e.a(((Long) map.get(oVar2)).longValue(), weekFields.e), iFloorMod);
                if (b0Var == b0.STRICT && c(chronoLocalDateE) != iA2) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(weekFields.f);
            map.remove(weekFields.e);
            map.remove(chronoField);
            return chronoLocalDateB;
        }
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final n range() {
        return this.e;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean o(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.h(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.h(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return temporalAccessor.h(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.h(ChronoField.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalField
    public final n w(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    public final n f(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iH = h(temporalAccessor.g(chronoField), b(temporalAccessor));
        n nVarK = temporalAccessor.k(chronoField);
        return n.f(a(iH, (int) nVarK.a), a(iH, (int) nVarK.d));
    }

    public final n g(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.h(chronoField)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(chronoField);
        int iH = h(iG, iB);
        int iA = a(iH, iG);
        if (iA != 0) {
            if (iA >= a(iH, this.b.b + ((int) temporalAccessor.k(chronoField).d))) {
                return g(Chronology.n(temporalAccessor).D(temporalAccessor).b((r0 - iG) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return n.f(1L, r1 - 1);
        }
        return g(Chronology.n(temporalAccessor).D(temporalAccessor).c(iG + 7, (TemporalUnit) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
