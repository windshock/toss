package kr.go.korail.railpluscardsdk.data.service;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kr.go.korail.railpluscardsdk.data.model.dto.result.RefundResult;
import o.access13800;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundService$doProcess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefundService$doProcess$1(RefundService refundService, access13800<? super RefundService$doProcess$1> access13800Var) {
        super(access13800Var);
        this.this$0 = refundService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onExtraCallback((access13800<? super RefundResult>) this);
    }
}
