package com.tnkfactory.ad.a;

import com.tnkfactory.ad.AdListViewImpl;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdListViewImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdListViewImpl adListViewImpl, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adListViewImpl;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new c(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new c(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        Object next;
        ResultKt.onNavigationEvent(obj);
        Settings settings = Settings.INSTANCE;
        long receiveAppId = settings.getReceiveAppId(this.a.a.getActivity());
        settings.setReceiveAppId(this.a.a.getActivity(), 0L);
        if (receiveAppId != 0) {
            Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdListVo) next).getAppId() == receiveAppId) {
                    break;
                }
            }
            AdListVo adListVo = (AdListVo) next;
            if (adListVo != null) {
                AdListViewImpl adListViewImpl = this.a;
                adListViewImpl.getAdClickProcessor().onItemSelected(adListVo, adListViewImpl);
            }
        }
        return Unit.INSTANCE;
    }
}
