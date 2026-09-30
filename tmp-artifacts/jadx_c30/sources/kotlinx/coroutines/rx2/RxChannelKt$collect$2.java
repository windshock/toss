package kotlinx.coroutines.rx2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RxChannelKt$collect$2<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    RxChannelKt$collect$2(access13800<? super RxChannelKt$collect$2> access13800Var) {
        super(access13800Var);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RxChannelKt.onWarmupCompleted(null, null, this);
    }
}
