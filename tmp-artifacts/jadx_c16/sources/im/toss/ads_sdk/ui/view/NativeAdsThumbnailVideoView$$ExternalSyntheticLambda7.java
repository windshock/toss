package im.toss.ads_sdk.ui.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda7 implements View.OnLayoutChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 77;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            NativeAdsThumbnailVideoView.IAuthTabCallback(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        } else {
            NativeAdsThumbnailVideoView.IAuthTabCallback(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            int i11 = 21 / 0;
        }
    }
}
