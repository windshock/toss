package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ok3<E extends Throwable> {
    public static final ok3 onWarmupCompleted = new ok3() { // from class: org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda0
        @Override // o.ok3
        public final void accept(long j) {
        }
    };

    void accept(long j) throws Throwable;

    static /* synthetic */ void onNavigationEvent(ok3 ok3Var, ok3 ok3Var2, long j) throws Throwable {
        ok3Var.accept(j);
        ok3Var2.accept(j);
    }
}
