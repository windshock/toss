package im.toss.features.kyc.activities;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda28 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.onWarmupCompleted(compoundButton, z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }
}
