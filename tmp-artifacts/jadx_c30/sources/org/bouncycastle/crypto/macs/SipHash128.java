package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    public SipHash128(int i, int i2) {
        super(i, i2);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        this.m = ((this.m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r5) & 255) << 56);
        processMessageWord();
        this.v2 ^= 238;
        applySipRounds(this.d);
        long j = this.v0;
        long j2 = this.v1;
        long j3 = this.v2;
        long j4 = this.v3;
        this.v1 = 221 ^ j2;
        applySipRounds(this.d);
        long j5 = this.v0;
        long j6 = this.v1;
        long j7 = this.v2;
        long j8 = this.v3;
        reset();
        Pack.longToLittleEndian(((j ^ j2) ^ j3) ^ j4, bArr, i);
        Pack.longToLittleEndian(((j5 ^ j6) ^ j7) ^ j8, bArr, i + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws IllegalStateException, DataLengthException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.c + "-" + this.d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.v1 ^= 238;
    }
}
