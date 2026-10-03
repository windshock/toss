package viva.republica.toss.ads;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RedirectionLogFlusher$maxRetryCount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RedirectionLogFlusher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedirectionLogFlusher$maxRetryCount$1(RedirectionLogFlusher redirectionLogFlusher, access13800<? super RedirectionLogFlusher$maxRetryCount$1> access13800Var) {
        super(access13800Var);
        this.this$0 = redirectionLogFlusher;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onExtraCallback(this);
    }
}
