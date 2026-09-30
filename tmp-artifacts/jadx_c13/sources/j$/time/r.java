package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
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
public final class r implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((r) obj).a;
    }

    static {
        new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).toFormatter();
    }

    public static r o(int i) {
        ChronoField.YEAR.Q(i);
        return new r(i);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        r rVarO;
        if (temporal instanceof r) {
            rVarO = (r) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!p.d.equals(Chronology.n(temporal))) {
                    temporal = LocalDate.C(temporal);
                }
                rVarO = o(temporal.g(ChronoField.YEAR));
            } catch (DateTimeException e) {
                throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j = rVarO.a - this.a;
            int i = q.b[((ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                ChronoField chronoField = ChronoField.ERA;
                return rVarO.j(chronoField) - j(chronoField);
            }
            throw new m("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, rVarO);
    }

    public r(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.n.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i = q.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new m(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (r) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final r a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (r) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i = q.a[chronoField.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return o((int) j);
        }
        if (i == 2) {
            return o((int) j);
        }
        if (i == 3) {
            return j(ChronoField.ERA) == j ? this : o(1 - this.a);
        }
        throw new m(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final r b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (r) temporalUnit.o(this, j);
        }
        int i = q.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return C(j);
        }
        if (i == 2) {
            return C(Math.multiplyExact(j, 10));
        }
        if (i == 3) {
            return C(Math.multiplyExact(j, 100));
        }
        if (i == 4) {
            return C(Math.multiplyExact(j, 1000));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return a(Math.addExact(j(chronoField), j), chronoField);
        }
        throw new m("Unsupported unit: " + temporalUnit);
    }

    public final r C(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return o(chronoField.b.a(this.a + j, chronoField));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.b) {
            return p.d;
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.YEARS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        if (!Chronology.n(temporal).equals(p.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(this.a, ChronoField.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new p((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
