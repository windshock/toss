package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14000;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class n extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkError a;
    public final /* synthetic */ TnkAdListModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TnkError tnkError, TnkAdListModel tnkAdListModel, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkError;
        this.b = tnkAdListModel;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new n(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new n(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getCause();
        this.b.getTnkContext().getNavi().showDialog(this.b.getMContext(), "서버 요청 시 오류가 발생하였습니다", new Function0() { // from class: com.tnkfactory.ad.a.n$$ExternalSyntheticLambda0
            public final Object invoke() {
                return n.a();
            }
        });
        this.b.get_isLoading().postValue(access14000.onNavigationEvent(false));
        return Unit.INSTANCE;
    }
}
