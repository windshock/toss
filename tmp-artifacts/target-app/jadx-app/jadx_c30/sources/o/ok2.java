package o;

import java.lang.Throwable;
import o.ok2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ok2<E extends Throwable> {
    public static final ok2 onExtraCallbackWithResult = new ok2() { // from class: org.apache.commons.lang3.function.FailableIntUnaryOperator$$ExternalSyntheticLambda0
        @Override // o.ok2
        public final int applyAsInt(int i) {
            return ok2.IAuthTabCallback(i);
        }
    };

    static /* synthetic */ int IAuthTabCallback(int i) {
        return 0;
    }

    static /* synthetic */ int onWarmupCompleted(int i) {
        return i;
    }

    int applyAsInt(int i) throws Throwable;
}
