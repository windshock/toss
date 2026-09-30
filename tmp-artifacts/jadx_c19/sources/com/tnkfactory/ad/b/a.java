package com.tnkfactory.ad.b;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.basic.AdDetailNewsDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a extends SuspendLambda implements Function2 {
    public final /* synthetic */ FragmentActivity a;
    public final /* synthetic */ AdDetailNewsDialog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentActivity fragmentActivity, AdDetailNewsDialog adDetailNewsDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = fragmentActivity;
        this.b = adDetailNewsDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new a(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new a(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        Toast.makeText((Context) this.a, (CharSequence) "적립되었습니다.", 0).show();
        this.b.getTvNewsResult().setText("적립되었습니다.");
        return Unit.INSTANCE;
    }
}
