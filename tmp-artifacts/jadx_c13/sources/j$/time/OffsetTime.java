package j$.time;

import j$.time.format.DateTimeFormatter;
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
public final class OffsetTime implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetTime offsetTime) {
        OffsetTime offsetTime2 = offsetTime;
        if (this.b.equals(offsetTime2.b)) {
            return this.a.compareTo(offsetTime2.a);
        }
        int iCompare = Long.compare(C(), offsetTime2.C());
        return iCompare == 0 ? this.a.compareTo(offsetTime2.a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new OffsetTime(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new OffsetTime(localTime2, zoneOffset2);
    }

    public static OffsetTime o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetTime) {
            return (OffsetTime) temporalAccessor;
        }
        try {
            return new OffsetTime(LocalTime.w(temporalAccessor), ZoneOffset.from(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static OffsetTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.h;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetTime) dateTimeFormatter.parse(charSequence, new f(5));
    }

    public OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final OffsetTime I(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).R() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                return this.a.k(temporalField);
            }
            return ((ChronoField) temporalField).b;
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(temporalField);
        }
        return temporalField.I(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (OffsetTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                ChronoField chronoField = (ChronoField) temporalField;
                return I(this.a, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
            }
            return I(this.a.a(j, temporalField), this.b);
        }
        return (OffsetTime) temporalField.O(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final OffsetTime b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return I(this.a.b(j, temporalUnit), this.b);
        }
        return (OffsetTime) temporalUnit.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(LongCompanionObject.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.d || temporalQuery == l.e) {
            return this.b;
        }
        if (((temporalQuery == l.a) || (temporalQuery == l.b)) || temporalQuery == l.f) {
            return null;
        }
        if (temporalQuery == l.g) {
            return this.a;
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.a.toNanoOfDay(), ChronoField.NANO_OF_DAY).a(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetTime offsetTimeO = o(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jC = offsetTimeO.C() - C();
            switch (o.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jC;
                case 2:
                    return jC / 1000;
                case 3:
                    return jC / 1000000;
                case 4:
                    return jC / 1000000000;
                case 5:
                    return jC / 60000000000L;
                case 6:
                    return jC / 3600000000000L;
                case 7:
                    return jC / 43200000000000L;
                default:
                    throw new m("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, offsetTimeO);
    }

    public final long C() {
        return this.a.toNanoOfDay() - (this.b.getTotalSeconds() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.a.equals(offsetTime.a) && this.b.equals(offsetTime.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
