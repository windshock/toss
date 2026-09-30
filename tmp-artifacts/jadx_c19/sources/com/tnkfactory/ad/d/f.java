package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14300;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdListVo b;
    public final /* synthetic */ AdEventListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = adListVo;
        this.c = adEventListener;
    }

    public static final Unit a(AdEventListener adEventListener, AdListVo adListVo, boolean z) {
        adEventListener.onComplete(adListVo, true);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new f(this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new f(this.b, this.c, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
            long appId = this.b.getAppId();
            boolean zAreEqual = Intrinsics.areEqual(this.b.getLike_yn(), "Y");
            this.a = 1;
            obj = offRepository.likeProduct(appId, !zAreEqual, this);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        final AdEventListener adEventListener = this.c;
        final AdListVo adListVo = this.b;
        TnkResultTask onSuccess = ((TnkResultTask) obj).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.d.f$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return f.a(adEventListener, adListVo, ((Boolean) obj2).booleanValue());
            }
        });
        final AdEventListener adEventListener2 = this.c;
        final AdListVo adListVo2 = this.b;
        onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.d.f$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return f.a(adEventListener2, adListVo2, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(AdEventListener adEventListener, AdListVo adListVo, TnkError tnkError) {
        adEventListener.onComplete(adListVo, false);
        return Unit.INSTANCE;
    }
}
