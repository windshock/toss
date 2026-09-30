package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkFilterDialog;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class k0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkFilterDialog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(TnkFilterDialog tnkFilterDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkFilterDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new k0(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new k0(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        ResultKt.onNavigationEvent(obj);
        TnkCore.INSTANCE.cpsSearch(this.a.getMKeyword());
        return Unit.INSTANCE;
    }
}
