package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FaceAgeAndGender implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> onWarmupCompleted;

    public FaceAgeAndGender() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallbackWithResult = linkedHashMap;
        this.onWarmupCompleted = access8100.onNavigationEvent();
        this.onNavigationEvent = linkedHashMap.size();
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onWarmupCompleted;
        int i5 = i3 + 105;
        IAuthTabCallback = i5 % 128;
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
