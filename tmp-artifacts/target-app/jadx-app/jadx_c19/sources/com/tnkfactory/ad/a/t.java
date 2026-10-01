package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkResultListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class t extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkResultListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(TnkResultListener tnkResultListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkResultListener;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new t(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new t(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.onSuccess();
        return Unit.INSTANCE;
    }
}
