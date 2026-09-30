package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final /* synthetic */ class RxFlowableKt$RX_HANDLER$1 extends FunctionReferenceImpl implements Function2<Throwable, CoroutineContext, Unit> {
    public static final RxFlowableKt$RX_HANDLER$1 onExtraCallbackWithResult = new RxFlowableKt$RX_HANDLER$1();

    RxFlowableKt$RX_HANDLER$1() {
        super(2, RxCancellableKt.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
    }

    public final void IAuthTabCallback(Throwable th, CoroutineContext coroutineContext) {
        RxCancellableKt.onNavigationEvent(th, coroutineContext);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        IAuthTabCallback((Throwable) obj, (CoroutineContext) obj2);
        return Unit.INSTANCE;
    }
}
