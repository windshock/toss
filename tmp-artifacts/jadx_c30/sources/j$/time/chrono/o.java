package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum o implements j {
    AH;

    public final int getValue() {
        return 1;
    }

    public final j$.time.temporal.n k(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return j$.time.temporal.n.f(1L, 1L);
        }
        return super.k(temporalField);
    }
}
