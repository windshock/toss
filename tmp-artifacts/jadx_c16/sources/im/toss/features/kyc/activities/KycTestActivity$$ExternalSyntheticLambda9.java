package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda9 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.IAuthTabCallback(this.f$0, view);
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
