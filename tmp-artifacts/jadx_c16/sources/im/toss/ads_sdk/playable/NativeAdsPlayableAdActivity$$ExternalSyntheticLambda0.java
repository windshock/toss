package im.toss.ads_sdk.playable;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsPlayableAdActivity.onNavigationEvent(this.f$0, view);
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
