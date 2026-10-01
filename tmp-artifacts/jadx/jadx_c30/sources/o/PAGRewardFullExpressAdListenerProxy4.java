package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGRewardFullExpressAdListenerProxy4<T, U, E extends Throwable> {
    public static final PAGRewardFullExpressAdListenerProxy4 onNavigationEvent = new PAGRewardFullExpressAdListenerProxy4() { // from class: org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda0
        @Override // o.PAGRewardFullExpressAdListenerProxy4
        public final void accept(Object obj, Object obj2) {
        }
    };

    void accept(T t, U u) throws Throwable;

    static /* synthetic */ void onWarmupCompleted(PAGRewardFullExpressAdListenerProxy4 pAGRewardFullExpressAdListenerProxy4, PAGRewardFullExpressAdListenerProxy4 pAGRewardFullExpressAdListenerProxy42, Object obj, Object obj2) throws Throwable {
        pAGRewardFullExpressAdListenerProxy4.accept(obj, obj2);
        pAGRewardFullExpressAdListenerProxy42.accept(obj, obj2);
    }
}
