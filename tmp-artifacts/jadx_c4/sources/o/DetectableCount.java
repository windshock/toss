package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DetectableCount implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onNavigationEvent;

    public DetectableCount() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onNavigationEvent = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.onExtraCallback = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallbackWithResult;
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
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
