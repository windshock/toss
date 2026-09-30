package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Landmark implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> onWarmupCompleted;

    public Landmark() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallbackWithResult = linkedHashMap;
        this.onWarmupCompleted = access8100.onNavigationEvent();
        this.onNavigationEvent = linkedHashMap.size();
        linkedHashMap.put("tossBankGetUserToken", access102.class);
        linkedHashMap.put("tossBankSaveUserToken", access102.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onWarmupCompleted;
        int i5 = i2 + 35;
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
