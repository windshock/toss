package o;

import java.lang.Throwable;
import o.wwx4;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface wwx4<T, U, E extends Throwable> {
    public static final wwx4 onWarmupCompleted = new wwx4() { // from class: org.apache.commons.lang3.function.FailableToLongBiFunction$$ExternalSyntheticLambda0
        public final long applyAsLong(Object obj, Object obj2) {
            return wwx4.onExtraCallback(obj, obj2);
        }
    };

    static /* synthetic */ long onExtraCallback(Object obj, Object obj2) {
        return 0L;
    }
}
