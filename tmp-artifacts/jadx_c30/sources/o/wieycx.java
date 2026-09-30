package o;

import java.lang.Throwable;
import o.wieycx;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface wieycx<T, E extends Throwable> {
    public static final wieycx onWarmupCompleted = new wieycx() { // from class: org.apache.commons.lang3.function.FailableToDoubleFunction$$ExternalSyntheticLambda0
        public final double applyAsDouble(Object obj) {
            return wieycx.onExtraCallback(obj);
        }
    };

    static /* synthetic */ double onExtraCallback(Object obj) {
        return 0.0d;
    }
}
