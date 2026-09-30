package o;

import java.util.function.BiConsumer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface dispatchOnCancelled<K, V> {
    V IAuthTabCallback(K k, V v);

    V onExtraCallback(K k, V v);

    V onExtraCallbackWithResult(Object obj);

    int onWarmupCompleted();

    default void onNavigationEvent(BiConsumer<K, V> biConsumer) {
        throw new UnsupportedOperationException();
    }
}
