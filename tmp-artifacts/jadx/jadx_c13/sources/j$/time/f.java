package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.l;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class f implements TemporalQuery, TemporalAdjuster {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal f(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.a(temporal.k(chronoField).d, chronoField);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = this.a;
        f fVar = l.a;
        switch (i) {
            case 0:
                return Instant.from(temporalAccessor);
            case 1:
                return LocalDate.C(temporalAccessor);
            case 2:
                return LocalDateTime.w(temporalAccessor);
            case 3:
                return LocalTime.w(temporalAccessor);
            case 4:
                return OffsetDateTime.o(temporalAccessor);
            case 5:
                return OffsetTime.o(temporalAccessor);
            case 6:
                return YearMonth.from(temporalAccessor);
            case 7:
                return ZonedDateTime.w(temporalAccessor);
            case 8:
                f fVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(fVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 9:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.h(chronoField)) {
                    return LocalTime.ofNanoOfDay(temporalAccessor.j(chronoField));
                }
                return null;
            case 10:
                return (ZoneId) temporalAccessor.d(fVar);
            case 11:
                return (Chronology) temporalAccessor.d(l.b);
            case 12:
                return (TemporalUnit) temporalAccessor.d(l.c);
            case 13:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.h(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.g(chronoField2));
                }
                return null;
            case 14:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(fVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(l.d);
            case 15:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.j(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "ZoneId";
            case 11:
                return "Chronology";
            case 12:
                return "Precision";
            case 13:
                return "ZoneOffset";
            case 14:
                return "Zone";
            case 15:
                return "LocalDate";
            case 16:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
