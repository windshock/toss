package im.toss.features.benefit.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda4 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BenefitTestActivity f$0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BenefitTestActivity.onNavigationEvent(this.f$0, compoundButton, z);
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
