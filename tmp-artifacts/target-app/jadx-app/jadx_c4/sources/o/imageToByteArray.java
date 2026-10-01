package o;

import im.toss.features.benefit.ads.appbridge.RegisterAdMobFullScreenCallbackWebHandler;
import im.toss.features.benefit.ads.appbridge.RequestAdMobPrivacyConsentWebHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class imageToByteArray implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public imageToByteArray() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onNavigationEvent = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("getAdMobAvailabilityStatus", handleText.class);
        linkedHashMap.put("loadAdMobInterstitialAd", ClipboardTextHandler.class);
        linkedHashMap.put("loadAdMobRewardedAd", RVClipboardProxy.class);
        linkedHashMap.put("registerAdMobFullScreenCallbacks", RegisterAdMobFullScreenCallbackWebHandler.class);
        linkedHashMap.put("requestAdMobPrivacyConsent", RequestAdMobPrivacyConsentWebHandler.class);
        linkedHashMap.put("showAdMobInterstitialAd", RVClipboardProxyCallback.class);
        linkedHashMap.put("showAdMobRewardedAd", AddPhoneContactBridgeExtension.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onWarmupCompleted.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.onWarmupCompleted.keySet();
        }
        return setKeySet;
    }
}
