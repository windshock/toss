package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceDrawableDecoder<K, V> extends access6700<Map.Entry<? extends K, ? extends V>> implements getOpenFdsOrBuilderList<Map.Entry<? extends K, ? extends V>> {
    private final ResourceLoaderStreamFactory<K, V> onWarmupCompleted;

    public ResourceDrawableDecoder(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.onWarmupCompleted = resourceLoaderStreamFactory;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return onNavigationEvent((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onWarmupCompleted.size();
    }

    public boolean onNavigationEvent(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return RequestCoordinatorRequestState.onExtraCallback.IAuthTabCallback(this.onWarmupCompleted, entry);
    }

    @Override // o.access6700, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new ResourceBitmapDecoder(this.onWarmupCompleted);
    }
}
