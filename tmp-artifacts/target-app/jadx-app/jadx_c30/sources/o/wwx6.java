package o;

import java.lang.Throwable;
import o.wwx6;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface wwx6<T, E extends Throwable> {
    public static final wwx6 onExtraCallbackWithResult = new wwx6() { // from class: org.apache.commons.lang3.function.FailableToLongFunction$$ExternalSyntheticLambda0
        public final long applyAsLong(Object obj) {
            return wwx6.onNavigationEvent(obj);
        }
    };

    static /* synthetic */ long onNavigationEvent(Object obj) {
        return 0L;
    }
}
