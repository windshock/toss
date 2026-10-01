package im.toss.ads_sdk.admob;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import o.getScaleX;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ThumbnailBannerAdMobLoader$$ExternalSyntheticLambda0 implements OnPaidEventListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getScaleX.onWarmupCompleted f$0;
    public final /* synthetic */ NativeAd f$1;

    public /* synthetic */ ThumbnailBannerAdMobLoader$$ExternalSyntheticLambda0(getScaleX.onWarmupCompleted onwarmupcompleted, NativeAd nativeAd) {
        this.f$0 = onwarmupcompleted;
        this.f$1 = nativeAd;
    }

    public final void onPaidEvent(AdValue adValue) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getScaleX.onNavigationEvent(new Object[]{this.f$0, this.f$1, adValue}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1323678622, TransactionFilterLocal.Companion.onNavigationEvent(), 1323678624);
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
