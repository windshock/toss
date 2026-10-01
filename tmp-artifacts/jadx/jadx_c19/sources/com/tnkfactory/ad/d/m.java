package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class m extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;
    public final /* synthetic */ AdListVo b;
    public final /* synthetic */ AdJoinInfoVo c;
    public final /* synthetic */ AdEventListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AdEventHandler adEventHandler, AdListVo adListVo, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
        this.b = adListVo;
        this.c = adJoinInfoVo;
        this.d = adEventListener;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new m(this.a, this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        AdEventHandler.access$requestJoin(this.a, this.b, this.c, this.d);
        return Unit.INSTANCE;
    }
}
