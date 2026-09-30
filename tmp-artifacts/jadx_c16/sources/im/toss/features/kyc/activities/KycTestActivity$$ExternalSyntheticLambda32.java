package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda32 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            KycTestActivity.IAuthTabCallbackDefault(this.f$0, view);
            throw null;
        }
        KycTestActivity.IAuthTabCallbackDefault(this.f$0, view);
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
    }
}
