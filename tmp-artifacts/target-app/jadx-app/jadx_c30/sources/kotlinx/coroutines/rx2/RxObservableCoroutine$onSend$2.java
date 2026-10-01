package kotlinx.coroutines.rx2;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final /* synthetic */ class RxObservableCoroutine$onSend$2 extends FunctionReferenceImpl implements getBacktraceNote<RxObservableCoroutine<?>, Object, Object, Object> {
    public static final RxObservableCoroutine$onSend$2 onNavigationEvent = new RxObservableCoroutine$onSend$2();

    RxObservableCoroutine$onSend$2() {
        super(3, RxObservableCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(RxObservableCoroutine<?> rxObservableCoroutine, Object obj, Object obj2) {
        return rxObservableCoroutine.onWarmupCompleted(obj, obj2);
    }
}
