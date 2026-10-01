package no.nordicsemi.android.ble.ktx;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.onInterstitialDismissed;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$11 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RequestSuspendKt$suspend$11(access13800<? super RequestSuspendKt$suspend$11> access13800Var) {
        super(access13800Var);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RequestSuspendKt.onNavigationEvent((onInterstitialDismissed) null, (access13800<? super Pair<Integer, Integer>>) this);
    }
}
