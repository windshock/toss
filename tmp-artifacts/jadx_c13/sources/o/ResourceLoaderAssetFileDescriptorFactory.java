package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceLoaderAssetFileDescriptorFactory<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    private final BitmapTransformation<K, V> onNavigationEvent;

    public ResourceLoaderAssetFileDescriptorFactory(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.onNavigationEvent = new BitmapTransformation<>(resourceLoader.IAuthTabCallback(), resourceLoader);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onNavigationEvent.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new RuntimeCompat1(this.onNavigationEvent.IAuthTabCallback().onExtraCallbackWithResult(), this.onNavigationEvent.onWarmupCompleted(), this.onNavigationEvent.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.onNavigationEvent.remove();
    }
}
