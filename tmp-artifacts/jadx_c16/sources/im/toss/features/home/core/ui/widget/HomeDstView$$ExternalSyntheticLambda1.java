package im.toss.features.home.core.ui.widget;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstView$$ExternalSyntheticLambda1 implements View.OnLayoutChangeListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeDstView f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 121;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        Object obj = null;
        HomeDstView.onExtraCallback(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        if (i11 == 0) {
            obj.hashCode();
            throw null;
        }
        int i12 = onNavigationEvent + 57;
        onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
