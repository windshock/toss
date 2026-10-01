package im.toss.features.kyc.activities;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda26 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.IAuthTabCallback(compoundButton, z);
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        int i5 = onExtraCallback + 65;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
