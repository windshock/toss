package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManagerFragmentFragmentRequestManagerTreeNode<K, V> implements Iterator<V>, KMappedMarker {
    private final RequestManagerFragment<K, V> onExtraCallback;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RequestManagerFragmentFragmentRequestManagerTreeNode(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.onExtraCallback = new RequestManagerFragment<>(resourceLoaderStreamFactory.IAuthTabCallback(), resourceLoaderStreamFactory.onExtraCallback());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallback.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.onExtraCallback.next().onNavigationEvent();
    }
}
