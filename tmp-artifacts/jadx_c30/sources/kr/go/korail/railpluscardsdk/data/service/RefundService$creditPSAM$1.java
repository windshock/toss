package kr.go.korail.railpluscardsdk.data.service;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AdSlotBuilder;
import o.access13800;
import o.setBannerType;
import o.setExpressViewAccepted;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundService$creditPSAM$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefundService$creditPSAM$1(RefundService refundService, access13800<? super RefundService$creditPSAM$1> access13800Var) {
        super(access13800Var);
        this.this$0 = refundService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onExtraCallback((AdSlotBuilder) null, (setExpressViewAccepted) null, (setBannerType) null, (access13800<? super Unit>) this);
    }
}
