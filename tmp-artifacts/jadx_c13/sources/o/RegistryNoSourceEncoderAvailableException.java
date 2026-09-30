package o;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegistryNoSourceEncoderAvailableException<K, V> extends access6800<K> implements Set<K>, KMutableSet {
    private final RegistryNoImageHeaderParserException<K, V> onWarmupCompleted;

    public RegistryNoSourceEncoderAvailableException(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        this.onWarmupCompleted = registryNoImageHeaderParserException;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.onWarmupCompleted.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new RequestBuilder1(this.onWarmupCompleted);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.onWarmupCompleted.containsKey(obj)) {
            return false;
        }
        this.onWarmupCompleted.remove(obj);
        return true;
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.onWarmupCompleted.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.onWarmupCompleted.containsKey(obj);
    }
}
