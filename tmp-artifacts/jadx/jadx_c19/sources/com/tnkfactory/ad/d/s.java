package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class s extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;
    public final /* synthetic */ AdEventListener b;
    public final /* synthetic */ TnkError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AdEventHandler adEventHandler, AdEventListener adEventListener, TnkError tnkError, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
        this.b = adEventListener;
        this.c = tnkError;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new s(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getNavi().showLoading(false);
        this.b.onError(this.c);
        return Unit.INSTANCE;
    }
}
