package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class dv52 {
    private final ConcurrentMap<Class<?>, dv53<? extends dv12<?>>> onExtraCallback = new ConcurrentHashMap();

    dv52() {
    }

    public boolean IAuthTabCallback(Class<?> cls) {
        return this.onExtraCallback.containsKey(cls);
    }

    public void onExtraCallback(Class<?> cls, dv12<?> dv12Var) {
        this.onExtraCallback.put(cls, dv53.onNavigationEvent(dv12Var));
    }

    public <T> dv12<T> onExtraCallbackWithResult(Class<T> cls) {
        if (this.onExtraCallback.containsKey(cls)) {
            dv53<? extends dv12<?>> dv53Var = this.onExtraCallback.get(cls);
            if (!dv53Var.onWarmupCompleted()) {
                return (dv12) dv53Var.onExtraCallback();
            }
        }
        throw new dv3(String.format("Can't find a codec for %s.", cls));
    }
}
