package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o.jni_YGConfigGetErrataJNI;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGConfigGetErrataJNI {
    private static final Function2<Throwable, CoroutineContext, Unit> onExtraCallbackWithResult = new Function2() { // from class: kotlinx.coroutines.reactive.PublishKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return jni_YGConfigGetErrataJNI.onNavigationEvent((Throwable) obj, (CoroutineContext) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(findResAndMsg findresandmsg, CoroutineContext coroutineContext, Function2 function2, Function2 function22, ycxExternalSyntheticLambda0 ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 == null) {
            throw new NullPointerException("Subscriber cannot be null");
        }
        jni_YGConfigSetLoggerJNI jni_ygconfigsetloggerjni = new jni_YGConfigSetLoggerJNI(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), ycxexternalsyntheticlambda0, function2);
        ycxexternalsyntheticlambda0.onExtraCallback(jni_ygconfigsetloggerjni);
        jni_ygconfigsetloggerjni.onExtraCallback(setRandomHost.DEFAULT, jni_ygconfigsetloggerjni, function22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            inst.onNavigationEvent(coroutineContext, th);
        }
        return Unit.INSTANCE;
    }
}
