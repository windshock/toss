package o;

import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getRegisterNameBytes<K, V> {
    public final clearType<K, V> IAuthTabCallback;
    public final TombstoneProtosLogMessageOrBuilder onExtraCallback;
    public final OsMap onExtraCallbackWithResult;
    protected final Class<V> onWarmupCompleted;

    protected abstract boolean IAuthTabCallback(@Nullable Object obj);

    @Nullable
    protected abstract V onExtraCallback(K k, @Nullable V v);

    @Nullable
    protected abstract V onNavigationEvent(K k);

    void onExtraCallbackWithResult(Object obj) {
        this.onExtraCallbackWithResult.onNavigationEvent(obj);
    }

    int IAuthTabCallback() {
        return (int) this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    boolean onExtraCallback() {
        return this.onExtraCallbackWithResult.onWarmupCompleted() == 0;
    }

    protected boolean onWarmupCompleted(@Nullable Object obj) {
        if (obj != null && obj.getClass() != this.onWarmupCompleted) {
            throw new ClassCastException("Only '" + this.onWarmupCompleted.getSimpleName() + "'  values can be used with 'containsValue'.");
        }
        return IAuthTabCallback(obj);
    }

    void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    void IAuthTabCallback(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            onExtraCallback(entry.getKey(), entry.getValue());
        }
    }

    Set<K> onNavigationEvent() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    Collection<V> onWarmupCompleted() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }
}
