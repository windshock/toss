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
public final class z extends c {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public final ChronoLocalDateTime E(LocalTime localTime) {
        return new e(this, localTime);
    }

    public z(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    public final Chronology getChronology() {
        return x.d;
    }

    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    public final j H() {
        return Q() >= 1 ? a0.ROC : a0.BEFORE_ROC;
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
        int i = y.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(temporalField);
        }
        if (i != 4) {
            return x.d.u(chronoField);
        }
        j$.time.temporal.n nVar = ChronoField.YEAR.b;
        return j$.time.temporal.n.f(1L, Q() <= 0 ? (-nVar.a) + 1912 : nVar.d - 1911);
    }

    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = y.a[((ChronoField) temporalField).ordinal()];
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
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: R, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z m9a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (j(chronoField) == j) {
                return this;
            }
            int[] iArr = y.a;
            int i = iArr[chronoField.ordinal()];
            if (i == 4) {
                int iA = x.d.u(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 4) {
                    return S(this.a.X(Q() >= 1 ? iA + 1911 : 1912 - iA));
                }
                if (i2 == 6) {
                    return S(this.a.X(iA + 1911));
                }
                if (i2 == 7) {
                    return S(this.a.X(1912 - Q()));
                }
            } else {
                if (i == 5) {
                    x.d.u(chronoField).b(j, chronoField);
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
    public final Temporal m10b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    /* renamed from: c, reason: collision with other method in class */
    public final Temporal m11c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    public final z S(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new z(localDate);
    }

    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 7, this);
    }
}
