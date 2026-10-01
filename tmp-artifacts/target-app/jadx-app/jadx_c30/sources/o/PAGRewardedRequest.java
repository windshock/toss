package o;

import java.lang.Throwable;
import o.PAGRewardedRequest;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGRewardedRequest<E extends Throwable> {
    public static final PAGRewardedRequest onWarmupCompleted = new PAGRewardedRequest() { // from class: org.apache.commons.lang3.function.FailableDoubleToIntFunction$$ExternalSyntheticLambda0
        public final int applyAsInt(double d) {
            return PAGRewardedRequest.onExtraCallbackWithResult(d);
        }
    };

    static /* synthetic */ int onExtraCallbackWithResult(double d) {
        return 0;
    }
}
