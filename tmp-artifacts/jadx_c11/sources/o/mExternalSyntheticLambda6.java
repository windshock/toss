package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import o.mExternalSyntheticApiModelOutline1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mExternalSyntheticLambda6 implements List<mExternalSyntheticLambda2>, KMappedMarker {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final List<mExternalSyntheticLambda2> IAuthTabCallback;
    private final mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault onNavigationEvent;
    private final SurfaceProcessorNodeOut onWarmupCompleted;

    @Override // java.util.List
    public /* synthetic */ void add(int i, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends mExternalSyntheticLambda2> collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends mExternalSyntheticLambda2> collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void addFirst(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void addLast(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean zContainsAll = this.IAuthTabCallback.containsAll(collection);
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zContainsAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zIsEmpty = this.IAuthTabCallback.isEmpty();
            int i3 = 24 / 0;
        } else {
            zIsEmpty = this.IAuthTabCallback.isEmpty();
        }
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsEmpty;
        }
        throw null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<mExternalSyntheticLambda2> iterator() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Iterator<mExternalSyntheticLambda2> it = this.IAuthTabCallback.iterator();
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return it;
    }

    @Override // java.util.List
    public ListIterator<mExternalSyntheticLambda2> listIterator() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ListIterator<mExternalSyntheticLambda2> listIterator = this.IAuthTabCallback.listIterator();
        int i4 = onExtraCallbackWithResult + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return listIterator;
    }

    @Override // java.util.List
    public ListIterator<mExternalSyntheticLambda2> listIterator(int i) {
        ListIterator<mExternalSyntheticLambda2> listIterator;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            listIterator = this.IAuthTabCallback.listIterator(i);
            int i4 = 71 / 0;
        } else {
            listIterator = this.IAuthTabCallback.listIterator(i);
        }
        int i5 = onExtraCallbackWithResult + 63;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return listIterator;
    }

    public int onExtraCallback(@NotNull mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        int iLastIndexOf = this.IAuthTabCallback.lastIndexOf(mexternalsyntheticlambda2);
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iLastIndexOf;
    }

    public mExternalSyntheticLambda2 onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        mExternalSyntheticLambda2 mexternalsyntheticlambda2 = this.IAuthTabCallback.get(i);
        int i5 = onExtraCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return mexternalsyntheticlambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onNavigationEvent(@NotNull mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        int iIndexOf = this.IAuthTabCallback.indexOf(mexternalsyntheticlambda2);
        int i4 = onExtraCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iIndexOf;
        }
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int size = this.IAuthTabCallback.size();
        int i4 = onExtraCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean onWarmupCompleted(@NotNull mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda2, "");
        boolean zContains = this.IAuthTabCallback.contains(mexternalsyntheticlambda2);
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return zContains;
    }

    @Override // java.util.List
    public /* synthetic */ mExternalSyntheticLambda2 remove(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object removeFirst() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object removeLast() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<mExternalSyntheticLambda2> unaryOperator) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ mExternalSyntheticLambda2 set(int i, mExternalSyntheticLambda2 mexternalsyntheticlambda2) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super mExternalSyntheticLambda2> comparator) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<mExternalSyntheticLambda2> subList(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        List<mExternalSyntheticLambda2> list = this.IAuthTabCallback;
        if (i5 != 0) {
            return list.subList(i, i2);
        }
        list.subList(i, i2);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] array = CollectionToArray.toArray(this);
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) CollectionToArray.toArray(this, tArr);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return tArr2;
    }

    public mExternalSyntheticLambda6(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, @NotNull List<mExternalSyntheticLambda2> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        this.onWarmupCompleted = surfaceProcessorNodeOut;
        this.IAuthTabCallback = list;
        this.onNavigationEvent = iAuthTabCallbackDefault;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof mExternalSyntheticLambda2;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof mExternalSyntheticLambda2) {
            return onWarmupCompleted((mExternalSyntheticLambda2) obj);
        }
        int i4 = i2 + 69;
        onExtraCallbackWithResult = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override // java.util.List
    public /* synthetic */ mExternalSyntheticLambda2 get(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        mExternalSyntheticLambda2 mexternalsyntheticlambda2OnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        int i5 = onExtraCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return mexternalsyntheticlambda2OnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (!(obj instanceof mExternalSyntheticLambda2)) {
            int i5 = i3 + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        int iOnNavigationEvent = onNavigationEvent((mExternalSyntheticLambda2) obj);
        int i7 = onExtraCallbackWithResult + 31;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
        return iOnNavigationEvent;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof mExternalSyntheticLambda2)) {
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        int iOnExtraCallback = onExtraCallback((mExternalSyntheticLambda2) obj);
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    public final SurfaceProcessorNodeOut IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = this.onWarmupCompleted;
        int i5 = i3 + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return surfaceProcessorNodeOut;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        mExternalSyntheticApiModelOutline1.IAuthTabCallbackDefault iAuthTabCallbackDefault = this.onNavigationEvent;
        int i5 = i3 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallbackDefault;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        List<mExternalSyntheticLambda2> list = this.IAuthTabCallback;
        int size = list.size();
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = onExtraCallback + 83;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            list.get(i4).extraCallbackWithResult();
        }
    }
}
