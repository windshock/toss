package com.tnkfactory.ad.b;

import com.tnkfactory.ad.basic.TnkAdListNoExist;
import com.tnkfactory.ad.basic.TnkAdListNoItem;
import com.tnkfactory.ad.basic.TnkAdMyMenu;
import com.tnkfactory.ad.basic.TnkCurationHeader;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class t extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkAdMyMenu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(TnkAdMyMenu tnkAdMyMenu, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkAdMyMenu;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new t(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new t(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : adList) {
            if (!((AdListVo) obj2).getOnError()) {
                arrayList.add(obj2);
            }
        }
        Ref.IntRef intRef = new Ref.IntRef();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AdListVo) it.next()).getAdType() == 4) {
                intRef.element++;
            }
        }
        if (intRef.element == arrayList.size()) {
            this.a.getMAdapter().add(new TnkAdListNoExist(2));
            return Unit.INSTANCE;
        }
        if (arrayList.size() < 2) {
            this.a.getMAdapter().add(new TnkAdListNoExist(2));
        } else {
            int size = arrayList.size() > 4 ? 5 : arrayList.size();
            this.a.getMAdapter().add(new TnkAdListNoItem("참여 중인\n멀티리워드 캠페인은 없지만..."));
            this.a.getMAdapter().add(new TnkCurationHeader("이런 캠페인은 어때요?"));
            this.a.getMAdapter().addAll(this.a.filterAdItem(CollectionsKt.toMutableList(arrayList.subList(0, size))));
        }
        return Unit.INSTANCE;
    }
}
