package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceExpressions implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public FaceExpressions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onNavigationEvent = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("isTapPayExpressModeEnabled", PerformanceMonitorFactoryPerformanceType.class);
        linkedHashMap.put("updateTapPayExpressModeEnabled", getPerformanceMonitor.class);
        linkedHashMap.put("overseasExchangeRateNotificationGetOn", GriverJSAPICallEventHandler.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onNavigationEvent;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
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
