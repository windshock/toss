package im.toss.features.benefit.ui;

import android.view.View;
import o.RotationVectorAbility1$onWarmupCompleted;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda15 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ getNameByOperatorName f$0;
    public final /* synthetic */ RotationVectorAbility1$onWarmupCompleted f$1;

    public /* synthetic */ BenefitItemAdapter$$ExternalSyntheticLambda15(getNameByOperatorName getnamebyoperatorname, RotationVectorAbility1$onWarmupCompleted rotationVectorAbility1$onWarmupCompleted) {
        this.f$0 = getnamebyoperatorname;
        this.f$1 = rotationVectorAbility1$onWarmupCompleted;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        if (i3 != 0) {
            getNameByOperatorName.onNavigationEvent(getnamebyoperatorname, this.f$1, view);
        } else {
            getNameByOperatorName.onNavigationEvent(getnamebyoperatorname, this.f$1, view);
            throw null;
        }
    }
}
