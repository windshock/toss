package im.toss.features.benefit.test;

import android.view.View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ TdsListRowV1View f$0;
    public final /* synthetic */ BenefitTestActivity f$1;

    public /* synthetic */ BenefitTestActivity$$ExternalSyntheticLambda2(TdsListRowV1View tdsListRowV1View, BenefitTestActivity benefitTestActivity) {
        this.f$0 = tdsListRowV1View;
        this.f$1 = benefitTestActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsListRowV1View tdsListRowV1View = this.f$0;
        if (i3 == 0) {
            BenefitTestActivity.onWarmupCompleted(tdsListRowV1View, this.f$1, view);
        } else {
            BenefitTestActivity.onWarmupCompleted(tdsListRowV1View, this.f$1, view);
            throw null;
        }
    }
}
