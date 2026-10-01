package im.toss.features.home.core.ui.widget.sprint3;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryIncomeMainVar3View$$ExternalSyntheticLambda1 implements View.OnLayoutChangeListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeInventoryIncomeMainVar3View f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            HomeInventoryIncomeMainVar3View.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        } else {
            HomeInventoryIncomeMainVar3View.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            throw null;
        }
    }
}
