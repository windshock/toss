package com.tnkfactory.ad.d;

import android.app.Dialog;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.basic.TnkLoadingDialog;
import com.tnkfactory.ad.off.TnkOffNavi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class b0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ TnkOffNavi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z, TnkOffNavi tnkOffNavi, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = z;
        this.b = tnkOffNavi;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new b0(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Dialog loading;
        ResultKt.onNavigationEvent(obj);
        if (this.a) {
            if (this.b.getLoading() == null) {
                this.b.setLoading(new TnkLoadingDialog(this.b.getActivity(), R.style.TnkRwdLoadingDialog));
            }
            try {
                Dialog loading2 = this.b.getLoading();
                if (loading2 != null && !loading2.isShowing() && (loading = this.b.getLoading()) != null) {
                    loading.show();
                }
            } catch (Exception unused) {
            }
        } else {
            Dialog loading3 = this.b.getLoading();
            if (loading3 != null) {
                loading3.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
