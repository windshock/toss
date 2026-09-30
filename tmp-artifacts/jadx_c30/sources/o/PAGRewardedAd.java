package o;

import java.lang.Throwable;
import o.PAGRewardedAd;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PAGRewardedAd<T, U, R, E extends Throwable> {
    public static final PAGRewardedAd onNavigationEvent = new PAGRewardedAd() { // from class: org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda0
        @Override // o.PAGRewardedAd
        public final Object apply(Object obj, Object obj2) {
            return PAGRewardedAd.onExtraCallback(obj, obj2);
        }
    };

    static /* synthetic */ Object onExtraCallback(Object obj, Object obj2) {
        return null;
    }

    R apply(T t, U u) throws Throwable;
}
