package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.AdidManager;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import java.util.ArrayList;
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
import o.setPatch;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class l extends SuspendLambda implements Function2 {
    public Exception a;
    public int b;
    public final /* synthetic */ AdListVo c;
    public final /* synthetic */ AdEventHandler d;
    public final /* synthetic */ AdEventListener e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.c = adListVo;
        this.d = adEventHandler;
        this.e = adEventListener;
    }

    public static final Unit a(AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, ArrayList arrayList) {
        adListVo.setDayLimited(false);
        adListVo.getCampaignItems().clear();
        adListVo.getCampaignItems().addAll(arrayList);
        try {
            if (!arrayList.isEmpty()) {
                adListVo.setCmpn_cnt(arrayList.size());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((AdActionInfoVo) obj).getPayYn()) {
                        arrayList2.add(obj);
                    }
                }
                adListVo.setPay_cnt(arrayList2.size());
                TnkCore.INSTANCE.getOffRepository().getAdItemRepository().updateItem(adListVo);
            }
        } catch (Exception unused) {
        }
        try {
            AdActionInfoVo adActionInfoVo = adListVo.getCampaignItems().get(0);
            Intrinsics.checkNotNullExpressionValue(adActionInfoVo, "");
            AdEventHandler.access$videoCache(adEventHandler, adActionInfoVo);
        } catch (Exception unused2) {
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.getLifecycleOwner()), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new k(adEventHandler, adListVo, adEventListener, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new l(this.c, this.d, this.e, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r1, r4, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r7 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.b;
        try {
        } catch (Exception e) {
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            j jVar = new j(this.d, null);
            this.a = e;
            this.b = 2;
        }
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (Intrinsics.areEqual(this.c.getAdid_yn(), "Y") && AdidManager.INSTANCE.getAdvertisingIdThread().isLimited()) {
                setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback();
                i iVar = new i(this.d, null);
                this.b = 1;
                if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback2, iVar, this) == objOnWarmupCompleted) {
                }
                return Unit.INSTANCE;
            }
            TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
            long appId = this.c.getAppId();
            int actionId = this.c.getActionId();
            this.b = 3;
            obj = offRepository.getActionInfoV3(appId, actionId, this);
            return objOnWarmupCompleted;
        }
        if (i2 == 1) {
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        final AdListVo adListVo = this.c;
        final AdEventHandler adEventHandler = this.d;
        final AdEventListener adEventListener = this.e;
        TnkResultTask onSuccess = ((TnkResultTask) obj).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.d.l$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return l.a(adListVo, adEventHandler, adEventListener, (ArrayList) obj2);
            }
        });
        final AdListVo adListVo2 = this.c;
        final AdEventListener adEventListener2 = this.e;
        final AdEventHandler adEventHandler2 = this.d;
        onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.d.l$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return l.a(adListVo2, adEventListener2, adEventHandler2, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(AdListVo adListVo, AdEventListener adEventListener, AdEventHandler adEventHandler, TnkError tnkError) {
        if (tnkError.getCode() == 12) {
            adListVo.setDayLimited(true);
        } else if (tnkError.getCode() < 6) {
            adListVo.setOnError(true);
        }
        adEventListener.onError(tnkError);
        adEventHandler.getNavi().showLoading(false);
        return Unit.INSTANCE;
    }
}
