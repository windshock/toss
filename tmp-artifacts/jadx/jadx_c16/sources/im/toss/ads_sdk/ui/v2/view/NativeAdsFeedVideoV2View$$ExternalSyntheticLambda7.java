package im.toss.ads_sdk.ui.v2.view;

import android.view.ViewTreeObserver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFeedVideoV2View$$ExternalSyntheticLambda7 implements ViewTreeObserver.OnScrollChangedListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsFeedVideoV2View f$0;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsFeedVideoV2View.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
