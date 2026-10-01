package o;

import java.lang.Throwable;
import o.getLoadingStyle;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface getLoadingStyle<R, E extends Throwable> {
    public static final getLoadingStyle onWarmupCompleted = new getLoadingStyle() { // from class: org.apache.commons.lang3.function.FailableIntFunction$$ExternalSyntheticLambda0
        public final Object apply(int i) {
            return getLoadingStyle.IAuthTabCallback(i);
        }
    };

    static /* synthetic */ Object IAuthTabCallback(int i) {
        return null;
    }
}
