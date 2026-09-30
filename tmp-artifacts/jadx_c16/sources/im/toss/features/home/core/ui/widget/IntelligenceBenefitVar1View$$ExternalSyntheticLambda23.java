package im.toss.features.home.core.ui.widget;

import android.view.View;
import im.toss.features.benefit.ui.BenefitItemAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceBenefitVar1View$$ExternalSyntheticLambda23 implements View.OnLayoutChangeListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ IntelligenceBenefitVar1View f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = {this.f$0, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        IntelligenceBenefitVar1View.onExtraCallback(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -970104189, iOnExtraCallbackWithResult, 970104193, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr);
        int i12 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
    }
}
