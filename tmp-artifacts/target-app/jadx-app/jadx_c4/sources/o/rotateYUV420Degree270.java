package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class rotateYUV420Degree270 implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public rotateYUV420Degree270() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallbackWithResult = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
        linkedHashMap.put("closeVisitMissionGuideOverlay", hasFeatureNfc.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        int i4 = i2 + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
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
