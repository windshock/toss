package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14000;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class b extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventListener a;
    public final /* synthetic */ AdListVo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdEventListener adEventListener, AdListVo adListVo, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventListener;
        this.b = adListVo;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new b(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new b(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(access14000.onNavigationEvent(true));
        this.a.onComplete(this.b, true);
        return Unit.INSTANCE;
    }
}
