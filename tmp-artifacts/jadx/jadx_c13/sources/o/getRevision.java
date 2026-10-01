package o;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getRevision<K, V> extends getOpenFdsList<K, V> {

    public interface onExtraCallbackWithResult<K, V> extends Map<K, V>, KMutableMap {
        getRevision<K, V> onWarmupCompleted();
    }

    getRevision<K, V> IAuthTabCallback(@NotNull Map<? extends K, ? extends V> map);

    onExtraCallbackWithResult<K, V> onWarmupCompleted();
}
