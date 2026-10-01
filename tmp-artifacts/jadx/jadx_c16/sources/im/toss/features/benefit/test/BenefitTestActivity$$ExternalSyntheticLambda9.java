package im.toss.features.benefit.test;

import android.view.View;
import android.widget.EditText;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda9 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ EditText f$0;
    public final /* synthetic */ BenefitTestActivity f$1;

    public /* synthetic */ BenefitTestActivity$$ExternalSyntheticLambda9(EditText editText, BenefitTestActivity benefitTestActivity) {
        this.f$0 = editText;
        this.f$1 = benefitTestActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            BenefitTestActivity.onWarmupCompleted(this.f$0, this.f$1, view);
            int i3 = 86 / 0;
        } else {
            BenefitTestActivity.onWarmupCompleted(this.f$0, this.f$1, view);
        }
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
