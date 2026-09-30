package com.tnkfactory.ad.d;

import android.content.Intent;
import com.tnkfactory.ad.off.TnkOffNavi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class x extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkOffNavi a;
    public final /* synthetic */ Intent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(TnkOffNavi tnkOffNavi, Intent intent, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkOffNavi;
        this.b = intent;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new x(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new x(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getActivity().startActivity(this.b);
        return Unit.INSTANCE;
    }
}
