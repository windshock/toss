package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GoppaCode$MatrixSet {
    private GF2Matrix g;
    private int[] setJ;

    public GoppaCode$MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
        this.g = gF2Matrix;
        this.setJ = iArr;
    }

    public GF2Matrix getG() {
        return this.g;
    }

    public int[] getSetJ() {
        return this.setJ;
    }
}
