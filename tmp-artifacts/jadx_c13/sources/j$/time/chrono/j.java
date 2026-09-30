package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.l;
import j$.time.temporal.m;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface j extends TemporalAccessor, TemporalAdjuster {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        return super.g(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new m(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == l.c) {
            return ChronoUnit.ERAS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal f(Temporal temporal) {
        return temporal.a(getValue(), ChronoField.ERA);
    }
}
