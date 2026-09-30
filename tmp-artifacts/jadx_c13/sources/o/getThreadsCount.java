package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import o.getProcessUptime;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getThreadsCount<E> extends AbstractList<E> implements getProcessUptime<E> {
    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getMemoryMappingsOrBuilder<E> subList(int i, int i2) {
        return getProcessUptime.onNavigationEvent.IAuthTabCallback(this, i, i2);
    }

    @Override // o.getProcessUptime
    public getProcessUptime<E> onWarmupCompleted(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return this;
        }
        getProcessUptime.onExtraCallback<E> onextracallbackIAuthTabCallback = IAuthTabCallback();
        onextracallbackIAuthTabCallback.addAll(collection);
        return onextracallbackIAuthTabCallback.IAuthTabCallback();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }
}
