package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt__ArraysJVMKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access6900<E> extends AbstractMutableList<E> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final Object[] onExtraCallbackWithResult = new Object[0];
    private Object[] onExtraCallback;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.onWarmupCompleted;
    }

    public access6900(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = onExtraCallbackWithResult;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.onExtraCallback = objArr;
    }

    public access6900() {
        this.onExtraCallback = onExtraCallbackWithResult;
    }

    public access6900(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Object[] array = collection.toArray(new Object[0]);
        this.onExtraCallback = array;
        this.onWarmupCompleted = array.length;
        if (array.length == 0) {
            this.onExtraCallback = onExtraCallbackWithResult;
        }
    }

    private final void IAuthTabCallback(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.onExtraCallback;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == onExtraCallbackWithResult) {
            this.onExtraCallback = new Object[RangesKt___RangesKt.coerceAtLeast(i, 10)];
        } else {
            onWarmupCompleted(AbstractList.Companion.onWarmupCompleted(objArr.length, i));
        }
    }

    private final void onWarmupCompleted(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.onExtraCallback;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.onNavigationEvent, objArr2.length);
        Object[] objArr3 = this.onExtraCallback;
        int length = objArr3.length;
        int i2 = this.onNavigationEvent;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i2, 0, i2);
        this.onNavigationEvent = 0;
        this.onExtraCallback = objArr;
    }

    private final int IAuthTabCallbackStub(int i) {
        Object[] objArr = this.onExtraCallback;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final int onExtraCallback(int i) {
        return i < 0 ? i + this.onExtraCallback.length : i;
    }

    private final int onNavigationEvent(int i) {
        if (i == ArraysKt___ArraysKt.getLastIndex(this.onExtraCallback)) {
            return 0;
        }
        return i + 1;
    }

    private final int onExtraCallbackWithResult(int i) {
        return i == 0 ? ArraysKt___ArraysKt.getLastIndex(this.onExtraCallback) : i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E onNavigationEvent() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.onExtraCallback[this.onNavigationEvent];
    }

    public final E IAuthTabCallback() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.onExtraCallback[this.onNavigationEvent];
    }

    public final E onExtraCallbackWithResult() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.onExtraCallback[IAuthTabCallbackStub(this.onNavigationEvent + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    public final E onExtraCallback() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.onExtraCallback[IAuthTabCallbackStub(this.onNavigationEvent + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E e) {
        onTransact();
        IAuthTabCallback(size() + 1);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent);
        this.onNavigationEvent = iOnExtraCallbackWithResult;
        this.onExtraCallback[iOnExtraCallbackWithResult] = e;
        this.onWarmupCompleted = size() + 1;
    }

    public final void addLast(E e) {
        onTransact();
        IAuthTabCallback(size() + 1);
        this.onExtraCallback[IAuthTabCallbackStub(this.onNavigationEvent + size())] = e;
        this.onWarmupCompleted = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        onTransact();
        Object[] objArr = this.onExtraCallback;
        int i = this.onNavigationEvent;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.onNavigationEvent = onNavigationEvent(i);
        this.onWarmupCompleted = size() - 1;
        return e;
    }

    public final E onWarmupCompleted() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        onTransact();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.onExtraCallback;
        E e = (E) objArr[iIAuthTabCallbackStub];
        objArr[iIAuthTabCallbackStub] = null;
        this.onWarmupCompleted = size() - 1;
        return e;
    }

    public final E IAuthTabCallbackDefault() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractList.Companion.onNavigationEvent(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        onTransact();
        IAuthTabCallback(size() + 1);
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + i);
        if (i < ((size() + 1) >> 1)) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iIAuthTabCallbackStub);
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(this.onNavigationEvent);
            int i2 = this.onNavigationEvent;
            if (iOnExtraCallbackWithResult >= i2) {
                Object[] objArr = this.onExtraCallback;
                objArr[iOnExtraCallbackWithResult2] = objArr[i2];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2, i2 + 1, iOnExtraCallbackWithResult + 1);
            } else {
                Object[] objArr2 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.onExtraCallback;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, iOnExtraCallbackWithResult + 1);
            }
            this.onExtraCallback[iOnExtraCallbackWithResult] = e;
            this.onNavigationEvent = iOnExtraCallbackWithResult2;
        } else {
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + size());
            if (iIAuthTabCallbackStub < iIAuthTabCallbackStub2) {
                Object[] objArr4 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, iIAuthTabCallbackStub + 1, iIAuthTabCallbackStub, iIAuthTabCallbackStub2);
            } else {
                Object[] objArr5 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, iIAuthTabCallbackStub2);
                Object[] objArr6 = this.onExtraCallback;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iIAuthTabCallbackStub + 1, iIAuthTabCallbackStub, objArr6.length - 1);
            }
            this.onExtraCallback[iIAuthTabCallbackStub] = e;
        }
        this.onWarmupCompleted = size() + 1;
    }

    private final void onExtraCallback(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.onExtraCallback.length;
        while (i < length && it.hasNext()) {
            this.onExtraCallback[i] = it.next();
            i++;
        }
        int i2 = this.onNavigationEvent;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.onExtraCallback[i3] = it.next();
        }
        this.onWarmupCompleted = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        onTransact();
        IAuthTabCallback(size() + collection.size());
        onExtraCallback(IAuthTabCallbackStub(this.onNavigationEvent + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractList.Companion.onNavigationEvent(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        onTransact();
        IAuthTabCallback(size() + collection.size());
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + size());
        int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.onNavigationEvent;
            int length = i2 - size;
            if (iIAuthTabCallbackStub2 < i2) {
                Object[] objArr = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, length, i2, objArr.length);
                if (size >= iIAuthTabCallbackStub2) {
                    Object[] objArr2 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iIAuthTabCallbackStub2);
                } else {
                    Object[] objArr3 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, iIAuthTabCallbackStub2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, length, i2, iIAuthTabCallbackStub2);
            } else {
                Object[] objArr6 = this.onExtraCallback;
                length += objArr6.length;
                int length2 = objArr6.length - length;
                if (length2 >= iIAuthTabCallbackStub2 - i2) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i2, iIAuthTabCallbackStub2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.onNavigationEvent + length2, iIAuthTabCallbackStub2);
                }
            }
            this.onNavigationEvent = length;
            onExtraCallback(onExtraCallback(iIAuthTabCallbackStub2 - size), collection);
        } else {
            int i3 = iIAuthTabCallbackStub2 + size;
            if (iIAuthTabCallbackStub2 < iIAuthTabCallbackStub) {
                int i4 = size + iIAuthTabCallbackStub;
                Object[] objArr8 = this.onExtraCallback;
                if (i4 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i3, iIAuthTabCallbackStub2, iIAuthTabCallbackStub);
                } else if (i3 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i3 - objArr8.length, iIAuthTabCallbackStub2, iIAuthTabCallbackStub);
                } else {
                    int length3 = iIAuthTabCallbackStub - (i4 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length3, iIAuthTabCallbackStub);
                    Object[] objArr9 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i3, iIAuthTabCallbackStub2, length3);
                }
            } else {
                Object[] objArr10 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, iIAuthTabCallbackStub);
                Object[] objArr11 = this.onExtraCallback;
                if (i3 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i3 - objArr11.length, iIAuthTabCallbackStub2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.onExtraCallback;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i3, iIAuthTabCallbackStub2, objArr12.length - size);
                }
            }
            onExtraCallback(iIAuthTabCallbackStub2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.onExtraCallbackWithResult(i, size());
        return (E) this.onExtraCallback[IAuthTabCallbackStub(this.onNavigationEvent + i)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractList.Companion.onExtraCallbackWithResult(i, size());
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + i);
        Object[] objArr = this.onExtraCallback;
        E e2 = (E) objArr[iIAuthTabCallbackStub];
        objArr[iIAuthTabCallbackStub] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + size());
        int length = this.onNavigationEvent;
        if (length < iIAuthTabCallbackStub) {
            while (length < iIAuthTabCallbackStub) {
                if (Intrinsics.areEqual(obj, this.onExtraCallback[length])) {
                    i = this.onNavigationEvent;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.onNavigationEvent) < iIAuthTabCallbackStub) {
            return -1;
        }
        int length2 = this.onExtraCallback.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iIAuthTabCallbackStub; i2++) {
                    if (Intrinsics.areEqual(obj, this.onExtraCallback[i2])) {
                        length = i2 + this.onExtraCallback.length;
                        i = this.onNavigationEvent;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.onExtraCallback[length])) {
                i = this.onNavigationEvent;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + size());
        int i2 = this.onNavigationEvent;
        if (i2 < iIAuthTabCallbackStub) {
            lastIndex = iIAuthTabCallbackStub - 1;
            if (i2 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.onExtraCallback[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.onNavigationEvent;
                return lastIndex - i;
            }
            return -1;
        }
        if (!isEmpty() && this.onNavigationEvent >= iIAuthTabCallbackStub) {
            int i3 = iIAuthTabCallbackStub - 1;
            while (true) {
                if (i3 >= 0) {
                    if (Intrinsics.areEqual(obj, this.onExtraCallback[i3])) {
                        lastIndex = i3 + this.onExtraCallback.length;
                        i = this.onNavigationEvent;
                        break;
                    }
                    i3--;
                } else {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.onExtraCallback);
                    int i4 = this.onNavigationEvent;
                    if (i4 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.onExtraCallback[lastIndex])) {
                            if (lastIndex != i4) {
                                lastIndex--;
                            }
                        }
                        i = this.onNavigationEvent;
                    }
                }
            }
            return lastIndex - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        AbstractList.Companion.onExtraCallbackWithResult(i, size());
        if (i == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        onTransact();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + i);
        E e = (E) this.onExtraCallback[iIAuthTabCallbackStub];
        if (i < (size() >> 1)) {
            int i2 = this.onNavigationEvent;
            if (iIAuthTabCallbackStub >= i2) {
                Object[] objArr = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + 1, i2, iIAuthTabCallbackStub);
            } else {
                Object[] objArr2 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, iIAuthTabCallbackStub);
                Object[] objArr3 = this.onExtraCallback;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.onNavigationEvent;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.onExtraCallback;
            int i4 = this.onNavigationEvent;
            objArr4[i4] = null;
            this.onNavigationEvent = onNavigationEvent(i4);
        } else {
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (iIAuthTabCallbackStub <= iIAuthTabCallbackStub2) {
                Object[] objArr5 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, iIAuthTabCallbackStub, iIAuthTabCallbackStub + 1, iIAuthTabCallbackStub2 + 1);
            } else {
                Object[] objArr6 = this.onExtraCallback;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iIAuthTabCallbackStub, iIAuthTabCallbackStub + 1, objArr6.length);
                Object[] objArr7 = this.onExtraCallback;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, iIAuthTabCallbackStub2 + 1);
            }
            this.onExtraCallback[iIAuthTabCallbackStub2] = null;
        }
        this.onWarmupCompleted = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            onTransact();
            onExtraCallbackWithResult(this.onNavigationEvent, IAuthTabCallbackStub(this.onNavigationEvent + size()));
        }
        this.onNavigationEvent = 0;
        this.onWarmupCompleted = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length < size()) {
            tArr = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, size());
        }
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + size());
        int i = this.onNavigationEvent;
        if (i < iIAuthTabCallbackStub) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.onExtraCallback, tArr, 0, i, iIAuthTabCallbackStub, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.onExtraCallback;
            ArraysKt___ArraysJvmKt.copyInto(objArr, tArr, 0, this.onNavigationEvent, objArr.length);
            Object[] objArr2 = this.onExtraCallback;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, tArr, objArr2.length - this.onNavigationEvent, 0, iIAuthTabCallbackStub);
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        AbstractList.Companion.onNavigationEvent(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        onTransact();
        if (i < size() - i2) {
            onWarmupCompleted(i, i2);
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + i3);
            onExtraCallbackWithResult(this.onNavigationEvent, iIAuthTabCallbackStub);
            this.onNavigationEvent = iIAuthTabCallbackStub;
        } else {
            onExtraCallback(i, i2);
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + size());
            onExtraCallbackWithResult(onExtraCallback(iIAuthTabCallbackStub2 - i3), iIAuthTabCallbackStub2);
        }
        this.onWarmupCompleted = size() - i3;
    }

    private final void onWarmupCompleted(int i, int i2) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + (i - 1));
        int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + (i2 - 1));
        while (i > 0) {
            int i3 = iIAuthTabCallbackStub + 1;
            int iMin = Math.min(i, Math.min(i3, iIAuthTabCallbackStub2 + 1));
            Object[] objArr = this.onExtraCallback;
            int i4 = iIAuthTabCallbackStub2 - iMin;
            int i5 = iIAuthTabCallbackStub - iMin;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i4 + 1, i5 + 1, i3);
            iIAuthTabCallbackStub = onExtraCallback(i5);
            iIAuthTabCallbackStub2 = onExtraCallback(i4);
            i -= iMin;
        }
    }

    private final void onExtraCallback(int i, int i2) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.onNavigationEvent + i2);
        int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.onExtraCallback;
            i2 = Math.min(size, Math.min(objArr.length - iIAuthTabCallbackStub, objArr.length - iIAuthTabCallbackStub2));
            Object[] objArr2 = this.onExtraCallback;
            int i3 = iIAuthTabCallbackStub + i2;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, iIAuthTabCallbackStub2, iIAuthTabCallbackStub, i3);
            iIAuthTabCallbackStub = IAuthTabCallbackStub(i3);
            iIAuthTabCallbackStub2 = IAuthTabCallbackStub(iIAuthTabCallbackStub2 + i2);
        }
    }

    private final void onExtraCallbackWithResult(int i, int i2) {
        if (i < i2) {
            ArraysKt___ArraysJvmKt.fill(this.onExtraCallback, (Object) null, i, i2);
            return;
        }
        Object[] objArr = this.onExtraCallback;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i, objArr.length);
        ArraysKt___ArraysJvmKt.fill(this.onExtraCallback, (Object) null, 0, i2);
    }

    private final void onTransact() {
        ((java.util.AbstractList) this).modCount++;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        int iIAuthTabCallbackStub;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.onExtraCallback.length != 0) {
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + size());
            int i = this.onNavigationEvent;
            if (i < iIAuthTabCallbackStub2) {
                iIAuthTabCallbackStub = i;
                while (i < iIAuthTabCallbackStub2) {
                    Object obj = this.onExtraCallback[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.onExtraCallback[iIAuthTabCallbackStub] = obj;
                        iIAuthTabCallbackStub++;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.onExtraCallback, (Object) null, iIAuthTabCallbackStub, iIAuthTabCallbackStub2);
            } else {
                int length = this.onExtraCallback.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.onExtraCallback;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.onExtraCallback[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
                for (int i3 = 0; i3 < iIAuthTabCallbackStub2; i3++) {
                    Object[] objArr2 = this.onExtraCallback;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.onExtraCallback[iIAuthTabCallbackStub] = obj3;
                        iIAuthTabCallbackStub = onNavigationEvent(iIAuthTabCallbackStub);
                    }
                }
                z = z2;
            }
            if (z) {
                onTransact();
                this.onWarmupCompleted = onExtraCallback(iIAuthTabCallbackStub - this.onNavigationEvent);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        int iIAuthTabCallbackStub;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.onExtraCallback.length != 0) {
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.onNavigationEvent + size());
            int i = this.onNavigationEvent;
            if (i < iIAuthTabCallbackStub2) {
                iIAuthTabCallbackStub = i;
                while (i < iIAuthTabCallbackStub2) {
                    Object obj = this.onExtraCallback[i];
                    if (collection.contains(obj)) {
                        this.onExtraCallback[iIAuthTabCallbackStub] = obj;
                        iIAuthTabCallbackStub++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ArraysKt___ArraysJvmKt.fill(this.onExtraCallback, (Object) null, iIAuthTabCallbackStub, iIAuthTabCallbackStub2);
            } else {
                int length = this.onExtraCallback.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.onExtraCallback;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.onExtraCallback[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iIAuthTabCallbackStub = IAuthTabCallbackStub(i2);
                for (int i3 = 0; i3 < iIAuthTabCallbackStub2; i3++) {
                    Object[] objArr2 = this.onExtraCallback;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.onExtraCallback[iIAuthTabCallbackStub] = obj3;
                        iIAuthTabCallbackStub = onNavigationEvent(iIAuthTabCallbackStub);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                onTransact();
                this.onWarmupCompleted = onExtraCallback(iIAuthTabCallbackStub - this.onNavigationEvent);
            }
        }
        return z;
    }
}
