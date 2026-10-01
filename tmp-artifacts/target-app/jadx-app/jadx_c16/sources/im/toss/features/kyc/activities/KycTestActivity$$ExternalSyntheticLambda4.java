package im.toss.features.kyc.activities;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda4 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.onNavigationEvent(compoundButton, z);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
    }
}
