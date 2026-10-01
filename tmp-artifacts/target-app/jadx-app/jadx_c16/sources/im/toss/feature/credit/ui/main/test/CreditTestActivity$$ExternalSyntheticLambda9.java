package im.toss.feature.credit.ui.main.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda9 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.onNavigationEvent(compoundButton, z);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }
}
