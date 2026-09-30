package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResizableAtomicArray<T> {
    private volatile AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int onExtraCallback() {
        return this.array.length();
    }

    public final T onExtraCallbackWithResult(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void IAuthTabCallback(int i, @Nullable T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(RangesKt___RangesKt.coerceAtLeast(i + 1, length << 1));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
