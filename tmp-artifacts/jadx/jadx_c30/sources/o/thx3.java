package o;

import java.lang.Throwable;
import o.thx3;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface thx3<E extends Throwable> {
    public static final thx3 IAuthTabCallback = new thx3() { // from class: org.apache.commons.lang3.function.FailableIntToLongFunction$$ExternalSyntheticLambda0
        public final long applyAsLong(int i) {
            return thx3.onNavigationEvent(i);
        }
    };

    static /* synthetic */ long onNavigationEvent(int i) {
        return 0L;
    }
}
