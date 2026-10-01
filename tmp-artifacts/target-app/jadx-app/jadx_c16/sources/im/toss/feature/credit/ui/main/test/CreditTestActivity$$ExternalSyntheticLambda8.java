package im.toss.feature.credit.ui.main.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda8 implements CompoundButton.OnCheckedChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.onExtraCallback(compoundButton, z);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }
}
