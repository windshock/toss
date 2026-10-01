package o;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class clearRegisterName<K, V> {
    protected abstract boolean onWarmupCompleted(@Nullable V v, @Nullable V v2);

    clearRegisterName() {
    }

    public boolean onExtraCallbackWithResult(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return onWarmupCompleted(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}
