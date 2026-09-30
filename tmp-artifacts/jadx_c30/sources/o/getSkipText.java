package o;

import java.lang.Throwable;
import o.getSkipText;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface getSkipText<E extends Throwable> {
    public static final getSkipText onWarmupCompleted = new getSkipText() { // from class: org.apache.commons.lang3.function.FailableDoubleUnaryOperator$$ExternalSyntheticLambda1
        @Override // o.getSkipText
        public final double applyAsDouble(double d) {
            return getSkipText.onWarmupCompleted(d);
        }
    };

    static /* synthetic */ double IAuthTabCallback(double d) {
        return d;
    }

    static /* synthetic */ double onWarmupCompleted(double d) {
        return 0.0d;
    }

    double applyAsDouble(double d) throws Throwable;
}
