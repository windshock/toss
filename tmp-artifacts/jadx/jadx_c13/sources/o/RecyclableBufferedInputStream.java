package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RecyclableBufferedInputStream<K, V> implements Iterator<V>, KMutableIterator {
    private final BitmapTransformation<K, V> IAuthTabCallback;

    public RecyclableBufferedInputStream(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.IAuthTabCallback = new BitmapTransformation<>(resourceLoader.IAuthTabCallback(), resourceLoader);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.IAuthTabCallback.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.IAuthTabCallback.next().onNavigationEvent();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.IAuthTabCallback.remove();
    }
}
