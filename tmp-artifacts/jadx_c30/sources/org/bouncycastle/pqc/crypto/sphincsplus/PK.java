package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class PK {
    final byte[] root;
    final byte[] seed;

    PK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.root = bArr2;
    }
}
