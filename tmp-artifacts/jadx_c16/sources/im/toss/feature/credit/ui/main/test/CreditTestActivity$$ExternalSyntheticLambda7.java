package im.toss.feature.credit.ui.main.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda7 implements CompoundButton.OnCheckedChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.onWarmupCompleted(compoundButton, z);
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
