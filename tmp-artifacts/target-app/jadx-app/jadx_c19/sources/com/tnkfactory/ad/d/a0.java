package com.tnkfactory.ad.d;

import android.content.Context;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, String str, Function0 function0, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = context;
        this.b = str;
        this.c = function0;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new a0(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        TAlertDialog.Companion.show(this.a, this.b, this.c, null);
        return Unit.INSTANCE;
    }
}
