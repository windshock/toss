package o;

import java.lang.Throwable;
import o.onResourceUpdated;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface onResourceUpdated<E extends Throwable> {
    public static final onResourceUpdated onNavigationEvent = new onResourceUpdated() { // from class: org.apache.commons.lang3.function.FailableIntToDoubleFunction$$ExternalSyntheticLambda0
        public final double applyAsDouble(int i) {
            return onResourceUpdated.IAuthTabCallback(i);
        }
    };

    static /* synthetic */ double IAuthTabCallback(int i) {
        return 0.0d;
    }
}
