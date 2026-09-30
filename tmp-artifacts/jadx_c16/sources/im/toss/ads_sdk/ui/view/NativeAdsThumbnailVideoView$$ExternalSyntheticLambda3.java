package im.toss.ads_sdk.ui.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoView$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoView f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailVideoView.onExtraCallbackWithResult(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
