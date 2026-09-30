package o;

import java.util.AbstractSet;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access6800<E> extends AbstractSet<E> implements Set<E>, KMutableSet {
    public abstract int onExtraCallback();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return onExtraCallback();
    }
}
