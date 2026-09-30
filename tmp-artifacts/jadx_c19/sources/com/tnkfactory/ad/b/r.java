package com.tnkfactory.ad.b;

import android.content.Context;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.basic.TnkAdMyMenu;
import com.tnkfactory.ad.off.TnkOffNavi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class r extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkAdMyMenu a;
    public final /* synthetic */ TnkError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TnkAdMyMenu tnkAdMyMenu, TnkError tnkError, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkAdMyMenu;
        this.b = tnkError;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new r(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new r(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        Context context = this.a.getContext();
        if (context != null) {
            TnkAdMyMenu tnkAdMyMenu = this.a;
            TnkError tnkError = this.b;
            TnkOffNavi tnkNavi = tnkAdMyMenu.getTnkNavi();
            Intrinsics.checkNotNull(tnkNavi);
            tnkNavi.showDialog(context, tnkError.getMessage(), new Function0() { // from class: com.tnkfactory.ad.b.r$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return r.a();
                }
            });
        }
        return Unit.INSTANCE;
    }
}
