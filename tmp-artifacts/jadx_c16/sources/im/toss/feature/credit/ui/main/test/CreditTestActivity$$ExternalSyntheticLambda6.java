package im.toss.feature.credit.ui.main.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda6 implements CompoundButton.OnCheckedChangeListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.onExtraCallbackWithResult(compoundButton, z);
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
