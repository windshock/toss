package o;

import java.lang.Throwable;
import o.thxycx;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface thxycx<T, E extends Throwable> {
    public static final thxycx onExtraCallback = new thxycx() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
        @Override // o.thxycx
        public final boolean test(Object obj) {
            return thxycx.onExtraCallbackWithResult(obj);
        }
    };
    public static final thxycx IAuthTabCallback = new thxycx() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda3
        @Override // o.thxycx
        public final boolean test(Object obj) {
            return thxycx.IAuthTabCallback(obj);
        }
    };

    static /* synthetic */ boolean IAuthTabCallback(Object obj) {
        return true;
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(Object obj) {
        return false;
    }

    boolean test(T t) throws Throwable;

    static /* synthetic */ boolean onExtraCallback(thxycx thxycxVar, thxycx thxycxVar2, Object obj) {
        return thxycxVar.test(obj) && thxycxVar2.test(obj);
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(thxycx thxycxVar, Object obj) {
        return !thxycxVar.test(obj);
    }

    static /* synthetic */ boolean onWarmupCompleted(thxycx thxycxVar, thxycx thxycxVar2, Object obj) {
        return thxycxVar.test(obj) || thxycxVar2.test(obj);
    }
}
