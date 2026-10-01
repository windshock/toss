package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceLoaderFileDescriptorFactory<K, V> extends TombstoneProtosTombstoneOrBuilder<Map.Entry<K, V>, K, V> {
    private final ResourceLoader<K, V> onExtraCallbackWithResult;

    public ResourceLoaderFileDescriptorFactory(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.onExtraCallbackWithResult = resourceLoader;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.onExtraCallbackWithResult.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new ResourceLoaderAssetFileDescriptorFactory(this.onExtraCallbackWithResult);
    }

    @Override // o.TombstoneProtosTombstoneOrBuilder
    public boolean onExtraCallback(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.onExtraCallbackWithResult.remove(entry.getKey(), entry.getValue());
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult.size();
    }

    @Override // o.TombstoneProtosTombstoneOrBuilder
    public boolean IAuthTabCallback(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return RequestCoordinatorRequestState.onExtraCallback.IAuthTabCallback(this.onExtraCallbackWithResult, entry);
    }
}
