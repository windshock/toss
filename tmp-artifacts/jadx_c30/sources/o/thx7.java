package o;

import java.lang.Throwable;
import o.thx7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface thx7<E extends Throwable> {
    public static final thx7 onNavigationEvent = new thx7() { // from class: org.apache.commons.lang3.function.FailableLongUnaryOperator$$ExternalSyntheticLambda2
        @Override // o.thx7
        public final long applyAsLong(long j) {
            return thx7.IAuthTabCallback(j);
        }
    };

    static /* synthetic */ long IAuthTabCallback(long j) {
        return 0L;
    }

    static /* synthetic */ long onExtraCallbackWithResult(long j) {
        return j;
    }

    long applyAsLong(long j) throws Throwable;
}
