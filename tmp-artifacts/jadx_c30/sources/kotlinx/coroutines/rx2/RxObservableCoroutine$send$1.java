package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxObservableCoroutine$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RxObservableCoroutine<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxObservableCoroutine$send$1(RxObservableCoroutine<T> rxObservableCoroutine, access13800<? super RxObservableCoroutine$send$1> access13800Var) {
        super(access13800Var);
        this.this$0 = rxObservableCoroutine;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onExtraCallback((RxObservableCoroutine<T>) null, (access13800<? super Unit>) this);
    }
}
