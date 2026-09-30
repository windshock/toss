package im.toss.ads_sdk.ui.v2.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda14 implements View.OnLayoutChangeListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        NativeAdsThumbnailVideoV2View.onExtraCallbackWithResult(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
