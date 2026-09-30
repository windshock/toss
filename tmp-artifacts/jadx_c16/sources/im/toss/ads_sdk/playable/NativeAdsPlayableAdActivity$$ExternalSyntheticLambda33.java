package im.toss.ads_sdk.playable;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda33 implements View.OnLongClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
