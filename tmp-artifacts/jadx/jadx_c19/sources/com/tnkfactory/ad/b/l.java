package com.tnkfactory.ad.b;

import android.app.Dialog;
import android.content.Context;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.basic.CpsDetailWebDialog;
import com.tnkfactory.ad.basic.TnkLoadingDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class l extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ CpsDetailWebDialog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z, CpsDetailWebDialog cpsDetailWebDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = z;
        this.b = cpsDetailWebDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new l(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new l(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        if (this.a) {
            if (this.b.getDlg() == null) {
                CpsDetailWebDialog cpsDetailWebDialog = this.b;
                Context context = cpsDetailWebDialog.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                cpsDetailWebDialog.setDlg(new TnkLoadingDialog(context, R.style.TnkRwdLoadingDialog));
            }
            Dialog dlg = this.b.getDlg();
            if (dlg != null) {
                dlg.show();
            }
        } else {
            Dialog dlg2 = this.b.getDlg();
            if (dlg2 != null) {
                dlg2.dismiss();
            }
        }
        return Unit.INSTANCE;
    }
}
