package im.toss.ads_sdk.ui.v2.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFeedVideoV2View$$ExternalSyntheticLambda8 implements View.OnLayoutChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsFeedVideoV2View f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onWarmupCompleted + 51;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            NativeAdsFeedVideoV2View.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        } else {
            NativeAdsFeedVideoV2View.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            int i11 = 14 / 0;
        }
    }
}
