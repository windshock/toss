package o;

import im.toss.features.payment.ui.facepay.handlers.FacePayUserVerifyHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceExpression implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final int onExtraCallbackWithResult;

    public FaceExpression() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("facepayCheckAdditionalAuthRequired", setAppInfoEnd.class);
        linkedHashMap.put("facePayConfigurePassword", setAppxPageLoaded.class);
        linkedHashMap.put("facePayRegisterSelfie", setAppxAppLoaded.class);
        linkedHashMap.put("facePayUserVerify", FacePayUserVerifyHandler.class);
        linkedHashMap.put("nudgeFaceAuth", setResourceReady.class);
        linkedHashMap.put("offlinePayConfigureCardSignature", setFirstScreen.class);
        linkedHashMap.put("openUnionPayWebView", AppTypeUtils.class);
        linkedHashMap.put("redirectUnionPayPaymentsWebView", shouldInstall.class);
        linkedHashMap.put("checkOfflineTosspayTokenIssuable", setPublishingStatus.class);
        linkedHashMap.put("showOfflinePayDefaultMethodBottomSheet", getAndroidId.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        int i5 = i2 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
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
