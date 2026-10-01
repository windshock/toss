package im.toss.features.credit.ui.legacy.detail;

import android.view.View;
import o.connectWithOverlayPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;
    public final /* synthetic */ connectWithOverlayPermission f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CreditStatusItemDetailActivity$$ExternalSyntheticLambda1(CreditStatusItemDetailActivity creditStatusItemDetailActivity, connectWithOverlayPermission connectwithoverlaypermission, String str, int i) {
        this.f$0 = creditStatusItemDetailActivity;
        this.f$1 = connectwithoverlaypermission;
        this.f$2 = str;
        this.f$3 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, view);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
