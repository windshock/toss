package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.p;
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
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            iCompare = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.a.toEpochSecond(this.b), offsetDateTime2.a.toEpochSecond(offsetDateTime2.b));
            if (iCompare == 0) {
                iCompare = toLocalTime().getNano() - offsetDateTime2.toLocalTime().getNano();
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime now() {
        a aVarC = Clock.c();
        Instant instant = aVarC.instant();
        return w(instant, aVarC.a.getRules().getOffset(instant));
    }

    public static OffsetDateTime w(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.C(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    public static OffsetDateTime o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset zoneOffsetFrom = ZoneOffset.from(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.d(l.f);
            LocalTime localTime = (LocalTime) temporalAccessor.d(l.g);
            if (localDate != null && localTime != null) {
                return new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffsetFrom);
            }
            return w(Instant.from(temporalAccessor), zoneOffsetFrom);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static OffsetDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.parse(charSequence, new f(4));
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public final OffsetDateTime I(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return this.a.k(temporalField);
            }
            return ((ChronoField) temporalField).b;
        }
        return temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = n.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new m("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.g(temporalField);
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = n.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return this.a.toEpochSecond(this.b);
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(temporalField);
        }
        return temporalField.I(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public int getYear() {
        return this.a.getYear();
    }

    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal i(LocalDate localDate) {
        if (localDate != null) {
            return I(this.a.i(localDate), this.b);
        }
        return (OffsetDateTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = n.a[chronoField.ordinal()];
            if (i == 1) {
                return w(Instant.ofEpochSecond(j, this.a.getNano()), this.b);
            }
            if (i == 2) {
                return I(this.a, ZoneOffset.ofTotalSeconds(chronoField.b.a(j, chronoField)));
            }
            return I(this.a.a(j, temporalField), this.b);
        }
        return (OffsetDateTime) temporalField.O(this, j);
    }

    public OffsetDateTime withMinute(int i) {
        LocalDateTime localDateTime = this.a;
        LocalTime localTimeO = localDateTime.b;
        if (localTimeO.b != i) {
            ChronoField.MINUTE_OF_HOUR.Q(i);
            localTimeO = LocalTime.o(localTimeO.a, i, localTimeO.c, localTimeO.d);
        }
        return I(localDateTime.V(localDateTime.a, localTimeO), this.b);
    }

    public OffsetDateTime withSecond(int i) {
        return I(this.a.withSecond(i), this.b);
    }

    public OffsetDateTime withNano(int i) {
        return I(this.a.withNano(i), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime b(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return I(this.a.b(j, temporalUnit), this.b);
        }
        return (OffsetDateTime) temporalUnit.o(this, j);
    }

    public OffsetDateTime plusHours(long j) {
        return I(this.a.Q(j), this.b);
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
        if (temporalQuery == l.a) {
            return null;
        }
        if (temporalQuery == l.f) {
            return this.a.toLocalDate();
        }
        if (temporalQuery == l.g) {
            return toLocalTime();
        }
        if (temporalQuery == l.b) {
            return p.d;
        }
        if (temporalQuery == l.c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.a.toLocalDate().toEpochDay(), ChronoField.EPOCH_DAY).a(toLocalTime().toNanoOfDay(), ChronoField.NANO_OF_DAY).a(this.b.getTotalSeconds(), ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTimeO = o(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.b;
            if (!zoneOffset.equals(offsetDateTimeO.b)) {
                offsetDateTimeO = new OffsetDateTime(offsetDateTimeO.a.S(zoneOffset.getTotalSeconds() - offsetDateTimeO.b.getTotalSeconds()), zoneOffset);
            }
            return this.a.until(offsetDateTimeO.a, temporalUnit);
        }
        return temporalUnit.between(this, offsetDateTimeO);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public Instant toInstant() {
        return this.a.toInstant(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
