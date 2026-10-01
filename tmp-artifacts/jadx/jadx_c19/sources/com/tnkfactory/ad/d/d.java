package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends ContinuationImpl {
    public AdEventHandler a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdEventHandler c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdEventHandler adEventHandler, access13800 access13800Var) {
        super(access13800Var);
        this.c = adEventHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AdEventHandler.access$onActionInfo(this.c, null, null, this);
    }
}
