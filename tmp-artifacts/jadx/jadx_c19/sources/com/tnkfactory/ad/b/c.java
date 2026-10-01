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
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AdDetailNewsDialog d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FragmentActivity fragmentActivity, String str, AdDetailNewsDialog adDetailNewsDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = fragmentActivity;
        this.c = str;
        this.d = adDetailNewsDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new c(this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Toast.makeText((Context) this.b, (CharSequence) this.c, 0).show();
            setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
            b bVar = new b(this.d, this.c, null);
            this.a = 1;
            if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, bVar, this) == objOnWarmupCompleted) {
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
