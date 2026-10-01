package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class u extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient v b;
    public final transient int c;

    public final ChronoLocalDateTime E(LocalTime localTime) {
        return new e(this, localTime);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public u(LocalDate localDate) throws DateTimeException {
        if (localDate.isBefore(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        v vVarM = v.m(localDate);
        this.b = vVarM;
        this.c = (localDate.getYear() - vVarM.b.getYear()) + 1;
        this.a = localDate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public u(v vVar, int i, LocalDate localDate) throws DateTimeException {
        if (localDate.isBefore(d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = vVar;
        this.c = i;
        this.a = localDate;
    }

    public final Chronology getChronology() {
        return s.d;
    }

    public final int hashCode() {
        s.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    public final j H() {
        return this.b;
    }

    public final int N() {
        int iN;
        v vVarN = this.b.n();
        if (vVarN != null && vVarN.b.getYear() == this.a.getYear()) {
            iN = vVarN.b.getDayOfYear() - 1;
        } else {
            iN = this.a.N();
        }
        return this.c == 1 ? iN - (this.b.b.getDayOfYear() - 1) : iN;
    }

    public final boolean h(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.o(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.temporal.m */
    public final j$.time.temporal.n k(TemporalField temporalField) throws j$.time.temporal.m {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.w(this);
        }
        if (!h(temporalField)) {
            throw new j$.time.temporal.m(b.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = t.a[chronoField.ordinal()];
        if (i == 1) {
            return j$.time.temporal.n.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.n.f(1L, N());
        }
        if (i != 3) {
            return s.d.u(chronoField);
        }
        int year = this.b.b.getYear();
        return this.b.n() != null ? j$.time.temporal.n.f(1L, (r0.b.getYear() - year) + 1) : j$.time.temporal.n.f(1L, 999999999 - year);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.temporal.m */
    public final long j(TemporalField temporalField) throws j$.time.temporal.m {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        switch (t.a[((ChronoField) temporalField).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.getDayOfYear() - this.b.b.getDayOfYear()) + 1 : this.a.getDayOfYear();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.m(b.a("Unsupported field: ", temporalField));
            case 8:
                return this.b.a;
            default:
                return this.a.j(temporalField);
        }
    }

    /* renamed from: R, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final u m6a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j) {
                return this;
            }
            int[] iArr = t.a;
            int i = iArr[chronoField.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                s sVar = s.d;
                int iA = sVar.u(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 3) {
                    return T(this.a.X(sVar.z(this.b, iA)));
                }
                if (i2 == 8) {
                    return T(this.a.X(sVar.z(v.o(iA), this.c)));
                }
                if (i2 == 9) {
                    return T(this.a.X(iA));
                }
            }
            return T(this.a.W(j, temporalField));
        }
        return super.a(j, temporalField);
    }

    public final u S(j$.time.f fVar) {
        return super.i(fVar);
    }

    public final Temporal e(LocalDate localDate) {
        return super.i(localDate);
    }

    public final ChronoLocalDate i(TemporalAdjuster temporalAdjuster) {
        return super.i(temporalAdjuster);
    }

    public final ChronoLocalDate K(TemporalAmount temporalAmount) {
        return super.K(temporalAmount);
    }

    public final ChronoLocalDate O(long j) {
        return T(this.a.plusYears(j));
    }

    public final ChronoLocalDate I(long j) {
        return T(this.a.plusMonths(j));
    }

    public final ChronoLocalDate C(long j) {
        return T(this.a.plusDays(j));
    }

    public final u Q(long j, ChronoUnit chronoUnit) {
        return super.b(j, chronoUnit);
    }

    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    /* renamed from: b, reason: collision with other method in class */
    public final Temporal m7b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    /* renamed from: c, reason: collision with other method in class */
    public final Temporal m8c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    public final u T(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new u(localDate);
    }

    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.a.equals(((u) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 4, this);
    }
}
