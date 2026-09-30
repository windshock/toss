package o;

import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class clearType<K, V> {
    abstract Set<K> onExtraCallback();

    abstract Collection<V> onExtraCallbackWithResult();

    public V onWarmupCompleted(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, long j) {
        throw new UnsupportedOperationException("Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    public V onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsMap osMap, K k, @Nullable V v) {
        throw new UnsupportedOperationException("Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    public Map.Entry<K, V> onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, long j, K k) {
        throw new UnsupportedOperationException("Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances.");
    }
}
