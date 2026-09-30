package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.zone.ZoneRules;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient e a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public static i w(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeW = LocalDateTime.w(eVar);
        List listE = rules.e(localDateTimeW);
        if (listE.size() == 1) {
            zoneOffset = (ZoneOffset) listE.get(0);
        } else if (listE.size() != 0) {
            if (zoneOffset == null || !listE.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listE.get(0);
            }
        } else {
            Object objD = rules.d(localDateTimeW);
            j$.time.zone.b bVar = objD instanceof j$.time.zone.b ? (j$.time.zone.b) objD : null;
            eVar = eVar.C(eVar.a, 0L, 0L, Duration.ofSeconds(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()).getSeconds(), 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    public static i C(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new i(zoneId, offset, (e) chronology.G(LocalDateTime.C(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    public static i o(Chronology chronology, Temporal temporal) {
        i iVar = (i) temporal;
        if (chronology.equals(iVar.getChronology())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.getId() + ", actual: " + iVar.getChronology().getId());
    }

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "dateTime");
        this.a = eVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.toString();
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime A(ZoneId zoneId) {
        return w(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime l(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return C(getChronology(), this.a.toInstant(this.b), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = h.a[chronoField.ordinal()];
            if (i == 1) {
                return b(j - toEpochSecond(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i == 2) {
                return C(getChronology(), this.a.toInstant(ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField))), this.c);
            }
            return w(this.c, this.b, this.a.a(j, temporalField));
        }
        return o(getChronology(), temporalField.O(this, j));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return i(this.a.b(j, temporalUnit));
        }
        return o(getChronology(), temporalUnit.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeR = getChronology().r(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.until(chronoZonedDateTimeR.l(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeR);
    }

    private Object writeReplace() {
        return new b0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
