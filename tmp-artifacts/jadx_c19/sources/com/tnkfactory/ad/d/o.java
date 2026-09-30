package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.PayForInstallVo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class o extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdListVo c;
    public final /* synthetic */ AdEventHandler d;
    public final /* synthetic */ AdEventListener e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.c = adListVo;
        this.d = adEventHandler;
        this.e = adEventListener;
    }

    public static final Unit a(AdActionInfoVo adActionInfoVo, AdEventListener adEventListener, AdListVo adListVo, PayForInstallVo payForInstallVo) {
        if (Intrinsics.areEqual(payForInstallVo.getPay_yn(), "Y")) {
            adActionInfoVo.setPayYn(true);
        }
        adEventListener.onComplete(adListVo, true);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        o oVar = new o(this.c, this.d, this.e, access13800Var);
        oVar.b = obj;
        return oVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        final AdActionInfoVo adActionInfoVo;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Iterator<T> it = this.c.getCampaignItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AdActionInfoVo adActionInfoVo2 = (AdActionInfoVo) next;
                if (adActionInfoVo2.getActionId() == 0 && !adActionInfoVo2.getPayYn()) {
                    break;
                }
            }
            AdActionInfoVo adActionInfoVo3 = (AdActionInfoVo) next;
            if (adActionInfoVo3 == null) {
                AdEventHandler adEventHandler = this.d;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.b), putChannelInfo.onExtraCallback(), (setRandomHost) null, new c(adEventHandler, this.e, null), 2, (Object) null);
                return Unit.INSTANCE;
            }
            TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
            long appId = this.c.getAppId();
            long campaignId = adActionInfoVo3.getCampaignId();
            this.b = adActionInfoVo3;
            this.a = 1;
            Object objRequestRewardForInstall = offRepository.requestRewardForInstall(appId, campaignId, this);
            if (objRequestRewardForInstall == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            adActionInfoVo = adActionInfoVo3;
            obj = objRequestRewardForInstall;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adActionInfoVo = (AdActionInfoVo) this.b;
            ResultKt.onNavigationEvent(obj);
        }
        final AdEventListener adEventListener = this.e;
        final AdListVo adListVo = this.c;
        TnkResultTask onSuccess = ((TnkResultTask) obj).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.d.o$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return o.a(adActionInfoVo, adEventListener, adListVo, (PayForInstallVo) obj2);
            }
        });
        final AdEventListener adEventListener2 = this.e;
        onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.d.o$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return o.a(adEventListener2, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(AdEventListener adEventListener, TnkError tnkError) {
        adEventListener.onError(tnkError);
        return Unit.INSTANCE;
    }
}
