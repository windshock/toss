package o;

import java.lang.Throwable;
import o.getDislikeTip;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface getDislikeTip<E extends Throwable> {
    public static final getDislikeTip onNavigationEvent = new getDislikeTip() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda3
        @Override // o.getDislikeTip
        public final boolean test(double d) {
            return getDislikeTip.IAuthTabCallback(d);
        }
    };
    public static final getDislikeTip onExtraCallbackWithResult = new getDislikeTip() { // from class: org.apache.commons.lang3.function.FailableDoublePredicate$$ExternalSyntheticLambda4
        @Override // o.getDislikeTip
        public final boolean test(double d) {
            return getDislikeTip.onNavigationEvent(d);
        }
    };

    static /* synthetic */ boolean IAuthTabCallback(double d) {
        return false;
    }

    static /* synthetic */ boolean onNavigationEvent(double d) {
        return true;
    }

    boolean test(double d) throws Throwable;

    static /* synthetic */ boolean onWarmupCompleted(getDislikeTip getdisliketip, getDislikeTip getdisliketip2, double d) {
        return getdisliketip.test(d) && getdisliketip2.test(d);
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(getDislikeTip getdisliketip, double d) {
        return !getdisliketip.test(d);
    }

    static /* synthetic */ boolean onExtraCallback(getDislikeTip getdisliketip, getDislikeTip getdisliketip2, double d) {
        return getdisliketip.test(d) || getdisliketip2.test(d);
    }
}
