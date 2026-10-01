package com.tnkfactory.ad.d;

import com.tnkfactory.ad.off.AdEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class j extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AdEventHandler adEventHandler, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new j(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new j(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getNavi().showLoading(false);
        this.a.getNavi().showDialog(this.a.getMActivity(), "광고아이디를 획득 할 수 없는 기기입니다.", new Function0() { // from class: com.tnkfactory.ad.d.j$$ExternalSyntheticLambda0
            public final Object invoke() {
                return j.a();
            }
        });
        return Unit.INSTANCE;
    }
}
