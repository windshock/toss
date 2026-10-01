package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class v implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ Chronology c;
    public final /* synthetic */ ZoneId d;

    public v(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = chronology;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.h(temporalField);
        }
        return this.b.h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.n k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.k(temporalField);
        }
        return this.b.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.j(temporalField);
        }
        return this.b.j(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.b) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.l.a) {
            return this.d;
        }
        if (temporalQuery == j$.time.temporal.l.c) {
            return this.b.d(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        Chronology chronology = this.c;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
