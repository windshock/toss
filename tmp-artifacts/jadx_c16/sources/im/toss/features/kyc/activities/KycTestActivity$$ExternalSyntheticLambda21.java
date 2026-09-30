package im.toss.features.kyc.activities;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda21 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            KycTestActivity.onWarmupCompleted(this.f$0, view);
            throw null;
        }
        KycTestActivity.onWarmupCompleted(this.f$0, view);
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
