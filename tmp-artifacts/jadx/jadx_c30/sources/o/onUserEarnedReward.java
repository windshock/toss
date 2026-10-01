package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface onUserEarnedReward<T, E extends Throwable> {
    public static final onUserEarnedReward onWarmupCompleted = new onUserEarnedReward() { // from class: org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda0
        @Override // o.onUserEarnedReward
        public final void accept(Object obj) {
        }
    };

    void accept(T t) throws Throwable;

    static /* synthetic */ void onNavigationEvent(onUserEarnedReward onuserearnedreward, onUserEarnedReward onuserearnedreward2, Object obj) throws Throwable {
        onuserearnedreward.accept(obj);
        onuserearnedreward2.accept(obj);
    }
}
