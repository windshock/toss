package j$.time.chrono;

import j$.time.DateTimeException;
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
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class n extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient l a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public final ChronoLocalDateTime E(LocalTime localTime) {
        return new e(this, localTime);
    }

    public n(l lVar, int i, int i2, int i3) {
        lVar.V(i, i2, i3);
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public n(l lVar, long j) throws DateTimeException {
        int i = (int) j;
        lVar.S();
        if (i < lVar.f || i >= lVar.g) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(lVar.e, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.U(iBinarySearch), ((lVar.h + iBinarySearch) % 12) + 1, (i - lVar.e[iBinarySearch]) + 1};
        this.a = lVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    public final Chronology getChronology() {
        return this.a;
    }

    public final j H() {
        return o.AH;
    }

    public final int N() {
        return this.a.Y(this.b, 12);
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
        int i = m.a[chronoField.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.u(chronoField) : j$.time.temporal.n.f(1L, 5L) : j$.time.temporal.n.f(1L, N()) : j$.time.temporal.n.f(1L, this.a.W(this.b, this.c));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.temporal.m */
    public final long j(TemporalField temporalField) throws j$.time.temporal.m {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        switch (m.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return Q();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((Q() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((Q() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.m(b.a("Unsupported field: ", temporalField));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.temporal.m */
    /* renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final n m3a(long j, TemporalField temporalField) throws j$.time.temporal.m {
        if (!(temporalField instanceof ChronoField)) {
            return super.a(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        this.a.u(chronoField).b(j, chronoField);
        int i = (int) j;
        switch (m.a[chronoField.ordinal()]) {
            case 1:
                return T(this.b, this.c, i);
            case 2:
                return C(Math.min(i, N()) - Q());
            case 3:
                return C((j - j(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return C(j - (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1));
            case 5:
                return C(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return C(j - j(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.a, j);
            case 8:
                return C((j - j(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return T(this.b, i, this.d);
            case 10:
                return I(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return T(i, this.c, this.d);
            case 12:
                return T(i, this.c, this.d);
            case 13:
                return T(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.m(b.a("Unsupported field: ", temporalField));
        }
    }

    public final n T(int i, int i2, int i3) {
        int iW = this.a.W(i, i2);
        if (i3 > iW) {
            i3 = iW;
        }
        return new n(this.a, i, i2, i3);
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

    public final long toEpochDay() {
        return this.a.V(this.b, this.c, this.d);
    }

    public final int Q() {
        return this.a.Y(this.b, this.c - 1) + this.d;
    }

    public final boolean t() {
        return this.a.P(this.b);
    }

    public final ChronoLocalDate O(long j) {
        return j == 0 ? this : T(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final n I(long j) throws DateTimeException {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        l lVar = this.a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= lVar.U(0) && jFloorDiv <= lVar.U(lVar.e.length - 1) - 1) {
            return T((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final n C(long j) {
        return new n(this.a, toEpochDay() + j);
    }

    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    /* renamed from: b, reason: collision with other method in class */
    public final Temporal m4b(long j, TemporalUnit temporalUnit) {
        return super.b(j, temporalUnit);
    }

    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    /* renamed from: c, reason: collision with other method in class */
    public final Temporal m5c(long j, TemporalUnit temporalUnit) {
        return super.c(j, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.a.equals(nVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 6, this);
    }
}
