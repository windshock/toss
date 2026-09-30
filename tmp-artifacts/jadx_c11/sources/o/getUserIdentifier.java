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
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getUserIdentifier implements getCmpService, List<AppLovinSdkSettings>, KMappedMarker {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<AppLovinSdkSettings> onExtraCallback;

    @Override // java.util.List
    public /* synthetic */ void add(int i, AppLovinSdkSettings appLovinSdkSettings) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends AppLovinSdkSettings> collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends AppLovinSdkSettings> collection) {
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
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean zContainsAll = this.onExtraCallback.containsAll(collection);
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zContainsAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            zIsEmpty = this.onExtraCallback.isEmpty();
            int i3 = 45 / 0;
        } else {
            zIsEmpty = this.onExtraCallback.isEmpty();
        }
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zIsEmpty;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<AppLovinSdkSettings> iterator() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<AppLovinSdkSettings> list = this.onExtraCallback;
        if (i3 != 0) {
            return list.iterator();
        }
        list.iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.List
    public ListIterator<AppLovinSdkSettings> listIterator() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ListIterator<AppLovinSdkSettings> listIterator = this.onExtraCallback.listIterator();
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return listIterator;
        }
        throw null;
    }

    @Override // java.util.List
    public ListIterator<AppLovinSdkSettings> listIterator(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ListIterator<AppLovinSdkSettings> listIterator = this.onExtraCallback.listIterator(i);
        int i5 = onWarmupCompleted + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return listIterator;
        }
        throw null;
    }

    public AppLovinSdkSettings onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            this.onExtraCallback.get(i);
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettings = this.onExtraCallback.get(i);
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    public boolean onExtraCallback(@NotNull AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        boolean zContains = this.onExtraCallback.contains(appLovinSdkSettings);
        int i4 = onNavigationEvent + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return zContains;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        int iIndexOf = this.onExtraCallback.indexOf(appLovinSdkSettings);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return iIndexOf;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onExtraCallback.size();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return size;
    }

    public int onWarmupCompleted(@NotNull AppLovinSdkSettings appLovinSdkSettings) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        int iLastIndexOf = this.onExtraCallback.lastIndexOf(appLovinSdkSettings);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public /* synthetic */ AppLovinSdkSettings remove(int i) {
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
    public void replaceAll(UnaryOperator<AppLovinSdkSettings> unaryOperator) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ AppLovinSdkSettings set(int i, AppLovinSdkSettings appLovinSdkSettings) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super AppLovinSdkSettings> comparator) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<AppLovinSdkSettings> subList(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            this.onExtraCallback.subList(i, i2);
            throw null;
        }
        List<AppLovinSdkSettings> listSubList = this.onExtraCallback.subList(i, i2);
        int i5 = onWarmupCompleted + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return listSubList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] array;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            array = CollectionToArray.toArray(this);
            int i3 = 57 / 0;
        } else {
            array = CollectionToArray.toArray(this);
        }
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tArr, "");
        T[] tArr2 = (T[]) CollectionToArray.toArray(this, tArr);
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tArr2;
    }

    public getUserIdentifier(@NotNull List<AppLovinSdkSettings> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (obj instanceof AppLovinSdkSettings) {
            return onExtraCallback((AppLovinSdkSettings) obj);
        }
        int i5 = i3 + 49;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 49;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    @Override // java.util.List
    public /* synthetic */ AppLovinSdkSettings get(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(i);
        }
        onExtraCallback(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (obj instanceof AppLovinSdkSettings) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult((AppLovinSdkSettings) obj);
            int i5 = onWarmupCompleted + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iOnExtraCallbackWithResult;
        }
        int i7 = i3 + 97;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return -1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof AppLovinSdkSettings;
            throw null;
        }
        if (obj instanceof AppLovinSdkSettings) {
            return onWarmupCompleted((AppLovinSdkSettings) obj);
        }
        int i4 = i2 + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return -1;
    }

    public final List<AppLovinSdkSettings> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<AppLovinSdkSettings> list = this.onExtraCallback;
        int i5 = i2 + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int iOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            iOnWarmupCompleted = onWarmupCompleted();
            int i3 = 69 / 0;
        } else {
            iOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }
}
