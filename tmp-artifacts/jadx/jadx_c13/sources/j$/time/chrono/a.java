package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.f;
import j$.time.format.b0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class a implements Chronology {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Locale c = new Locale("ja", "JP", "JP");

    public static Chronology C(Chronology chronology, String str) {
        String strQ;
        Chronology chronology2 = (Chronology) a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strQ = chronology.q()) != null) {
            b.putIfAbsent(strQ, chronology);
        }
        return chronology2;
    }

    public static boolean w() {
        if (a.get("ISO") != null) {
            return false;
        }
        l lVar = l.m;
        lVar.getClass();
        C(lVar, "Hijrah-umalqura");
        s sVar = s.d;
        sVar.getClass();
        C(sVar, "Japanese");
        x xVar = x.d;
        xVar.getClass();
        C(xVar, "Minguo");
        d0 d0Var = d0.d;
        d0Var.getClass();
        C(d0Var, "ThaiBuddhist");
        try {
            for (a aVar : Arrays.asList(new a[0])) {
                if (!aVar.getId().equals("ISO")) {
                    C(aVar, aVar.getId());
                }
            }
            p pVar = p.d;
            pVar.getClass();
            C(pVar, "ISO");
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return p.d;
        }
        do {
            Chronology chronology = (Chronology) b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (w());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (unicodeLocaleType.equals(chronology2.q())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate L(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return m(((Long) map.remove(chronoField)).longValue());
        }
        O(map, b0Var);
        ChronoLocalDate chronoLocalDateR = R(map, b0Var);
        if (chronoLocalDateR != null) {
            return chronoLocalDateR;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return Q(map, b0Var);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(chronoField5)) {
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int iA = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (b0Var == b0.LENIENT) {
                            return I(J(iA, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                        }
                        int iA2 = u(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateI = J(iA, iA2, 1).b((u(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new k(DayOfWeek.of(u(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                        if (b0Var != b0.STRICT || chronoLocalDateI.g(chronoField3) == iA2) {
                            return chronoLocalDateI;
                        }
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (b0Var == b0.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return J(iA3, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA4 = u(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA5 = u(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    ChronoLocalDate chronoLocalDateB = J(iA3, iA4, 1).b((u(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((iA5 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var != b0.STRICT || chronoLocalDateB.g(chronoField3) == iA4) {
                        return chronoLocalDateB;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (!map.containsKey(chronoField7)) {
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(chronoField8)) {
                return null;
            }
            ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(chronoField9)) {
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (!map.containsKey(chronoField10)) {
                    return null;
                }
                int iA6 = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                if (b0Var == b0.LENIENT) {
                    return I(s(iA6, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
                }
                ChronoLocalDate chronoLocalDateI2 = s(iA6, 1).b((u(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).i(new k(DayOfWeek.of(u(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
                if (b0Var != b0.STRICT || chronoLocalDateI2.g(chronoField2) == iA6) {
                    return chronoLocalDateI2;
                }
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            int iA7 = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (b0Var == b0.LENIENT) {
                return s(iA7, 1).b(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = u(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            ChronoLocalDate chronoLocalDateB2 = s(iA7, 1).b((u(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (b0Var != b0.STRICT || chronoLocalDateB2.g(chronoField2) == iA7) {
                return chronoLocalDateB2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        int iA9 = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (b0Var == b0.LENIENT) {
            return s(iA9, 1).b(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return s(iA9, u(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
    }

    public void O(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (b0Var != b0.LENIENT) {
                chronoField.Q(l.longValue());
            }
            ChronoLocalDate chronoLocalDateA = F().a(1L, (TemporalField) ChronoField.DAY_OF_MONTH).a(l.longValue(), (TemporalField) chronoField);
            o(map, ChronoField.MONTH_OF_YEAR, chronoLocalDateA.g(r0));
            o(map, ChronoField.YEAR, chronoLocalDateA.g(r0));
        }
    }

    public ChronoLocalDate R(Map map, b0 b0Var) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (b0Var != b0.LENIENT) {
                intExact = u(chronoField).a(l.longValue(), chronoField);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                o(map, ChronoField.YEAR, z(x(u(r2).a(l2.longValue(), r2)), intExact));
                return null;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                o(map, chronoField2, z(s(u(chronoField2).a(((Long) map.get(chronoField2)).longValue(), chronoField2), 1).H(), intExact));
                return null;
            }
            if (b0Var == b0.STRICT) {
                map.put(chronoField, l);
                return null;
            }
            if (v().isEmpty()) {
                o(map, chronoField2, intExact);
                return null;
            }
            o(map, chronoField2, z((j) r9.get(r9.size() - 1), intExact));
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        u(chronoField3).b(((Long) map.get(chronoField3)).longValue(), chronoField3);
        return null;
    }

    public ChronoLocalDate Q(Map map, b0 b0Var) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = u(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (b0Var == b0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return J(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = u(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = u(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (b0Var != b0.SMART) {
            return J(iA, iA2, iA3);
        }
        try {
            return J(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return J(iA, iA2, 1).i(new f(9));
        }
    }

    public static ChronoLocalDate I(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (TemporalUnit) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.i(new k(DayOfWeek.of((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return chronoLocalDateB2.i(new k(DayOfWeek.of((int) j3).getValue(), 0));
    }

    public static void o(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* renamed from: y */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
