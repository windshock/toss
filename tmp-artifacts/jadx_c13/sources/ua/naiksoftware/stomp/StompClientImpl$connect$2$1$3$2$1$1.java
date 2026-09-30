package ua.naiksoftware.stomp;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14000;
import ua.naiksoftware.stomp.dto.StompMessage;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class StompClientImpl$connect$2$1$3$2$1$1 extends SuspendLambda implements Function2<StompMessage, access13800<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    StompClientImpl$connect$2$1$3$2$1$1(access13800<? super StompClientImpl$connect$2$1$3$2$1$1> access13800Var) {
        super(2, access13800Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        StompClientImpl$connect$2$1$3$2$1$1 stompClientImpl$connect$2$1$3$2$1$1 = new StompClientImpl$connect$2$1$3$2$1$1(access13800Var);
        stompClientImpl$connect$2$1$3$2$1$1.L$0 = obj;
        return stompClientImpl$connect$2$1$3$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StompMessage stompMessage, access13800<? super Boolean> access13800Var) {
        return ((StompClientImpl$connect$2$1$3$2$1$1) create(stompMessage, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StompMessage stompMessage = (StompMessage) this.L$0;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        return access14000.onNavigationEvent(Intrinsics.areEqual(stompMessage.getStompCommand(), "CONNECTED"));
    }
}
