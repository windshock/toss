package o;

import java.lang.annotation.Annotation;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RememberLifecycleOwnerKtExternalSyntheticLambda0 {
    boolean IAuthTabCallback(Class<?> cls);

    <A extends Annotation> A onExtraCallbackWithResult(Class<A> cls);

    int onWarmupCompleted();

    boolean onWarmupCompleted(Class<? extends Annotation>[] clsArr);
}
