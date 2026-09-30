package com.tnkfactory.ad.d;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.Utils;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class p extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;
    public final /* synthetic */ AdListVo b;
    public final /* synthetic */ AdEventListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
        this.b = adListVo;
        this.c = adEventListener;
    }

    public static final Unit a(AdEventHandler adEventHandler, AdListVo adListVo, AdEventListener adEventListener) {
        String installingPackageName;
        try {
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? adEventHandler.getMActivity().getPackageManager().getInstallSourceInfo(adListVo.getApp_pkg()).getInstallingPackageName() : adEventHandler.getMActivity().getPackageManager().getInstallerPackageName(adListVo.getApp_pkg());
        } catch (Exception e) {
            Logger.e("failed to get installer package of " + adListVo.getApp_pkg() + " : " + e);
            installingPackageName = null;
        }
        if (Utils.isNull(installingPackageName)) {
            Toast.makeText((Context) adEventHandler.getMActivity(), (CharSequence) Resources.getResources().error_not_installed_through_market, 1).show();
        } else {
            try {
                Intent launchIntent = Utils.getLaunchIntent(adEventHandler.getMActivity(), adListVo.getApp_pkg());
                if (launchIntent != null) {
                    adEventHandler.getMActivity().startActivity(launchIntent);
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(adEventHandler.getLifecycleOwner()), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new o(adListVo, adEventHandler, adEventListener, null), 2, (Object) null);
                }
            } catch (Exception unused) {
                String str = Resources.getResources().error_check_run_failed;
                Intrinsics.checkNotNullExpressionValue(str, "");
                adEventListener.onError(new TnkError(99, str, null));
            }
        }
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new p(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        final AdEventHandler adEventHandler = this.a;
        final AdListVo adListVo = this.b;
        final AdEventListener adEventListener = this.c;
        Function0<Unit> function0 = new Function0() { // from class: com.tnkfactory.ad.d.p$$ExternalSyntheticLambda0
            public final Object invoke() {
                return p.a(adEventHandler, adListVo, adEventListener);
            }
        };
        TAlertDialog tAlertDialog = new TAlertDialog(this.a.getMActivity());
        tAlertDialog.setMessage(Resources.getResources().info_check_run);
        tAlertDialog.setOnCancel(new Function0() { // from class: com.tnkfactory.ad.d.p$$ExternalSyntheticLambda1
            public final Object invoke() {
                return p.a();
            }
        });
        tAlertDialog.setOnConfirm(function0);
        tAlertDialog.show();
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
