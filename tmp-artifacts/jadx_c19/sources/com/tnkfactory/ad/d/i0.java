package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.TnkOffRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class i0 extends ContinuationImpl {
    public TnkOffRepository a;
    public /* synthetic */ Object b;
    public final /* synthetic */ TnkOffRepository c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(TnkOffRepository tnkOffRepository, access13800 access13800Var) {
        super(access13800Var);
        this.c = tnkOffRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.loadJoinMultiList(this);
    }
}
