package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    IntSlicer(int[] iArr, int i) {
        this.values = iArr;
        this.base = i;
    }

    final int at(int i) {
        return this.values[this.base + i];
    }

    final int at(int i, int i2) {
        this.values[this.base + i] = i2;
        return i2;
    }

    final int at(int i, long j) {
        int i2 = (int) j;
        this.values[this.base + i] = i2;
        return i2;
    }

    final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    final IntSlicer from(int i) {
        return new IntSlicer(this.values, this.base + i);
    }

    final void incBase(int i) {
        this.base += i;
    }
}
