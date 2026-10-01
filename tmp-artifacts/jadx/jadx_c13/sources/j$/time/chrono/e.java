package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public static e o(Chronology chronology, Temporal temporal) {
        e eVar = (e) temporal;
        if (chronology.equals(eVar.getChronology())) {
            return eVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + eVar.getChronology().getId());
    }

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    public final e O(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == localTime) ? this : new e(c.o(chronoLocalDate.getChronology(), temporal), localTime);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate toLocalDate() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.o(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.R();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (((ChronoField) temporalField).R() ? this.b : this.a).k(temporalField);
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.b.g(temporalField) : this.a.g(temporalField);
        }
        return k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).R() ? this.b.j(temporalField) : this.a.j(temporalField);
        }
        return temporalField.I(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final e i(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return O((ChronoLocalDate) temporalAdjuster, this.b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return O(this.a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof e) {
            return o(this.a.getChronology(), (e) temporalAdjuster);
        }
        return o(this.a.getChronology(), (e) temporalAdjuster.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final e a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).R()) {
                return O(this.a, this.b.a(j, temporalField));
            }
            return O(this.a.a(j, temporalField), this.b);
        }
        return o(this.a.getChronology(), temporalField.O(this, j));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final e b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return o(this.a.getChronology(), temporalUnit.o(this, j));
        }
        switch (d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return C(this.a, 0L, 0L, 0L, j);
            case 2:
                e eVarO = O(this.a.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarO.C(eVarO.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e eVarO2 = O(this.a.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarO2.C(eVarO2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return C(this.a, 0L, 0L, j, 0L);
            case 5:
                return C(this.a, 0L, j, 0L, 0L);
            case 6:
                return C(this.a, j, 0L, 0L, 0L);
            case 7:
                e eVarO3 = O(this.a.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarO3.C(eVarO3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return O(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final e C(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return O(chronoLocalDate, this.b);
        }
        long j5 = j4 / 86400000000000L;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long nanoOfDay = this.b.toNanoOfDay();
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + nanoOfDay;
        long jFloorDiv = Math.floorDiv(j9, 86400000000000L);
        long jFloorMod = Math.floorMod(j9, 86400000000000L);
        return O(chronoLocalDate.b(jFloorDiv + j8 + j7 + j6 + j5, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == nanoOfDay ? this.b : LocalTime.ofNanoOfDay(jFloorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime B(ZoneId zoneId) {
        return i.w(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        int i;
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeG = getChronology().G(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeG);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            ChronoLocalDate localDate = chronoLocalDateTimeG.toLocalDate();
            if (chronoLocalDateTimeG.toLocalTime().compareTo(this.b) < 0) {
                localDate = localDate.c(1L, (TemporalUnit) chronoUnit2);
            }
            return this.a.until(localDate, temporalUnit);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long j = chronoLocalDateTimeG.j(chronoField) - this.a.j(chronoField);
        switch (d.a[chronoUnit.ordinal()]) {
            case 1:
                j = Math.multiplyExact(j, 86400000000000L);
                break;
            case 2:
                j = Math.multiplyExact(j, 86400000000L);
                break;
            case 3:
                j = Math.multiplyExact(j, 86400000L);
                break;
            case 4:
                i = 86400;
                j = Math.multiplyExact(j, i);
                break;
            case 5:
                i = 1440;
                j = Math.multiplyExact(j, i);
                break;
            case 6:
                i = 24;
                j = Math.multiplyExact(j, i);
                break;
            case 7:
                i = 2;
                j = Math.multiplyExact(j, i);
                break;
        }
        return Math.addExact(j, this.b.until(chronoLocalDateTimeG.toLocalTime(), temporalUnit));
    }

    private Object writeReplace() {
        return new b0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }
}
