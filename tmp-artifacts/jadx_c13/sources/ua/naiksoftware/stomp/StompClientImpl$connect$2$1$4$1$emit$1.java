package ua.naiksoftware.stomp;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import ua.naiksoftware.stomp.StompClientImpl$connect$2$1$4;
import ua.naiksoftware.stomp.dto.LifecycleEvent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class StompClientImpl$connect$2$1$4$1$emit$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StompClientImpl$connect$2$1$4.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StompClientImpl$connect$2$1$4$1$emit$1(StompClientImpl$connect$2$1$4.AnonymousClass1<? super T> anonymousClass1, access13800<? super StompClientImpl$connect$2$1$4$1$emit$1> access13800Var) {
        super(access13800Var);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((LifecycleEvent) null, (access13800<? super Unit>) this);
    }
}
