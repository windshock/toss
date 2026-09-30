package j$.time;

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

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochSecond(long j) {
        return o(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return o(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return o(Math.floorDiv(j, j2), ((int) Math.floorMod(j, j2)) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.j(ChronoField.INSTANT_SECONDS), temporalAccessor.g(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.parse(charSequence, new f(0));
    }

    public static Instant o(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.k(temporalField).a(temporalField.I(this), temporalField);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.b.a(this.a, chronoField);
        }
        throw new m(b.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i2 = g.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new m(b.a("Unsupported field: ", temporalField));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.O(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Q(j);
        int i = g.a[chronoField.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return o(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                if (i3 != this.b) {
                    return o(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new m(b.a("Unsupported field: ", temporalField));
                }
                if (j != this.a) {
                    return o(j, this.b);
                }
            }
        } else if (j != this.b) {
            return o(this.a, (int) j);
        }
        return this;
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.o(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return w(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return w(j / 1000, (j % 1000) * 1000000);
            case 4:
                return w(j, 0L);
            case 5:
                return w(Math.multiplyExact(j, 60), 0L);
            case 6:
                return w(Math.multiplyExact(j, 3600), 0L);
            case 7:
                return w(Math.multiplyExact(j, 43200), 0L);
            case 8:
                return w(Math.multiplyExact(j, 86400), 0L);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plusNanos(long j) {
        return w(0L, j);
    }

    public final Instant w(long j, long j2) {
        return (j | j2) == 0 ? this : ofEpochSecond(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.w(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.c) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == l.b || temporalQuery == l.a || temporalQuery == l.e || temporalQuery == l.d || temporalQuery == l.f || temporalQuery == l.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.a, ChronoField.INSTANT_SECONDS).a(this.b, ChronoField.NANO_OF_SECOND);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantFrom);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.a, this.a), 1000000000L), instantFrom.b - this.b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantFrom.a, this.a), 1000000000L), instantFrom.b - this.b) / 1000;
            case 3:
                return Math.subtractExact(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return C(instantFrom);
            case 5:
                return C(instantFrom) / 60;
            case 6:
                return C(instantFrom) / 3600;
            case 7:
                return C(instantFrom) / 43200;
            case 8:
                return C(instantFrom) / 86400;
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public final long C(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.a, this.a);
        long j = instant.b - this.b;
        return (jSubtractExact <= 0 || j >= 0) ? (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.w(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public long toEpochMilli() {
        long j = this.a;
        if (j >= 0 || this.b <= 0) {
            return Math.addExact(Math.multiplyExact(j, 1000), this.b / 1000000);
        }
        return Math.addExact(Math.multiplyExact(j + 1, 1000), (this.b / 1000000) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new p((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
