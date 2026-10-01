package io.realm.kotlin;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RealmExtensionsKt$executeTransactionAwait$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RealmExtensionsKt$executeTransactionAwait$1(access13800<? super RealmExtensionsKt$executeTransactionAwait$1> access13800Var) {
        super(access13800Var);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealmExtensionsKt.onWarmupCompleted(null, null, null, this);
    }
}
