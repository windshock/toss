package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TemporalAccessor {
    boolean h(TemporalField temporalField);

    long j(TemporalField temporalField);

    default n k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.w(this);
        }
        if (h(temporalField)) {
            return ((ChronoField) temporalField).b;
        }
        throw new m(j$.time.b.a("Unsupported field: ", temporalField));
    }

    default int g(TemporalField temporalField) {
        n nVarK = k(temporalField);
        if (!nVarK.d()) {
            throw new m("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j = j(temporalField);
        if (nVarK.e(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + nVarK + "): " + j);
    }

    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.a || temporalQuery == l.b || temporalQuery == l.c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
