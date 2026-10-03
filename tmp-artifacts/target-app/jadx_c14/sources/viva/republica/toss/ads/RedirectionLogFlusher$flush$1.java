package viva.republica.toss.ads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RedirectionLogFlusher$flush$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RedirectionLogFlusher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedirectionLogFlusher$flush$1(RedirectionLogFlusher redirectionLogFlusher, access13800<? super RedirectionLogFlusher$flush$1> access13800Var) {
        super(access13800Var);
        this.this$0 = redirectionLogFlusher;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onWarmupCompleted(this);
    }
}
