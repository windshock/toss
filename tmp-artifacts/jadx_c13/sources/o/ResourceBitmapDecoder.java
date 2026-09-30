package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceBitmapDecoder<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, KMappedMarker {
    private final RequestManagerFragment<K, V> IAuthTabCallback;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ResourceBitmapDecoder(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.IAuthTabCallback = new RequestManagerFragment<>(resourceLoaderStreamFactory.IAuthTabCallback(), resourceLoaderStreamFactory.onExtraCallback());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.IAuthTabCallback.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new TombstoneProtosTombstoneThreadsDefaultEntryHolder(this.IAuthTabCallback.onExtraCallbackWithResult(), this.IAuthTabCallback.next().onNavigationEvent());
    }
}
