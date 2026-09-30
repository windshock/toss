package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class DoubleIterator implements Iterator<Double>, KMappedMarker {
    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Double next() {
        return Double.valueOf(nextDouble());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final Double next() {
        return Double.valueOf(nextDouble());
    }
}
