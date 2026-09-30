package o;

import java.lang.Throwable;
import o.wwx12;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface wwx12<T, U, E extends Throwable> {
    public static final wwx12 IAuthTabCallback = new wwx12() { // from class: org.apache.commons.lang3.function.FailableToIntBiFunction$$ExternalSyntheticLambda0
        public final int applyAsInt(Object obj, Object obj2) {
            return wwx12.onWarmupCompleted(obj, obj2);
        }
    };

    static /* synthetic */ int onWarmupCompleted(Object obj, Object obj2) {
        return 0;
    }
}
