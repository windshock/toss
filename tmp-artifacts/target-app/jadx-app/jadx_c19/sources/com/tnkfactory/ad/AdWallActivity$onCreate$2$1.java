package com.tnkfactory.ad;

import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tnkfactory.ad.rwd.common.TAlertDialog;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdWallActivity$onCreate$2$1 implements TnkResultListener {
    public final /* synthetic */ AdWallActivity a;
    public final /* synthetic */ TnkOfferwall b;

    public AdWallActivity$onCreate$2$1(AdWallActivity adWallActivity, TnkOfferwall tnkOfferwall) {
        this.a = adWallActivity;
        this.b = tnkOfferwall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit a(AdWallActivity adWallActivity) {
        adWallActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit b(AdWallActivity adWallActivity) {
        adWallActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, com.tnkfactory.ad.AdWallActivity] */
    @Override // com.tnkfactory.ad.TnkResultListener
    public void onFail(TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        TnkAssert.INSTANCE.offerwallError(tnkError);
        tnkError.getCause();
        if (tnkError.getCode() == 99) {
            TAlertDialog.Companion companion = TAlertDialog.Companion;
            final ?? r0 = this.a;
            companion.show(r0, "인터넷 연결을 확인 하시기 바랍니다.\n*광고 차단 앱 사용시 이용이 불가능합니다.", new Function0() { // from class: com.tnkfactory.ad.AdWallActivity$onCreate$2$1$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return AdWallActivity$onCreate$2$1.a(r0);
                }
            }, null);
        } else {
            TAlertDialog.Companion companion2 = TAlertDialog.Companion;
            AppCompatActivity appCompatActivity = this.a;
            String message = tnkError.getMessage();
            final AdWallActivity adWallActivity = this.a;
            companion2.show(appCompatActivity, message, new Function0() { // from class: com.tnkfactory.ad.AdWallActivity$onCreate$2$1$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return AdWallActivity$onCreate$2$1.b(adWallActivity);
                }
            }, null);
        }
        this.b.showDialog(false);
    }

    @Override // com.tnkfactory.ad.TnkResultListener
    public void onSuccess() {
        TnkAssert tnkAssert = TnkAssert.INSTANCE;
        tnkAssert.offerwallSuccess();
        tnkAssert.getMOfferwallTabClick().resetData();
        ((LinearLayout) this.a.findViewById(R.id.com_tnk_off_ll_view_root)).addView(this.b.getAdListView(), new LinearLayout.LayoutParams(-1, -1));
    }
}
