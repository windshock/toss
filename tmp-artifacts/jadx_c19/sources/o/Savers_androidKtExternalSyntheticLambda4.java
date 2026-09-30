package o;

import java.util.Queue;
import o.TextInclusionStrategyCompanionExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class Savers_androidKtExternalSyntheticLambda4<T extends TextInclusionStrategyCompanionExternalSyntheticLambda1> {
    private final Queue<T> onExtraCallback = applyConstraintsFromLayoutParams.onWarmupCompleted(20);

    abstract T onExtraCallback();

    Savers_androidKtExternalSyntheticLambda4() {
    }

    T onExtraCallbackWithResult() {
        T tPoll = this.onExtraCallback.poll();
        return tPoll == null ? (T) onExtraCallback() : tPoll;
    }

    public void IAuthTabCallback(T t) {
        if (this.onExtraCallback.size() < 20) {
            this.onExtraCallback.offer(t);
        }
    }
}
