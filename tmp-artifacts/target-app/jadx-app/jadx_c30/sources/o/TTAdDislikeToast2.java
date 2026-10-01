package o;

import java.lang.Throwable;
import o.TTAdDislikeToast2;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface TTAdDislikeToast2<T, R, E extends Throwable> {
    public static final TTAdDislikeToast2 onNavigationEvent = new TTAdDislikeToast2() { // from class: org.apache.commons.lang3.function.FailableFunction$$ExternalSyntheticLambda1
        @Override // o.TTAdDislikeToast2
        public final Object apply(Object obj) {
            return TTAdDislikeToast2.onExtraCallback(obj);
        }
    };

    static /* synthetic */ Object onExtraCallback(Object obj) {
        return null;
    }

    static /* synthetic */ Object onWarmupCompleted(Object obj) {
        return obj;
    }

    R apply(T t) throws Throwable;
}
