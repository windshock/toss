package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Rotate<K, V> implements Iterator<K>, KMappedMarker {
    private final RequestManagerFragment<K, V> onExtraCallback;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Rotate(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.onExtraCallback = new RequestManagerFragment<>(resourceLoaderStreamFactory.IAuthTabCallback(), resourceLoaderStreamFactory.onExtraCallback());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallback.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k = (K) this.onExtraCallback.onExtraCallbackWithResult();
        this.onExtraCallback.next();
        return k;
    }
}
