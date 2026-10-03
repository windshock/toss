package viva.republica.toss.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RedirectionEventLogger$logAppLanding$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    int label;
    final /* synthetic */ RedirectionEventLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedirectionEventLogger$logAppLanding$1(RedirectionEventLogger redirectionEventLogger, access13800<? super RedirectionEventLogger$logAppLanding$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = redirectionEventLogger;
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new RedirectionEventLogger$logAppLanding$1(this.this$0, access13800Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            RedirectionLogFlushScheduler redirectionLogFlushScheduler = this.this$0.IAuthTabCallback;
            this.label = 1;
            if (redirectionLogFlushScheduler.onExtraCallback(this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
