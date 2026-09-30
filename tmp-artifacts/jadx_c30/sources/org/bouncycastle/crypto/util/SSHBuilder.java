package org.bouncycastle.crypto.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class SSHBuilder {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    SSHBuilder() {
    }

    public byte[] getBytes() {
        return this.bos.toByteArray();
    }

    public byte[] getPaddedBytes() {
        return getPaddedBytes(8);
    }

    public byte[] getPaddedBytes(int i) {
        int size = this.bos.size() % i;
        if (size != 0) {
            for (int i2 = 1; i2 <= i - size; i2++) {
                this.bos.write(i2);
            }
        }
        return this.bos.toByteArray();
    }

    public void u32(int i) {
        this.bos.write(i >>> 24);
        this.bos.write((i >>> 16) & GF2Field.MASK);
        this.bos.write((i >>> 8) & GF2Field.MASK);
        this.bos.write(i & GF2Field.MASK);
    }

    public void writeBigNum(BigInteger bigInteger) throws IOException {
        writeBlock(bigInteger.toByteArray());
    }

    public void writeBlock(byte[] bArr) throws IOException {
        u32(bArr.length);
        try {
            this.bos.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public void writeBytes(byte[] bArr) throws IOException {
        try {
            this.bos.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public void writeString(String str) throws IOException {
        writeBlock(Strings.toByteArray(str));
    }
}
