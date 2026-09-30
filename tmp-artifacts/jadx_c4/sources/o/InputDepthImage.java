package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InputDepthImage implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final int onWarmupCompleted;

    public InputDepthImage() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
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
