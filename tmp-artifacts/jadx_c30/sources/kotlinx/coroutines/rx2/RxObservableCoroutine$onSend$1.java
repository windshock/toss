package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.getBacktraceNote;
import o.jni_YGNodeStyleGetBorderJNI;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final /* synthetic */ class RxObservableCoroutine$onSend$1 extends FunctionReferenceImpl implements getBacktraceNote<RxObservableCoroutine<?>, jni_YGNodeStyleGetBorderJNI<?>, Object, Unit> {
    public static final RxObservableCoroutine$onSend$1 onWarmupCompleted = new RxObservableCoroutine$onSend$1();

    RxObservableCoroutine$onSend$1() {
        super(3, RxObservableCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        onNavigationEvent((RxObservableCoroutine) obj, (jni_YGNodeStyleGetBorderJNI) obj2, obj3);
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(RxObservableCoroutine<?> rxObservableCoroutine, jni_YGNodeStyleGetBorderJNI<?> jni_ygnodestylegetborderjni, Object obj) {
        rxObservableCoroutine.IAuthTabCallback(jni_ygnodestylegetborderjni, obj);
    }
}
