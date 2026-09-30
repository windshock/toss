package o;

import java.lang.Throwable;
import o.thx4;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface thx4<E extends Throwable> {
    public static final thx4 IAuthTabCallback = new thx4() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda3
        @Override // o.thx4
        public final boolean test(long j) {
            return thx4.onExtraCallback(j);
        }
    };
    public static final thx4 onWarmupCompleted = new thx4() { // from class: org.apache.commons.lang3.function.FailableLongPredicate$$ExternalSyntheticLambda4
        @Override // o.thx4
        public final boolean test(long j) {
            return thx4.onExtraCallbackWithResult(j);
        }
    };

    static /* synthetic */ boolean onExtraCallback(long j) {
        return false;
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(long j) {
        return true;
    }

    boolean test(long j) throws Throwable;

    static /* synthetic */ boolean onExtraCallback(thx4 thx4Var, thx4 thx4Var2, long j) {
        return thx4Var.test(j) && thx4Var2.test(j);
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(thx4 thx4Var, long j) {
        return !thx4Var.test(j);
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(thx4 thx4Var, thx4 thx4Var2, long j) {
        return thx4Var.test(j) || thx4Var2.test(j);
    }
}
