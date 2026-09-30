package com.tnkfactory.ad.a;

import com.tnkfactory.ad.AdListViewImpl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.formatMsgs;
import o.putChannelInfo;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class h extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdListViewImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdListViewImpl adListViewImpl, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = adListViewImpl;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new h(this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new h(this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r6, r1, r5) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.a = 1;
            if (formatMsgs.onWarmupCompleted(500L, this) != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
        g gVar = new g(this.b, null);
        this.a = 2;
    }
}
