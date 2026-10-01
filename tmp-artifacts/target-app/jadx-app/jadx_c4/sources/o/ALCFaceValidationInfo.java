package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceValidationInfo implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Map<String, Class<? extends drawTextBox>> onNavigationEvent = new LinkedHashMap();
    private final Map<Class<? extends drawTextBox>, List<String>> IAuthTabCallback = access8100.onNavigationEvent();

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.IAuthTabCallback;
        int i5 = i3 + 3;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @NotNull Class<? extends drawTextBox> cls) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            this.onNavigationEvent.put(str, cls);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            this.onNavigationEvent.put(str, cls);
            throw null;
        }
    }

    public void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent.remove(str);
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
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
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setKeySet = this.onNavigationEvent.keySet();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return setKeySet;
    }
}
