package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AlignedFaceImage implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final int IAuthTabCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public AlignedFaceImage() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onNavigationEvent = access8100.onNavigationEvent();
        this.IAuthTabCallback = linkedHashMap.size();
        linkedHashMap.put("mobilityCameraCapture", writeEndArray.class);
        linkedHashMap.put("mobilityScanDriverLicense", afterWrite.class);
        linkedHashMap.put("mobilityScanQRCode", flush.class);
        linkedHashMap.put("mobilityStartTaxi", writeStartObject.class);
        linkedHashMap.put("mobilityStartSeoulBike", writeStartObject.class);
        linkedHashMap.put("mobilityStartPersonalMobility", writeStartObject.class);
        linkedHashMap.put("mobilityEndService", writeStartObject.class);
        linkedHashMap.put("mobilityCheckWidgetInstalledHandler", writeKey.class);
        linkedHashMap.put("mobilityRequestInstallWidget", writeStartArray.class);
        linkedHashMap.put("mobilityCancelUnlockSeoulBike", writeObject.class);
        linkedHashMap.put("mobilityFinishManualReturnSeoulBike", writeEndObject.class);
        linkedHashMap.put("mobilityGetSeoulBikeLockStatus", translate.class);
        linkedHashMap.put("mobilityPreScanSeoulBikeHandler", TypeReference.class);
        linkedHashMap.put("mobilityRequestManualReturnSeoulBike", writeValue.class);
        linkedHashMap.put("mobilityStopScanHandler", PropertyNamingStrategy.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<Class<? extends drawTextBox>, List<String>> map = this.onNavigationEvent;
        int i4 = i3 + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return map;
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
