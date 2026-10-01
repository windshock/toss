package im.toss.core.webkit.ksp.bridge;

import im.toss.rn.toss.core.handler.bundle.ReactBundleDownloadHandler;
import im.toss.rn.toss.core.handler.location.ReactNativeGeolocationUpdateHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1;
import o.access8100;
import o.drawTextBox;
import o.hExternalSyntheticLambda1;
import o.hExternalSyntheticLambda10;
import o.hExternalSyntheticLambda12;
import o.r8lambdaWqF5CIdkbu6fIHd8QWmBRhtuQ;
import o.r8lambdazfFh1wkJD3B6O3YZyi_yb5N7Bjw;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RnTossCoreKspWebMessageHandlerPool implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public RnTossCoreKspWebMessageHandlerPool() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.onNavigationEvent = linkedHashMap.size();
        linkedHashMap.put("invalidateRNBundle", r8lambdaWqF5CIdkbu6fIHd8QWmBRhtuQ.class);
        linkedHashMap.put("downloadRNBundle", ReactBundleDownloadHandler.class);
        linkedHashMap.put("clearRNCache", hExternalSyntheticLambda1.class);
        linkedHashMap.put("openIntent", hExternalSyntheticLambda10.class);
        linkedHashMap.put("startGeolocationUpdateEmitter", r8lambdazfFh1wkJD3B6O3YZyi_yb5N7Bjw.class);
        linkedHashMap.put("stopGeolocationUpdateEmitter", r8lambdazfFh1wkJD3B6O3YZyi_yb5N7Bjw.class);
        linkedHashMap.put("startGeolocationUpdated", ReactNativeGeolocationUpdateHandler.class);
        linkedHashMap.put("stopGeolocationUpdated", ReactNativeGeolocationUpdateHandler.class);
        linkedHashMap.put("showTossShoppingAds", hExternalSyntheticLambda12.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onExtraCallback.get(str);
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
            setKeySet = this.onExtraCallback.keySet();
        }
        return setKeySet;
    }
}
