package o;

import java.lang.Throwable;
import o.PAGRewardedAdInteractionCallback;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGRewardedAdInteractionCallback<T, U, E extends Throwable> {
    public static final PAGRewardedAdInteractionCallback onWarmupCompleted = new PAGRewardedAdInteractionCallback() { // from class: org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda3
        @Override // o.PAGRewardedAdInteractionCallback
        public final boolean test(Object obj, Object obj2) {
            return PAGRewardedAdInteractionCallback.onExtraCallback(obj, obj2);
        }
    };
    public static final PAGRewardedAdInteractionCallback onNavigationEvent = new PAGRewardedAdInteractionCallback() { // from class: org.apache.commons.lang3.function.FailableBiPredicate$$ExternalSyntheticLambda4
        @Override // o.PAGRewardedAdInteractionCallback
        public final boolean test(Object obj, Object obj2) {
            return PAGRewardedAdInteractionCallback.IAuthTabCallback(obj, obj2);
        }
    };

    static /* synthetic */ boolean IAuthTabCallback(Object obj, Object obj2) {
        return true;
    }

    static /* synthetic */ boolean onExtraCallback(Object obj, Object obj2) {
        return false;
    }

    boolean test(T t, U u) throws Throwable;

    static /* synthetic */ boolean onExtraCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback2, Object obj, Object obj2) {
        return pAGRewardedAdInteractionCallback.test(obj, obj2) && pAGRewardedAdInteractionCallback2.test(obj, obj2);
    }

    static /* synthetic */ boolean onWarmupCompleted(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, Object obj, Object obj2) {
        return !pAGRewardedAdInteractionCallback.test(obj, obj2);
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback2, Object obj, Object obj2) {
        return pAGRewardedAdInteractionCallback.test(obj, obj2) || pAGRewardedAdInteractionCallback2.test(obj, obj2);
    }
}
