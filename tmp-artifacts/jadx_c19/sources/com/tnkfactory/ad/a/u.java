package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkResultListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class u extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkResultListener a;
    public final /* synthetic */ TnkError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(TnkResultListener tnkResultListener, TnkError tnkError, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkResultListener;
        this.b = tnkError;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new u(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new u(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.onFail(this.b);
        return Unit.INSTANCE;
    }
}
