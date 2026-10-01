package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Box implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public Box() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallbackWithResult = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
        linkedHashMap.put("presentUnifiedSessionInfoView", CameraUtils1.class);
        linkedHashMap.put("unifiedSessionGlobalIdCardResult", OrientationDetector.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return map;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onExtraCallbackWithResult.get(str);
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
            setKeySet = this.onExtraCallbackWithResult.keySet();
        }
        return setKeySet;
    }
}
