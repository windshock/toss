package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class w {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.e;
        ZoneId zoneId = dateTimeFormatter.f;
        if (chronology != null || zoneId != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.d(j$.time.temporal.l.b);
            ZoneId zoneId2 = (ZoneId) temporalAccessor.d(j$.time.temporal.l.a);
            ChronoLocalDate chronoLocalDateD = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            zoneId = Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (chronology != null || zoneId != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (chronology != null) {
                        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                            chronoLocalDateD = chronology3.D(temporalAccessor);
                        } else if (chronology != j$.time.chrono.p.d || chronology2 != null) {
                            for (ChronoField chronoField : ChronoField.values()) {
                                if (chronoField.isDateBased() && temporalAccessor.h(chronoField)) {
                                    throw new DateTimeException("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new v(chronoLocalDateD, temporalAccessor, chronology3, zoneId2);
                } else if (temporalAccessor.h(ChronoField.INSTANT_SECONDS)) {
                    j$.time.chrono.p pVar = j$.time.chrono.p.d;
                    if (chronology3 == null) {
                        Objects.requireNonNull(pVar, "defaultObj");
                        chronology3 = pVar;
                    }
                    temporalAccessor = chronology3.M(Instant.from(temporalAccessor), zoneId);
                } else {
                    if (zoneId.normalized() instanceof ZoneOffset) {
                        ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                        if (temporalAccessor.h(chronoField2) && temporalAccessor.g(chronoField2) != zoneId.getRules().getOffset(Instant.c).getTotalSeconds()) {
                            throw new DateTimeException("Unable to apply override zone '" + zoneId + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (chronology != null) {
                    }
                    temporalAccessor = new v(chronoLocalDateD, temporalAccessor, chronology3, zoneId2);
                }
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.a;
        Object objD = temporalAccessor.d(temporalQuery);
        if (objD != null || this.c != 0) {
            return objD;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.h(temporalField)) {
            return Long.valueOf(temporalAccessor.j(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
