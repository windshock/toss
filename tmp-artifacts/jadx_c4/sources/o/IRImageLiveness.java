package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IRImageLiveness implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public IRImageLiveness() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.IAuthTabCallback = access8100.onNavigationEvent();
        this.onExtraCallbackWithResult = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
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
