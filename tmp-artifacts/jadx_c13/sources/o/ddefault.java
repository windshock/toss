package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ddefault<T> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Map<T, Float> onNavigationEvent = new LinkedHashMap();

    public final Map<T, Float> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<T, Float> map = this.onNavigationEvent;
        int i5 = i2 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final void IAuthTabCallback(T t, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.put(t, Float.valueOf(f));
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }
}
