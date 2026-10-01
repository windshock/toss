package com.bugsnag.android.repackaged.dslplatform.json;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Grisu3$DiyFp {
    private static final long k10MSBits = -18014398509481984L;
    private static final long kM32 = 4294967295L;
    static final int kSignificandSize = 64;
    static final long kUint64MSB = Long.MIN_VALUE;
    long f = 0;
    int e = 0;

    Grisu3$DiyFp() {
    }

    void subtract(Grisu3$DiyFp grisu3$DiyFp) {
        this.f -= grisu3$DiyFp.f;
    }

    void multiply(Grisu3$DiyFp grisu3$DiyFp) {
        long j = this.f;
        long j2 = j >>> 32;
        long j3 = j & kM32;
        long j4 = grisu3$DiyFp.f;
        long j5 = j4 >>> 32;
        long j6 = j4 & kM32;
        long j7 = j5 * j3;
        long j8 = j2 * j6;
        this.e += grisu3$DiyFp.e + kSignificandSize;
        this.f = (j2 * j5) + (j8 >>> 32) + (j7 >>> 32) + ((((((j3 * j6) >>> 32) + (j8 & kM32)) + (kM32 & j7)) + 2147483648L) >>> 32);
    }

    void normalize() {
        long j = this.f;
        int i2 = this.e;
        while ((k10MSBits & j) == 0) {
            j <<= 10;
            i2 -= 10;
        }
        while ((kUint64MSB & j) == 0) {
            j <<= 1;
            i2--;
        }
        this.f = j;
        this.e = i2;
    }

    void reset() {
        this.e = 0;
        this.f = 0L;
    }

    public String toString() {
        return "[DiyFp f:" + this.f + ", e:" + this.e + "]";
    }
}
