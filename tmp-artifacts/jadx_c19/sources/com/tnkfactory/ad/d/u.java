package com.tnkfactory.ad.d;

import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdJoinInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class u extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdListVo a;
    public final /* synthetic */ AdEventHandler b;
    public final /* synthetic */ AdJoinInfoVo c;
    public final /* synthetic */ AdEventListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AdListVo adListVo, AdEventHandler adEventHandler, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adListVo;
        this.b = adEventHandler;
        this.c = adJoinInfoVo;
        this.d = adEventListener;
    }

    public static final Unit a(AdEventHandler adEventHandler, AdListVo adListVo, AdJoinInfoVo adJoinInfoVo, AdEventListener adEventListener) {
        adEventHandler.a(adListVo, adJoinInfoVo, adEventListener);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new u(this.a, this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        try {
            if (this.a.getCampaignType() == 100) {
                TAlertDialog.Companion companion = TAlertDialog.Companion;
                FragmentActivity mActivity = this.b.getMActivity();
                final AdEventHandler adEventHandler = this.b;
                final AdListVo adListVo = this.a;
                final AdJoinInfoVo adJoinInfoVo = this.c;
                final AdEventListener adEventListener = this.d;
                companion.show(mActivity, "설치 후 목록으로 돌아와\n설치확인 후 리워드가 지급됩니다.", "참여하러 가기", "취소", new Function0() { // from class: com.tnkfactory.ad.d.u$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return u.a(adEventHandler, adListVo, adJoinInfoVo, adEventListener);
                    }
                }, null);
            } else {
                this.b.a(this.a, this.c, this.d);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
