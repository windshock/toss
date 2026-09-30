package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u7a<T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Map<T, Float> IAuthTabCallback = new LinkedHashMap();

    public final Map<T, Float> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(T t, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.put(t, Float.valueOf(f));
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
