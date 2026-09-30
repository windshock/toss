package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DepthImageLiveness implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final int IAuthTabCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public DepthImageLiveness() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.IAuthTabCallback = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallbackWithResult;
        int i5 = i3 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
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
