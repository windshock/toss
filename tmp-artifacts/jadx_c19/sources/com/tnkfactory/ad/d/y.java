package com.tnkfactory.ad.d;

import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.basic.AdListDetailViewDialog;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.MagicSuperClass;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class y extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdListVo a;
    public final /* synthetic */ FragmentActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AdListVo adListVo, FragmentActivity fragmentActivity, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adListVo;
        this.b = fragmentActivity;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new y(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new y(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        MagicSuperClass.INSTANCE.setAdItem(this.a);
        new AdListDetailViewDialog(this.b, this.a).show();
        return Unit.INSTANCE;
    }
}
