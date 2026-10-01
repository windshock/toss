package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class f0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public final ChronoLocalDateTime E(LocalTime localTime) {
        return new e(this, localTime);
    }

    public f0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    public final Chronology getChronology() {
        return d0.d;
    }

    public final int hashCode() {
        d0.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    public final j H() {
        return Q() >= 1 ? g0.BE : g0.BEFORE_BE;
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
        int i = e0.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(temporalField);
        }
        if (i != 4) {
            return d0.d.u(chronoField);
        }
        j$.time.temporal.n nVar = ChronoField.YEAR.b;
        return j$.time.temporal.n.f(1L, Q() <= 0 ? (-(nVar.a + 543)) + 1 : 543 + nVar.d);
    }

    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = e0.a[((ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int iQ = Q();
                if (iQ < 1) {
                    iQ = 1 - iQ;
                }
                return iQ;
            }
            if (i == 5) {
                return ((Q() * 12) + this.a.getMonthValue()) - 1;
            }
            if (i == 6) {
                return Q();
            }
            if (i != 7) {
                return this.a.j(temporalField);
            }
            return Q() < 1 ? 0 : 1;
        }
        return temporalField.I(this);
    }

    public final int Q() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: R, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f0 m0a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j) {
                return this;
            }
            int[] iArr = e0.a;
            int i = iArr[chronoField.ordinal()];
            if (i == 4) {
                int iA = d0.d.u(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 4) {
                    LocalDate localDate = this.a;
                    if (Q() < 1) {
                        iA = 1 - iA;
                    }
                    return S(localDate.X(iA - 543));
                }
                if (i2 == 6) {
                    return S(this.a.X(iA - 543));
                }
                if (i2 == 7) {
                    return S(this.a.X((-542) - Q()));
                }
            } else {
                if (i == 5) {
                    d0.d.u(chronoField).b(j, chronoField);
                    return S(this.a.plusMonths(j - (((Q() * 12) + this.a.getMonthValue()) - 1)));
                }
                if (i == 6 || i == 7) {
                }
            }
            return S(this.a.W(j, temporalField));
        }
        return super.a(j, temporalField);
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
        return S(this.a.plusYears(j));
    }

    public final ChronoLocalDate I(long j) {
        return S(this.a.plusMonths(j));
    }

    public final ChronoLocalDate C(long j) {
        return S(this.a.plusDays(j));
    }

    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    /* renamed from: b, reason: collision with other method in class */
    public final Temporal m1b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    /* renamed from: c, reason: collision with other method in class */
    public final Temporal m2c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    public final f0 S(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new f0(localDate);
    }

    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.a.equals(((f0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 8, this);
    }
}
