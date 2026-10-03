package o;

import viva.republica.toss.ads.PlayableAdsPlayerActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DEROctetString implements setSize<PlayableAdsPlayerActivity> {
    public static void onExtraCallback(PlayableAdsPlayerActivity playableAdsPlayerActivity, setTranslateY settranslatey) {
        playableAdsPlayerActivity.nativeAdsRepository = settranslatey;
    }

    public static void onNavigationEvent(PlayableAdsPlayerActivity playableAdsPlayerActivity, zzad zzadVar) {
        playableAdsPlayerActivity.injectedEnvironments = zzadVar;
    }
}
