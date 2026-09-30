package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class k extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdEventHandler b;
    public final /* synthetic */ AdListVo c;
    public final /* synthetic */ AdEventListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = adEventHandler;
        this.c = adListVo;
        this.d = adEventListener;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new k(this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            AdEventHandler adEventHandler = this.b;
            AdListVo adListVo = this.c;
            AdEventListener adEventListener = this.d;
            this.a = 1;
            if (AdEventHandler.access$onActionInfo(adEventHandler, adListVo, adEventListener, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
