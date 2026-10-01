package com.tnkfactory.ad.d;

import com.tnkfactory.ad.basic.TnkAdMyMenu;
import com.tnkfactory.ad.off.TnkOffNavi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class z extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TnkOffNavi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i2, TnkOffNavi tnkOffNavi, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = i2;
        this.b = tnkOffNavi;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new z(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new z(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        TnkAdMyMenu.Companion.newInstance(this.a).show(this.b.getActivity().getSupportFragmentManager(), "TnkAdMyMenu");
        return Unit.INSTANCE;
    }
}
