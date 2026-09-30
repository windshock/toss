package im.toss.ads_sdk.ui.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFeedVideoView$$ExternalSyntheticLambda8 implements View.OnLayoutChangeListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsFeedVideoView f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onWarmupCompleted + 3;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        NativeAdsFeedVideoView.onWarmupCompleted(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = onExtraCallback + 49;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 83 / 0;
        }
    }
}
