package im.toss.ads_sdk.ui.view;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ShortFormPlayerView$$ExternalSyntheticLambda1 implements View.OnTouchListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ShortFormPlayerView f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ShortFormPlayerView shortFormPlayerView = this.f$0;
        if (i3 == 0) {
            return ShortFormPlayerView.onExtraCallback(shortFormPlayerView, view, motionEvent);
        }
        ShortFormPlayerView.onExtraCallback(shortFormPlayerView, view, motionEvent);
        throw null;
    }
}
