package o;

import java.lang.Throwable;
import o.TTAdDislikeToast;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface TTAdDislikeToast<R, E extends Throwable> {
    public static final TTAdDislikeToast onExtraCallback = new TTAdDislikeToast() { // from class: org.apache.commons.lang3.function.FailableDoubleFunction$$ExternalSyntheticLambda0
        public final Object apply(double d) {
            return TTAdDislikeToast.onExtraCallback(d);
        }
    };

    static /* synthetic */ Object onExtraCallback(double d) {
        return null;
    }
}
