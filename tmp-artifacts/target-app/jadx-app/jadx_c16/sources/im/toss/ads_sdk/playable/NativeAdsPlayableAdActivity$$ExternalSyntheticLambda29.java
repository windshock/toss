package im.toss.ads_sdk.playable;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda29 implements View.OnTouchListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, view, motionEvent);
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }
}
