package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import com.tnkfactory.ad.rwd.TnkCore;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class g extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdItemDto a;
    public final /* synthetic */ AdEventHandler b;
    public final /* synthetic */ AdEventListener c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdItemDto adItemDto, AdEventHandler adEventHandler, AdEventListener adEventListener, long j, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adItemDto;
        this.b = adEventHandler;
        this.c = adEventListener;
        this.d = j;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new g(this.a, this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        Object next;
        ResultKt.onNavigationEvent(obj);
        AdItemDto adItemDto = this.a;
        if (adItemDto == null) {
            ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
            long j = this.d;
            Iterator<T> it = adList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdListVo) next).getAppId() == j) {
                    break;
                }
            }
            AdListVo adListVo = (AdListVo) next;
            if (adListVo != null) {
                this.b.onItemSelected(adListVo, this.c);
            }
        } else {
            this.b.onItemSelected(AdListVoKt.toAdListVo(adItemDto), this.c);
        }
        return Unit.INSTANCE;
    }
}
