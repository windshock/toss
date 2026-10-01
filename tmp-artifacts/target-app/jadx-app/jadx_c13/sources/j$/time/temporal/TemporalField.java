package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TemporalField {
    default TemporalAccessor C(Map map, a0 a0Var, b0 b0Var) {
        return null;
    }

    long I(TemporalAccessor temporalAccessor);

    Temporal O(Temporal temporal, long j);

    boolean isDateBased();

    boolean o(TemporalAccessor temporalAccessor);

    n range();

    n w(TemporalAccessor temporalAccessor);
}
