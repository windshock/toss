package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BitBuilder {
    private static final byte[] bits = {ISOFileInfo.DATA_BYTES1, 64, ISO7816.INS_VERIFY, ISO7816.CLA_COMMAND_CHAINING, 8, 4, 2, 1};
    byte[] buf = new byte[1];
    int pos = 0;

    protected void finalize() throws Throwable {
        zero();
        super.finalize();
    }

    public void pad() {
        int i = this.pos;
        this.pos = i + (i % 8);
    }

    public int write(OutputStream outputStream) throws IOException {
        int i = this.pos;
        int i2 = (i + (i % 8)) / 8;
        outputStream.write(this.buf, 0, i2);
        outputStream.flush();
        return i2;
    }

    public void write7BitBytes(int i) {
        boolean z = false;
        for (int i2 = 4; i2 >= 0; i2--) {
            if (!z && ((-33554432) & i) != 0) {
                z = true;
            }
            if (z) {
                writeBit(i2).writeBits(i, 32, 7);
            }
            i <<= 7;
        }
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + (bigInteger.bitLength() % 8)) / 8;
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(254L).shiftLeft(iBitLength << 3);
        boolean z = false;
        while (iBitLength >= 0) {
            if (!z && bigInteger.and(bigIntegerShiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z = true;
            }
            if (z) {
                writeBit(iBitLength).writeBits(bigInteger.and(bigIntegerShiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            iBitLength--;
        }
    }

    public int writeAndClear(OutputStream outputStream) throws IOException {
        int i = this.pos;
        int i2 = (i + (i % 8)) / 8;
        outputStream.write(this.buf, 0, i2);
        outputStream.flush();
        zero();
        return i2;
    }

    public BitBuilder writeBit(int i) {
        int i2 = this.pos / 8;
        byte[] bArr = this.buf;
        if (i2 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            Arrays.clear(this.buf);
            this.buf = bArr2;
        }
        if (i == 0) {
            byte[] bArr3 = this.buf;
            int i3 = this.pos;
            int i4 = i3 / 8;
            bArr3[i4] = (byte) ((~bits[i3 % 8]) & bArr3[i4]);
        } else {
            byte[] bArr4 = this.buf;
            int i5 = this.pos;
            int i6 = i5 / 8;
            bArr4[i6] = (byte) (bits[i5 % 8] | bArr4[i6]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j, int i) {
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            writeBit(((1 << i) & j) > 0 ? 1 : 0);
        }
    }

    public BitBuilder writeBits(long j, int i, int i2) {
        for (int i3 = i - 1; i3 >= i - i2; i3--) {
            writeBit(((1 << i3) & j) != 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.buf);
        this.pos = 0;
    }
}
