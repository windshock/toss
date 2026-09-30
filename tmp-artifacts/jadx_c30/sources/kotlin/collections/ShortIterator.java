package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class ShortIterator implements Iterator<Short>, KMappedMarker {
    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Short next() {
        return Short.valueOf(nextShort());
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public final Short next2() {
        return Short.valueOf(nextShort());
    }
}
