package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final Consumer<V> removeCallback;
    private final SparseArray<V> spans;

    public static /* synthetic */ void $r8$lambda$5sh9YY_DQV1I48Xp9X9SdGtwQcc(Object obj) {
    }

    public SpannedData() {
        this(new Consumer() { // from class: com.google.android.exoplayer2.source.SpannedData$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                SpannedData.$r8$lambda$5sh9YY_DQV1I48Xp9X9SdGtwQcc(obj);
            }
        });
    }

    public SpannedData(Consumer<V> consumer) {
        this.spans = new SparseArray<>();
        this.removeCallback = consumer;
        this.memoizedReadIndex = -1;
    }

    public V get(int i2) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i3 = this.memoizedReadIndex;
            if (i3 <= 0 || i2 >= this.spans.keyAt(i3)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i2 >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public void appendSpan(int i2, V v) {
        if (this.memoizedReadIndex == -1) {
            Assertions.checkState(this.spans.size() == 0);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            SparseArray<V> sparseArray = this.spans;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.checkArgument(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                Consumer<V> consumer = this.removeCallback;
                SparseArray<V> sparseArray2 = this.spans;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i2, v);
    }

    public V getEndValue() {
        return this.spans.valueAt(r0.size() - 1);
    }

    public void discardTo(int i2) {
        int i3 = 0;
        while (i3 < this.spans.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.spans.keyAt(i4)) {
                return;
            }
            this.removeCallback.accept(this.spans.valueAt(i3));
            this.spans.removeAt(i3);
            int i5 = this.memoizedReadIndex;
            if (i5 > 0) {
                this.memoizedReadIndex = i5 - 1;
            }
            i3 = i4;
        }
    }

    public void discardFrom(int i2) {
        for (int size = this.spans.size() - 1; size >= 0 && i2 < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        this.memoizedReadIndex = this.spans.size() > 0 ? Math.min(this.memoizedReadIndex, this.spans.size() - 1) : -1;
    }

    public void clear() {
        for (int i2 = 0; i2 < this.spans.size(); i2++) {
            this.removeCallback.accept(this.spans.valueAt(i2));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public boolean isEmpty() {
        return this.spans.size() == 0;
    }
}
