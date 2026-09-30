package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda34 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ KycTestActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ KycTestActivity$$ExternalSyntheticLambda34(KycTestActivity kycTestActivity, String str) {
        this.f$0 = kycTestActivity;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity kycTestActivity = this.f$0;
        if (i3 == 0) {
            KycTestActivity.onExtraCallbackWithResult(kycTestActivity, this.f$1, view);
        } else {
            KycTestActivity.onExtraCallbackWithResult(kycTestActivity, this.f$1, view);
            throw null;
        }
    }
}
