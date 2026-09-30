package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkAdListModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class l extends ContinuationImpl {
    public TnkAdListModel a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ TnkAdListModel e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TnkAdListModel tnkAdListModel, access13800 access13800Var) {
        super(access13800Var);
        this.e = tnkAdListModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.reload(this);
    }
}
