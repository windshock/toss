package ua.naiksoftware.stomp;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import o.IAnimation;
import o.access13800;
import o.access14000;
import o.access14100;
import o.findResAndMsg;
import o.getByteBuffer;
import o.wasLastName;
import o.ycxycx;
import ua.naiksoftware.stomp.dto.LifecycleEvent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class StompClientImpl$disconnect$2$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super LifecycleEvent>, Object> {
    int label;
    final /* synthetic */ StompClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StompClientImpl$disconnect$2$1$1(StompClientImpl stompClientImpl, access13800<? super StompClientImpl$disconnect$2$1$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = stompClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new StompClientImpl$disconnect$2$1$1(this.this$0, access13800Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super LifecycleEvent> access13800Var) {
        return ((StompClientImpl$disconnect$2$1$1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            wasLastName waslastnameDisconnect = this.this$0.connectionProvider.disconnect();
            Intrinsics.checkNotNullExpressionValue(waslastnameDisconnect, "");
            this.label = 1;
            if (RxAwaitKt.onWarmupCompleted(waslastnameDisconnect, this) != objOnExtraCallback) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        getByteBuffer<LifecycleEvent> getbytebufferLifecycle = this.this$0.connectionProvider.lifecycle();
        Intrinsics.checkNotNullExpressionValue(getbytebufferLifecycle, "");
        IAnimation iAnimationIAuthTabCallback = RxConvertKt.IAuthTabCallback(getbytebufferLifecycle);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.label = 2;
        Object objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(iAnimationIAuthTabCallback, anonymousClass1, this);
        return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
    }

    /* renamed from: ua.naiksoftware.stomp.StompClientImpl$disconnect$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<LifecycleEvent, access13800<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(access13800Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LifecycleEvent lifecycleEvent, access13800<? super Boolean> access13800Var) {
            return ((AnonymousClass1) create(lifecycleEvent, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LifecycleEvent lifecycleEvent = (LifecycleEvent) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return access14000.onNavigationEvent(lifecycleEvent.getType() == LifecycleEvent.Type.CLOSED || lifecycleEvent.getType() == LifecycleEvent.Type.ERROR);
        }
    }
}
