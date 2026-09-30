package im.toss.features.benefit.test;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ BenefitTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BenefitTestActivity.onWarmupCompleted(this.f$0, view);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
    }
}
