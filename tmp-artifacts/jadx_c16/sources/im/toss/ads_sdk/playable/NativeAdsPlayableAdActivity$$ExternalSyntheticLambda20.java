package im.toss.ads_sdk.playable;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda20 implements View.OnLayoutChangeListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        int i10 = IAuthTabCallback + 69;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        NativeAdsPlayableAdActivity.onNavigationEvent(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
        int i12 = onExtraCallback + 31;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
    }
}
