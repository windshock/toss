package o;

import java.lang.Throwable;
import o.setOnlyLoading;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface setOnlyLoading<R, E extends Throwable> {
    public static final setOnlyLoading onExtraCallback = new setOnlyLoading() { // from class: org.apache.commons.lang3.function.FailableLongFunction$$ExternalSyntheticLambda0
        public final Object apply(long j) {
            return setOnlyLoading.onWarmupCompleted(j);
        }
    };

    static /* synthetic */ Object onWarmupCompleted(long j) {
        return null;
    }
}
