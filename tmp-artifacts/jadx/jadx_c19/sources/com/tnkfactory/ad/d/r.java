package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class r extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdListVo b;
    public final /* synthetic */ AdEventHandler c;
    public final /* synthetic */ AdEventListener d;
    public final /* synthetic */ AdJoinInfoVo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, AdJoinInfoVo adJoinInfoVo, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = adListVo;
        this.c = adEventHandler;
        this.d = adEventListener;
        this.e = adJoinInfoVo;
    }

    public static final void a(AdEventHandler adEventHandler) throws InterruptedException {
        Thread.sleep(1000L);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.getLifecycleOwner()), putChannelInfo.onExtraCallback(), (setRandomHost) null, new q(adEventHandler, null), 2, (Object) null);
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new r(this.b, this.c, this.d, this.e, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            TnkSession tnkSession = TnkSession.INSTANCE;
            final AdEventHandler adEventHandler = this.c;
            tnkSession.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.d.r$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    r.a(adEventHandler);
                }
            });
            if (AdListVoKt.isInstallComplete(this.b, this.c.getMActivity())) {
                AdEventHandler adEventHandler2 = this.c;
                AdListVo adListVo = this.b;
                AdEventListener adEventListener = this.d;
                this.a = 1;
                if (AdEventHandler.access$processPayForInstall(adEventHandler2, adListVo, adEventListener, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else if (this.b.getActionId() == 3) {
                AdEventHandler.access$requestJoin(this.c, this.b, this.e, this.d);
            } else if (this.b.getActionId() > 100) {
                AdEventHandler.access$processPayForAttend(this.c, this.b, this.d);
            } else {
                this.c.b(this.b, this.e, this.d);
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
