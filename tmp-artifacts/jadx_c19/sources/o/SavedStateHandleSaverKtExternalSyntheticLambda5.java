package o;

import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;
import o.commitContentChanged;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SavedStateHandleSaverKtExternalSyntheticLambda5<K, V> implements dispatchOnCancelled<K, V>, Serializable {
    private static final long serialVersionUID = 2;
    protected final int _initialEntries;
    protected final int _maxEntries;
    protected final transient commitContentChanged<K, V> onWarmupCompleted;

    public SavedStateHandleSaverKtExternalSyntheticLambda5(int i2, int i3) {
        this._initialEntries = i2;
        this._maxEntries = i3;
        this.onWarmupCompleted = new commitContentChanged.onExtraCallback().onNavigationEvent(i2).onExtraCallbackWithResult(i3).onExtraCallbackWithResult(4).onNavigationEvent();
    }

    @Override // o.dispatchOnCancelled
    public V IAuthTabCallback(K k, V v) {
        return this.onWarmupCompleted.put(k, v);
    }

    @Override // o.dispatchOnCancelled
    public V onExtraCallback(K k, V v) {
        return this.onWarmupCompleted.putIfAbsent(k, v);
    }

    @Override // o.dispatchOnCancelled
    public V onExtraCallbackWithResult(Object obj) {
        return this.onWarmupCompleted.get(obj);
    }

    @Override // o.dispatchOnCancelled
    public int onWarmupCompleted() {
        return this.onWarmupCompleted.size();
    }

    @Override // o.dispatchOnCancelled
    public void onNavigationEvent(BiConsumer<K, V> biConsumer) {
        for (Map.Entry<K, V> entry : this.onWarmupCompleted.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    protected Object readResolve() {
        return new SavedStateHandleSaverKtExternalSyntheticLambda5(this._initialEntries, this._maxEntries);
    }
}
