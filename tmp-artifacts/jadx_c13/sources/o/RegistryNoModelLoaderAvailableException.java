package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegistryNoModelLoaderAvailableException<K, V> extends TombstoneProtosTombstoneOrBuilder<Map.Entry<K, V>, K, V> {
    private final RegistryNoImageHeaderParserException<K, V> IAuthTabCallback;

    public RegistryNoModelLoaderAvailableException(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        this.IAuthTabCallback = registryNoImageHeaderParserException;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.IAuthTabCallback.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new RegistryNoResultEncoderAvailableException(this.IAuthTabCallback);
    }

    @Override // o.TombstoneProtosTombstoneOrBuilder
    public boolean onExtraCallback(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.IAuthTabCallback.remove(entry.getKey(), entry.getValue());
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.IAuthTabCallback.size();
    }

    @Override // o.TombstoneProtosTombstoneOrBuilder
    public boolean IAuthTabCallback(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return RequestCoordinatorRequestState.onExtraCallback.IAuthTabCallback(this.IAuthTabCallback, entry);
    }
}
