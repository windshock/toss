package im.toss.features.home.core.ui.widget.sprint3;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryDynamicProgressTypeView$$ExternalSyntheticLambda7 implements View.OnLayoutChangeListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeInventoryDynamicProgressTypeView f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 111;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        HomeInventoryDynamicProgressTypeView.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        if (i11 != 0) {
            throw null;
        }
        int i12 = onWarmupCompleted + 83;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
    }
}
