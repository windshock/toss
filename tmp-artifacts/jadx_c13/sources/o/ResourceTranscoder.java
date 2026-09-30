package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceTranscoder<K, V> extends access6700<K> implements getOpenFdsOrBuilderList<K> {
    private final ResourceLoaderStreamFactory<K, V> onNavigationEvent;

    public ResourceTranscoder(@NotNull ResourceLoaderStreamFactory<K, V> resourceLoaderStreamFactory) {
        Intrinsics.checkNotNullParameter(resourceLoaderStreamFactory, "");
        this.onNavigationEvent = resourceLoaderStreamFactory;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onNavigationEvent.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.onNavigationEvent.containsKey(obj);
    }

    @Override // o.access6700, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new Rotate(this.onNavigationEvent);
    }
}
