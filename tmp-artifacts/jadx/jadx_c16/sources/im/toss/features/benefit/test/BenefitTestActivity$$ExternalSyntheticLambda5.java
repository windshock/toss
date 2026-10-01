package im.toss.features.benefit.test;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ BenefitTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            BenefitTestActivity.IAuthTabCallback(this.f$0, view);
            int i3 = 40 / 0;
        } else {
            BenefitTestActivity.IAuthTabCallback(this.f$0, view);
        }
        int i4 = onExtraCallbackWithResult + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
