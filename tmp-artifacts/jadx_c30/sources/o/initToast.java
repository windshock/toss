package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface initToast<E extends Throwable> {
    public static final initToast onExtraCallback = new initToast() { // from class: org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda1
        @Override // o.initToast
        public final void accept(int i) {
        }
    };

    void accept(int i) throws Throwable;

    static /* synthetic */ void onNavigationEvent(initToast inittoast, initToast inittoast2, int i) throws Throwable {
        inittoast.accept(i);
        inittoast2.accept(i);
    }
}
