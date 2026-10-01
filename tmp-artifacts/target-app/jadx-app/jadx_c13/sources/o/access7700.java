package o;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access7700<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
    private int onExtraCallback;
    private final Iterator<T> onExtraCallbackWithResult;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public access7700(@NotNull Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        this.onExtraCallbackWithResult = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.onExtraCallbackWithResult.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i = this.onExtraCallback;
        this.onExtraCallback = i + 1;
        if (i < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return new IndexedValue<>(i, this.onExtraCallbackWithResult.next());
    }
}
