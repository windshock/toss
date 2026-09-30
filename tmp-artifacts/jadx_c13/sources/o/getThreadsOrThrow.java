package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import o.getProcessUptime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getThreadsOrThrow<E> extends AbstractMutableList<E> implements getProcessUptime.onExtraCallback<E> {
    private int IAuthTabCallback;
    private Object[] IAuthTabCallbackDefault;
    private getProcessUptime<? extends E> onExtraCallback;
    private Object[] onExtraCallbackWithResult;
    private int onNavigationEvent;
    private ResourceEncoderRegistry onWarmupCompleted;

    public getThreadsOrThrow(@NotNull getProcessUptime<? extends E> getprocessuptime, @Nullable Object[] objArr, @NotNull Object[] objArr2, int i) {
        Intrinsics.checkNotNullParameter(getprocessuptime, "");
        Intrinsics.checkNotNullParameter(objArr2, "");
        this.IAuthTabCallback = i;
        this.onExtraCallback = getprocessuptime;
        this.onWarmupCompleted = new ResourceEncoderRegistry();
        this.onExtraCallbackWithResult = objArr;
        this.IAuthTabCallbackDefault = objArr2;
        this.onNavigationEvent = getprocessuptime.size();
    }

    public final int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final Object[] onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    private final void IAuthTabCallback(Object[] objArr) {
        if (objArr != this.onExtraCallbackWithResult) {
            this.onExtraCallback = null;
            this.onExtraCallbackWithResult = objArr;
        }
    }

    public final Object[] onExtraCallback() {
        return this.IAuthTabCallbackDefault;
    }

    private final void onExtraCallbackWithResult(Object[] objArr) {
        if (objArr != this.IAuthTabCallbackDefault) {
            this.onExtraCallback = null;
            this.IAuthTabCallbackDefault = objArr;
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.onNavigationEvent;
    }

    public final int onNavigationEvent() {
        return ((AbstractList) this).modCount;
    }

    @Override // o.getProcessUptime.onExtraCallback
    public getProcessUptime<E> IAuthTabCallback() {
        getThreadsOrDefault getthreadsordefault = this.onExtraCallback;
        if (getthreadsordefault == null) {
            Object[] objArr = this.onExtraCallbackWithResult;
            Object[] objArr2 = this.IAuthTabCallbackDefault;
            this.onWarmupCompleted = new ResourceEncoderRegistry();
            if (objArr == null) {
                if (objArr2.length == 0) {
                    getthreadsordefault = (getProcessUptime<? extends E>) removeThreads.onNavigationEvent();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, size());
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    getthreadsordefault = new putAllThreads(objArrCopyOf);
                }
            } else {
                getthreadsordefault = new getThreadsOrDefault(objArr, objArr2, size(), this.IAuthTabCallback);
            }
            this.onExtraCallback = (getProcessUptime<? extends E>) getthreadsordefault;
        }
        return getthreadsordefault;
    }

    private final int asBinder() {
        if (size() <= 32) {
            return 0;
        }
        return removeThreads.IAuthTabCallback(size());
    }

    private final int onExtraCallbackWithResult(int i) {
        return i <= 32 ? i : i - removeThreads.IAuthTabCallback(i);
    }

    private final int IAuthTabCallbackStub() {
        return onExtraCallbackWithResult(size());
    }

    private final boolean onWarmupCompleted(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.onWarmupCompleted;
    }

    private final Object[] onExtraCallback(Object[] objArr) {
        if (objArr == null) {
            return asInterface();
        }
        return onWarmupCompleted(objArr) ? objArr : ArraysKt___ArraysJvmKt.copyInto$default(objArr, asInterface(), 0, 0, RangesKt___RangesKt.coerceAtMost(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] IAuthTabCallback(Object[] objArr, int i) {
        if (onWarmupCompleted(objArr)) {
            return ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i, 0, 32 - i);
        }
        return ArraysKt___ArraysJvmKt.copyInto(objArr, asInterface(), i, 0, 32 - i);
    }

    private final Object[] onNavigationEvent(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.onWarmupCompleted;
        return objArr;
    }

    private final Object[] asInterface() {
        Object[] objArr = new Object[33];
        objArr[32] = this.onWarmupCompleted;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (iIAuthTabCallbackStub < 32) {
            Object[] objArrOnExtraCallback = onExtraCallback(this.IAuthTabCallbackDefault);
            objArrOnExtraCallback[iIAuthTabCallbackStub] = e;
            onExtraCallbackWithResult(objArrOnExtraCallback);
            this.onNavigationEvent = size() + 1;
        } else {
            onExtraCallback(this.onExtraCallbackWithResult, this.IAuthTabCallbackDefault, onNavigationEvent(e));
        }
        return true;
    }

    private final void onExtraCallback(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.IAuthTabCallback;
        if ((size >> 5) > (1 << i)) {
            IAuthTabCallback(onNavigationEvent(onNavigationEvent(objArr), objArr2, this.IAuthTabCallback + 5));
            onExtraCallbackWithResult(objArr3);
            this.IAuthTabCallback += 5;
            this.onNavigationEvent = size() + 1;
            return;
        }
        if (objArr == null) {
            IAuthTabCallback(objArr2);
            onExtraCallbackWithResult(objArr3);
            this.onNavigationEvent = size() + 1;
        } else {
            IAuthTabCallback(onNavigationEvent(objArr, objArr2, i));
            onExtraCallbackWithResult(objArr3);
            this.onNavigationEvent = size() + 1;
        }
    }

    private final Object[] onNavigationEvent(Object[] objArr, Object[] objArr2, int i) {
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(size() - 1, i);
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        if (i == 5) {
            objArrOnExtraCallback[iOnWarmupCompleted] = objArr2;
            return objArrOnExtraCallback;
        }
        objArrOnExtraCallback[iOnWarmupCompleted] = onNavigationEvent((Object[]) objArrOnExtraCallback[iOnWarmupCompleted], objArr2, i - 5);
        return objArrOnExtraCallback;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iIAuthTabCallbackStub >= collection.size()) {
            onExtraCallbackWithResult(onExtraCallbackWithResult(onExtraCallback(this.IAuthTabCallbackDefault), iIAuthTabCallbackStub, it));
            this.onNavigationEvent = size() + collection.size();
        } else {
            int size = ((collection.size() + iIAuthTabCallbackStub) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = onExtraCallbackWithResult(onExtraCallback(this.IAuthTabCallbackDefault), iIAuthTabCallbackStub, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = onExtraCallbackWithResult(asInterface(), 0, it);
            }
            IAuthTabCallback(onNavigationEvent(this.onExtraCallbackWithResult, asBinder(), objArr));
            onExtraCallbackWithResult(onExtraCallbackWithResult(asInterface(), 0, it));
            this.onNavigationEvent = size() + collection.size();
        }
        return true;
    }

    private final Object[] onExtraCallbackWithResult(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    private final Object[] onNavigationEvent(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArrOnExtraCallback;
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i2 = this.IAuthTabCallback;
        if ((i >> 5) < (1 << i2)) {
            objArrOnExtraCallback = onWarmupCompleted(objArr, i, i2, it);
        } else {
            objArrOnExtraCallback = onExtraCallback(objArr);
        }
        while (it.hasNext()) {
            this.IAuthTabCallback += 5;
            objArrOnExtraCallback = onNavigationEvent(objArrOnExtraCallback);
            int i3 = this.IAuthTabCallback;
            onWarmupCompleted(objArrOnExtraCallback, 1 << i3, i3, it);
        }
        return objArrOnExtraCallback;
    }

    private final Object[] onWarmupCompleted(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i, i2);
        int i3 = i2 - 5;
        objArrOnExtraCallback[iOnWarmupCompleted] = onWarmupCompleted((Object[]) objArrOnExtraCallback[iOnWarmupCompleted], i, i3, it);
        while (true) {
            iOnWarmupCompleted++;
            if (iOnWarmupCompleted >= 32 || !it.hasNext()) {
                break;
            }
            objArrOnExtraCallback[iOnWarmupCompleted] = onWarmupCompleted((Object[]) objArrOnExtraCallback[iOnWarmupCompleted], 0, i3, it);
        }
        return objArrOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        RegistersComponents.onExtraCallback(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iAsBinder = asBinder();
        if (i >= iAsBinder) {
            onWarmupCompleted(this.onExtraCallbackWithResult, i - iAsBinder, e);
            return;
        }
        getSelinuxLabel getselinuxlabel = new getSelinuxLabel(null);
        Object[] objArr = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(objArr);
        onWarmupCompleted(onWarmupCompleted(objArr, this.IAuthTabCallback, i, e, getselinuxlabel), 0, getselinuxlabel.onNavigationEvent());
    }

    private final void onWarmupCompleted(Object[] objArr, int i, E e) {
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        Object[] objArrOnExtraCallback = onExtraCallback(this.IAuthTabCallbackDefault);
        if (iIAuthTabCallbackStub < 32) {
            ArraysKt___ArraysJvmKt.copyInto(this.IAuthTabCallbackDefault, objArrOnExtraCallback, i + 1, i, iIAuthTabCallbackStub);
            objArrOnExtraCallback[i] = e;
            IAuthTabCallback(objArr);
            onExtraCallbackWithResult(objArrOnExtraCallback);
            this.onNavigationEvent = size() + 1;
            return;
        }
        Object[] objArr2 = this.IAuthTabCallbackDefault;
        Object obj = objArr2[31];
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArrOnExtraCallback, i + 1, i, 31);
        objArrOnExtraCallback[i] = e;
        onExtraCallback(objArr, objArrOnExtraCallback, onNavigationEvent(obj));
    }

    private final Object[] onWarmupCompleted(Object[] objArr, int i, int i2, Object obj, getSelinuxLabel getselinuxlabel) {
        Object obj2;
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i2, i);
        if (i == 0) {
            getselinuxlabel.onWarmupCompleted(objArr[31]);
            Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, onExtraCallback(objArr), iOnWarmupCompleted + 1, iOnWarmupCompleted, 31);
            objArrCopyInto[iOnWarmupCompleted] = obj;
            return objArrCopyInto;
        }
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        int i3 = i - 5;
        Object obj3 = objArrOnExtraCallback[iOnWarmupCompleted];
        Intrinsics.checkNotNull(obj3, "");
        objArrOnExtraCallback[iOnWarmupCompleted] = onWarmupCompleted((Object[]) obj3, i3, i2, obj, getselinuxlabel);
        while (true) {
            iOnWarmupCompleted++;
            if (iOnWarmupCompleted >= 32 || (obj2 = objArrOnExtraCallback[iOnWarmupCompleted]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "");
            objArrOnExtraCallback[iOnWarmupCompleted] = onWarmupCompleted((Object[]) obj2, i3, 0, getselinuxlabel.onNavigationEvent(), getselinuxlabel);
        }
        return objArrOnExtraCallback;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        Object[] objArrCopyInto;
        Intrinsics.checkNotNullParameter(collection, "");
        RegistersComponents.onExtraCallback(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            asBinder();
            int i3 = i & 31;
            int size2 = collection.size();
            Object[] objArr = this.IAuthTabCallbackDefault;
            Object[] objArrCopyInto2 = ArraysKt___ArraysJvmKt.copyInto(objArr, onExtraCallback(objArr), (((i + size2) - 1) & 31) + 1, i3, IAuthTabCallbackStub());
            onExtraCallbackWithResult(objArrCopyInto2, i3, collection.iterator());
            onExtraCallbackWithResult(objArrCopyInto2);
            this.onNavigationEvent = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(size() + collection.size());
        if (i >= asBinder()) {
            objArrCopyInto = asInterface();
            onExtraCallbackWithResult(collection, i, this.IAuthTabCallbackDefault, iIAuthTabCallbackStub, objArr2, size, objArrCopyInto);
        } else if (iOnExtraCallbackWithResult > iIAuthTabCallbackStub) {
            int i4 = iOnExtraCallbackWithResult - iIAuthTabCallbackStub;
            objArrCopyInto = IAuthTabCallback(this.IAuthTabCallbackDefault, i4);
            onExtraCallbackWithResult(collection, i, i4, objArr2, size, objArrCopyInto);
        } else {
            int i5 = iIAuthTabCallbackStub - iOnExtraCallbackWithResult;
            objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(this.IAuthTabCallbackDefault, asInterface(), 0, i5, iIAuthTabCallbackStub);
            int i6 = 32 - i5;
            Object[] objArrIAuthTabCallback = IAuthTabCallback(this.IAuthTabCallbackDefault, i6);
            int i7 = size - 1;
            objArr2[i7] = objArrIAuthTabCallback;
            onExtraCallbackWithResult(collection, i, i6, objArr2, i7, objArrIAuthTabCallback);
        }
        IAuthTabCallback(onNavigationEvent(this.onExtraCallbackWithResult, i2, objArr2));
        onExtraCallbackWithResult(objArrCopyInto);
        this.onNavigationEvent = size() + collection.size();
        return true;
    }

    private final void onExtraCallbackWithResult(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.onExtraCallbackWithResult == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        Object[] objArrOnExtraCallback = onExtraCallback(i4, i2, objArr, i3, objArr2);
        int iAsBinder = i3 - (((asBinder() >> 5) - 1) - i4);
        if (iAsBinder < i3) {
            objArr2 = objArr[iAsBinder];
            Intrinsics.checkNotNull(objArr2);
        }
        onExtraCallbackWithResult(collection, i, objArrOnExtraCallback, 32, objArr, iAsBinder, objArr2);
    }

    private final Object[] onExtraCallback(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.onExtraCallbackWithResult == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ListIterator<Object[]> listIteratorOnNavigationEvent = onNavigationEvent(asBinder() >> 5);
        while (listIteratorOnNavigationEvent.previousIndex() != i) {
            Object[] objArrPrevious = listIteratorOnNavigationEvent.previous();
            ArraysKt___ArraysJvmKt.copyInto(objArrPrevious, objArr2, 0, 32 - i2, 32);
            objArr2 = IAuthTabCallback(objArrPrevious, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return listIteratorOnNavigationEvent.previous();
    }

    private final void onExtraCallbackWithResult(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrAsInterface;
        if (i3 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        objArr2[0] = objArrOnExtraCallback;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt___ArraysJvmKt.copyInto(objArrOnExtraCallback, objArr3, size + 1, i4, i2);
        } else {
            if (i3 == 1) {
                objArrAsInterface = objArrOnExtraCallback;
            } else {
                objArrAsInterface = asInterface();
                i3--;
                objArr2[i3] = objArrAsInterface;
            }
            int i6 = i2 - (i5 - 31);
            ArraysKt___ArraysJvmKt.copyInto(objArrOnExtraCallback, objArr3, 0, i6, i2);
            ArraysKt___ArraysJvmKt.copyInto(objArrOnExtraCallback, objArrAsInterface, size + 1, i4, i6);
            objArr3 = objArrAsInterface;
        }
        Iterator<? extends E> it = collection.iterator();
        onExtraCallbackWithResult(objArrOnExtraCallback, i4, it);
        for (int i7 = 1; i7 < i3; i7++) {
            objArr2[i7] = onExtraCallbackWithResult(asInterface(), 0, it);
        }
        onExtraCallbackWithResult(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        RegistersComponents.onExtraCallbackWithResult(i, size());
        return (E) onWarmupCompleted(i)[i & 31];
    }

    private final Object[] onWarmupCompleted(int i) {
        if (asBinder() <= i) {
            return this.IAuthTabCallbackDefault;
        }
        Object[] objArr = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.IAuthTabCallback; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[removeThreads.onWarmupCompleted(i, i2)];
            Intrinsics.checkNotNull(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        RegistersComponents.onExtraCallbackWithResult(i, size());
        ((AbstractList) this).modCount++;
        int iAsBinder = asBinder();
        if (i >= iAsBinder) {
            return (E) onExtraCallback(this.onExtraCallbackWithResult, iAsBinder, this.IAuthTabCallback, i - iAsBinder);
        }
        getSelinuxLabel getselinuxlabel = new getSelinuxLabel(this.IAuthTabCallbackDefault[0]);
        Object[] objArr = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(objArr);
        onExtraCallback(onWarmupCompleted(objArr, this.IAuthTabCallback, i, getselinuxlabel), iAsBinder, this.IAuthTabCallback, 0);
        return (E) getselinuxlabel.onNavigationEvent();
    }

    private final Object onExtraCallback(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.IAuthTabCallbackDefault[0];
            onExtraCallback(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.IAuthTabCallbackDefault;
        Object obj2 = objArr2[i3];
        Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr2, onExtraCallback(objArr2), i3, i3 + 1, size);
        objArrCopyInto[size - 1] = null;
        IAuthTabCallback(objArr);
        onExtraCallbackWithResult(objArrCopyInto);
        this.onNavigationEvent = (i + size) - 1;
        this.IAuthTabCallback = i2;
        return obj2;
    }

    private final Object[] onWarmupCompleted(Object[] objArr, int i, int i2, getSelinuxLabel getselinuxlabel) {
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i2, i);
        if (i == 0) {
            Object obj = objArr[iOnWarmupCompleted];
            Object[] objArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(objArr, onExtraCallback(objArr), iOnWarmupCompleted, iOnWarmupCompleted + 1, 32);
            objArrCopyInto[31] = getselinuxlabel.onNavigationEvent();
            getselinuxlabel.onWarmupCompleted(obj);
            return objArrCopyInto;
        }
        int iOnWarmupCompleted2 = objArr[31] == null ? removeThreads.onWarmupCompleted(asBinder() - 1, i) : 31;
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        int i3 = i - 5;
        int i4 = iOnWarmupCompleted + 1;
        if (i4 <= iOnWarmupCompleted2) {
            while (true) {
                Object obj2 = objArrOnExtraCallback[iOnWarmupCompleted2];
                Intrinsics.checkNotNull(obj2, "");
                objArrOnExtraCallback[iOnWarmupCompleted2] = onWarmupCompleted((Object[]) obj2, i3, 0, getselinuxlabel);
                if (iOnWarmupCompleted2 == i4) {
                    break;
                }
                iOnWarmupCompleted2--;
            }
        }
        Object obj3 = objArrOnExtraCallback[iOnWarmupCompleted];
        Intrinsics.checkNotNull(obj3, "");
        objArrOnExtraCallback[iOnWarmupCompleted] = onWarmupCompleted((Object[]) obj3, i3, i2, getselinuxlabel);
        return objArrOnExtraCallback;
    }

    private final void onExtraCallback(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            IAuthTabCallback((Object[]) null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            onExtraCallbackWithResult(objArr);
            this.onNavigationEvent = i;
            this.IAuthTabCallback = i2;
            return;
        }
        getSelinuxLabel getselinuxlabel = new getSelinuxLabel(null);
        Intrinsics.checkNotNull(objArr);
        Object[] objArrOnExtraCallback = onExtraCallback(objArr, i2, i, getselinuxlabel);
        Intrinsics.checkNotNull(objArrOnExtraCallback);
        Object objOnNavigationEvent = getselinuxlabel.onNavigationEvent();
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        onExtraCallbackWithResult((Object[]) objOnNavigationEvent);
        this.onNavigationEvent = i;
        if (objArrOnExtraCallback[1] == null) {
            IAuthTabCallback((Object[]) objArrOnExtraCallback[0]);
            this.IAuthTabCallback = i2 - 5;
        } else {
            IAuthTabCallback(objArrOnExtraCallback);
            this.IAuthTabCallback = i2;
        }
    }

    private final Object[] onExtraCallback(Object[] objArr, int i, int i2, getSelinuxLabel getselinuxlabel) {
        Object[] objArrOnExtraCallback;
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i2 - 1, i);
        if (i == 5) {
            getselinuxlabel.onWarmupCompleted(objArr[iOnWarmupCompleted]);
            objArrOnExtraCallback = null;
        } else {
            Object obj = objArr[iOnWarmupCompleted];
            Intrinsics.checkNotNull(obj, "");
            objArrOnExtraCallback = onExtraCallback((Object[]) obj, i - 5, i2, getselinuxlabel);
        }
        if (objArrOnExtraCallback == null && iOnWarmupCompleted == 0) {
            return null;
        }
        Object[] objArrOnExtraCallback2 = onExtraCallback(objArr);
        objArrOnExtraCallback2[iOnWarmupCompleted] = objArrOnExtraCallback;
        return objArrOnExtraCallback2;
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function1<E, Boolean> {
        final /* synthetic */ Collection<E> $elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Collection<? extends E> collection) {
            super(1);
            this.$elements = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e) {
            return Boolean.valueOf(this.$elements.contains(e));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        return IAuthTabCallback(new onExtraCallbackWithResult(collection));
    }

    public final boolean IAuthTabCallback(@NotNull Function1<? super E, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zOnExtraCallback = onExtraCallback(function1);
        if (zOnExtraCallback) {
            ((AbstractList) this).modCount++;
        }
        return zOnExtraCallback;
    }

    private final boolean onExtraCallback(Function1<? super E, Boolean> function1) {
        Object[] objArrOnWarmupCompleted;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        getSelinuxLabel getselinuxlabel = new getSelinuxLabel(null);
        if (this.onExtraCallbackWithResult == null) {
            return onNavigationEvent(function1, iIAuthTabCallbackStub, getselinuxlabel) != iIAuthTabCallbackStub;
        }
        ListIterator<Object[]> listIteratorOnNavigationEvent = onNavigationEvent(0);
        int iIAuthTabCallback = 32;
        while (iIAuthTabCallback == 32 && listIteratorOnNavigationEvent.hasNext()) {
            iIAuthTabCallback = IAuthTabCallback(function1, listIteratorOnNavigationEvent.next(), 32, getselinuxlabel);
        }
        if (iIAuthTabCallback == 32) {
            listIteratorOnNavigationEvent.hasNext();
            int iOnNavigationEvent = onNavigationEvent(function1, iIAuthTabCallbackStub, getselinuxlabel);
            if (iOnNavigationEvent == 0) {
                onExtraCallback(this.onExtraCallbackWithResult, size(), this.IAuthTabCallback);
            }
            return iOnNavigationEvent != iIAuthTabCallbackStub;
        }
        int iPreviousIndex = listIteratorOnNavigationEvent.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iOnExtraCallbackWithResult = iIAuthTabCallback;
        while (listIteratorOnNavigationEvent.hasNext()) {
            iOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, listIteratorOnNavigationEvent.next(), 32, iOnExtraCallbackWithResult, getselinuxlabel, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i = iPreviousIndex;
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(function1, this.IAuthTabCallbackDefault, iIAuthTabCallbackStub, iOnExtraCallbackWithResult, getselinuxlabel, arrayList2, arrayList);
        Object objOnNavigationEvent = getselinuxlabel.onNavigationEvent();
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        Object[] objArr = (Object[]) objOnNavigationEvent;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, iOnExtraCallbackWithResult2, 32);
        if (arrayList.isEmpty()) {
            objArrOnWarmupCompleted = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(objArrOnWarmupCompleted);
        } else {
            objArrOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult, i, this.IAuthTabCallback, arrayList.iterator());
        }
        int size = i + (arrayList.size() << 5);
        IAuthTabCallback(onExtraCallback(objArrOnWarmupCompleted, size));
        onExtraCallbackWithResult(objArr);
        this.onNavigationEvent = size + iOnExtraCallbackWithResult2;
        return true;
    }

    private final Object[] onExtraCallback(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i == 0) {
            this.IAuthTabCallback = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.IAuthTabCallback;
            if ((i2 >> i3) == 0) {
                this.IAuthTabCallback = i3 - 5;
                Object[] objArr2 = objArr[0];
                Intrinsics.checkNotNull(objArr2, "");
                objArr = objArr2;
            } else {
                return onNavigationEvent(objArr, i2, i3);
            }
        }
    }

    private final Object[] onNavigationEvent(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i, i2);
        Object obj = objArr[iOnWarmupCompleted];
        Intrinsics.checkNotNull(obj, "");
        Object objOnNavigationEvent = onNavigationEvent((Object[]) obj, i, i2 - 5);
        if (iOnWarmupCompleted < 31) {
            int i3 = iOnWarmupCompleted + 1;
            if (objArr[i3] != null) {
                if (onWarmupCompleted(objArr)) {
                    ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i3, 32);
                }
                objArr = ArraysKt___ArraysJvmKt.copyInto(objArr, asInterface(), 0, 0, i3);
            }
        }
        if (objOnNavigationEvent == objArr[iOnWarmupCompleted]) {
            return objArr;
        }
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        objArrOnExtraCallback[iOnWarmupCompleted] = objOnNavigationEvent;
        return objArrOnExtraCallback;
    }

    private final int onNavigationEvent(Function1<? super E, Boolean> function1, int i, getSelinuxLabel getselinuxlabel) {
        int iIAuthTabCallback = IAuthTabCallback(function1, this.IAuthTabCallbackDefault, i, getselinuxlabel);
        if (iIAuthTabCallback == i) {
            getselinuxlabel.onNavigationEvent();
            return i;
        }
        Object objOnNavigationEvent = getselinuxlabel.onNavigationEvent();
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        Object[] objArr = (Object[]) objOnNavigationEvent;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, iIAuthTabCallback, i);
        onExtraCallbackWithResult(objArr);
        this.onNavigationEvent = size() - (i - iIAuthTabCallback);
        return iIAuthTabCallback;
    }

    private final int IAuthTabCallback(Function1<? super E, Boolean> function1, Object[] objArr, int i, getSelinuxLabel getselinuxlabel) {
        Object[] objArrOnExtraCallback = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrOnExtraCallback = onExtraCallback(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrOnExtraCallback[i2] = obj;
                i2++;
            }
        }
        getselinuxlabel.onWarmupCompleted(objArrOnExtraCallback);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult(Function1<? super E, Boolean> function1, Object[] objArr, int i, int i2, getSelinuxLabel getselinuxlabel, List<Object[]> list, List<Object[]> list2) {
        Object[] objArrAsInterface;
        if (onWarmupCompleted(objArr)) {
            list.add(objArr);
        }
        Object objOnNavigationEvent = getselinuxlabel.onNavigationEvent();
        Intrinsics.checkNotNull(objOnNavigationEvent, "");
        Object[] objArr2 = (Object[]) objOnNavigationEvent;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!function1.invoke(obj).booleanValue()) {
                if (i2 == 32) {
                    if (!list.isEmpty()) {
                        objArrAsInterface = list.remove(list.size() - 1);
                    } else {
                        objArrAsInterface = asInterface();
                    }
                    objArr3 = objArrAsInterface;
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        getselinuxlabel.onWarmupCompleted(objArr3);
        if (objArr2 != getselinuxlabel.onNavigationEvent()) {
            list2.add(objArr2);
        }
        return i2;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        RegistersComponents.onExtraCallbackWithResult(i, size());
        if (asBinder() <= i) {
            Object[] objArrOnExtraCallback = onExtraCallback(this.IAuthTabCallbackDefault);
            if (objArrOnExtraCallback != this.IAuthTabCallbackDefault) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) objArrOnExtraCallback[i2];
            objArrOnExtraCallback[i2] = e;
            onExtraCallbackWithResult(objArrOnExtraCallback);
            return e2;
        }
        getSelinuxLabel getselinuxlabel = new getSelinuxLabel(null);
        Object[] objArr = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(objArr);
        IAuthTabCallback(onNavigationEvent(objArr, this.IAuthTabCallback, i, e, getselinuxlabel));
        return (E) getselinuxlabel.onNavigationEvent();
    }

    private final Object[] onNavigationEvent(Object[] objArr, int i, int i2, E e, getSelinuxLabel getselinuxlabel) {
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(i2, i);
        Object[] objArrOnExtraCallback = onExtraCallback(objArr);
        if (i == 0) {
            if (objArrOnExtraCallback != objArr) {
                ((AbstractList) this).modCount++;
            }
            getselinuxlabel.onWarmupCompleted(objArrOnExtraCallback[iOnWarmupCompleted]);
            objArrOnExtraCallback[iOnWarmupCompleted] = e;
            return objArrOnExtraCallback;
        }
        Object obj = objArrOnExtraCallback[iOnWarmupCompleted];
        Intrinsics.checkNotNull(obj, "");
        objArrOnExtraCallback[iOnWarmupCompleted] = onNavigationEvent((Object[]) obj, i - 5, i2, e, getselinuxlabel);
        return objArrOnExtraCallback;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        RegistersComponents.onExtraCallback(i, size());
        return new hasSignalInfo(this, i);
    }

    private final ListIterator<Object[]> onNavigationEvent(int i) {
        if (this.onExtraCallbackWithResult == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iAsBinder = asBinder() >> 5;
        RegistersComponents.onExtraCallback(i, iAsBinder);
        int i2 = this.IAuthTabCallback;
        if (i2 == 0) {
            Object[] objArr = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(objArr);
            return new clearThreads(objArr, i);
        }
        Object[] objArr2 = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(objArr2);
        return new putThreads(objArr2, i, iAsBinder, i2 / 5);
    }
}
