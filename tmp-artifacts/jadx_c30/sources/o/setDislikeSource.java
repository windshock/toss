package o;

import java.lang.Throwable;
import o.setDislikeSource;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface setDislikeSource<T, U, E extends Throwable> {
    public static final setDislikeSource onExtraCallbackWithResult = new setDislikeSource() { // from class: org.apache.commons.lang3.function.FailableToDoubleBiFunction$$ExternalSyntheticLambda0
        public final double applyAsDouble(Object obj, Object obj2) {
            return setDislikeSource.onWarmupCompleted(obj, obj2);
        }
    };

    static /* synthetic */ double onWarmupCompleted(Object obj, Object obj2) {
        return 0.0d;
    }
}
