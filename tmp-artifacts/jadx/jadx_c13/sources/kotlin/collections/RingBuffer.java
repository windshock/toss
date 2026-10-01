package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.access6400;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private int IAuthTabCallback;
    private final int onExtraCallback;
    private int onExtraCallbackWithResult;
    private final Object[] onNavigationEvent;

    public RingBuffer(@NotNull Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.onNavigationEvent = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i > objArr.length) {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        this.onExtraCallback = objArr.length;
        this.IAuthTabCallback = i;
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.IAuthTabCallback;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        AbstractList.Companion.onExtraCallbackWithResult(i, size());
        return (T) this.onNavigationEvent[(this.onExtraCallbackWithResult + i) % this.onExtraCallback];
    }

    public final boolean IAuthTabCallback() {
        return size() == this.onExtraCallback;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new access6400<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            final /* synthetic */ RingBuffer<T> onExtraCallback;
            private int onExtraCallbackWithResult;
            private int onWarmupCompleted;

            {
                this.onExtraCallback = this;
                this.onExtraCallbackWithResult = this.size();
                this.onWarmupCompleted = ((RingBuffer) this).onExtraCallbackWithResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.access6400
            public void onNavigationEvent() {
                if (this.onExtraCallbackWithResult != 0) {
                    onExtraCallback(((RingBuffer) this.onExtraCallback).onNavigationEvent[this.onWarmupCompleted]);
                    this.onWarmupCompleted = (this.onWarmupCompleted + 1) % ((RingBuffer) this.onExtraCallback).onExtraCallback;
                    this.onExtraCallbackWithResult--;
                    return;
                }
                onExtraCallback();
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.onExtraCallbackWithResult; i2 < size && i3 < this.onExtraCallback; i3++) {
            objArr[i2] = this.onNavigationEvent[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.onNavigationEvent[i];
            i2++;
            i++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> IAuthTabCallback(int i) {
        Object[] array;
        int i2 = this.onExtraCallback;
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        if (this.onExtraCallbackWithResult == 0) {
            array = Arrays.copyOf(this.onNavigationEvent, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "");
        } else {
            array = toArray(new Object[iCoerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    public final void onExtraCallback(T t) {
        if (IAuthTabCallback()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.onNavigationEvent[(this.onExtraCallbackWithResult + size()) % this.onExtraCallback] = t;
        this.IAuthTabCallback = size() + 1;
    }

    public final void onWarmupCompleted(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.onExtraCallbackWithResult;
            int i3 = (i2 + i) % this.onExtraCallback;
            if (i2 > i3) {
                ArraysKt___ArraysJvmKt.fill(this.onNavigationEvent, (Object) null, i2, this.onExtraCallback);
                ArraysKt___ArraysJvmKt.fill(this.onNavigationEvent, (Object) null, 0, i3);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.onNavigationEvent, (Object) null, i2, i3);
            }
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallback = size() - i;
        }
    }
}
