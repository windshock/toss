package o;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RecyclableBufferedInputStreamInvalidMarkException<K, V> extends access6800<K> implements Set<K>, KMutableSet {
    private final ResourceLoader<K, V> onExtraCallbackWithResult;

    public RecyclableBufferedInputStreamInvalidMarkException(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.onExtraCallbackWithResult = resourceLoader;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.onExtraCallbackWithResult.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new DefaultImageHeaderParserReaderEndOfFileException(this.onExtraCallbackWithResult);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.onExtraCallbackWithResult.containsKey(obj)) {
            return false;
        }
        this.onExtraCallbackWithResult.remove(obj);
        return true;
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.onExtraCallbackWithResult.containsKey(obj);
    }
}
