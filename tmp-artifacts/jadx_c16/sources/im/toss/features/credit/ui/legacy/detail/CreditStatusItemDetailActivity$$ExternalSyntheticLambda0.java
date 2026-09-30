package im.toss.features.credit.ui.legacy.detail;

import android.view.View;
import o.connectWithOverlayPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;
    public final /* synthetic */ connectWithOverlayPermission f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CreditStatusItemDetailActivity$$ExternalSyntheticLambda0(CreditStatusItemDetailActivity creditStatusItemDetailActivity, connectWithOverlayPermission connectwithoverlaypermission, String str) {
        this.f$0 = creditStatusItemDetailActivity;
        this.f$1 = connectwithoverlaypermission;
        this.f$2 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity creditStatusItemDetailActivity = this.f$0;
        if (i3 != 0) {
            CreditStatusItemDetailActivity.onWarmupCompleted(creditStatusItemDetailActivity, this.f$1, this.f$2, view);
        } else {
            CreditStatusItemDetailActivity.onWarmupCompleted(creditStatusItemDetailActivity, this.f$1, this.f$2, view);
            throw null;
        }
    }
}
