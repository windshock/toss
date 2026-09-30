package com.tnkfactory.ad.d;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class i extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdEventHandler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AdEventHandler adEventHandler, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adEventHandler;
    }

    public static final Unit a(AdEventHandler adEventHandler) {
        adEventHandler.getMActivity().startActivity(new Intent("android.settings.SETTINGS"));
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new i(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new i(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.a.getNavi().showLoading(false);
        TAlertDialog.Companion companion = TAlertDialog.Companion;
        FragmentActivity mActivity = this.a.getMActivity();
        final AdEventHandler adEventHandler = this.a;
        companion.show(mActivity, "광고ID 설정이 필요한 광고입니다.\n[설정] -> [개인정보 보호] -> [광고] -> [새 광고ID 받기]", "설정하기", "취소", new Function0() { // from class: com.tnkfactory.ad.d.i$$ExternalSyntheticLambda0
            public final Object invoke() {
                return i.a(adEventHandler);
            }
        }, new Function0() { // from class: com.tnkfactory.ad.d.i$$ExternalSyntheticLambda1
            public final Object invoke() {
                return i.a();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
