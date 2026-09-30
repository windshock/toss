package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.format.b0;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.l;
import j$.time.temporal.n;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Chronology extends Comparable<Chronology> {
    ChronoLocalDate D(TemporalAccessor temporalAccessor);

    ChronoLocalDate F();

    ChronoLocalDate J(int i, int i2, int i3);

    ChronoLocalDate L(Map map, b0 b0Var);

    boolean P(long j);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    ChronoLocalDate m(long j);

    String q();

    ChronoLocalDate s(int i, int i2);

    String toString();

    n u(ChronoField chronoField);

    List v();

    j x(int i);

    @Override // java.lang.Comparable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    int z(j jVar, int i);

    static Chronology n(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(l.b);
        p pVar = p.d;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(pVar, "defaultObj");
        return pVar;
    }

    static Chronology ofLocale(Locale locale) {
        return a.ofLocale(locale);
    }

    static Chronology of(String str) {
        ConcurrentHashMap concurrentHashMap = a.a;
        Objects.requireNonNull(str, StompHeader.ID);
        do {
            Chronology chronology = (Chronology) a.a.get(str);
            if (chronology == null) {
                chronology = (Chronology) a.b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (a.w());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (str.equals(chronology2.getId()) || str.equals(chronology2.q())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown chronology: ".concat(str));
    }

    default ChronoLocalDateTime G(TemporalAccessor temporalAccessor) {
        try {
            return D(temporalAccessor).E(LocalTime.w(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    default ChronoZonedDateTime r(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdO = ZoneId.o(temporalAccessor);
            try {
                temporalAccessor = M(Instant.from(temporalAccessor), zoneIdO);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return i.w(zoneIdO, null, e.o(this, G(temporalAccessor)));
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    default ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return i.C(this, instant, zoneId);
    }
}
