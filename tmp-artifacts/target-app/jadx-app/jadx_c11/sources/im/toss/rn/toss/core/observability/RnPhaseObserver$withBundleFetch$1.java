package im.toss.rn.toss.core.observability;

import im.toss.observability.instrumentation.rn.RnCause;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RnPhaseObserver$withBundleFetch$1<T> extends ContinuationImpl {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RnPhaseObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RnPhaseObserver$withBundleFetch$1(RnPhaseObserver rnPhaseObserver, access13800<? super RnPhaseObserver$withBundleFetch$1> access13800Var) {
        super(access13800Var);
        this.this$0 = rnPhaseObserver;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objIAuthTabCallback = this.this$0.IAuthTabCallback((String) null, (String) null, (String) null, (RnCause) null, (Function1) null, (Function1) null, (access13800) this);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return objIAuthTabCallback;
    }
}
