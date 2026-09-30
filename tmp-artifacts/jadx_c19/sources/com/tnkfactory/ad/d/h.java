package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.repository.db.AdItemRoomDbImpl;
import com.tnkfactory.ad.repository.db.dao.AdItemDao;
import com.tnkfactory.ad.repository.db.entity.AdItemDto;
import com.tnkfactory.ad.rwd.TnkCore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class h extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ AdEventHandler c;
    public final /* synthetic */ AdEventListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j, AdEventHandler adEventHandler, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = j;
        this.c = adEventHandler;
        this.d = adEventListener;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new h(this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AdItemDao adItemDao;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            AdItemRoomDbImpl db = TnkCore.INSTANCE.getOffRepository().getDb();
            AdItemDto adItemDtoFindByAppId = (db == null || (adItemDao = db.adItemDao()) == null) ? null : adItemDao.findByAppId(this.b);
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            g gVar = new g(adItemDtoFindByAppId, this.c, this.d, this.b, null);
            this.a = 1;
            if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, gVar, this) == objOnWarmupCompleted) {
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
