package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManagerFragment<K, V> implements Iterator<ResourceRecycler<V>>, KMappedMarker {
    private Object IAuthTabCallback;
    private int onExtraCallback;
    private final Map<K, ResourceRecycler<V>> onNavigationEvent;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RequestManagerFragment(@Nullable Object obj, @NotNull Map<K, ResourceRecycler<V>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.IAuthTabCallback = obj;
        this.onNavigationEvent = map;
    }

    public final Object onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallback < this.onNavigationEvent.size();
    }

    @Override // java.util.Iterator
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public ResourceRecycler<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ResourceRecycler<V> resourceRecycler = this.onNavigationEvent.get(this.IAuthTabCallback);
        if (resourceRecycler == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.IAuthTabCallback + ") has changed after it was added to the persistent map.");
        }
        ResourceRecycler<V> resourceRecycler2 = resourceRecycler;
        this.onExtraCallback++;
        this.IAuthTabCallback = resourceRecycler2.onWarmupCompleted();
        return resourceRecycler2;
    }
}
