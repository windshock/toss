package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkAdListModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.formatMsgs;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class j extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ TnkAdListModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TnkAdListModel tnkAdListModel, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = tnkAdListModel;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new j(this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.a = 1;
            if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        this.b.setClickProcessing(false);
        return Unit.INSTANCE;
    }
}
