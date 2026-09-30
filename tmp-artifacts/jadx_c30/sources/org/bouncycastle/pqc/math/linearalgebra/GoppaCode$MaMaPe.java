package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GoppaCode$MaMaPe {
    private GF2Matrix h;
    private Permutation p;
    private GF2Matrix s;

    public GoppaCode$MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
        this.s = gF2Matrix;
        this.h = gF2Matrix2;
        this.p = permutation;
    }

    public GF2Matrix getFirstMatrix() {
        return this.s;
    }

    public Permutation getPermutation() {
        return this.p;
    }

    public GF2Matrix getSecondMatrix() {
        return this.h;
    }
}
