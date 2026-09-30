package im.toss.features.benefit.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda3 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BenefitTestActivity.onExtraCallbackWithResult(compoundButton, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
