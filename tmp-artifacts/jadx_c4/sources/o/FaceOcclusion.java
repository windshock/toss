package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceOcclusion implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final int onNavigationEvent;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public FaceOcclusion() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onNavigationEvent = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        int i4 = i2 + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
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
