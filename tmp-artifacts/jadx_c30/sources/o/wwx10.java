package o;

import java.lang.Throwable;
import o.wwx10;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface wwx10<T, E extends Throwable> {
    public static final wwx10 IAuthTabCallback = new wwx10() { // from class: org.apache.commons.lang3.function.FailableToIntFunction$$ExternalSyntheticLambda0
        public final int applyAsInt(Object obj) {
            return wwx10.onWarmupCompleted(obj);
        }
    };

    static /* synthetic */ int onWarmupCompleted(Object obj) {
        return 0;
    }
}
