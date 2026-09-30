package im.toss.ads_sdk.playable;

import android.view.View;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda5(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, view};
        NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2111618597, -2111618589, objArr);
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
