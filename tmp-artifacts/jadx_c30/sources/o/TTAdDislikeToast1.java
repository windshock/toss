package o;

import java.lang.Throwable;
import o.TTAdDislikeToast1;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface TTAdDislikeToast1<E extends Throwable> {
    public static final TTAdDislikeToast1 IAuthTabCallback = new TTAdDislikeToast1() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda1
        @Override // o.TTAdDislikeToast1
        public final boolean test(int i) {
            return TTAdDislikeToast1.onExtraCallbackWithResult(i);
        }
    };
    public static final TTAdDislikeToast1 onWarmupCompleted = new TTAdDislikeToast1() { // from class: org.apache.commons.lang3.function.FailableIntPredicate$$ExternalSyntheticLambda2
        @Override // o.TTAdDislikeToast1
        public final boolean test(int i) {
            return TTAdDislikeToast1.IAuthTabCallback(i);
        }
    };

    static /* synthetic */ boolean IAuthTabCallback(int i) {
        return true;
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(int i) {
        return false;
    }

    boolean test(int i) throws Throwable;

    static /* synthetic */ boolean onExtraCallback(TTAdDislikeToast1 tTAdDislikeToast1, TTAdDislikeToast1 tTAdDislikeToast12, int i) {
        return tTAdDislikeToast1.test(i) && tTAdDislikeToast12.test(i);
    }

    static /* synthetic */ boolean IAuthTabCallback(TTAdDislikeToast1 tTAdDislikeToast1, int i) {
        return !tTAdDislikeToast1.test(i);
    }

    static /* synthetic */ boolean onNavigationEvent(TTAdDislikeToast1 tTAdDislikeToast1, TTAdDislikeToast1 tTAdDislikeToast12, int i) {
        return tTAdDislikeToast1.test(i) || tTAdDislikeToast12.test(i);
    }
}
