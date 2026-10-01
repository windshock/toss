package com.tnkfactory.ad.b;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.basic.AdListPopupAdlist;
import com.tnkfactory.ad.basic.TnkLoadingDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class f extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ AdListPopupAdlist b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z, AdListPopupAdlist adListPopupAdlist, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = z;
        this.b = adListPopupAdlist;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new f(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new f(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Dialog loading;
        ResultKt.onNavigationEvent(obj);
        if (this.a) {
            if (this.b.getLoading() == null) {
                AdListPopupAdlist adListPopupAdlist = this.b;
                FragmentActivity fragmentActivityRequireActivity = adListPopupAdlist.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                adListPopupAdlist.setLoading(new TnkLoadingDialog(fragmentActivityRequireActivity, R.style.TnkRwdLoadingDialog));
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
