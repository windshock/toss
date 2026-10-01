package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Mask implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onNavigationEvent;
    private final int onWarmupCompleted;

    public Mask() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onNavigationEvent = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
        linkedHashMap.put("getAccessibilityServices", getServiceEmail.class);
        linkedHashMap.put("chargeUssCardTrafficBalance", setAppDesc.class);
        linkedHashMap.put("forceSyncContacts", getServiceTel.class);
        linkedHashMap.put("getMobileTmoneyPurseHistory", setAppIntro.class);
        linkedHashMap.put("getMobileTmoneyTransHistory", setCreateDate.class);
        linkedHashMap.put("getUssCardTrafficStoredBalance", setIconUrl.class);
        linkedHashMap.put("getMobileTmoneyEverCharged", GetAboutInfoRequest.class);
        linkedHashMap.put("shareToInstagramStory", setServiceTel.class);
        linkedHashMap.put("takeImageWithSystemCamera", getRelatedEnv.class);
        linkedHashMap.put("updateUssCardTrafficBalance", setLastModifiedDate.class);
        linkedHashMap.put("shareMessageToInstagram", setRelatedEnv.class);
        linkedHashMap.put("shareMessageToKakaotalk", AMCSConfigKeyDetails.class);
        linkedHashMap.put("storeSchoolInformation", GetAboutInfoResult.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onNavigationEvent.get(str);
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
            setKeySet = this.onNavigationEvent.keySet();
        }
        return setKeySet;
    }
}
