package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGRewardedAdLoadListener<E extends Throwable> {
    public static final PAGRewardedAdLoadListener onExtraCallbackWithResult = new PAGRewardedAdLoadListener() { // from class: org.apache.commons.lang3.function.FailableDoubleConsumer$$ExternalSyntheticLambda0
        @Override // o.PAGRewardedAdLoadListener
        public final void accept(double d) {
        }
    };

    void accept(double d) throws Throwable;

    static /* synthetic */ void onExtraCallbackWithResult(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAdLoadListener pAGRewardedAdLoadListener2, double d) throws Throwable {
        pAGRewardedAdLoadListener.accept(d);
        pAGRewardedAdLoadListener2.accept(d);
    }
}
