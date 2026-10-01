package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TupleHash implements Xof, Digest {
    private static final byte[] N_TUPLE_HASH = Strings.toByteArray("TupleHash");
    private final int bitLength;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private final int outputLength;

    public TupleHash(int i, byte[] bArr) {
        this(i, bArr, i << 1);
    }

    public TupleHash(int i, byte[] bArr, int i2) {
        this.cshake = new CSHAKEDigest(i, N_TUPLE_HASH, bArr);
        this.bitLength = i;
        this.outputLength = (i2 + 7) / 8;
        reset();
    }

    public TupleHash(TupleHash tupleHash) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(tupleHash.cshake);
        this.cshake = cSHAKEDigest;
        int i = ((KeccakDigest) cSHAKEDigest).fixedOutputLength;
        this.bitLength = i;
        this.outputLength = (i << 1) / 8;
        this.firstOutput = tupleHash.firstOutput;
    }

    private void wrapUp(int i) {
        byte[] bArrRightEncode = XofUtils.rightEncode(i << 3);
        this.cshake.update(bArrRightEncode, 0, bArrRightEncode.length);
        this.firstOutput = false;
    }

    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
        }
        int iDoFinal = this.cshake.doFinal(bArr, i, getDigestSize());
        reset();
        return iDoFinal;
    }

    public int doFinal(byte[] bArr, int i, int i2) {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
        }
        int iDoFinal = this.cshake.doFinal(bArr, i, i2);
        reset();
        return iDoFinal;
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.firstOutput) {
            wrapUp(0);
        }
        return this.cshake.doOutput(bArr, i, i2);
    }

    public String getAlgorithmName() {
        return "TupleHash" + this.cshake.getAlgorithmName().substring(6);
    }

    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    public int getDigestSize() {
        return this.outputLength;
    }

    public void reset() {
        this.cshake.reset();
        this.firstOutput = true;
    }

    public void update(byte b) throws IllegalStateException {
        byte[] bArrEncode = XofUtils.encode(b);
        this.cshake.update(bArrEncode, 0, bArrEncode.length);
    }

    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        byte[] bArrEncode = XofUtils.encode(bArr, i, i2);
        this.cshake.update(bArrEncode, 0, bArrEncode.length);
    }
}
