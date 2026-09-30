package im.toss.features.kyc.activities;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda30 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.onExtraCallbackWithResult(compoundButton, z);
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
