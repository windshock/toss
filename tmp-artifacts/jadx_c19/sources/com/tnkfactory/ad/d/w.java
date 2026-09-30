package com.tnkfactory.ad.d;

import com.tnkfactory.ad.basic.AdDetailNewsDialog;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class w extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdJoinInfoVo a;
    public final /* synthetic */ AdListVo b;
    public final /* synthetic */ AdEventHandler c;
    public final /* synthetic */ AdEventListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AdJoinInfoVo adJoinInfoVo, AdListVo adListVo, AdEventHandler adEventHandler, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adJoinInfoVo;
        this.b = adListVo;
        this.c = adEventHandler;
        this.d = adEventListener;
    }

    public static final Unit a(AdListVo adListVo, AdEventListener adEventListener, boolean z) {
        if (z) {
            adListVo.setPayYn("Y");
            TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
            adEventListener.onComplete(adListVo, true);
        }
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new w(this.a, this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdDetailNewsDialog adDetailNewsDialogNewInstance;
        ResultKt.onNavigationEvent(obj);
        AdJoinInfoVo adJoinInfoVo = this.a;
        if (adJoinInfoVo != null) {
            adDetailNewsDialogNewInstance = AdDetailNewsDialog.Companion.newInstance(this.b, adJoinInfoVo);
            if (adDetailNewsDialogNewInstance == null) {
                adDetailNewsDialogNewInstance = AdDetailNewsDialog.Companion.newInstance(this.b);
            }
        }
        AdEventHandler adEventHandler = this.c;
        final AdListVo adListVo = this.b;
        final AdEventListener adEventListener = this.d;
        adDetailNewsDialogNewInstance.show(adEventHandler.getMActivity().getSupportFragmentManager(), "news");
        adDetailNewsDialogNewInstance.setOnRequestPayForClick(new Function1() { // from class: com.tnkfactory.ad.d.w$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return w.a(adListVo, adEventListener, ((Boolean) obj2).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }
}
