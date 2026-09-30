package no.nordicsemi.android.ble.ktx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import no.nordicsemi.android.ble.ReadRssiRequest;
import o.access13800;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$7 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RequestSuspendKt$suspend$7(access13800<? super RequestSuspendKt$suspend$7> access13800Var) {
        super(access13800Var);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RequestSuspendKt.onNavigationEvent((ReadRssiRequest) null, (access13800<? super Integer>) this);
    }
}
