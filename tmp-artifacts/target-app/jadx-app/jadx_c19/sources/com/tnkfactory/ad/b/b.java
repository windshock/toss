package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.AdDetailNewsDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class b extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdDetailNewsDialog a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdDetailNewsDialog adDetailNewsDialog, String str, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adDetailNewsDialog;
        this.b = str;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new b(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new b(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getTvNewsResult().setText("적립 실패." + this.b);
        return Unit.INSTANCE;
    }
}
