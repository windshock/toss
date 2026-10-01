package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;
    public final /* synthetic */ AdEventListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdEventHandler adEventHandler, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
        this.b = adEventListener;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new c(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new c(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getNavi().showLoading(false);
        this.b.onError(new TnkError(2, ErrorCodes.INSTANCE.getErrorMessage(2), null, 4, null));
        return Unit.INSTANCE;
    }
}
