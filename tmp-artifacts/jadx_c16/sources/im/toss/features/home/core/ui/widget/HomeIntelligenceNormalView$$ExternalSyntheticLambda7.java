package im.toss.features.home.core.ui.widget;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeIntelligenceNormalView$$ExternalSyntheticLambda7 implements View.OnLayoutChangeListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        HomeIntelligenceNormalView.onNavigationEvent(view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
    }
}
