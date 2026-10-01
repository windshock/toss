package no.nordicsemi.android.ble.ktx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.nordicsemi.android.ble.ReadRequest;
import o.access13800;
import o.loss;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$5 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RequestSuspendKt$suspend$5(access13800<? super RequestSuspendKt$suspend$5> access13800Var) {
        super(access13800Var);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RequestSuspendKt.onNavigationEvent((ReadRequest) null, (access13800<? super loss>) this);
    }
}
